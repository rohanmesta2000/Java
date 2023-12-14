class Signal{
	public static void main(String[] radius)
	{
		System.out.println("signal radiation");
		float frequency=1001.9f;
		float amplitude=0.9f;
		float phase=0;
		float duration=5;
		int sample_rate=44400;
		int bitdepth=16;
		String signal_type="analog";
		float signal_power=0.8f;
		float signal_energy=1000;
		float signalToNoiseRatio=20;
		float signalToInterferenceRatio=15;
		float signalToNoiseAndInterferenceRatio=10;
		float bandwidth=1000;
		String modulation_type="AM";
		float modulationIndex=0.8f;
		float carrierFrequency=10000;
		float symbol_rate=2890;
		String errorCorrection="Reed-Solomon";
        float signalStrength=70;
        float signalQuality=80;
        System.out.println("frequency:"+1000.9);
		System.out.println("amplitude:"+0.9);
        System.out.println("phase:"+0);
        System.out.println("duration:"+5);
		System.out.println("sample_rate:"+44400);
		System.out.println("bitdepth:"+16);
		System.out.println("signal_type:"+"analog");
		System.out.println("signal_power:"+0.8);
		System.out.println("signal_energy:"+1000);
		System.out.println("signalToNoiseRatio:"+20);
		System.out.println("signalToNoiseAndInterferenceRatio:"+15);
		System.out.println("bandwidth:"+10);
		System.out.println("modulation_type:"+"AM");
		System.out.println("modulationIndex:"+0.8);
		System.out.println("carrierFrequency:"+10000);
		System.out.println("symbol_rate:"+2890);
		System.out.println("errorCorrection:"+"Reed-Solomon");
		System.out.println("signalStrength:"+70);
		System.out.println("signalQuality:"+80);

	}
}