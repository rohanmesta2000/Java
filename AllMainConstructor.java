class AllMainConstructor{
	public static void main(String[] args) {
        System.out.println("Invoking main in Wood");
		Wood wood=new Wood("red","banyan",true,false,false);
	
	    System.out.println("Invoking main in Mall");
		Mall mall=new Mall("LULU","Banglore",1000,true,false,true,true);
		
	    System.out.println("Invoking main in Park");
		Park park=new Park("Varsh place","banglore",89,true,false,false,true,true,true);
	}
}