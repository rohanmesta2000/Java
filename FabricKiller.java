class FabricKiller{
	public static void main(String[] values){
	System.out.println("Invoking main in FabricKiller");
	
	int ref1=Fabric.getPrice("cotton");
	System.out.println("Ref 1 is:"+ref1);
	int ref2=Fabric.getPrice("nylon");
	System.out.println("Ref 2 is:"+ref2);
	int ref3=Fabric.getPrice("woolen");
	System.out.println("Ref 3 is:"+ref3);
	int ref4=Fabric.getPrice("linen");
	System.out.println("Ref 4 is:"+ref4);
	int ref5=Fabric.getPrice("polyster");
	System.out.println("Ref 5is:"+ref5);
	int ref6=Fabric.getPrice("silk");
	System.out.println("Ref 6is:"+ref6);
	}
}