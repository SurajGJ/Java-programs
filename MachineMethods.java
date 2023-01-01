class MachineMethods{
	public static void main(String[] Tech){
		MachineMethods object = new MachineMethods();
		
		object.Machine();
		object.Loadtype();
	}
	
	void Washing(){
		System.out.println("Which machine is used to wash cloths");
	}
	void Machine(){
		Washing();
		System.out.println("Washing machine used to wash cloths ");
	}
	void Loadtype(){
		System.out.println("The are 2 load types");
		System.out.println("1: Top load ");
		System.out.println("2: Front load ");
	}
}