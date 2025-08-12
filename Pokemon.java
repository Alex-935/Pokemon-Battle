
public class Pokemon {
    
    //attributes
    String name;
    int level;
    String type;
    //Pokemon's Stats for battling
    int hp;
    int atk;
    int def;
    int spAtk;
    int spDef;
    int spd;
    int currentHp;

    //class of Pokemon's moves
    Move[] moves;

    //Constructor
    Pokemon(String name, int level, String type, int hp, int atk, int def,
            int spAtk, int spDef, int spd) {

        this.name = name;
        this.level = level;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
        this.currentHp = hp;
        
        // Also: Accuracy and Evasion, STAB, Natures, Ivs, Evs, Megas/DM/Terra/Z-Moves?
        //Stat calcs
        //HP: HP = floor(0.01 * (2 * Base + IV + floor(0.25 * EV)) * Level) + Level + 10
        //Other Stats: Stat = floor(0.01 * (2 * Base + IV + floor(0.25 * EV)) * Level) + 5 (then multiplied by the nature modifier)

    }
}
