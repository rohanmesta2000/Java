class CricketKiller{
    public static void main(String[] args) {
        Cricket schedule = new Cricket();
        System.out.println("\n");
        System.out.println("Invoking main in CricketKiller");
        System.out.println("TeamName: " + schedule.teamName);
        System.out.println("Captain: " + schedule.captain);
        System.out.println("TotalPlayers: " + schedule.totalPlayers);

        System.out.println("\n");

        Cricket schedule1 = new Cricket("Royals11", "Rohan", 11);
        System.out.println("TeamName: " + schedule1.teamName);
        System.out.println("Captain: " + schedule1.captain);
        System.out.println("TotalPlayers: " + schedule1.totalPlayers);
    }
}

