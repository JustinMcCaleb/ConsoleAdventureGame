package characters;

public class Villain {

    //properties
    private String name;
    private int health;
    private int attackPoints;

    //constructor
    public Villain(String name, int health, int attackPoints){
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
    }

    public Villain() {
    }

    //getters and setters
    public void setName(String name){this.name = name;}
    public void setHealth(int health){this.health = health;}
    public void setAttackPoints(int attackPoints){this.attackPoints = attackPoints;}

    public String getName(){return this.name;}
    public int getHealth(){return this.health;}
    public int getAttackPoints(){return this.attackPoints;}
}
