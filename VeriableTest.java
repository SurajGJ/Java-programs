class VeriableTest{
	
	static int a;
	int b;
	
	public static void main(String pass[])
	{
		int c;
		//System.out.println(c);
		 
		System.out.println("Static veriable : "+a); //default value=0;
		
		VeriableTest test = new VeriableTest();
		test.b=20;
		a=10;
		System.out.println("Static veriable after initilazation : "+a); //10
		
		System.out.println("Instance Veriable : "+test.b); //20
		
		
		VeriableTest test1 = new VeriableTest();
		test1.b=04;
		
		System.out.println("Static veriable after initilazation : "+a); //24
		
		System.out.println("Instance Veriable : "+test.b); //04 	
		a=200;
		System.out.println("a : "+a);
	}
	
}