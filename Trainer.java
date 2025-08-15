import java.util.ArrayList;

public class Trainer {
    
    String name;
    ArrayList<Pokemon> team;
    Pokemon acePokemon;
    int aceLevel;
    int prizeMoneyBase;
    int prizeMoney;
    Pokemon currentPokemon;
    int remainingPokemon;

    Trainer(String name, ArrayList<Pokemon> team, Pokemon acePokemon, int prizeMoneyBase) {

        this.name = name;
        this.acePokemon = acePokemon;
        this.aceLevel = acePokemon.level;
        this.prizeMoneyBase = prizeMoneyBase;
        this.prizeMoney = prizeMoneyBase * aceLevel;
        this.currentPokemon = team.get(0);
        this.remainingPokemon = team.size();
    }
}
