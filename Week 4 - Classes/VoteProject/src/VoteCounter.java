import java.util.Scanner;
public class VoteCounter {
    static PoliticalParty p1 = new PoliticalParty();
    static PoliticalParty p2 = new PoliticalParty();
    static PoliticalParty p3 = new PoliticalParty();
    static PoliticalParty total = new PoliticalParty();
    static Scanner keyboard =new Scanner(System.in);

    static void getVotes(String prompt, PoliticalParty party){
        String input;
        int votes;
       
        System.out.println(prompt);
        input = keyboard.nextLine();
        party.setName(input);

        System.out.print("Enter votes for " + party.getName() + " ");
        votes = keyboard.nextInt();
        party.setVotes(votes);
        keyboard.nextLine(); 
    }//end of getVotes

    public static String percVotes(PoliticalParty party){
        double percent;
        String output;
        percent = 100 * party.getVotes()/(float)total.getVotes();
        output = String.format("%s %7.2f%%", party.toString(), percent );
        return output;
    }//end of percVotes

    public static void setData(){
        p1.setName("Independent");
        p1.setVotes(1000);
        p2.setName("Republican");
        p2.setVotes(500);
        p3.setName("Democrat");
        p3.setVotes(500);
    }//end of setdata
    public static void main(String[] args) throws Exception {
        
        /*getVotes("Enter the name of the first party", p1);
        //keyboard.nextLine();//clear out the enter in the buffer
        getVotes("Enter the name of the second party", p2);
        getVotes("Enter the name of the third party", p3);
        */
        setData();//stop entering data for each run
        total.setName("Total votes");
        total.setVotes(p1.getVotes() + p2.getVotes() + p3.getVotes());
        
        System.out.println(percVotes(p1));
        System.out.println(percVotes(p2));
        System.out.println(percVotes(p3));
        System.out.println(total.toString());
        keyboard.close();
    }//end of main
}
