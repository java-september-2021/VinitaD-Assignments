public class Pokemon {
    //member variables
    public String name;
    public int health;
    public String type;
    public static int countPokemon;
    //method
    public void attackPokemon(Pokemon target) {
        target.health -= 10;
    } 
    //getter
    public String getName() {
        return this.name;
    }
    public int getHealth() {
        return this.health;
    }
    public String getType() {
        return this.type;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void sethealth(int health) {
        this.health = health;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Pokemon(String name,int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        Pokemon.countPokemon++;

    }

}