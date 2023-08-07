class ElectricianSkill{
    public static void main(String[] args)
	{
	System.out.println("Running main in elctrician...");
        Electrician.installLighting();
        Electrician.installSwitches();
        Electrician.installOutlets();
        Electrician.installCircuitBreakers();
        Electrician.testWiring();
        Electrician.replaceLightBulbs();
        Electrician.troubleshootPowerOutage();
        Electrician.installCeilingFans();
        Electrician.installSecurityCameras();
        Electrician.installSmokeDetectors();
		Electrician.installCeilingFans("Pigeon",3);
		Electrician.testWiring(true,11);
		Electrician.installSmokeDetectors(9);
		Electrician.installSwitches(false);
		Electrician.replaceLightBulbs(3);
    }
}
