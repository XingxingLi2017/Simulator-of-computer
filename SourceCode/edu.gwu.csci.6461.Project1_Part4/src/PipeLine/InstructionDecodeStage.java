package PipeLine;

import Simulator.MainFrame;
import Simulator.SwitchMethod;

public class InstructionDecodeStage implements TaskStage {

	public MainFrame mainFrame;
	public InstructionDecodeStage(MainFrame simulator ) {
		// TODO Auto-generated constructor stub
		this.mainFrame = simulator;
	}
	
	//decode the instruction and get the efficient address.
	//Then start the instruction execution stage.
	@Override
	public TaskStage process() {
		// TODO Auto-generated method stub
		String instru = SwitchMethod.shortToString(mainFrame.ir);
		int indexshort=Integer.valueOf(instru.substring(8, 10),2) ;
		int I = Integer.valueOf(instru.substring(10,11),2);
		int address = Integer.valueOf(instru.substring(11,16),2);
		int ea = 0;
		if(I == 0)
		{
			if(indexshort == 0)
			{
				ea = address;
			}
			else {
				ea =  mainFrame.IXRs[indexshort] + address;
			}
		}
		else if(I == 1)
		{
			int indirectAdress = 0;
			if(indexshort == 0)
			{
				indirectAdress = address;
			}
			else {
				indirectAdress = address + mainFrame.IXRs[indexshort];
			}
			if(indirectAdress > Short.MAX_VALUE)
			{
				System.out.println("overflow");
				return null;
			}
			else if(indirectAdress < Short.MIN_VALUE){
				System.out.println("underflow.");
				return null;
			}
			mainFrame.mar = (short)indirectAdress;
			mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
			ea = mainFrame.mbr;
		}
		mainFrame.efficientAddress = ea;
		
		System.out.println("ID stage, ea = " + ea);
		return new InstructionExecuteStage(mainFrame);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
