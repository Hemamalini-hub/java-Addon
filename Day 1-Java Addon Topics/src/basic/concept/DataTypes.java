package basic.concept;

public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive data types
        //1.Number type
		byte a = 127;
		short b = 32_767;
		int c = 2_147_483_647;
		long d = 9_223_372_036_854_775_807L;
		System.out.println("BYTE:"+a);
		System.out.println("SHORT:"+b);
		System.out.println("INT:"+c);
		System.out.println("LONG:"+d);
		
		//float type
		float e = 1.123456789f;//6 to 7 6 digits precision 
		double f =1.12345678910111245;// 16 digits precision
		System.out.println("FLOAT:"+e);
		System.out.println("DOUBLE:"+f);
		
		// Boolean type
		boolean status = true;
		System.out.println("Boolean:"+status);
		
		// character type
		char initial = 'R';
		System.out.println("char:"+initial);
		
		
		//non-primitive data types
		String name = "ABC";
		System.out.println("String:"+name);
		System.out.println("String:"+name.length());
		System.out.println("String:"+name.toLowerCase());
	}

}
