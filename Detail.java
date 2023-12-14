public class Detail {
	
	String firstName;
	String lastName;
	int age;
	
	public Detail(){
	 System.out.println(" Default Constructor")
	}
	
  //Detail constructor
  public Detail(String firstName){
	  this.firstName=firstName;
	  System.out.println("invoking in firstName")
      
  }
    public Detail(String firstName,String lastName){
	  this(firstName);
	  this.lastName=lastName;
	  System.out.println("invoking in firstName and lastName")
      
  }
  
  
  
  
  public static void main(String args[]) {
      Detail detail= new Detail();
      System.out.println(detail.age);
  }
}