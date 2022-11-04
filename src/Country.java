import java.util.ArrayList;

public class Country {

  public String name;

  public int numberTeams;

    /**
   * 
   * @element-type Team
   */
  public ArrayList myTeam;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getnumberTeams() {
    return numberTeams;
  }

  public void setNumberYeams(int numberTeams) {
    this.numberTeams = numberTeams;
  }

  public Country(String name, int numberTeams) {

    this.name = name;
    this.numberTeams = numberTeams;
  }

  @Override
  public String toString() {
    return name;
  }
}