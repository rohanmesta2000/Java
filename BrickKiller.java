    class BrickKiller{    
		public static void main(String[] args) {
        Brick.printStatic(); 

        Brick brick1 = new Brick("Mud", "Red");
        brick1.printInstance(); 

        Brick brick2 = new Brick(9, "Large");
        brick2.printInstance(); 
    }
	}
	
