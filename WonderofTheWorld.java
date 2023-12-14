class WonderofTheWorld{
	public static void main(String[] beautiful)
	{
		System.out.println("world has beautifulplaces....");
		String tajMahal="TajMahal";
		String victoriaFalls="VictoriaFalls";
		String machuPicchu="MachuPicchu";
		String theGreatPyramidofGiza="TheGreatPyramidofGiza";
		String greatWallofChina="GreatWallofChina";
		String collesum="Collesum";
		String petra="Petra";
		String wonders[]={tajMahal,victoriaFalls,machuPicchu,theGreatPyramidofGiza,greatWallofChina,collesum,petra};
		for(int Place=0;Place<wonders.length;Place++)
		System.out.println("Place of the world " +wonders[Place]+"is a looking beautiful"+Place);
	wonders[0]="Banglore";
	String temp=wonders[3];
	System.out.println("\n");
	for(int Place=wonders.length-1;Place>=0;Place-- )
		System.out.println("Place of the world " +wonders[Place]+ " with varity taste " +Place);
	}

}