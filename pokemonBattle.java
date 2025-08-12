import java.util.ArrayList;
import java.util.Arrays;

public class pokemonBattle {

    public static void main(String[] args) {

        Pokemon userPokemon = new Pokemon("Rayquaza", 50, new ArrayList<>(Arrays.asList("Dragon", "Flying")), 105, 150, 90, 150, 90, 95);
        Pokemon compPokemon = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), 108, 130, 95, 80, 85, 102);
        
        System.out.println(userPokemon.type.get(0));
        System.out.println(compPokemon.type.get(1));
        
    }




}