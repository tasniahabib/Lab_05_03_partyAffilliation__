public class Main {
    public static void main(String[] args) {

        // Set the party choice
        String partyChoice = "X";

        // Check the party affiliation
        if (partyChoice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyChoice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyChoice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}