
import java.util.ArrayList;

public class Pot {

  public int number;

  public ArrayList<Team> teams;

    /**
   * 
   * @element-type Team
   */
  public ArrayList  myTeam;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public ArrayList<Team> getTeams() {
    return teams;
  }

  public void setTeams(ArrayList<Team> teams) {
    this.teams = teams;
  }

  public Pot(int number, ArrayList<Team> teams) {

    this.number = number;
    this.teams = teams;
  }

  public Pot(int number) {

    this.number = number;
  }

  @Override
  public String toString() {
    return "Pot{" +
            "number=" + number +
            ", teams=" + teams +
            ", myTeam=" + myTeam +
            '}';
  }
}