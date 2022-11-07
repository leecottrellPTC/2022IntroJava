import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class VoteClassLecture {

    static PoliticalParty p1 = new PoliticalParty();
    static PoliticalParty p2 = new PoliticalParty();
    static PoliticalParty p3 = new PoliticalParty();
    static PoliticalParty total = new PoliticalParty("Total votes", 0);
    static Scanner keyboard = new Scanner(System.in);

    static void inputData(PoliticalParty party, String prompt) {
        String input;
        int votes;

        System.out.println(prompt);
        input = keyboard.next();// gets the name
        party.setName(input);
        // keyboard.nextLine();
        System.out.println("Enter votes for " + party.getName() + " ");
        votes = keyboard.nextInt();
        party.setVotes(votes);

    }

    public static void setData() {
        p1.setName("Democrat");
        p2.setName("Independent");
        p3.setName("Republican");

        p1.setVotes(1000);
        p2.setVotes(3000);
        p3.setVotes(1000);
    }

    public static String percentVotes(PoliticalParty party) {
        String output;
        double percent;
        percent = 100 * party.getVotes() / (float) total.getVotes();
        output = String.format("%s %7.0f%%", party.toString(), percent);
        return output;
    }

    public static void main(String[] args) throws Exception {
        // inputData(p1, "Enter first party name");
        // inputData(p2, "Enter second party name");
        // inputData(p3, "Enter third party name");
        setData();
        total.setVotes(p1.getVotes() + p2.getVotes() + p3.getVotes());
        // prove it works
        System.out.println(percentVotes(p1));
        System.out.println(percentVotes(p2));
        System.out.println(percentVotes(p3));
        System.out.println(total.toString());

        keyboard.close();
    }
}
