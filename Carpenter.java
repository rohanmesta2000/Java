class Carpenter{
	static void branch()
	{
		System.out.println("I am from ...");
	}
	static void carpenter()
	{
		System.out.println("i am civil engineering department");
	}
	static void carpenter(String carpenterName, int salary)
	{
		System.out.println("carpenter Name :" + carpenterName);
		System.out.println("carpenter Salary:"  +salary);
	}
	static void carpenter(String subject) {
    System.out.println("i lean " + subject);
    }
  
    static void cut(int quantity) {
        System.out.println("Cutting the material:" +quantity);
    }

    static void join(int joined) {
        System.out.println("Joining the pieces together:" +joined);
    }


    static void sand() {
        System.out.println("Sanding the surface...");
    }

   
    static void paint() {
        System.out.println("Applying paint or varnish...");
    }

  
    static void repair() {
        System.out.println("Repairing the damaged area...");
    }
	
    static void polish() {
        System.out.println("Polishing the surface...");
    }

}