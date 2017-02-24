package Simulator;
/**
 * 
 * **/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.cert.CertPathChecker;
import java.util.ArrayList;
import java.util.PrimitiveIterator.OfDouble;

import javax.management.monitor.Monitor;
import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.MediaName;
import javax.swing.JFrame;
import javax.swing.text.html.parser.Entity;

public class MainFrame extends JFrame {
	
	//General Process Register
	public short[] GPRs;
	//Index Register
	public short[] IXRs,fr;
	//PC,MAR,MBR,IR Register
	public short pc,mar,mbr,ir,msr,mfr,cc;
	public Memory memory;
	//the container of the instruction strings
	public ArrayList<String> instructions;
	public int[] deviceStatus = new int[32];
	
	public String screen;
	public String keyboard;
	
	public int efficientAddress;

	
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		initialization();
	}
	
	//initialize registers and memory
	public void initialization() {
		screen = "";
		keyboard = "";
		GPRs = new short[4];
		IXRs = new short[4];
		fr= new short[2];
		pc = 0;
		cc = 0;
		mar = 0;
		mbr = 0;
		ir = 0;
		memory = new Memory();
		memory.memory[12] = Short.MAX_VALUE;
		memory.memory[0] = 3000;
		instructions = new ArrayList<String>();
		try {
			loadInstructions();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//convert 16-bits binary instruction strings to short. Then put them into memory.
	//put the start address of instructions into PC register. Start addresses of user programs are 1024. 
	public void loadInstructions() throws IOException
	{
		if(instructions == null)
			;
		else {
			//address 0-5 is reserved for system.
			//instructions start at 1024
			//read instructions from code.txt
			BufferedReader reader = new BufferedReader(new FileReader("code.txt"));
			String s1 = reader.readLine();
			while(s1 != null)
			{
				instructions.add(s1);
				s1 = reader.readLine();
			}
			
			//load the program in the address 1024
			for(int i = 0 ; i < instructions.size() ; i++)
			{
				memory.memory[1024+i] = SwitchMethod.stringToShort(instructions.get(i));
			}
			 
			pc = (short)1024;
			mar = pc;
			mbr = memory.fetch(pc);
			ir = mbr;
			
			//pc++
			pc++;
			if(pc > 4096) System.out.println("Overflowed when load instructions, load instructions.");
		}
	}
	
	// load the program 2 and initialize the simulator for the program 2.
	public void initialization2()
	{
		screen = "";
		keyboard = "";
		GPRs = new short[4];
		IXRs = new short[4];
		pc = 0;
		cc = 0;
		mar = 0;
		mbr = 0;
		ir = 0;
		fr[0]=0;
		fr[1]=0;
		memory = new Memory();
		memory.memory[0] = 3000;
		instructions = new ArrayList<String>();
		
		memory.memory[20] = 100;		//start instruction
		memory.memory[21] = 400;		//input start address
		memory.memory[22] = 500;		//sentences start address
		memory.memory[15] = 32;			
		memory.memory[16] = 10;
		memory.memory[9] = 126;
		memory.memory[25] = 135;
		memory.memory[24] = 199;		
		memory.memory[23] = 169;
		memory.memory[2] = 260;
		memory.memory[3] = 230;
		memory.memory[10] = 1000;
		memory.memory[11] = 1100;
		memory.memory[12] = 1200;
		memory.memory[13] = 1300;
		memory.memory[4] = 1000;
		memory.memory[5] = 1100;
		memory.memory[6] = 1200;
		memory.memory[7] = 1300;
		IXRs[1] = 500;
		IXRs[2] = 100;
		IXRs[3] = 400;
		
		try {
			loadInstructions2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//load instructions from the external file.
	public void loadInstructions2() throws IOException
	{
		if(instructions == null)
			;
		else {
			//read instructions from code.txt
			BufferedReader reader = new BufferedReader(new FileReader("code2.txt"));
			String s1 = reader.readLine();
			while(s1 != null)
			{
				instructions.add(s1);
				s1 = reader.readLine();
			}
			
			for(int i = 0 ; i < instructions.size() ; i++)
			{
				memory.memory[100+i] = SwitchMethod.stringToShort(instructions.get(i));
			//	System.out.println(instructions.get(i));
			}
			
			pc = (short)100;
			mar = pc;
			mbr = memory.fetch(pc);
			ir = mbr;
			pc++;
		}
	}
	
	public void initialization3() {
		screen = "";
		keyboard = "";
		GPRs = new short[4];
		IXRs = new short[4];
		pc = 0;
		cc = 0;
		mar = 0;
		mbr = 0;
		ir = 0;
		fr[0]=0;
		fr[1]=0;
		memory = new Memory();
		memory.memory[0] = 3000;
		instructions = new ArrayList<String>();
		
		GPRs[0] = 0;
		GPRs[1] = 1;
		fr[1] = 10;
		IXRs[1] = 200;
		
		memory.memory[10] = 300;
		memory.memory[11] = 400;
		memory.memory[200] = SwitchMethod.floatToShort(4.1f);
		memory.memory[201] = SwitchMethod.floatToShort(4.0f);
		memory.memory[202] = 7;
		memory.memory[203] = SwitchMethod.floatToShort(6.0f);
		
		for(int i =300 ; i<=310 ; i++)
		{
			memory.memory[i] = (short) (15+(i-300));
		}
		
		for(int i = 400 ; i <= 410 ;i++)
		{
			memory.memory[i] = (short) (35+(i-400));
		}
		try {
			loadInstructions3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadInstructions3() throws IOException {
		if(instructions == null)
			;
		else {
			//read instructions from code.txt
			BufferedReader reader = new BufferedReader(new FileReader("code3.txt"));
			String s1 = reader.readLine();
			while(s1 != null)
			{
				instructions.add(s1);
				s1 = reader.readLine();
			}
			
			for(int i = 0 ; i < instructions.size() ; i++)
			{
				memory.memory[1000+i] = SwitchMethod.stringToShort(instructions.get(i));
			//	System.out.println(instructions.get(i));
			}
			
			pc = (short)1000;
			mar = pc;
			mbr = memory.fetch(pc);
			ir = mbr;
			pc++;
		}
	}
	
	/**
	 * this founction is to fetch instruction from memory.
	 * pc-> mar
	 * instruction from memory -> mbr
	 * mbr -> ir
	 * pc+1 -> pc
	 * **/
	public void fetch()
	{
		mar = pc;
		mbr = memory.fetch(mar);
		ir = mbr;
		pc++;
	}
	
	
	/**
	 * This function is to calculate the EA.
	 * 1. convert content of IR to 16-bit binary string.
	 * 2. incise the instruction and get content of specified bits
	 * 3. caluculate the EA
	 * **/
	public int decode()
	{
		String instru = SwitchMethod.shortToString(ir);
		
		int indexshort=Integer.valueOf(instru.substring(8, 10),2) ;
		int I = Integer.valueOf(instru.substring(10,11),2);
		int address = Integer.valueOf(instru.substring(11,16),2);
		
		//caculate ea
		/**
		 * Effective Address (EA) = 
			if I = 0: 
					// NO indirect addressing			
					if IX = 00, EA = contents of the Address field
					// just indexing
					if IX = 1..3, c(Xj) + contents of the Address field, where j = c(IX)
					// that is, the IX field has an index register number, the contents of 
			 		which are added to the contents of the address field
			if I = 1: 
					// indirect addressing, but NO indexing
					if IX = 00, c(Address)
					// both indirect addressing and indexing
					if IX = 1..3, c(c(Xj) + Address), where j = c(IX)
		 * **/
		int ea = 0;
		if(I == 0)
		{
			if(indexshort == 0)
			{
				ea = address;
			}
			else {
				ea =  IXRs[indexshort] + address;
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
				indirectAdress = address + IXRs[indexshort];
			}
			if(indirectAdress > Short.MAX_VALUE)
			{
				System.out.println("overflow");
				return 0;
			}
			else if(indirectAdress < Short.MIN_VALUE){
				System.out.println("underflow.");
				return 0;
			}
			mar = (short)indirectAdress;
			mbr = memory.fetch(mar);
			ea = mbr;
		}
		return ea;
	}
	
	
	/**
	 * execute operations according to the opcode.
	 * **/
	public void execute() {
		//parse present instruction and get the special bits that may be useful.
		String instru = SwitchMethod.shortToString(ir);
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
		short ea = (short)decode();
		
		//Then execute the operation.
		//when opcode is 1, the operation is loading content from memory.
		//when opcode is 2, we need to store content.
		
		System.out.println("In execute function opcode = "+ Integer.toOctalString(opcode));

	
		switch (opcode) {
		case 00://halt
			HLT();
			break;
		
		case 01://load
			mar = (short)ea;
			mbr = memory.fetch(mar);
			GPRs[generalshort] = mbr;
			break;
			
		case 02://store
			mar = (short)ea;
			mbr = GPRs[generalshort];
			memory.set(mar, mbr);
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
			break;
			
		case 035:
			VADD(generalshort,ea);
			break;
			
		case 053:
			VSUB(generalshort,ea);
			break;
			
		case 054:
			CNVRT(generalshort, ea);
			break;
			
		case 050:
			LDFR(generalshort, ea);
			break;
			
		case 051:
			STFR(generalshort, ea);
			break;
			
		default:
			break;
		}
	}
	
	public void CNVRT(int x,int ea){
		mar=(short)ea;
		mbr=memory.fetch(ea);
		if (GPRs[x]==1) {	
			fr[0] = SwitchMethod.floatToShort((float)mbr);
		}else if (GPRs[x]==0) {
			GPRs[x]=(short)SwitchMethod.shortToFloat(mbr);
			//take c(ea) as a floating point and convert it to a integer with normal format.
		}
	}
	
	public void LDFR(int x,int ea){
		mar=(short)ea;
		mbr = memory.fetch(mar);
		fr[x]=mbr;
		System.out.println("fr[x] = "+ fr[x]);
	}
	
	public void STFR(int x, int ea){
		System.out.println("STFR: ea"+ ea);
		mar=(short)ea;
		mbr=fr[x];
		memory.set(mar, mbr);
	}
	
	public void FADD(int x,int ea){
		float i = SwitchMethod.shortToFloat((short)fr[x]);
		mar=(short)ea;
		mbr=memory.fetch(mar);
		fr[x]=SwitchMethod.floatToShort((i+ SwitchMethod.shortToFloat(mbr)));
	}
	
	public void FSUB(int x, int ea){
		float i = SwitchMethod.shortToFloat(fr[x]);
		mar=(short)ea;
		mbr=memory.fetch(mar);
		System.out.println("FSUB: mbr"+ SwitchMethod.shortToFloat(mbr));
		fr[x]=SwitchMethod.floatToShort((i- SwitchMethod.shortToFloat(mbr)));
	}
	
	public void VADD(int x, int ea){ 
		int length = fr[x];
		int v1address=memory.fetch(ea);
		int v2address=memory.fetch(ea+1);
		for(int i=0;i<=length;i++){
		int v1=memory.fetch(v1address+i)+memory.fetch(v2address+i);	
		memory.set(v1address+i, (short)v1);
		}
	}
	
	public void VSUB(int x, int ea){
		int length = fr[x];
		int v1address=memory.fetch(ea);
		int v2address=memory.fetch(ea+1);
		for(int i=0;i<=length;i++){
		int v1=memory.fetch(v1address+i)-memory.fetch(v2address+i);	
		memory.set(v1address+i,(short)v1);
	}
		}
	
	
	
	public void HLT()
	{
		//program is ended.
		//the machine is be stoped. change pc to 2048 
		//after doing this, the program will not respond to the "STEP" or "several steps" button in UI.
		pc = 2048;
	}
	
	public void TRAP(int trapcode)
	{
		memory.set(2,(short)(pc+1));
		int tableaddress = memory.fetch(0);
		int entry = tableaddress+trapcode;
		ir = memory.fetch(entry);
		execute();
		pc = memory.fetch(2);
		fetch();
	}
	
	//Load Register with Address
	public void LDA(int r,short ea){
		GPRs[r] = ea;
	}
	//Load Index Register from Memory
	public void LDX(int x, int addr , int i){
		int ea = 0;
		if(i == 0)
		{
			ea = addr;
		}
		else if(i == 1) {
			mar = (short) addr;
			mbr = memory.fetch(mar);
			ea =mbr; 
		}
		
		mar = (short)ea;
		mbr = memory.fetch(mar);
		IXRs[x] = mbr;
	}
	//Store Index Register to Memory
	public void STX(int x, int addr , int i){
		int ea = 0;
		if(i == 0)
		{
			ea = addr;
		}
		else if(i == 1) {
			mar = (short) addr;
			mbr = memory.fetch(mar);
			ea =mbr; 
		}
		
		mbr = IXRs[x];
		mar = (short) ea;
		memory.set(mar,mbr);
		
	}
	//Jump If Zero
	public void JZ(int x , short ea){
	   if (GPRs[x] == 0) {
		pc=ea;
	   	}
	}
	//Jump If Not Equal
	public void JNE(int x, short ea){
		if (GPRs[x] != 0) {
			pc=ea;
		}
	}
	//Jump If Condition Code
	public void JCC(int x, short ea){
		int temp = cc >>(x-1);
		temp = temp & 0x1;
		if(temp == 1){
			pc=ea;
		}
	}
	//Unconditional Jump To Address
	public void JMA(short ea){
		pc = ea;
	}
	//Jump and Save Return Address
	public void JSR( short ea){
		GPRs[3] = (short) (pc+1);
		pc = ea;
	}
	//Return From Subroutine w/ return code as Immed 
	//portion (optional) stored in the instruction’s address field. 
	public void RFS(int immed){
		GPRs[0] = (short)immed;
		mar = GPRs[3];
		mbr = memory.fetch(mar);
		pc = mbr;
	}
	//Subtract One and Branch
	public void SOB(int x, short ea){
		if (GPRs[x] > 0) {
			pc = ea;
			GPRs[x]--;
		}
	}
	//Jump Greater Than or Equal To
	public void JGE(int x, short ea) {
		if (GPRs[x] >= 0) {
			pc = ea;
		}
	}
	//Add Memory To Register
	public void AMR(int x, short ea) {
		mar = ea;
		mbr = memory.fetch(mar);
		GPRs[x]=(short) (GPRs[x] + mbr);
	}
	//Subtract Memory From Register
	public void SMR(int x, short ea) {
		mar = ea;
		mbr = memory.fetch(mar);
		GPRs[x] = (short) (GPRs[x] - mbr);
	}
	//Add  Immediate to Register
	public void AIR(int x, int immed) {
		
		GPRs[x]+=(short)immed;
	}
	//Subtract  Immediate  from Register
	public void SIR(int x,int immed) {
		while (immed == 0) {
			break;
		}
		while (GPRs[x] == 0) {
			GPRs[x] = (short)-immed;
		}
		GPRs[x]-=(short)immed;
	}
	//Multiply Register by Register
	public void MLT(int rx,int ry) {
		if(rx ==1|| rx == 3 || ry == 1 || ry == 3)
		{
			System.out.println("Error in function MLT. rx or ry is 1 or 3.");
			return;
		}
		int temp = GPRs[rx] * GPRs[ry];// use type int to avoid precision loss
		GPRs[rx] = (short)(temp>>16);
		GPRs[rx+1] = (short)(temp & 0x00001111);
		if (temp >= Short.MAX_VALUE) {//decide whether there is an overflow
			cc = (short)(cc | 0x0008); //the fouth bits of cc be set to 1 will be 1000,and equals to 8.
		}
	}
	//Divide Register by Register
	public void DVD(int rx, int ry) {
		if(rx ==1|| rx == 3 || ry == 1 || ry == 3)
		{
			System.out.println("Error in function DVD. rx or ry is 1 or 3.");
			return;
		}
		if (GPRs[ry] == 0 ) {
			System.out.println("Divided by zero.");
			cc = (short)(cc | 0x0002); // condition code will set to 0010
			return;
		}	
		int quotient = GPRs[rx] / GPRs[ry];
		int remainder = GPRs[rx] % GPRs[ry];
		GPRs[rx] = (short)quotient;
		GPRs[rx+1] = (short)remainder;
	}
	//Test the Equality of Register and Register
	public void TRR(int rx, int ry) {
		if (GPRs[rx] == GPRs[ry]) {
			cc = (short)(cc| 0x0001); // set the condition code 0001.
		}else{
			cc=(short) (cc& 0xfffe);
			
		}
	}
	//Logical And of Register and Register
	public void AND(int rx, int ry) {
		GPRs[rx]= (short) (GPRs[rx] & GPRs[ry]);
	}
	//Logical Or of Register and Register
	public void ORR(int rx,int ry) {
		GPRs[rx]= (short) (GPRs[rx] | GPRs[ry]);
	}
	//Logical Not of Register To Register
	public void NOT(int rx) {
		GPRs[rx] = (short) ~GPRs[rx];
	}
	//Shift Register by Count
	public void SRC(int x,int left_right,int arithmetic_logical,int count){
		if (count == 0) {
			return;
		}
		if (left_right == 1) {
				GPRs[x]=(short) (GPRs[x]<<count);
		}else{
			if (arithmetic_logical == 1) 
			{
				String s1 = SwitchMethod.logicalShiftRight(SwitchMethod.shortToString(GPRs[x]), count);
				GPRs[x] = SwitchMethod.stringToShort(s1);
			}else{
				GPRs[x]=(short) (GPRs[x]>>>count);
			}
		}
	}
	//Rotate Register by Count
	public void RRC(int x, int count,int a_l, int l_r) {
		if (count == 0) {
			return;
		}
		if (l_r ==1 && a_l==1) {
			String s1 = SwitchMethod.locigalRotate(SwitchMethod.shortToString(GPRs[x]), count, -1);
			GPRs[x] = SwitchMethod.stringToShort(s1);//left rotation
		}else if(l_r == 0 && a_l == 1){
			String s1 = SwitchMethod.locigalRotate(SwitchMethod.shortToString(GPRs[x]), count, 1);
			GPRs[x] = SwitchMethod.stringToShort(s1);//right rotation
		}
	}
	
	//Input struction
	public void IN(int r,int devid)
	{
		System.out.println("In IN function devid = "+devid+".\n");
		switch (devid) {
		case 0:	//console keyboard Program 1, input is number.
			GPRs[r] = (short) Integer.parseInt(keyboard);
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
						memory.memory[bootstart] = (short) (sentence.charAt(j));
						bootstart++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 3: //read a word. program 2.
			for(int i = 0 ; i < keyboard.length() ; i++)
			{
				memory.memory[400+i] = (short) keyboard.charAt(i);
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
			temp = temp + String.valueOf(GPRs[r])+".\n";
			newwindow.monitor.setText(temp);
			break;
		case 2: //output char
			String temp2 =  newwindow.monitor.getText();
			temp2 = temp2 + Character.toString((char)GPRs[r]);
			newwindow.monitor.setText(temp2);
			break;
		default:
			System.out.println("Error in OUT.");
			break;
		}
		
	}
	
	public void CHK(int r , int devid)
	{
		GPRs[r] = (short) deviceStatus[devid];
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();;
		mainFrame.memory.memory[100]=16448;
		mainFrame.GPRs[1]=0;
		mainFrame.LDFR(1, 100);
		mainFrame.CNVRT(1, 100);;
		System.out.println("gpr[1] = " + mainFrame.GPRs[1]);
		System.out.println("fr[0] = " + SwitchMethod.shortToFloat(mainFrame.fr[0]));
		
	}
}
