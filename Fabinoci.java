class Fabinoci{
	public static void main(String [] args){
		int n1=0;
		int n2=1;
		int total=12;
		int n3;
		System.out.print(n1+" "+n2+" ");
		
		for (int i=1; i<=total; i++){
			n3=n1+n2;
			System.out.print(n3+" ");
			
			n2=n3;
			n1=n2;
		}
	}
}