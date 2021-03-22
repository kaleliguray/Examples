public class Main {

    public static void main(String[] args) {

        FootballPlayer jack = new FootballPlayer("Jack");
        BaseballPlayer tom = new BaseballPlayer("Tom");
        SoccerPlayer gerrard = new SoccerPlayer("Gerrard");

        Team<FootballPlayer> irishRugby = new Team<>("Irish Rugby");
        irishRugby.addPlayer(jack);

        System.out.println(irishRugby.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Jersy Hawk");
        baseballTeam.addPlayer(tom);

        System.out.println(baseballTeam.numPlayers());

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester");
        soccerTeam.addPlayer(gerrard);

        System.out.println(soccerTeam.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(irishRugby,3,7);
        fremantle.matchResult(irishRugby,3,8);
        irishRugby.matchResult(fremantle,4,2);

        System.out.println("Rankings");
        System.out.println(irishRugby.getName() + " : " + irishRugby.raking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.raking());
        System.out.println(fremantle.getName() + " : " + fremantle.raking());

        System.out.println(irishRugby.compareTo(melbourne));
        System.out.println(irishRugby.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(fremantle));
        System.out.println(melbourne.compareTo(hawthorn));




    }



}































