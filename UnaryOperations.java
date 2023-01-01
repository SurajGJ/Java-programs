class UnaryOperations{
	
	public static void main(String work[]){
		
		int a = 10;
		
		int b = a++; 
		System.out.println();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c = (--b)+(--a); 
		
		System.out.println();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		c++;
		++a;
		b--;
		
		System.out.println();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println();
		System.out.println(a--); //11
		System.out.println(b+c); //28
		System.out.println(--b); //7
		System.out.println(c);
		System.out.println(b+c); //27
	}
}
//a=10  b=10
//a=11 b=10
//b=9  a=10
//c=20 a=11 b=8


//a=10
//b10  a=11
//b=9  a=10 c=19
//c=20 a=11 b=8
//a=10 b=7  c=