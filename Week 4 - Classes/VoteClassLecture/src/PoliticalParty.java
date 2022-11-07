import org.w3c.dom.NameList;

public class PoliticalParty {
    private String name;
    private int votes;

    public PoliticalParty(){
        //default constructor
        name = "No name";
        votes = 0;
    }
    //parameterized constructor
    public PoliticalParty(String Name, int Votes){
        name = Name;
        votes = Votes;
    }

    public String getName(){
        return name;
    }

    public int getVotes(){
        return votes;
    }

    public void setName(String Name){
        name = Name;
    }

    public void setVotes(int Votes){
        this.votes = Votes;
    }

    
    public String toString(){
        String output;
        output = String.format("%-20s %,7d", name, votes);
        return output;
    }

}
