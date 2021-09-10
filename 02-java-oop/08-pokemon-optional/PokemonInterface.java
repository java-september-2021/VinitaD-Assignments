

public interface PokemonInterface {
    // default void createPokemon(String name, int health, String type){
    //     Pokemon newPokemon = new Pokemon(name, health, type);
    //     myPokemon.add(newPokemon);

    // }
    // //static method and default doesnot need implementation
    // default void pokemonInfo(Pokemon pokemon){
    //     System.out.println(pokemonInfo());
    // }

    // default void pokemonInfo(){
    //     System.out.println("Name: "+ pokemon.name +" health: "+ pokemon.health + " Type: " + pokemon.type);
    // }
    // void listPokemon();
    // // {
    // //     for (Pokemon pok: Pokemon) {
    // //         System.out.println(pok.toString());
    // //     }
    // //}
    Pokemon createPokemon(String name, int health, String type);
    String pokemonInfo(Pokemon pokemon);
    void listPokemon();

}