class LogicalOperator{
	public static void main(String[] Gang)
	{
		int a=15;
		int b=13;
		boolean result;
		System.out.println("a value : "+a);
		System.out.println("b value : "+b);
		
		result = (a==b)||(a<b);
		System.out.println("(a==b)||(a<b) : "+result);
		result = (a>b++)||(--a!=b);                               
		System.out.println("(a>b++)||(--a!=b) : "+result);
		
		result = (++a>=b)&&(a<=++b); 						
		System.out.println("(++a>=b--)||(a--<=++b) : "+result);
		
		result = (a>=b--)&&(a--<=b); 						
		System.out.println("(++a>=b--)||(a--<=++b) : "+result);
		ystem.out.println("b : "+b);
															
		result = (a==b)&&(a>=b);
		System.out.println("(a==b)&&(a>=b) : "+result);
		
		System.out.println();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}