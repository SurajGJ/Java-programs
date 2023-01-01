class Diagonal2Star{
	public static void main(String[] group){
		int n=5;
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if(i==0 || j==0 || i==n-1 || j==n-1 || (i==1 && j==n-4)|| (i==2 && j==n-3)|| (i==3 && j==3)){
				    System.out.print("*"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}