

public abstract class AbstractPokemon implements PokemonInterface {
    protected String name;
    protected int health;
    protected String type;
    public static int countPokemon;
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon newPokemon = new Pokemon(name, health, type);
        //myPokemon.add(newPokemon);
        return newPokemon;
    }
    //method
    // public void attackPokemon(Pokemon target) {
    //     target.health -= 10;
    // } 
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
    
    public String pokemonInfo(Pokedex pokemon){
        return ("Name: "+ this.name +" health: "+ this.health + " Type: " + this.type);
    }
    public abstract void listPokemon();
}