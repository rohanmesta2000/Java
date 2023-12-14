class Biscuit{
	public static void main(String[] taste)
	{
		System.out.println("running in a tasted food....");
		String goodday="Goodday";
		String oreo="Oreo";
		String monaco="Monaco";
		String jimjam="Jimjam";
		String hideAndSeek="HideAndSeek";
		String twentyTwenty="TwentyTwenty";
		String bourborn="Borborn";
		String biscuities[]={goodday,oreo,monaco,jimjam,hideAndSeek,twentyTwenty,bourborn};
		for(int Name=0;Name<biscuities.length;Name++)
		System.out.println("Biscuit" +biscuities[Name]+"is a hard type"+Name);
	biscuities[3]="HappyHappy";
	String temp=biscuities[3];
	for(int Name=biscuities.length-1;Name>=0;Name-- )
		System.out.println("My favourite biscuities name is " +biscuities[Name]+ " with varity taste " +Name);
	}

}