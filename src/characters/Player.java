package characters;

public class Player {
    //properties
    private String name;
    private int health;
    private int attackPoints;

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

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void setAttackPoints(int attackPoints){
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }
}
