class Student extends StudentName{  
    int id;  
    String name;    
    Student(int i,String a){  
    System.out.println("It is a parametrized constructor");
    }  
   
    //public Student(){
		//System.out.println("default constructor");
		//}
   
    public static void main(String args[]){  
  
    Student s1 = new Student(1,"Rohan");  
	 
   }  
}