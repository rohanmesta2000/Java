class ATMCard {
    long cardNumber;
    long accountNumber;
    String cardHolderName;
  

    ATMCard() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.cardNumber);
        System.out.println("Inside constructor: " + this.accountNumber);
        System.out.println("Inside constructor: " + this.cardHolderName);
       
    }

    ATMCard(long cardNumber, long accountNumber, String cardHolderName) {
        System.out.println("Invoking constructor by passing parameters");
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.cardHolderName = cardHolderName;
      
    }
}