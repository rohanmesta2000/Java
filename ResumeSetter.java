class ResumeSetter{
public static void main(String[] args){
System.out.println("Invoking main in resume setter");
Resume.format();
Resume.format("CV",1);
Resume.format("CV",2);
Resume.clear();
Resume.delete();
}
}