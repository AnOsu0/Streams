package Example2;

class Match {
    private String HomeTeam;
    private String AwayTeam;
    private int HomeTeamGoals;
    private int AwayTeamGoals;

    private Match(String homeTeam, String awayTeam, int homeTeamGoals, int awayTeamGoals) {
        HomeTeam = homeTeam;
        AwayTeam = awayTeam;
        HomeTeamGoals = homeTeamGoals;
        AwayTeamGoals = awayTeamGoals;
    }

    public static final Match matchFactoryMetchod (String HomeTeam, String Awayteam, int HomeTeamGoals
    , int AwayTeamGoals){
       return new Match(HomeTeam,Awayteam,HomeTeamGoals,AwayTeamGoals);
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public String getAwayTeam() {
        return AwayTeam;
    }

    public int getHomeTeamGoals() {
        return HomeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return AwayTeamGoals;
    }

    @Override
    public String toString() {
        return HomeTeam + " - " + AwayTeam + "(" + HomeTeamGoals + " - " + AwayTeamGoals + ")";
    }
}
