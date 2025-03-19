/*package core;

public class MethodExample {
	/*public static void main(String args[]) {
	   int a = 10;
	   System.out.println(a);
   }
   void NextFun() {
   
   }*/
	
	
 //class kula
 	//1.Member variable Can access to getter and setter
  /*private int a=10;
  private String myName = "Ram";
    
  public int getA() {
	  return a;
  }
  public void setA(int a) {
	  this.a = a;
  }
  
  public String getMyName() {
	return myName;
}

public void setMyName(String myName) {
	this.myName = myName;//this method class inside indicate the variables
}
*/




   
   /**
    * Function syntax
    * Access-specifiers{public,private(access to within the class only variables),protected} return-type function name(arguments){
    * //block function
    * function statement
    * }
    */
   //without arguments with return type
    /*String display1() {
	   return "Display Function Return this statement";
   }
   
   
   /*public int display() {
	   return a;
   }*/
   
   
   //without arguments with return type
 /* String display2(String fname,String lname, int age) {
	   System.out.println(age);
	   return fname + lname;
   }
   
   
   
   //without arguments with return type
   public void display2() {
	   System.out.println("Test method");
   }
   */
   
 	//2.Member function
   /*public static void main(String args[]) {
	   System.out.println(a);
   }*/

package core;

public class MethodExample {
	
	// Member Variable can access to getter and setter
	private int a = 10;
	private String myName = "Hemamalini";
	
	public int getA() {
		return a;
	}

	public String getMyName() {
		return myName;
	}

//	public void setMyName(String myName) {
//		this.myName = myName;
//	}

	/**
	 * Function Syntax:
	 * access-specifiers return-type function-name(arguments){
	 * 	function statement
	 * }
	 */
	// Without argument without return type
	private void display() {
		System.out.println("Test Method");
	}
	
	// Without argument with return type
	
	public String display1() {
		display();
		return myName;
	}
	
	// with argument with return type
	public String display2(String fname, String lname, int age) {
		System.out.println(age);
		return fname + lname; 
	}
	
}

