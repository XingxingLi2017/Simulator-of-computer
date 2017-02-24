package Simulator;

/**
 * This class provides several static function to converts Short to binary String 
 * or to converts binary String to Short. These function will be useful when we need 
 * to display the content of registers. 
 * **/

public class SwitchMethod {
	
	/**
	 * change 16-bit binary string to short
	 * @param target string
	 * **/
	public static short stringToShort(String byteString)
	{
		if(byteString.charAt(0) == '0')
		{
			return (short)Integer.parseInt(byteString,2);
		}
		else
		{
			return (short)(Integer.parseInt(byteString,2)-65536);
		}
	}
	
	
	/**
	 * change short to 16-bit binary string
	 * @param short target number
	 * **/
	public static String shortToString(short target)
	{
		String s = "";
		for(int i = 15 ; i >= 0 ; i -- )
		{
			s = s + (short)((target>>i) & 0x1);
		}
		return s;
	}
	
	public static String logicalShiftRight(String target, int count)
	{
		String s1 = "";
		for(int i = 0 ; i < 16 ; i++)
		{
			if( i < count)
			{
				s1 = s1+'0';
			}
			else {
				s1 = s1 + target.charAt(i-count);
			}
		}
		
		return s1;
	}
	
	/**
	 * count is the number of characters needed to shift.
	 * direction: 1 right ; -1 left.
	 * **/
	public static String locigalRotate(String target , int count , int direction)
	{
		String s1 = "";
		
		//right shift
		if(direction == 1)
		{
			String s2 = target.substring(target.length()-count);
			s1 = s2 + target.substring(0, target.length()-count);
		}
		else if(direction == -1)
		{
			String s2 = target.substring(0, count);
			s1 = target.substring(count)+s2;
		}
		else {
			System.out.println("locigalRotate: direction error.");
		}
		
		return s1;
	}
	
	//change short to float based on the given format
	//the Exponent is expressed by shifting code which is based on 63.
	public static float shortToFloat(short i)
	{
		float result=0;
		if(i == 0)
		{
			return result;
		}
		String fr = SwitchMethod.shortToString(i);
		
		float man=0;
		
		for(int j=8;j<16;j++){
			man=(float) (man+(Integer.valueOf(fr.substring(j, j+1),2))*(Math.pow(2, 7-j)));
		}
		
		 
		int exp= Integer.valueOf(fr.substring(1, 8),2) - 63;

		
		
		int sign = Integer.valueOf(fr.substring(0, 1),2);
		if(sign==1){
			sign = -1;
		}else if(sign ==0){
			sign = 1;
		}
	
		result= (float) (sign * (1 + man) * Math.pow(2, exp));
		return result;
	}
	
	
	//change floatToShort based on the given format
	public static short floatToShort(float x)
	{
		if(x == 0)
		{
			return 0;
		}
		
		short result = 0;
		String s1 = Integer.toBinaryString(Float.floatToIntBits(x));
		if(s1.length() < 32)
		{
			int temp = 32 - s1.length();
			for(int j = 0 ; j < temp ; j++)
			{
				s1  = '0' + s1;
			}
		}
		
		int exp= Integer.valueOf(s1.substring(1, 9),2) - 127;
	
		exp = exp + 63;
		String expString = Integer.toBinaryString(exp);
		if(expString.length() < 7)
		{
			int temp = 7 - expString.length();
			for(int j = 0 ; j < temp ; j++)
			{
				expString  = '0' + expString;
			}
		}
		
		
		String s2 = s1.substring(0, 1) + expString + s1.substring(9, 17);
		result = stringToShort(s2);
		return result;
	}
	
	public static void main(String[] args) {
		 float f = 2.1f;
		 short x = floatToShort(f);
		 System.out.println(shortToString(x));
		 System.out.println(shortToFloat(x));
		 String s1 = "0100000111000000";
		 short a = stringToShort(s1);
		 System.out.println(shortToFloat(a));
		
	}

}

