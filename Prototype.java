class Prototype extends Demo  
{  
//derived class default constructor  
Prototype()  
{  
this("Java", "Python");  
System.out.println("Derived class default constructor called");  
}  
//derived class parameterized constructor  
Prototype(String str1, String str2)  
{  
super();  
System.out.println("Derived class parameterized constructor called");  
}  
}  
public class ConstructorChaining  
{  
//main method  
public static void main(String args[])   
{   
//initializes the instance of example class  
Prototype my_example = new Prototype();  
}   
}  

