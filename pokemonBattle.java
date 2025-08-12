import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pokemonBattle {

    public static void main(String[] args) {

        //Moves
        Move flamethrower = new Move("Flamethrower", "Fire", "Spec", 90, 100, 15);
        Move earthquake = new Move("Earthquake", "Ground", "Phys", 100, 100, 10);
        Move outrage = new Move("Outrage", "Dragon", "Phys", 120, 100, 10);
        Move crunch = new Move("Crunch", "Dark", "Phys", 80, 100, 15);

        //Pokemon      Lv. 50 Stat calculaator: https://pycosites.com/pkmn/stat.php
        Pokemon userPokemon = new Pokemon("Rayquaza", 50, new ArrayList<>(Arrays.asList("Dragon", "Flying")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)), 165, 155, 95, 155, 95, 100);
        Pokemon compPokemon = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)),  168, 135, 100, 85, 90, 107);
        
        String rayAscii = """
                ⠀⠀⠀⠀⢀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠸⣟⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⢸⡀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⢧⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠘⡇⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠛⢉⡼⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⢸⡀⢠⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⣾⠟⠙⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢧⠈⡇⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠟⢋⣀⣀⣠⠾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⢀⡀⠀⢀⣨⠗⠛⠒⠒⣶⡶⣢⣤⣶⠟⣫⡴⠒⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⢀⣾⣿⣿⣿⡷⣶⣶⣶⣺⣭⠾⠟⠉⣡⢞⣿⠦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⢀⣾⡿⢣⢞⣿⣿⣭⡽⢿⡏⠀⠤⠄⠿⠋⠀⢻⡆⢷⣏⡓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⣴⣿⠏⣀⣼⣿⣯⣿⣷⣤⡿⢿⣧⠀⢘⣁⣀⣀⣀⡛⠳⢬⣝⣦⣈⠓⢄⣀⣾⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⣿⣿⣿⠛⠻⠟⣻⡏⠉⢀⢿⣿⡿⢳⣄⡘⣯⠉⠓⠲⢤⣤⡈⠙⠯⣓⢮⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠉⠀⠁⠀⠀⢸⡟⠀⢀⣾⣿⠟⠀⠀⠙⣿⣾⣧⠀⠀⠀⠙⢻⣶⠄⠈⠳⣝⣿⢯⢷⣶⣶⣶⣶⣤⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠠⣿⡀⣀⣼⣿⣯⣤⣤⣦⡀⠈⢿⡻⢳⡀⠀⠀⠀⢹⡳⡶⠞⡛⢹⣧⠀⢿⣦⠀⠈⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠉⠉⠉⣹⣿⣿⣿⣿⣿⣷⣦⣀⣽⣆⣳⣶⣶⣶⣾⣧⠀⠙⣶⠟⠉⢻⣾⡏⠀⠀⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣟⣻⡀⠀⣸⣄⣠⠾⣿⣷⠀⠀⣾⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⣀⡼⣿⠿⣿⣄⣤⣴⣿⣿⡿⢭⣽⣿⡽⠿⠟⣻⣿⡟⢛⣿⡶⠟⠉⢹⣦⡘⣿⡄⢠⣿⣿⣯⣻⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⣤⢾⡿⠃⢉⣤⣿⣿⣿⣟⣯⣟⠓⣿⣿⠿⣿⣷⠶⠿⠋⠀⣸⣼⣧⡀⢀⣿⡟⢳⡈⣷⣼⠛⠛⠿⣿⣟⡻⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢠⡞⢡⠟⢡⢿⣽⠿⠿⣿⣿⣿⣿⣿⡿⠁⠉⠉⠉⠁⠀⠀⠀⢰⣿⣁⣵⣧⣾⣿⡧⠾⠋⣹⡧⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⢠⣿⡄⠈⠀⢸⡾⠁⠀⠀⠹⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⣾⣟⣿⠟⣹⣧⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⣿⣿⡇⠀⠀⢸⠃⠀⣴⠟⠛⠻⠿⠿⠿⣧⠀⠀⠀⠀⠀⠀⣠⠎⠀⠉⣹⠿⡿⣻⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣽⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀
                ⣿⣿⠀⠀⠀⣠⠧⠾⢯⣀⣀⡀⠀⠀⣀⣿⣆⠀⢀⣠⠴⠊⠀⠀⣠⣮⣷⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣯⣿⣷⣤⣀⠀⠀⠀⠀⠀
                ⢻⣿⡀⢀⡞⠁⠀⠀⠀⠀⠉⠉⠉⠉⢉⣽⠟⠋⠉⠁⠀⣀⠀⢈⡿⢿⢿⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀
                ⠀⠱⣝⢿⣶⣶⢄⣀⡀⠀⠀⠀⠀⠀⣾⠃⠀⣠⠖⠍⠛⣿⣏⣭⣾⠿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣶⡄
                ⠀⠀⠈⠙⢷⣉⠉⠛⠚⠿⠿⢶⣶⣶⣿⡶⣶⢻⣤⡴⣶⣻⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣯⣿⢿⣯⠁⠀⠀⠀
                ⠀⠀⠀⠀⠀⠙⣷⡤⠤⠤⣄⣀⣀⡀⢈⣛⣿⣽⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡿⠃⠀⢻⡆⠀⠀⠀
                ⠀⠀⠀⠀⠀⢸⣿⣗⠤⣄⡀⠀⠉⢩⣽⡟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠈⠉⠙⠛⠲⢿⣶⣤⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """;
                
        //Create Scanner
        Scanner scanner = new Scanner(System.in);
        boolean accepted = false;//used to confirm move selection
        String moveSelection = "";//stored value of move selected by user
        Move userMove;//the move the user has picked for this turn
        Move compMove;//the move the computer is using this turn

        //greets users
        welcomeMessage(userPokemon, compPokemon);

        // repeats battle sequence until we get a winner
        //do {

        //print out user's pokemon's moves
        System.out.println("What will " + userPokemon.name + " do?");
        System.out.println("1. " + userPokemon.moves.get(0).name);
        System.out.println("2. " + userPokemon.moves.get(1).name);
        System.out.println("3. " + userPokemon.moves.get(2).name);
        System.out.println("4. " + userPokemon.moves.get(3).name);

        //Asks the user to enter which move they want to use until they give an acceptable answer
        while (!accepted) { 

            System.out.print("Please enter the number of the move you want to use: ");
            moveSelection = scanner.nextLine();

            if (moveSelection.equals("1") || moveSelection.equals("2") || moveSelection.equals("3") || moveSelection.equals("4")) {  
                accepted = true;
            }
        }
        
        //user choses which move they want to use
        userMove = userPokemon.moves.get(Integer.parseInt(moveSelection) - 1);

        //Perorm both players attacks and print the result
        battleSequence(userPokemon, userMove, compPokemon);

        //} while (!userPokemon.hasFainted || !compPokemon.hasFainted);

        //Displays match outcome

        if (userPokemon.hasFainted || compPokemon.hasFainted) {
            matchEnd(userPokemon);
        };

        scanner.close();
    }

    public static void welcomeMessage(Pokemon userPokemon, Pokemon compPokemon) {
        
        //UI output
        System.out.println("*****************************************");
        System.out.println(" Welcome to the Pokemon Battle Simulator");
        System.out.println("*****************************************");
        //System.out.println("");
        System.out.println("You are challenged by Champion Cynthia");
        System.out.println("Champion Cynthia sent out " + compPokemon.name + "!");
        System.out.println("Go! " + userPokemon.name + "!");
        System.out.println(battleScreen(userPokemon, compPokemon));
    }

    public static String battleScreen(Pokemon userPokemon, Pokemon compPokemon) {

        return String.format("""
                ____________________________________________________
                |                                                  |
                |   %s  lv.%d                        
                |   Hp: %d / %d                                  |
                |                                                  |
                |                                                  |
                |                                                  |
                |                                                  |
                |                              %s  lv.%d         
                |                              Hp: %d / %d       |
                ____________________________________________________
                """, compPokemon.name, compPokemon.level, compPokemon.currentHp, compPokemon.hp,
                     userPokemon.name, userPokemon.level, userPokemon.currentHp, userPokemon.hp);
    //compPokemon.gender, userPokemon.gender,
    }

    public static int calculateDamage(Pokemon attackingPokemon, Move move, Pokemon defendingPokemon) {

        //Damage = (((((Level, 0.4 + 2), Base Power, (Attack/Defense)) / 50) + 2), Modifiers), and Random Number.
        
        //physical moves
        double baseDamage = ((((attackingPokemon.level * 0.4) + 2) * move.power * (attackingPokemon.atk / defendingPokemon.def)) / 50) + 2;
        //special moves
        //double baseDamage = ((((attackingPokemon.level * 0.4) + 2) * move.power * (attackingPokemon.spAtk / defendingPokemon.spDef)) / 50) + 2;

        //Modifiers:

        //Math.floor(baseDamage)
        return (int) Math.floor(baseDamage);
    }

    public static void battleAttack(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon) {

        //prints the name of the move the user selected
        System.out.println(atkPokemon.name + " used "+ atkMove.name + "!");
        //calculate moves Damage
        int damage = calculateDamage(atkPokemon, atkMove, defPokemon);
        //Deal damage
        defPokemon.currentHp -= damage;
    }

    
    public static void battleTurn(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon, Boolean flipDisplay) {
        //player's move
        battleAttack(atkPokemon, atkMove, defPokemon);
        faintedCheck(defPokemon);
        //post-move result
        if (flipDisplay) {
            System.out.println(battleScreen(atkPokemon, defPokemon));
        } else {
            System.out.println(battleScreen(defPokemon, atkPokemon));
        }

        // if the defending pokemon has fainted
        if (defPokemon.hasFainted) {
            if (flipDisplay) {
                System.out.println("The foe's " + defPokemon.name + " fainted!");
            } else {
                System.out.println(defPokemon.name + " fainted!");
            }
            
        } //if the defending pokemon lives, he attacks
        else {
            battleAttack(defPokemon, atkMove, atkPokemon);
            faintedCheck(atkPokemon);
        };
    }

    public static void faintedCheck(Pokemon defPokemon) {
        
        if (defPokemon.currentHp <= 0) {
            defPokemon.currentHp = 0;//sets hp to 0 so it's not displaying a negative value
            defPokemon.hasFainted = true;
        }
    }

    public static void battleSequence(Pokemon userPokemon, Move userMove, Pokemon compPokemon) {

        //if user's pokemon is faster
        if (userPokemon.spd > compPokemon.spd) {

            //player's attck
            battleTurn(userPokemon, userMove, compPokemon, true);

            //computer's attack, only if the computer's pokemon survived the last attack
            if (userPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
                System.out.println(userPokemon.name + " fainted!");
            } else if (!compPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
            };
             
        } 
        //if computer's pokemon is faster
        else if (userPokemon.spd < compPokemon.spd) {

            //computer's attck
            battleTurn(compPokemon, userMove, userPokemon, false);

            //player's attack, only if the player's pokemon survived the last attack
            if (compPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
                System.out.println("The foe's " + compPokemon.name + " fainted!");
            } else if (!userPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
            };
            
        }
        //speed tie, random who goes first
        else {

            //player's attck
            battleTurn(userPokemon, userMove, compPokemon, true);

            //computer's attack, only if the computer's pokemon survived the last attack
            if (userPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
                System.out.println(userPokemon.name + " fainted!");
            } else {
                System.out.println(battleScreen(userPokemon, compPokemon));
            };
        }   
    }

    public static void matchEnd(Pokemon userPokemon) {

        if (userPokemon.hasFainted) {
            playerLost();
        } else {
            cynthiaLost();
        }
    }

    public static void cynthiaLost() {
        //payout = level of last pokemon in opponent's party * base (Champion $200) https://bulbapedia.bulbagarden.net/wiki/Prize_money
        System.out.println();
        System.out.println("You have defeated Champion Cynthia");
        System.out.println("...Just a few minutes ago, you were the most powerful challenger.");
        System.out.println("And just now, you became the most powerful of all the Trainers.");
        System.out.println("You are now our newest Champion!");
        System.out.println("You got $10,000 for winning!");
        System.out.println();
    }

    public static void playerLost() {
        //Lost money = player's highest pokemon lvl * base (120 at 8 badges) https://bulbapedia.bulbagarden.net/wiki/Black_out
        System.out.println();
        System.out.println("You are out of usable Pokemon!");
        System.out.println("You paid out $6,000 to the winner.");
        System.out.println("... ... ... ...");
        System.out.println("You blacked out!");
        System.out.println();
    }




}