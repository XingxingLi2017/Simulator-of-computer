package PipeLine;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import Simulator.MainFrame;

/**
 * start the pipeline and schedule all the tasks.
 * use three sub threads to execute instruction fetching stage, instruction decoding stage
 * and instruction execution stage.
 * **/

public class Pipeline {
	public MainFrame mainFrame;
	
	//use the queue data structure to store the stages.
	public BlockingQueue<TaskStage> firstStageQueue = new LinkedBlockingQueue<TaskStage>();
	public BlockingQueue<TaskStage> secondStageQueue = new LinkedBlockingQueue<TaskStage>();
	public BlockingQueue<TaskStage> thirdStageQueue = new LinkedBlockingQueue<TaskStage>();
	
	public Pipeline(MainFrame simulator) {
		// TODO Auto-generated constructor stub
		mainFrame = simulator;
		run();
	}
	
	public void run()
	{
		//start sub threads
				new Thread(){
					public void run() {
						while(true)
						{
							TaskStage taskStage = null;
							try {
								taskStage = firstStageQueue.poll(50, TimeUnit.SECONDS);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(taskStage != null)
							{
								TaskStage nextStage = taskStage.process();
								try {
									secondStageQueue.put(nextStage);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							else {
								System.out.println("Pipeline 1: first stage queue is empty.");
							}
							
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
				}.start();
				
				new Thread(){
					public void run() {
						while(true)
						{
							TaskStage taskStage = null;
							try {
								taskStage = secondStageQueue.poll(50, TimeUnit.SECONDS);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							if(taskStage != null)
							{
								TaskStage nextStage = taskStage.process();
								try {
									thirdStageQueue.put(nextStage);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							else {
								System.out.println("Pipeline 2: second stage queue is empty.");
							}
							
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
				}.start();
				
				new Thread(){
					public void run() {
						while(true)
						{
							TaskStage taskStage = null;
							try {
								taskStage = thirdStageQueue.poll(50, TimeUnit.SECONDS);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							if(taskStage != null)
							{
								taskStage.process();
							}
							else {
								System.out.println("Pipeline 3: third stage queue is empty.");
							}
							
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
				}.start();
	}
	
	//add the first stage of tasks to the pipeline.
	public void process(TaskStage firstStage)
	{
		try {
			firstStageQueue.put(firstStage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mysimulator = new MainFrame();
		mysimulator.initialization();
		try {
			mysimulator.loadInstructions();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Pipeline pipeline = new Pipeline(mysimulator);
		
		for(int i = 0 ; i < mysimulator.instructions.size() ; i++)
		{
			pipeline.process(new InstructionFetchStage(pipeline.mainFrame));
		}
		
		LockSupport.park();

	}

}
