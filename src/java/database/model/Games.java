package database.model;
// Generated Feb 25, 2015 10:04:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Games generated by hbm2java
 */
public class Games  implements java.io.Serializable {


     private Integer id;
     private Categories categories;
     private String name;
     private String url;
     private Date adddate;
     private String developer;
     private String thumbnailaddress;
     private String description;
     private Gameranking gameranking;
     private Set commentses = new HashSet(0);
     private Set featureds = new HashSet(0);

    public Games() {
    }

	
    public Games(Categories categories, String name, String url, Date adddate, String developer, String thumbnailaddress, String description) {
        this.categories = categories;
        this.name = name;
        this.url = url;
        this.adddate = adddate;
        this.developer = developer;
        this.thumbnailaddress = thumbnailaddress;
        this.description = description;
    }
    public Games(Categories categories, String name, String url, Date adddate, String developer, String thumbnailaddress, String description, Gameranking gameranking, Set commentses, Set featureds) {
       this.categories = categories;
       this.name = name;
       this.url = url;
       this.adddate = adddate;
       this.developer = developer;
       this.thumbnailaddress = thumbnailaddress;
       this.description = description;
       this.gameranking = gameranking;
       this.commentses = commentses;
       this.featureds = featureds;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Date getAdddate() {
        return this.adddate;
    }
    
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
    public String getDeveloper() {
        return this.developer;
    }
    
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getThumbnailaddress() {
        return this.thumbnailaddress;
    }
    
    public void setThumbnailaddress(String thumbnailaddress) {
        this.thumbnailaddress = thumbnailaddress;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Gameranking getGameranking() {
        return this.gameranking;
    }
    
    public void setGameranking(Gameranking gameranking) {
        this.gameranking = gameranking;
    }
    public Set getCommentses() {
        return this.commentses;
    }
    
    public void setCommentses(Set commentses) {
        this.commentses = commentses;
    }
    public Set getFeatureds() {
        return this.featureds;
    }
    
    public void setFeatureds(Set featureds) {
        this.featureds = featureds;
    }




}


