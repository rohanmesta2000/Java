class MobileNumbersArray{
	public static void main(String[] codes)
	{
		System.out.println("running main in MobileNumbersArray....");
		long indianMobileNum=919286382235l;
		long unitedKingdomMobileNum=44780888933l;
		long brazilMobileNum=55378329998l;
		long australiaMobileNum=61344089389l;
		long japanMobileNum=81803878979l;
		long germanyMobileNum=49398729880l;
		long bangladeshMobileNum=89578928790l;
		long pakistanMobileNum=92863878990l;
		long[] mobileNumbersArray={indianMobileNum,unitedKingdomMobileNum,brazilMobileNum,australiaMobileNum,japanMobileNum,germanyMobileNum,bangladeshMobileNum,pakistanMobileNum};
		long ref=mobileNumbersArray[7];
		System.out.println("element at index 7:"+ref);
		long ref1=mobileNumbersArray[6];
		System.out.println("element at index 6:"+ref1);
		long ref2=mobileNumbersArray[1];
		System.out.println("element at index 1:"+ref2);
		long ref3=mobileNumbersArray[5];
		System.out.println("element at index 5:"+ref3);
	}
}