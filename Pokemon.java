import java.util.ArrayList;
import java.util.Arrays;

public class Pokemon {
    
    //attributes
    String name;
    //char gender; Doesn't show in terminal
    int level;
    ArrayList<String> type;
    ArrayList<String> weaknesses = new ArrayList<>(Arrays.asList("Fire"));
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

    void generateWeaknesses() {

        ArrayList<String> typesList = new ArrayList<>(Arrays.asList("Normal", "Fire", "Water", "Electric", "Grass", 
                "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel", "Fairy"));

        //                If i'm attacked by                                      Nor  Fir  Wat Elec Gra  Ice  Fig  Poi  Gro  Fly  Psy  Bug  Roc  Gho  Gra  Dar  Ste  Fai
        ArrayList<String> normalMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "0", "1", "1", "1", "1"));
        ArrayList<String> fireMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> waterMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> electricMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> grassMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));;
        ArrayList<String> iceMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> fightingMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> poisonMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> groundMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> flyingMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> psychicMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> bugMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> rockMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> ghostMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> dragonMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> darkMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> steelMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        ArrayList<String> fairyMultipliers = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
        

        ArrayList<ArrayList<String>> fireType = new ArrayList<>(Arrays.asList(typesList, fireMultipliers));

        
        System.out.println(fireType);
    }

}
