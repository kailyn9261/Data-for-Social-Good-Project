public class UserStory {

  private FifaTeam[] stats;      // array of team stats


  /*
   * Reads the data from TotalPointsFile, TeamFile, YearFile, and
   * RankFile to initialize the 1D array stats
   */
  public UserStory(String TotalPointsFile, String TeamFile, String YearFile, String RankFile) {
    stats = createFifaTeams(TotalPointsFile, TeamFile, YearFile, RankFile);
  }

  
  /*
   * Reads the FIFA data files and creates
   * an array of FifaTeam objects.
   */
  public FifaTeam[] createFifaTeams(String TotalPointsFile, String TeamFile, String YearFile, String RankFile) {
    //Reads data from the four text files
    double[] TotalPointsData = FileReader.toDoubleArray(TotalPointsFile);
    String[] TeamData = FileReader.toStringArray(TeamFile);
    int[] YearData = FileReader.toIntArray(YearFile);
    int[] RankData = FileReader.toIntArray(RankFile);
    FifaTeam[] tempAnswers = new FifaTeam[TotalPointsData.length];
    
    //Creates a FifaTeam object for each team record
    for (int index = 0; index < tempAnswers.length; index++) {
      tempAnswers[index] = new FifaTeam(TotalPointsData[index], TeamData[index], YearData[index], RankData[index]);
    }

    return tempAnswers;
  }


 /*
   * Returns the Fifa Team at the specified position from the 1D array stats
   */
  public FifaTeam getStat(int position) {
    return stats[position];
  }


   /*
   * Returns the first FIFA team with the
   * specified rank, or null if none is found.
   */
  public FifaTeam getRankResponse(int targetRank) {
    for (FifaTeam response : stats) {
      if (response.getRank() == targetRank) {
        return response;
      }
    }
  
    return null;
  }


  /*
   * Counts how many FIFA team records
   * have the specified rank.
   */
  public int countRank(int targetRank) {
    int count = 0;

    for (FifaTeam response : stats) {
     if (response.getRank() == (targetRank)) {
        count++;
      }
    }

    return count;
  }

  /*
   * Returns an array of team names and years for teams with the specified rank.
   */
  public String[] getTeamsAtRank(int targetRank) {
    String[] teams = new String[countRank(targetRank)];
    int index = 0;

    for (FifaTeam team : stats) {
      if (team.getRank() == targetRank) {
        teams[index] = team.GetTeam() + " (" + team.getYear() + ")";
        index++;
      }
    }

    return teams;
  }

  /*
   * Returns a String containing each team's information
   */
  public String toString() {
    String result = "";

    for (FifaTeam response : stats) {
      result += response + "\n----------\n";
    }

    return result;
  }

  
}
