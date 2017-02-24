package Simulator;
//one Cache line contains 8 words. 

public class CacheLine {
	public int vd;
	public int tag;
	public short[] words;
	
	public CacheLine() {
		// TODO Auto-generated constructor stub
		vd = 0;
		tag = -1;
		words = new short[8];
		for(int i = 0 ; i < words.length ; i++)
			words[i] = 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 = "[vd :"+Integer.toString(vd) +"] [tag:"+Integer.toString(tag)
					+"] words:";
		for(int i = 0 ; i < words.length ; i++)
		{
			s1 = s1 + "["+Integer.toString(words[i])+"] ";
		}
		return s1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CacheLine a = new CacheLine();
		a.words[3] = -0x7fff;
		System.out.println(a.toString());
	}

}
