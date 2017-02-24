package PipeLine;

import Simulator.MainFrame;

public class InstructionFetchStage implements TaskStage {

	public MainFrame mainFrame;
	
	public InstructionFetchStage(MainFrame simulator ) {
		// TODO Auto-generated constructor stub
		this.mainFrame = simulator;
	}
	
	//use the instruction address to fetch the instruction
	@Override
	public TaskStage process() {
		// TODO Auto-generated method stub
		short address = mainFrame.pc;
		short instruction = mainFrame.memory.fetch(address);
		mainFrame.ir = instruction;
		mainFrame.pc = (short) (address+1);
		
		System.out.println("IF stage, instruction = " + instruction);
		
		return new InstructionDecodeStage(this.mainFrame);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
