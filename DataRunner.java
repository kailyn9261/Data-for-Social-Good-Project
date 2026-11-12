public class DataRunner {
  /*
   * Runs the FIFA data analysis program and
   * displays results about team rankings.
   */
  public static void main(String[] args) {
    
    //Creates a UserStory object using the FIFA data files
    UserStory responses = new UserStory("TotalPoints.txt", "Team.txt", "Year.txt", "Rank.txt");
    
    //Displays the number of teams ranked 5
    System.out.println("Teams that ranked 5: " + responses.countRank(5));
        
    //Displays the teams that ranked number 1
    String[] topTeams = responses.getTeamsAtRank(1);

    System.out.println("\nTeams ranked number 1:");

    for (String team : topTeams) {
      System.out.println(team);
    } 
  }
}
