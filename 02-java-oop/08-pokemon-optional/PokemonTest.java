public class PokemonTest {
    public static void main(String[] args) {
        Pokedex pokemon1 = new Pokedex("poke1", 30, "fly");
        Pokedex pokemon2 = new Pokedex("poke2", 50, "water");
        Pokedex pokemon3 = new Pokedex("poke3", 40, "land");
        pokemon1.listPokemon();
        System.out.println(pokemon2.getHealth());
        pokemon1.attackPokemon(pokemon2);
        System.out.println(pokemon2.getHealth());
        System.out.println(pokemonInfo(pokemon1));
        

        
    }
}