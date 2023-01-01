class StarGame2{
	public static void main (String[] args){
		int n=8;
		for(int i=0; i<=3; i++){
			for(int j=0; j<=n; j++){
				if(j==4 || i==j || j== n-i){
					System.out.print("*");
				}
				else{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}
}