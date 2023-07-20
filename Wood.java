class Wood{
	String color;
	String type;
	boolean isSuitableForConstruction;
	boolean isFlammable;
	boolean isDurable;
	Wood()
	{
		System.out.println(" invoking woods for construction");
	}
	Wood(String color)
	{
		super();
		System.out.println(" invoking String woods for construction");
		this.color=color;
		System.out.println("Color :"+color);
	}
	Wood(String color,String type)
	{
		this(color);
		System.out.println(" invoking String,String woods for construction");
		this.type=type;
		System.out.println("Color and Type:"+color +","+type);
	}
	Wood(String color,String type,boolean isSuitableForConstruction)
	{
		this(color,type);
		System.out.println(" invoking String,String,boolean woods for construction");
		this.isSuitableForConstruction=isSuitableForConstruction;
		System.out.println("Color and Type and IsSuitableForConstruction :"+color +","+type+","+isSuitableForConstruction);
	}
	Wood(String color,String type,boolean isSuitableForConstruction,boolean isFlammable)
	{
		this(color,type,isSuitableForConstruction);
		System.out.println(" invoking String,String,boolean woods for construction");
		this.isFlammable=isFlammable;
		System.out.println("Color and Type and IsSuitableForConstruction and IsFlammable:"+color +","+type+","+isSuitableForConstruction+","+isFlammable);
	}
	Wood(String color,String type,boolean isSuitableForConstruction,boolean isFlammable,boolean isDurable)
	{
		this(color,type,isSuitableForConstruction,isFlammable);
		System.out.println(" invoking String,String,boolean,boolean,boolean woods for construction");
		this.isDurable=isDurable;
		System.out.println("Color and Type and IsSuitableForConstruction and IsFlammable and IsDurable:"+color +","+type+","+isSuitableForConstruction+","+isFlammable+","+isDurable);
	}
	
}