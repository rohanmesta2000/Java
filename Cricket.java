class Cricket {
    String teamName;
    String captain;
    int totalPlayers;

    Cricket() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.teamName);
        System.out.println("Inside constructor: " + this.captain);
        System.out.println("Inside constructor: " + this.totalPlayers);
    }

    Cricket(String teamName, String captain, int totalPlayers) {
        System.out.println("Invoking constructor by passing parameters");
        this.teamName = teamName;
        this.captain = captain;
        this.totalPlayers = totalPlayers;
    }
}