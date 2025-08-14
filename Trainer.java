import java.util.ArrayList;

public class Trainer {
    
    String name;
    ArrayList<Pokemon> team;
    Pokemon acePokemon;
    int aceLevel;
    int prizeMoneyBase;
    int prizeMoney;
    boolean outOfPokemon;

    Trainer(String name, ArrayList<Pokemon> team, Pokemon acePokemon, int prizeMoneyBase) {

        this.name = name;
        this.acePokemon = acePokemon;
        this.aceLevel = acePokemon.level;
        this.prizeMoneyBase = prizeMoneyBase;
        this.prizeMoney = prizeMoneyBase * aceLevel;
        this.outOfPokemon = false;
    }
}
