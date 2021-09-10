

import java.util.ArrayList;
public class Pokedex extends AbstractPokemon {
    public static ArrayList<Pokemon> myPokemon = new ArrayList<>();
    public void listPokemon(){
        for (Pokemon pok: myPokemon) {
            System.out.println(pok.getName());
        }
    }
    public Pokedex(String name, int health, String type){
        super();
        Pokemon newPokemon = createPokemon(name, health, type);
        //myPokemon = new ArrayList<Pokemon>();
        myPokemon.add(newPokemon);
    }
    public void attackPokemon(Pokedex target) {
        int targetHealth =  target.getHealth();
        target.sethealth(targetHealth - 10);
    } 
    // public void createPokemon(String name, int health, String type){
    //     PokemonInterface.createPokemon(name, health, type);
    // }
    // public void pokemonInfo(Pokemon pokemon){
    //     PokemonInterface.pokemonInfo(pokemon);
    // }
}

