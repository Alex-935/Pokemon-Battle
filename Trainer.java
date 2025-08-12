public class Trainer {
    
    String name;
    Pokemon acePokemon;
    int aceLevel;
    int prizeMoneyBase;
    int prizeMoney;
    boolean outOfPokemon;

    Trainer(String name, Pokemon acePokemon, int prizeMoneyBase) {

        this.name = name;
        this.acePokemon = acePokemon;
        this.aceLevel = acePokemon.level;
        this.prizeMoneyBase = prizeMoneyBase;
        this.prizeMoney = prizeMoneyBase * aceLevel;
        this.outOfPokemon = false;
    }
}
