class GroceryItem{
	public static void main(String[] spicy)
	{
		System.out.println("running in grocery item...");
		String sugar="Sugar";
		String teaPowder="TeaPowder";
		String coffeePowder="CoffeePowder";
		String rice="Rice";
		String wheat="Wheat";
		String butter="Butter";
		String milk="Milk";
		
        String groceries[]={sugar,teaPowder,coffeePowder,rice,wheat,butter,milk};
		for (int Product=0;Product<groceries.length;Product++)
		System.out.println("Grocery" +groceries[Product]+ " is at a position" +Product);
	groceries[6]="Ghee";
	 String temp=groceries[6];
	 System.out.println("\n");
		for (int Product=groceries.length-1;Product>=0;Product--)
		System.out.println("Grocery" +groceries[Product]+ " is at a position" +Product);
	    
		
	}
} 