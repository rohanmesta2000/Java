class Vegetable{
	public static void main(String[] health)
	{
		System.out.println("eating vegetablesis good for health....");
		float tomato=39;
		float onion=70;
		float potato=60;
		float carrot=55;
		float cabbage=20;
		float raddish=47;
		float ginger=140;
		float vegetables[]={ginger,tomato,onion,potato,carrot,cabbage,raddish};
		for(int Market=0;Market<vegetables.length;Market++)
		System.out.println("Now a days" +vegetables[Market]+" rate is high"+Market);
	vegetables[2]=130;
	float temp=vegetables[2];
	System.out.println("\n");
	for(int Market=vegetables.length-1;Market>=0;Market-- )
		System.out.println("Now a days" +vegetables[Market]+" rate is high"+Market);
	}

}`