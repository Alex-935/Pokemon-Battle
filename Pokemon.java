import java.util.ArrayList;
import java.util.Arrays;

public class Pokemon {
    
    //attributes
    String name;
    //char gender; Doesn't show in terminal
    int level;
    ArrayList<String> type;
    ArrayList<String> weaknesses;
    ArrayList<Move> moves;
    //Pokemon's Stats for battling
    int hp;
    double atk;
    double def;
    double spAtk;
    double spDef;
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
        generateWeaknesses();//to generate weakness table
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
        /* 
        //                If i'm attacked by                                  Nor    Fir     Wat     Elec    Gra     Ice     Fig    Poi     Gro    Fly     Psy     Bug     Roc     Gho     Dra     Dar    Ste     Fai
        ArrayList<String> normalMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "1",    "1",    "1",    "1",   "1",    "1",   "1",    "1",    "1",   "0.5",   "0",    "1",    "1",  "0.5",   "1"));//Normal
        ArrayList<String> fireMultipliers = new ArrayList<>(Arrays.asList(    "1",  "0.5",  "0.5",   "1",    "2",    "2",    "1",   "1",    "1",   "1",    "1",    "2",   "0.5",   "1",   "0.5",   "1",   "2",    "1"));//Fire
        ArrayList<String> waterMultipliers = new ArrayList<>(Arrays.asList(   "1",   "2",   "0.5",   "1",   "0.5",   "1",    "1",   "1",    "2",   "1",    "1",    "1",    "2",    "1",   "0.5",   "1",   "1",    "1"));//Water
        ArrayList<String> electricMultipliers = new ArrayList<>(Arrays.asList("1",   "1",    "2",   "0.5",  "0.5",   "1",    "1",   "1",    "0",   "2",    "1",    "1",    "1",    "1",   "0.5",   "1",   "1",    "1"));//Electric
        ArrayList<String> grassMultipliers = new ArrayList<>(Arrays.asList(   "1",  "0.5",   "2",    "1",   "0.5",   "1",    "1",  "0.5",   "2",  "0.5",   "1",   "0.5",   "2",    "1",   "0.5",   "1",  "0.5",   "1"));//Grass
        ArrayList<String> iceMultipliers = new ArrayList<>(Arrays.asList(     "1",  "0.5",  "0.5",   "1",    "2",   "0.5",   "1",   "1",    "2",   "2",    "1",    "1",    "1",    "1",    "2",    "1",  "0.5",   "1"));//Ice
        ArrayList<String> fightingMultipliers = new ArrayList<>(Arrays.asList("2",   "1",    "1",    "1",    "1",    "2",    "1",  "0.5",   "1",  "0.5",  "0.5",  "0.5",   "2",    "0",    "1",    "2",   "2",   "0.5"));//Fighting
        ArrayList<String> poisonMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "1",    "2",    "1",    "1",  "0.5",  "0.5",  "1",    "1",    "1",   "0.5",  "0.5",   "1",    "1",   "0",    "2"));//Poison
        ArrayList<String> groundMultipliers = new ArrayList<>(Arrays.asList(  "1",   "2",    "1",    "2",   "0.5",   "1",    "1",   "2",    "1",   "0",    "1",   "0.5",   "2",    "1",    "1",    "1",   "2",    "1"));//Ground
        ArrayList<String> flyingMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",   "0.5",   "2",    "1",    "2",   "1",    "1",   "1",    "1",    "2",   "0.5",   "1",    "1",    "1",  "0.5",   "1"));//Flying
        ArrayList<String> psychicMultipliers = new ArrayList<>(Arrays.asList( "1",   "1",    "1",    "1",    "1",    "1",    "2",   "2",    "1",   "1",   "0.5",   "1",    "1",    "1",    "1",    "0",  "0.5",   "1"));//Psychic
        ArrayList<String> bugMultipliers = new ArrayList<>(Arrays.asList(     "1",  "0.5",   "1",    "1",    "2",    "1",   "0.5", "0.5",   "1",  "0.5",   "2",    "1",    "1",   "0.5",   "1",    "2",  "0.5",  "0.5"));//Bug
        ArrayList<String> rockMultipliers = new ArrayList<>(Arrays.asList(    "1",   "2",    "1",    "1",    "1",    "2",   "0.5",  "1",   "0.5",  "2",    "1",    "2",    "1",    "1",    "1",    "1",  "0.5",   "1"));//Rock
        ArrayList<String> ghostMultipliers = new ArrayList<>(Arrays.asList(   "0",   "1",    "1",    "1",    "1",    "1",    "1",   "1",    "1",   "1",    "2",    "1",    "1",    "2",    "1",   "0.5",  "1",    "1"));//Ghost
        ArrayList<String> dragonMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "1",    "1",    "1",    "1",   "1",    "1",   "1",    "1",    "1",    "1",    "1",    "2",    "1",  "0.5",   "0"));//Dragon
        ArrayList<String> darkMultipliers = new ArrayList<>(Arrays.asList(    "1",   "1",    "1",    "1",    "1",    "1",   "0.5",  "1",    "1",   "1",    "2",    "1",    "1",    "2",    "1",   "0.5",  "1",   "0.5"));//Dark
        ArrayList<String> steelMultipliers = new ArrayList<>(Arrays.asList(   "1",  "0.5",  "0.5",  "0.5",   "1",    "2",    "1",   "1",    "1",   "1",    "1",    "1",    "2",    "1",    "1",    "1",  "0.5",   "2"));//Steel
        ArrayList<String> fairyMultipliers = new ArrayList<>(Arrays.asList(   "1",  "0.5",   "1",    "1",    "1",    "1",    "2",  "0.5",   "1",   "1",    "1",    "1",    "1",    "1",    "2",    "2",  "0.5",   "1"));//Fairy*/

        //                If i'm defending type:                                   Nor    Fir     Wat     Elec    Gra     Ice     Fig    Poi     Gro    Fly     Psy     Bug     Roc     Gho     Dra     Dar    Ste     Fai
        ArrayList<String> normalMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "1",    "1",    "1",    "2",   "1",    "1",   "1",    "1",    "1",    "1",    "0",    "1",    "1",    "1",    "1"));//Normal
        ArrayList<String> fireMultipliers = new ArrayList<>(Arrays.asList(    "1",  "0.5",   "2",    "1",   "0.5",  "0.5",   "1",   "1",    "2",   "1",    "1",   "0.5",   "2",    "1",    "1",    "1",   "0.5",  "0.5"));//Fire
        ArrayList<String> waterMultipliers = new ArrayList<>(Arrays.asList(   "1",  "0.5",  "0.5",   "2",    "2",   "0.5",   "1",   "1",    "1",   "1",    "1",    "1",    "1",    "1",    "1",    "1",   "0.5",   "1"));//Water
        ArrayList<String> electricMultipliers = new ArrayList<>(Arrays.asList("1",   "1",    "1",   "0.5",   "1",    "1",    "1",   "1",    "2",  "0.5",   "1",    "1",    "1",    "1",    "1",    "1",   "0.5",   "1"));//Electric
        ArrayList<String> grassMultipliers = new ArrayList<>(Arrays.asList(   "1",   "2",   "0.5",  "0.5",  "0.5",   "2",    "1",   "2",   "0.5",  "2",    "1",    "2",    "1",    "1",    "1",    "1",    "1",    "1"));//Grass
        ArrayList<String> iceMultipliers = new ArrayList<>(Arrays.asList(     "1",   "2",    "1",    "1",    "1",   "0.5",   "2",   "1",    "1",   "1",    "1",    "1",    "2",    "1",    "1",    "1",    "2",    "1"));//Ice
        ArrayList<String> fightingMultipliers = new ArrayList<>(Arrays.asList("1",   "1",    "1",    "1",    "1",    "1",    "1",   "1",    "1",   "2",    "2",   "0.5",  "0.5",   "1",    "1",   "0.5",   "1",    "2"));//Fighting
        ArrayList<String> poisonMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "1",   "0.5",   "1",   "0.5", "0.5",   "2",   "1",    "2",   "0.5",   "1",    "1",    "1",    "1",    "1",   "0.5"));//Poison
        ArrayList<String> groundMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "2",    "0",    "2",    "2",    "1",  "0.5",   "1",   "1",    "1",    "1",   "0.5",   "1",    "1",    "1",    "1",    "1"));//Ground
        ArrayList<String> flyingMultipliers = new ArrayList<>(Arrays.asList(  "1",   "1",    "1",    "2",   "0.5",   "2",   "0.5",  "1",    "0",   "1",    "1",   "0.5",   "2",    "1",    "1",    "1",    "1",    "1"));//Flying
        ArrayList<String> psychicMultipliers = new ArrayList<>(Arrays.asList( "1",   "1",    "1",    "1",    "1",    "1",   "0.5",  "1",    "1",   "1",   "0.5",   "2",    "1",    "2",    "1",    "2",    "1",    "1"));//Psychic
        ArrayList<String> bugMultipliers = new ArrayList<>(Arrays.asList(     "1",   "2",    "1",    "1",   "0.5",   "1",   "0.5",  "1",   "0.5",  "2",    "1",    "1",    "2",    "1",    "1",    "1",    "1",    "1"));//Bug
        ArrayList<String> rockMultipliers = new ArrayList<>(Arrays.asList(   "0.5", "0.5",   "2",    "1",    "2",    "1",    "2",  "0.5",   "2",  "0.5",   "1",    "1",    "1",    "1",    "1",    "1",    "2",    "1"));//Rock
        ArrayList<String> ghostMultipliers = new ArrayList<>(Arrays.asList(   "0",   "1",    "1",    "1",    "1",    "1",    "0",  "0.5",   "1",   "1",    "1",   "0.5",   "1",    "2",    "1",    "2",    "1",    "1"));//Ghost
        ArrayList<String> dragonMultipliers = new ArrayList<>(Arrays.asList(  "1",  "0.5",  "0.5",  "0.5",  "0.5",   "2",    "1",   "1",    "1",   "1",    "1",    "1",    "1",    "1",    "2",    "1",    "1",    "2"));//Dragon
        ArrayList<String> darkMultipliers = new ArrayList<>(Arrays.asList(    "1",   "1",    "1",    "1",    "1",    "1",    "2",   "1",    "1",   "1",    "0",    "2",    "1",   "0.5",   "1",   "0.5",   "1",    "2"));//Dark
        ArrayList<String> steelMultipliers = new ArrayList<>(Arrays.asList(  "0.5",  "2",    "1",    "1",   "0.5",  "0.5",   "2",   "0",    "2",  "0.5",  "0.5",  "0.5",  "0.5",   "1",   "0.5",   "1",   "0.5",  "0.5"));//Steel
        ArrayList<String> fairyMultipliers = new ArrayList<>(Arrays.asList(   "1",   "1",    "1",    "1",    "1",    "1",   "0.5",  "2",    "1",   "1",    "1",   "0.5",   "1",    "1",    "0",   "0.5",   "2",    "1"));//Fairy
        
        /*ArrayList<ArrayList<String>> weaknessMultipliers = new ArrayList(Arrays.asList(normalMultipliers, fireMultipliers, waterMultipliers, electricMultipliers,
                grassMultipliers, iceMultipliers, fightingMultipliers, poisonMultipliers, groundMultipliers, flyingMultipliers, psychicMultipliers,
                bugMultipliers, rockMultipliers, ghostMultipliers, dragonMultipliers, darkMultipliers, steelMultipliers, fairyMultipliers));*/

        ArrayList<ArrayList<String>> weaknessMultipliers = new ArrayList<>(Arrays.asList(typesList, normalMultipliers, fireMultipliers, waterMultipliers, electricMultipliers,
                grassMultipliers, iceMultipliers, fightingMultipliers, poisonMultipliers, groundMultipliers, flyingMultipliers, psychicMultipliers,
                bugMultipliers, rockMultipliers, ghostMultipliers, dragonMultipliers, darkMultipliers, steelMultipliers, fairyMultipliers));

        //search the type array until the index matches the pokemon's first type
        for (int i = 0; i < 18; i++) {
            if (weaknessMultipliers.get(0).get(i).equals(this.type.get(0))) {
                //the Pokemon's defensive weakness multipliers are then set equal to the defensive weakness multipliers for that type
                this.weaknesses = weaknessMultipliers.get(i + 1);
            } 
        }

        //if the pokemon has a second type
        if (!(this.type.get(1) == null)) 
        {
            //search the type array until the index matches the pokemon's second type
            for (int j = 0; j < 18; j++) {
                if (weaknessMultipliers.get(0).get(j).equals(this.type.get(1))) {

                    //the Pokemon's defensive  weakness multipliers are then multiplied by the defensive multipliers of their second type
                    //this gives that pokemon the defensive weaknesses for their dual-typing
                    for (int k = 0; k < 18; k++) {
                        double multiplier = Double.parseDouble(this.weaknesses.get(k)) * Double.parseDouble(weaknessMultipliers.get(j + 1).get(k));
                        this.weaknesses.set(k, Double.toString(multiplier));
                    }
                }   
            }  
        }
        //System.out.println(weaknessMultipliers);
    }

}
