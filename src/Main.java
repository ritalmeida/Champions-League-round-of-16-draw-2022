import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static boolean isValid(Team team1, Team team2) {

        boolean valid = true;
        if (team1.country.equals(team2.country)) valid = false;     //Rule 2
        if (team1.group == team2.group) valid = false;              //Rule 3
        return valid;
    }


    public static void main(String[] args) {

        System.out.println("\n*** Welcome to Champions League Round 16 draws! ***\n");

        //Group
        Group A = new Group("A");
        Group B = new Group("B");
        Group C = new Group("C");
        Group D = new Group("D");
        Group E = new Group("E");
        Group F = new Group("F");
        Group G = new Group("G");
        Group H = new Group("H");


        //Countries
        Country GER = new Country("Germany", 4);
        Country POR = new Country("Portugal", 2);
        Country ENG = new Country("England", 4);
        Country BEL = new Country("Belgium", 1);
        Country ITA = new Country("Italy", 3);
        Country FRA = new Country("France", 1);
        Country ESP = new Country("Spain", 1);

        //Pots
        Pot Winners = new Pot(1);
        Pot RunnersUp = new Pot(2);


        //Teams
        Team Bayern = new Team("Bayern Munich", GER, C, Winners);
        Team Benfica = new Team("SL Benfica", POR, H, Winners);
        Team Chelsea = new Team("Chelsea", ENG, E, Winners);
        Team Napoli = new Team("Napoli", ITA, A, Winners);
        Team ManCity = new Team("Manchester City", ENG, G, Winners);
        Team Porto = new Team("FC Porto", POR, B, Winners);
        Team Tottenham = new Team("Tottenham", ENG, D, Winners);
        Team RealMadrid = new Team("Real Madrid", ESP, F, Winners);
        Team Liverpool = new Team("Liverpool", ENG, A, RunnersUp);
        Team Inter = new Team("FC Inter Milan", ITA, C, RunnersUp);
        Team Milan = new Team("AC Milan", ITA, E, RunnersUp);
        Team Dortmund = new Team("Borussia Dortmund", GER, G, RunnersUp);
        Team Brugge = new Team("Club Brugge", BEL, B, RunnersUp);
        Team Frankfurt = new Team("Eintracht Frankfurt", GER, D, RunnersUp);
        Team Leipzig = new Team("RB Leipzig", GER, F, RunnersUp);
        Team PSG = new Team("Paris Saint-Germain", FRA, H, RunnersUp);

        //Pot 1 Arrays
        ArrayList<Team> teams1 = new ArrayList<>();
        teams1.add(Napoli);
        teams1.add(Bayern);
        teams1.add(Chelsea);
        teams1.add(ManCity);
        teams1.add(Porto);
        teams1.add(Tottenham);
        teams1.add(RealMadrid);
        teams1.add(Benfica);
        System.out.println("Teams of Pot 1: ");
        System.out.println(teams1.toString());

        //Pot 2 Arrays
        ArrayList<Team> teams2 = new ArrayList<>();
        teams2.add(Liverpool);
        teams2.add(Inter);
        teams2.add(Milan);
        teams2.add(Dortmund);
        teams2.add(Brugge);
        teams2.add(Frankfurt);
        teams2.add(Leipzig);
        teams2.add(PSG);
        System.out.println("Teams of Pot 2: ");
        System.out.println(teams2.toString());

        //The Rules
        System.out.println("\nThe Rules:");
        System.out.println("1. Teams from Pot 1 must play with teams from Pot 2. Two teams from the same Pot can't play at this stage.");
        System.out.println("2. Two teams of the same country can't play against each other at this stage.");
        System.out.println("3. The teams who were on the same group at the previous stage can't play against each other at this stage.");
        System.out.println("Good luck! ☺\n");

        //For testing the shuffle and positions compared with the output draw
        Collections.shuffle(teams1);
        //System.out.println("Teams of Pot 1 suffled: ");
        //System.out.println(teams1.toString());
        Collections.shuffle(teams2);
        //System.out.println("Teams of Pot 2 suffled: ");
        //System.out.println(teams2.toString() + "\n");

        /*int i = 0;
        //Random random = new Random();
        for (i = 0; i < teams1.size(); i++) {
            //int index = random.nextInt(teams1.size());
            //System.out.println("random team: " + teams1.get(index).toString());

                if (isValid(teams1.get(i),teams2.get(i))){

                    System.out.println(teams2.get(i).getName() + " x " + teams1.get(i).getName());
                    teams2.remove(i);
                    teams1.remove(i);

                } else if (!isValid(teams1.get(i), teams2.get(i))) {

                    if (teams2.get(i) != null) {
                        System.out.println(teams2.get(i+1).getName() + " x " + teams1.get(i).getName());
                    } else {
                        i = 0;
                        System.out.println(teams2.get(i).getName() + " x " + teams1.get(i).getName());
                    }

                    teams2.remove(i);
                    teams1.remove(i);
                }
            //teams2.remove(i);
            //teams1.remove(i);*/

        /*for (int i = 0; i < teams1.size(); i++) {

            for (int j = 0; j < teams2.size(); j++) {

                if (isValid(teams1.get(i), teams2.get(j))){

                    System.out.println(teams2.get(j).getName() + " x " + teams1.get(i).getName());
                    teams2.remove(j);
                    teams1.remove(i);
                } else if (!isValid(teams1.get(i), teams2.get(j))) {

                    i = 0;
                    j = 0;
                    //if (teams2.get(j) != null){

                        System.out.println(teams2.get(j).getName() + " x " + teams1.get(i).getName());
                        teams2.remove(j);
                        teams1.remove(i);
                    } else {

                        System.out.println(teams2.get(j).getName() + " x " + teams1.get(i).getName());
                        teams2.remove(j);
                        teams1.remove(i);
                    }
                }
            }
        }*/

        while (teams1.size() != 0) {

            int i = 0;
            int j = 0;

            if (isValid(teams1.get(i), teams2.get(j))) {

                System.out.println(teams2.get(j).getName() + " x " + teams1.get(i).getName());
                teams2.remove(j);
                teams1.remove(i);
            } else if (!isValid(teams1.get(i), teams2.get(j))) {

                i = 0;
                j += 1;
                System.out.println(teams2.get(j).getName() + " x " + teams1.get(i).getName());
                teams2.remove(j);
                teams1.remove(i);
            }
        }

    }
}
