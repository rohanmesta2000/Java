class ATMCardKiller{
    public static void main(String[] args) {
       ATMCard schedule = new ATMCard();
        System.out.println("\n");
        System.out.println("Invoking main in ATMCardKiller");
        System.out.println("CardNumber: " + schedule.cardNumber);
        System.out.println("AccountNumber: " + schedule.accountNumber);
        System.out.println("CardHolderName: " + schedule.cardHolderName);

        System.out.println("\n");

       ATMCard schedule1 = new ATMCard(58389329823l,3283273286l,"Prajwal");
        System.out.println("CardNumber: " + schedule1.cardNumber);
        System.out.println("AccountNumber: " + schedule1.accountNumber);
        System.out.println("CardHolderName: " + schedule1.cardHolderName);
    }
}

