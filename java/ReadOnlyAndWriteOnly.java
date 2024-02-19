//*Read only */
//! Read only class refers to the concept of designing a Java class in a way that instances of that class cannot be modified after their creation.
class HockeyPlayer {
    private String team = "Maple leaf";

    public String getTeam() {
        return team;
    }
}

// *Write only */
class HockeyPlayer2 {
    private String team;
    public void setTeam(String college) {
        this.team = team;
    }
}

class Main {
    public static void main(String args[]) {
        //! read only
        HockeyPlayer hackeyPlayer = new HockeyPlayer();
        System.out.println(hackeyPlayer.getTeam());

        //! write inly
        HockeyPlayer2 hackeyPlayer2 = new HockeyPlayer2();
        hackeyPlayer2.setTeam("dream team");
       
    }
}