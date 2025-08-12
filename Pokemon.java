import java.util.ArrayList;

public class Pokemon {
    
    //attributes
    String name;
    //char gender; Doesn't show in terminal
    int level;
    ArrayList<String> type;
    ArrayList<Move> moves;
    //Pokemon's Stats for battling
    int hp;
    int atk;
    int def;
    int spAtk;
    int spDef;
    int spd;
    int currentHp;
    boolean hasFainted;

    //Constructor
    Pokemon(String name, int level, ArrayList<String> type, ArrayList<Move> moves, int hp, int atk, int def,
            int spAtk, int spDef, int spd) {

        this.name = name;
        //this.gender = gender;// alt + 11 ♂. alt + 12 ♀
        this.level = level;
        this.type = type;
        this.moves = moves;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
        this.currentHp = hp;
        this.hasFainted = false;
        
        // Also: Accuracy and Evasion, STAB, Natures, Ivs, Evs, Megas/DM/Terra/Z-Moves?
        //Stat calcs
        //HP: HP = floor(0.01 * (2 * Base + IV + floor(0.25 * EV)) * Level) + Level + 10
        //Other Stats: Stat = floor(0.01 * (2 * Base + IV + floor(0.25 * EV)) * Level) + 5 (then multiplied by the nature modifier)

    }
}
