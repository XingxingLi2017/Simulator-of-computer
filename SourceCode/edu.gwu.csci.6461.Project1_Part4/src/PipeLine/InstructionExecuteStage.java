package PipeLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Simulator.MainFrame;
import Simulator.SwitchMethod;
import Simulator.newwindow;

public class InstructionExecuteStage implements TaskStage {

	public MainFrame mainFrame;
	public InstructionExecuteStage(MainFrame simulator) {
		// TODO Auto-generated constructor stub
		this.mainFrame = simulator;
	}
	
	//execute the instruction and access the memory.
	@Override
	public TaskStage process() {
		// TODO Auto-generated method stub
		//parse present instruction and get the special bits that may be useful.
		String instru = SwitchMethod.shortToString(mainFrame.ir);
		int opcode = Integer.valueOf(instru.substring(0, 6),2);
		int generalshort = Integer.valueOf(instru.substring(6,8),2);//GPR address
		int indexshort = Integer.valueOf(instru.substring(8, 10),2);//Index rigster address
		int I = Integer.valueOf(instru.substring(10,11),2);	//direct address or indirect address
		int address = Integer.valueOf(instru.substring(11,16),2);	//address
		int immed = Integer.valueOf(instru.substring(11,16),2); //used for immed instructions
		int rx = Integer.valueOf(instru.substring(6,8),2);   //used for arithmetic and logical instructions
		int ry = Integer.valueOf(instru.substring(8,10),2);	//used for arithmetic and logical instructions
		int r = Integer.valueOf(instru.substring(6,8),2);	//
		int a_l=Integer.valueOf(instru.substring(8,9),2);
		int l_r=Integer.valueOf(instru.substring(9,10),2);
		int count=Integer.valueOf(instru.substring(12,16),2);
		int devid = Integer.valueOf(instru.substring(11),2);//used for IN and OUT instruction.
		int trapcode = Integer.valueOf(instru.substring(12,16),2);	//used for trap
		//get the EA.
		short ea = (short)mainFrame.efficientAddress;
		
		System.out.println("IE stage, instruction = " + instru);
		//Then execute the operation.
		//when opcode is 1, the operation is loading content from memory.
		//when opcode is 2, we need to store content.
		
		System.out.println("In execute function opcode = "+ opcode);

	
		switch (opcode) {
		case 00://halt
			HLT();
			break;
		
		case 01://load
			mainFrame.mar = (short)ea;
			mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
			mainFrame.GPRs[generalshort] = mainFrame.mbr;
			break;
			
		case 02://store
			mainFrame.mar = (short)ea;
			mainFrame.mbr = mainFrame.GPRs[generalshort];
			mainFrame.memory.set(mainFrame.mar, mainFrame.mbr);
			break;
		
		case 03:
			LDA(generalshort,ea);
			break;
		
		case 04:
			AMR(generalshort, ea);
			break;
		case 05:
			SMR(generalshort, ea);
			break;
		case 06:
			AIR(generalshort, immed);
			break;
		case 07:
			SIR(generalshort, immed);
			break;
			
		case 010:
			JZ(generalshort, ea);
			break;
			
		case 011:
			JNE(generalshort, ea);
			break;
			
		case 012:
			JCC(generalshort, ea);
			break;
			
		case 013:
			JMA(ea);
			break;
			
		case 014:
			JSR(ea);
			break;
			
		case 015:
			RFS(immed);
			break;
			
		case 016:
			SOB(generalshort, ea);
			break;
			
		case 017:
			JGE(generalshort, ea);
			break;

		case 020:
			MLT(rx, ry);
			break;
			
		case 021:
			DVD(rx, ry);
			break;
			
		case 022:
			TRR(rx, ry);
			break;
			
		case 023:
			AND(rx, ry);
			break;
			
		case 024:
			ORR(rx, ry);
			break;
			
		case 025:
			NOT(rx);
			break;
			
		case 031:
			SRC(generalshort, l_r, a_l, count);
			break;
			
		case 032:
			RRC(generalshort, count, a_l, l_r);
			break;
			
		case 036:
			TRAP(trapcode);
			break;
			
		case 041:
			LDX(generalshort,ea,I);
			break;
		
		case 042:
			STX(generalshort,ea,I);
			break;
			
		case 061:
			IN(r,devid);
			break;
		
		case 062:
			OUT(r,devid);
			break;
			
		case 063:
			CHK(r,devid);
			break;
		
		case 033:
			FADD(generalshort,ea);
			break;
		
		case 034:
			FSUB(generalshort,ea);
			
		case 035:
			VADD(generalshort,ea);
			
		case 053:
			VSUB(generalshort,ea);
			
		case 054:
			CNVRT(generalshort, ea);
			
		case 050:
			LDFR(generalshort, ea);
		
		case 052:
			STFR(generalshort, ea);
			
		default:
			break;
		}
		
		
		return null;
	}
	
	public void CNVRT(int x,int ea){
		mainFrame.mar=(short)ea;
		mainFrame.mbr=mainFrame.memory.fetch(ea);
		if (mainFrame.GPRs[x]==1) {	
			mainFrame.fr[0] = SwitchMethod.floatToShort((float)mainFrame.mbr);
		}else if (mainFrame.GPRs[x]==0) {
			mainFrame.GPRs[x]=(short)SwitchMethod.shortToFloat(mainFrame.mbr);
			//take c(ea) as a floating point and convert it to a integer with normal format.
		}
	}
	
	public void LDFR(int x,int ea){
		mainFrame.mar=(short)ea;
		mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.fr[x]=mainFrame.mbr;
		System.out.println("mainFrame.fr[x] = "+ mainFrame.fr[x]);
	}
	
	public void STFR(int x, int ea){
		mainFrame.mar=(short)ea;
		mainFrame.mbr=mainFrame.fr[x];
		mainFrame.memory.set(mainFrame.mar, mainFrame.mbr);
	}
	
	public void FADD(int x,int ea){
		float i = SwitchMethod.shortToFloat((short)mainFrame.fr[x]);
		mainFrame.mar=(short)ea;
		mainFrame.mbr=mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.fr[x]=SwitchMethod.floatToShort((i+(float)mainFrame.mbr));
	}
	
	public void FSUB(int x, int ea){
		float i = SwitchMethod.shortToFloat(mainFrame.fr[x]);
		mainFrame.mar=(short)ea;
		mainFrame.mbr=mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.fr[x]=SwitchMethod.floatToShort((i-(float)mainFrame.mbr));
	}
	
	public void VADD(int x, int ea){ 
		int length = mainFrame.fr[x];
		int v1address=mainFrame.memory.fetch(ea);
		int v2address=mainFrame.memory.fetch(ea+1);
		for(int i=0;i<length;i++){
		int v1=mainFrame.memory.fetch(v1address+i)+mainFrame.memory.fetch(v2address+i);	
		mainFrame.memory.set(v1address+i, (short)v1);
		}
	}
	
	public void VSUB(int x, int ea){
		int length = mainFrame.fr[x];
		int v1address=mainFrame.memory.fetch(ea);
		int v2address=mainFrame.memory.fetch(ea+1);
		for(int i=0;i<length;i++){
		int v1=mainFrame.memory.fetch(v1address+i)-mainFrame.memory.fetch(v2address+i);	
		mainFrame.memory.set(v1address+i,(short)v1);
	}
		}
	
	
	
	public void HLT()
	{
		//program is ended.
		//the machine is be stoped. change pc to 2048 
		//after doing this, the program will not respond to the "STEP" or "several steps" button in UI.
		mainFrame.pc = 2048;
	}
	
	public void TRAP(int trapcode)
	{
		mainFrame.memory.set(2,(short)(mainFrame.pc+1));
		int tableaddress = mainFrame.memory.fetch(0);
		int entry = tableaddress+trapcode;
		mainFrame.ir = mainFrame.memory.fetch(entry);
		mainFrame.execute();
		mainFrame.pc = mainFrame.memory.fetch(2);
		mainFrame.fetch();
	}
	
	//Load Register with Address
	public void LDA(int r,short ea){
		mainFrame.GPRs[r] = ea;
	}
	//Load Index Register from Memory
	public void LDX(int x, int addr , int i){
		int ea = 0;
		if(i == 0)
		{
			ea = addr;
		}
		else if(i == 1) {
			mainFrame.mar = (short) addr;
			mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
			ea =mainFrame.mbr; 
		}
		
		mainFrame.mar = (short)ea;
		mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.IXRs[x] = mainFrame.mbr;
	}
	//Store Index Register to Memory
	public void STX(int x, int addr , int i){
		int ea = 0;
		if(i == 0)
		{
			ea = addr;
		}
		else if(i == 1) {
			mainFrame.mar = (short) addr;
			mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
			ea =mainFrame.mbr; 
		}
		
		mainFrame.mbr = mainFrame.IXRs[x];
		mainFrame.mar = (short) ea;
		mainFrame.memory.set(mainFrame.mar,mainFrame.mbr);
		
	}
	//Jump If Zero
	public void JZ(int x , short ea){
	   if (mainFrame.GPRs[x] == 0) {
		   mainFrame.pc=ea;
	   	}
	}
	//Jump If Not Equal
	public void JNE(int x, short ea){
		if (mainFrame.GPRs[x] != 0) {
			mainFrame.pc=ea;
		}
	}
	//Jump If Condition Code
	public void JCC(int x, short ea){
		int temp = mainFrame.cc >>(x-1);
		temp = temp & 0x1;
		if(temp == 1){
			mainFrame.pc=ea;
		}
	}
	//Unconditional Jump To Address
	public void JMA(short ea){
		mainFrame.pc = ea;
	}
	//Jump and Save Return Address
	public void JSR( short ea){
		mainFrame.GPRs[3] = (short) (mainFrame.pc+1);
		mainFrame.pc = ea;
	}
	//Return From Subroutine w/ return code as Immed 
	//portion (optional) stored in the instruction’s address field. 
	public void RFS(int immed){
		mainFrame.GPRs[0] = (short)immed;
		mainFrame.mar = mainFrame.GPRs[3];
		mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.pc = mainFrame.mbr;
	}
	//Subtract One and Branch
	public void SOB(int x, short ea){
		if (mainFrame.GPRs[x] > 0) {
			mainFrame.pc = ea;
			mainFrame.GPRs[x]--;
		}
	}
	//Jump Greater Than or Equal To
	public void JGE(int x, short ea) {
		if (mainFrame.GPRs[x] >= 0) {
			mainFrame.pc = ea;
		}
	}
	//Add Memory To Register
	public void AMR(int x, short ea) {
		mainFrame.mar = ea;
		mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.GPRs[x]=(short) (mainFrame.GPRs[x] + mainFrame.mbr);
	}
	//Subtract Memory From Register
	public void SMR(int x, short ea) {
		mainFrame.mar = ea;
		mainFrame.mbr = mainFrame.memory.fetch(mainFrame.mar);
		mainFrame.GPRs[x] = (short) (mainFrame.GPRs[x] - mainFrame.mbr);
	}
	//Add  Immediate to Register
	public void AIR(int x, int immed) {
		
		mainFrame.GPRs[x]+=(short)immed;
	}
	//Subtract  Immediate  from Register
	public void SIR(int x,int immed) {
		while (immed == 0) {
			break;
		}
		while (mainFrame.GPRs[x] == 0) {
			mainFrame.GPRs[x] = (short)-immed;
		}
		mainFrame.GPRs[x]-=(short)immed;
	}
	//Multiply Register by Register
	public void MLT(int rx,int ry) {
		if(rx ==1|| rx == 3 || ry == 1 || ry == 3)
		{
			System.out.println("Error in function MLT. rx or ry is 1 or 3.");
			return;
		}
		int temp = mainFrame.GPRs[rx] * mainFrame.GPRs[ry];// use type int to avoid precision loss
		mainFrame.GPRs[rx] = (short)(temp>>16);
		mainFrame.GPRs[rx+1] = (short)(temp & 0x00001111);
		if (temp >= Short.MAX_VALUE) {//decide whether there is an overflow
			mainFrame.cc = (short)(mainFrame.cc | 0x0008); //the fouth bits of cc be set to 1 will be 1000,and equals to 8.
		}
	}
	//Divide Register by Register
	public void DVD(int rx, int ry) {
		if(rx ==1|| rx == 3 || ry == 1 || ry == 3)
		{
			System.out.println("Error in function DVD. rx or ry is 1 or 3.");
			return;
		}
		if (mainFrame.GPRs[ry] == 0 ) {
			System.out.println("Divided by zero.");
			mainFrame.cc = (short)(mainFrame.cc | 0x0002); // condition code will set to 0010
			return;
		}	
		int quotient = mainFrame.GPRs[rx] / mainFrame.GPRs[ry];
		int remainder = mainFrame.GPRs[rx] % mainFrame.GPRs[ry];
		mainFrame.GPRs[rx] = (short)quotient;
		mainFrame.GPRs[rx+1] = (short)remainder;
	}
	//Test the Equality of Register and Register
	public void TRR(int rx, int ry) {
		if (mainFrame.GPRs[rx] == mainFrame.GPRs[ry]) {
			mainFrame.cc = (short)(mainFrame.cc| 0x0001); // set the condition code 0001.
		}else{
			mainFrame.cc=(short) (mainFrame.cc & 0xfffe);
			
		}
	}
	//Logical And of Register and Register
	public void AND(int rx, int ry) {
		mainFrame.GPRs[rx]= (short) (mainFrame.GPRs[rx] & mainFrame.GPRs[ry]);
	}
	//Logical Or of Register and Register
	public void ORR(int rx,int ry) {
		mainFrame.GPRs[rx]= (short) (mainFrame.GPRs[rx] | mainFrame.GPRs[ry]);
	}
	//Logical Not of Register To Register
	public void NOT(int rx) {
		mainFrame.GPRs[rx] = (short) ~mainFrame.GPRs[rx];
	}
	//Shift Register by Count
	public void SRC(int x,int left_right,int arithmetic_logical,int count){
		if (count == 0) {
			return;
		}
		if (left_right == 1) {
				mainFrame.GPRs[x]=(short) (mainFrame.GPRs[x]<<count);
		}else{
			if (arithmetic_logical == 1) 
			{
				String s1 = SwitchMethod.logicalShiftRight(SwitchMethod.shortToString(mainFrame.GPRs[x]), count);
				mainFrame.GPRs[x] = SwitchMethod.stringToShort(s1);
			}else{
				mainFrame.GPRs[x]=(short) (mainFrame.GPRs[x]>>>count);
			}
		}
	}
	//Rotate Register by Count
	public void RRC(int x, int count,int a_l, int l_r) {
		if (count == 0) {
			return;
		}
		if (l_r ==1 && a_l==1) {
			String s1 = SwitchMethod.locigalRotate(SwitchMethod.shortToString(mainFrame.GPRs[x]), count, -1);
			mainFrame.GPRs[x] = SwitchMethod.stringToShort(s1);//left rotation
		}else if(l_r == 0 && a_l == 1){
			String s1 = SwitchMethod.locigalRotate(SwitchMethod.shortToString(mainFrame.GPRs[x]), count, 1);
			mainFrame.GPRs[x] = SwitchMethod.stringToShort(s1);//right rotation
		}
	}
	
	//Input struction
	public void IN(int r,int devid)
	{
		System.out.println("In IN function devid = "+devid+".\n");
		switch (devid) {
		case 0:	//console keyboard Program 1, input is number.
			mainFrame.GPRs[r] = (short) Integer.parseInt(mainFrame.keyboard);
			newwindow.keyboardfield.setText("");
			break;
			
		case 2:	//read external file ¡°paragraph¡±
			int bootstart = 500;
			// File file = new File("paragraph.txt");
			File file = new File("paragraph.txt");
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
				String sentence;
				while ((sentence = br.readLine()) != null) 
				{
					// System.out.println(sentence);
					sentence = sentence + "\n";
					for (int j = 0; j < sentence.length(); j++) 
					{
						mainFrame.memory.memory[bootstart] = (short) (sentence.charAt(j));
						bootstart++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 3: //read a word. program 2.
			for(int i = 0 ; i < mainFrame.keyboard.length() ; i++)
			{
				mainFrame.memory.memory[400+i] = (short) mainFrame.keyboard.charAt(i);
			}
			break;
		default:
			System.out.println("Error in IN.");
			break;
		}
	}
	//output
	public void OUT(int r,int devid)
	{
		System.out.println("In OUT function. devid is "+devid);
		switch (devid) 
		{
		case 1: //output number
			String temp =  newwindow.monitor.getText();
			temp = temp + String.valueOf(mainFrame.GPRs[r])+".\n";
			newwindow.monitor.setText(temp);
			break;
		case 2: //output char
			String temp2 =  newwindow.monitor.getText();
			temp2 = temp2 + Character.toString((char)mainFrame.GPRs[r]);
			newwindow.monitor.setText(temp2);
			break;
		default:
			System.out.println("Error in OUT.");
			break;
		}
		
	}
	
	public void CHK(int r , int devid)
	{
		mainFrame.GPRs[r] = (short) mainFrame.deviceStatus[devid];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
