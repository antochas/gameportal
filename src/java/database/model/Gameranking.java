package database.model;
// Generated Feb 25, 2015 10:04:42 PM by Hibernate Tools 4.3.1



/**
 * Gameranking generated by hbm2java
 */
public class Gameranking  implements java.io.Serializable {


     private int gameid;
     private Games games;
     private int upvotes;
     private int downvotes;
     private int votes;

    public Gameranking() {
    }

    public Gameranking(Games games, int upvotes, int downvotes, int votes) {
       this.games = games;
       this.upvotes = upvotes;
       this.downvotes = downvotes;
       this.votes = votes;
    }
   
    public int getGameid() {
        return this.gameid;
    }
    
    public void setGameid(int gameid) {
        this.gameid = gameid;
    }
    public Games getGames() {
        return this.games;
    }
    
    public void setGames(Games games) {
        this.games = games;
    }
    public int getUpvotes() {
        return this.upvotes;
    }
    
    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }
    public int getDownvotes() {
        return this.downvotes;
    }
    
    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }
    public int getVotes() {
        return this.votes;
    }
    
    public void setVotes(int votes) {
        this.votes = votes;
    }




}

