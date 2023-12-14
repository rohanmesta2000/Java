class DoorBellKiller{
public static void main (String[] args)
{
    System.out.println();

    System.out.println("Invoking main in DoorBellKiller");

    DoorBell sound=new DoorBell();

    System.out.println();

    DoorBell sound7 =new DoorBell("Smart Doorbells");
        System.out.println("Brand : " + sound7.brand);
        System.out.println("NumberOfButtons : " + sound7.numberOfButtons);
        System.out.println("HasCamera: " + sound7.hasCamera);
        System.out.println("IsWireless: " + sound7.isWireless);
        System.out.println("HasMotionSensor: " + sound7.hasMotionSensor);
		System.out.println("IsMuted: " + sound7.isMuted);
        System.out.println("IsRinging: " + sound7.isRinging);

    System.out.println();

    DoorBell sound1 =new DoorBell("Smart Doorbells",1);
        System.out.println("Brand : " + sound1.brand);
        System.out.println("NumberOfButtons : " + sound1.numberOfButtons);
        System.out.println("HasCamera: " + sound1.hasCamera);
        System.out.println("IsWireless: " + sound1.isWireless);
        System.out.println("HasMotionSensor: " + sound1.hasMotionSensor);
		System.out.println("IsMuted: " + sound1.isMuted);
        System.out.println("IsRinging: " + sound1.isRinging);

    System.out.println();

    DoorBell sound2 =new DoorBell("Smart Doorbells",1,true);
        System.out.println("Brand : " + sound2.brand);
        System.out.println("NumberOfButtons : " + sound2.numberOfButtons);
        System.out.println("HasCamera: " + sound2.hasCamera);
        System.out.println("IsWireless: " + sound2.isWireless);
        System.out.println("HasMotionSensor: " + sound2.hasMotionSensor);
		System.out.println("IsMuted: " + sound2.isMuted);
        System.out.println("IsRinging: " + sound2.isRinging);

    System.out.println();

     DoorBell sound3 =new DoorBell("Smart Doorbells",1,true,true);
        System.out.println("Brand : " + sound3.brand);
        System.out.println("NumberOfButtons : " + sound3.numberOfButtons);
        System.out.println("HasCamera: " + sound3.hasCamera);
        System.out.println("IsWireless: " + sound3.isWireless);
        System.out.println("HasMotionSensor: " + sound3.hasMotionSensor);
		System.out.println("IsMuted: " + sound3.isMuted);
        System.out.println("IsRinging: " + sound3.isRinging);

    System.out.println();

    DoorBell sound4 =new DoorBell("Smart Doorbells",1,true ,true,false);
        System.out.println("Brand : " + sound4.brand);
        System.out.println("NumberOfButtons : " + sound4.numberOfButtons);
        System.out.println("HasCamera: " + sound4.hasCamera);
        System.out.println("IsWireless: " + sound4.isWireless);
        System.out.println("HasMotionSensor: " + sound4.hasMotionSensor);
		System.out.println("IsMuted: " + sound4.isMuted);
        System.out.println("IsRinging: " + sound4.isRinging);
		
		System.out.println();

    DoorBell sound5 =new DoorBell("Smart Doorbells",1,true ,true,false ,true);
        System.out.println("Brand : " + sound5.brand);
        System.out.println("NumberOfButtons : " + sound5.numberOfButtons);
        System.out.println("HasCamera: " + sound5.hasCamera);
        System.out.println("IsWireless: " + sound5.isWireless);
        System.out.println("HasMotionSensor: " + sound5.hasMotionSensor);
		System.out.println("IsMuted: " + sound5.isMuted);
        System.out.println("IsRinging: " + sound5.isRinging);
		
		
		System.out.println();

    DoorBell sound6 =new DoorBell("Smart Doorbells",1,true ,true,false ,true , true);
        System.out.println("Brand : " + sound6.brand);
        System.out.println("NumberOfButtons : " + sound6.numberOfButtons);
        System.out.println("HasCamera: " + sound6.hasCamera);
        System.out.println("IsWireless: " + sound6.isWireless);
        System.out.println("HasMotionSensor: " + sound6.hasMotionSensor);
		System.out.println("IsMuted: " + sound6.isMuted);
        System.out.println("IsRinging: " + sound6.isRinging);




    }

}
