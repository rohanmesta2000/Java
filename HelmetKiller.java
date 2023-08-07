class HelmetKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in HelmetKiller");
		
		Helmet helmet=new Helmet("ISI","Full face");
		Helmet.printStatic();
		
		
		Helmet helmet1=new Helmet(9,"black");
		helmet1.printInstance();
	}
}