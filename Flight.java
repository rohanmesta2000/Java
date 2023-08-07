class Flight{
	public static void main(String[] sky)
	{
		System.out.println("world has beautifulsky....");
		String indiGo="IndiGo";
		String airIndia="AirIndia";
		String spiceJet="SpiceJet";
		String airAsiaIndia="AirAsiaIndia";
		String saudia="Saudia";
		String qatarAirways="QatarAirways";
		String allianceAir="AllianceAir";
		String planes[]={indiGo,airAsiaIndia,airIndia,allianceAir,saudia,qatarAirways,spiceJet};
		for(int Air=0;Air<planes.length;Air++)
		System.out.println("Place of the world " +planes[Air]+"is a looking beautiful"+Air);
	planes[2]="Sugama";
	String temp=planes[2];
	System.out.println("\n");
	for(int Air=planes.length-1;Air>=0;Air-- )
		System.out.println("Place of the world " +planes[Air]+ " with varity taste " +Air);
	}

}