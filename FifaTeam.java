public class FifaTeam {

  private double TotalPoints;      // Total points a team has
  private String Team;             // name of the team
  private int Rank;                // Rank of the team
  private int Year;                // the year that goes with the points and rank of the team


  /*
   * Sets TotalPoints, Team, Year, and Rank to the specified values
   */
  public FifaTeam(double TotalPoints, String Team, int Year, int Rank) {
    this.TotalPoints = TotalPoints;
    this.Team = Team;
    this.Year = Year;
    this.Rank = Rank;
  }


  /*
   * Returns the total points for a team in a specific year
   */
  public double GetTotalPoints() {
    return TotalPoints;
  }

  /*
   * Returns the team name
   */
  public String GetTeam() {
    return Team;
  }


  /*
   * Returns the Year for that team's stats
   */
  public int getYear() {
    return Year;
  }

  /*
   * Returns the Rank of the team
   */
  public int getRank() {
    return Rank;
  }


  /*
   * Returns a String containing the team stats
   */
  public String toString() {
    return "Team Name: " + Team + "\nYear: " + Year + "\nRank: " + Rank + "\nTotal Points: " + TotalPoints;
  }
  
}
