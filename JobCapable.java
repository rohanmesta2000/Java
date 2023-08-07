class JobCapable{
	public static void main(String[] args){
	System.out.println("invoking main in job capable");
	Job.apply();
	Job.apply("arun",4);
	Job.apply("wipro",4, "prajwal");
	Job.apply(4);
	Job.rejectOffer();
	}
}