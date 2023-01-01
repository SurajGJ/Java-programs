class NestedIfCondition{
	public static void main(String[] args)
	{
		int stream=10;
		boolean status=false;
		
		if(stream == 1)
		{
			System.out.println("You are eligible to apply for this Job");
		}
		else
		{
			System.out.println("not eligible");
		}
			if(status==false){
				System.out.println("You can apply for this job, as you know the Java Knowledge");
			}
			else
			{
				System.out.println("First get Knowledge of Java and then apply for the job");
			}
	}
}