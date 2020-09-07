package characters;

public class Alien {

    //properties
    private String type;
    private boolean isFriendly;

    //constructor
    public Alien(String type, boolean isFriendly){
        this.type = type;
        this.isFriendly = isFriendly;
    }

    //getters and setters
    public void setType(String type){this.type = type;}
    public void setIsFriendly(boolean isFriendly){this.isFriendly = isFriendly;}

    public String getType(){return this.type;}
    public boolean getIsFriendly(){return this.isFriendly;}
}
