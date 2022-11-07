public class PoliticalParty {
    private String name;
    private int votes;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVotes() {
        return votes;
    }
    public void setVotes(int votes) {
        this.votes = votes;
    }
    public PoliticalParty() {
        this.name = "No Name";
        this.votes = 0;
    }
    public PoliticalParty(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }
    @Override
    public String toString() {
        String output;
        output = String.format("%-20s %,7d", name, votes);
        return output;
    }

    
    
}
