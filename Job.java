class Job{
static void apply()
{
	System.out.println("Invoking main in job");
	String usn="4SU19ME008";
	System.out.println("Person USN:" +usn);	
}
static void apply(String personName,int experienceYears)
{
System.out.println("Person name:"+personName);
System.out.println("Year of experience:"+experienceYears);
}
static void apply(String companyName,int experienceYears,String refName){
System.out.println("Company name:"+companyName);
System.out.println("Year of experience:"+experienceYears);
System.out.println("Referal name:"+refName);

}
static void apply(int experienceYears)
{
System.out.println("Year of experience:"+experienceYears);
}
static void rejectOffer()
{
	System.out.println("Rejected");
}
}