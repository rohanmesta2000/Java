class SoilKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in SoilKiller");
		
		Soil soil=new Soil("Mud","Smooth");
		Soil.printStatic();
		
		
		Soil soil1=new Soil(90,"red");
		soil1.printInstance();
	}
}