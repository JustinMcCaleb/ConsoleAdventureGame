package user;

public class Player {
    //properties
    private String name;
    //constructor
    public Player(String name) {
        this.name = name;
    }
    //getters and setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
