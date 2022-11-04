
public class Team {

  public String name;

  public Country country;

  public Pot pot;

  public Group group;

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Pot getPot() {
    return pot;
  }

  public void setPot(Pot pot) {
    this.pot = pot;
  }

  public Team(String name, Country country, Group group, Pot pot) {

    this.name = name;
    this.country = country;
    this.group = group;
    this.pot = pot;
  }

  @Override
  public String toString() {
    return name + "(" + country + ")";
  }
}