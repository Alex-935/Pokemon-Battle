public class pokemonBattle {

    public static void main(String[] args) {


        
    }

    public static class Pokemon {

        //attributes
        String name;
        int level;
        String[] type;
        //Pokemon's Stats for battling
        int hp;
        int atk;
        int def;
        int spAtk;
        int spDef;
        int spd;
        int currentHp;

        //class of Pokemon's moves
        Move moves;

        //Constructor
        Pokemon(String name, int level, String[] type, int hp, int atk, int def,
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

        }


    }

    public static class Move {


    }
}