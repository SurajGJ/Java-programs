class RelationalOperator{
	public static void main(String [] group)
	{
		int a=10;
		int b=12;
		boolean result =a<b;
		System.out.println("a value : "+a);
		System.out.println("b value : "+b);
		
		System.out.println("a<b : "+result);
		result =a>--b;
		System.out.println("a>b : "+result);
		result =a--==b;
		System.out.println("a==b : "+result);
		result =a++<=b;
		System.out.println("a<=b : "+result);
		result =a>=++b;
		System.out.println("a>=b : "+result);
		result =--a!=b;
		System.out.println("a!=b : "+result);
		System.out.println();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}/*
a=10	b=12; //line4 and 5
a=10 	b=11; //line 11
a=10 	b=11; a=9	b=11 //line 13
a=9		b=11; a=10	b=11 //line 15
a=10	b=12 //line 17
a=9		b=12 /line 19  */