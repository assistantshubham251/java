class VaraibleExample {

    static int num = 55; 
	
	long numl = 54321980;
	
	public void disply(){
	     char a = 'M';
		 double num2 = 45.355;
		 System.out.println("local variable value : " +a);
		 System.out.println("local variable value : "+num2);
	}
	
	public static void calc(){
	     double b = 99.34;
		 double c = 45.23;
         double res =b * c;
		 System.out.println("Result is : " +res);
		 
	}
	
  public static void main(String args[]){
    VaraibleExample obj = new VaraibleExample();
	obj.disply();
	calc();
	System.out.println("Instance variable value : " +obj.numl);
	System.out.println("Static variable value : " +num);
	}
}
