import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pokemonBattle {

    public static void main(String[] args) {

        //Moves
        Move flamethrower = new Move("Flamethrower", "Fire", "Spec", 90, 100, 15);
        Move earthquake = new Move("Earthquake", "Ground", "Phys", 100, 100, 10);
        Move outrage = new Move("Outrage", "Dragon", "Phys", 120, 100, 10);
        Move crunch = new Move("Crunch", "Dark", "Phys", 80, 100, 15);

        //Pokemon      Lv. 50 Stat calculaator: https://pycosites.com/pkmn/stat.php
        Pokemon rayquaza = new Pokemon("Rayquaza", 50, new ArrayList<>(Arrays.asList("Dragon", "Flying")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)), 165, 155, 95, 155, 95, 100);
        Pokemon garchomp = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)),  168, 135, 100, 85, 90, 107);
        

        //Trainers
        Trainer user = new Trainer("user", rayquaza, 120);
        Trainer cynthia = new Trainer("Cynthia", garchomp, 200);

        //the Trainer the computer is playing as
        Trainer comp = cynthia;

        String rayquazaAscii = """
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
        Random random = new Random();
        boolean accepted = false;//used to confirm move selection
        String moveSelection = "";//stored value of move selected by user
        Move userMove;//the move the user has picked for this turn
        Move compMove;//the move the computer is using this turn
        int speedTie;//used for determining which pokemon goes first in the event their speeds are the same

        //greets users
        welcomeMessage(user.acePokemon, comp);

        // repeats battle sequence until we get a winner. True while neither pokemon has fainted.
        while (!user.acePokemon.hasFainted && !comp.acePokemon.hasFainted) {

            //print out user's pokemon's moves
            System.out.println("What will " + user.acePokemon.name + " do?");
            System.out.println("1. " + user.acePokemon.moves.get(0).name);
            System.out.println("2. " + user.acePokemon.moves.get(1).name);
            System.out.println("3. " + user.acePokemon.moves.get(2).name);
            System.out.println("4. " + user.acePokemon.moves.get(3).name);

            //needs to be reset every iteration of while loop
            accepted = false;
            //Asks the user to enter which move they want to use until they give an acceptable answer
            while (!accepted) { 

                System.out.print("Please enter the number of the move you want to use: ");
                moveSelection = scanner.nextLine();

                if (moveSelection.equals("1") || moveSelection.equals("2") || moveSelection.equals("3") || moveSelection.equals("4")) {  
                    accepted = true;
                }
            }
            
            //user choses which move they want to use
            userMove = user.acePokemon.moves.get(Integer.parseInt(moveSelection) - 1);

            //computerMove
            compMove = user.acePokemon.moves.get(random.nextInt(1, 5) - 1);

            speedTie = random.nextInt(0, 2);//used for determining which pokemon goes first in the event their speeds are the same
            //Perorm both players attacks and print the result
            battleSequence(user.acePokemon, userMove, comp.acePokemon, compMove, speedTie);

            //Displays match outcome when either pokemon has fainted
            if (user.acePokemon.hasFainted || comp.acePokemon.hasFainted) {
                matchEnd(user, comp);
            };

        };
        scanner.close();
    }

    //displays message welcoming you when copde is first ran
    public static void welcomeMessage(Pokemon userPokemon, Trainer comp) {
        
        //Greeting Message
        System.out.println("*****************************************");
        System.out.println(" Welcome to the Pokemon Battle Simulator");
        System.out.println("*****************************************");

        // Start Battle Dialogue
        System.out.println("You are challenged by " + comp.name);
        System.out.println(comp.name + " sent out " + comp.acePokemon + "!");
        System.out.println("Go! " + userPokemon.name + "!");
        System.out.println(battleScreen(userPokemon, comp.acePokemon));
    }

    //returns screen to display current battle status
    public static String battleScreen(Pokemon userPokemon, Pokemon compPokemon) {

        return String.format("""
                ____________________________________________________
                |                                                  |
                |   %s  lv.%d                        
                |   Hp: %d / %d                                  
                |                                                  |
                |                                                  |
                |                                                  |
                |                                                  |
                |                              %s  lv.%d         
                |                              Hp: %d / %d       
                ____________________________________________________
                """, compPokemon.name, compPokemon.level, compPokemon.currentHp, compPokemon.hp,
                     userPokemon.name, userPokemon.level, userPokemon.currentHp, userPokemon.hp);
    //compPokemon.gender, userPokemon.gender, //didn't display correctly, scraped legacy idea
    }

    //uses official pokemon damage formula to calculate battle damage
    public static int calculateDamage(Pokemon attackingPokemon, Move move, Pokemon defendingPokemon) {

        //Damage = (((((Level, 0.4 + 2), Base Power, (Attack/Defense)) / 50) + 2), Modifiers), and Random Number.
        double baseDamage;

        if (move.category.equals("Phys")) {
            //physical move
            baseDamage = ((((attackingPokemon.level * 0.4) + 2) * move.power * (attackingPokemon.atk / defendingPokemon.def)) / 50) + 2;
        }
        else if (move.category.equals("Spec")) {
            //special move
            baseDamage = ((((attackingPokemon.level * 0.4) + 2) * move.power * (attackingPokemon.spAtk / defendingPokemon.spDef)) / 50) + 2;
        }
        else {
            //Status move
            baseDamage = 0;
        }

        //STAB - Same-Type Attack Bonus. If the pokemon's and moves type are the same, the move does 1.5x damage
        if (move.type.equals(attackingPokemon.type.get(0)) || move.type.equals(attackingPokemon.type.get(1))) {
            baseDamage *= 1.5;
        }

        //Modifiers:
        //System.out.println("The damage is: " + baseDamage);
        //Math.floor(baseDamage)
        return (int) Math.floor(baseDamage);
    }

    //displays move use, calculates the damage and applies it to defending pokemon
    public static void battleAttack(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon) {

        //prints the name of the move the user selected
        System.out.println(atkPokemon.name + " used "+ atkMove.name + "!");
        //calculate moves Damage
        int damage = calculateDamage(atkPokemon, atkMove, defPokemon);
        //Deal damage
        defPokemon.currentHp -= damage;
    }

    //deals with actual fighting sequence, adds checks to ensure a fainted pokemon cannot attack
    public static void battleTurn(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon, Move defMove, Boolean flipDisplay) {
        //player's move
        battleAttack(atkPokemon, atkMove, defPokemon);
        faintedCheck(defPokemon);
        //posts-move result. flipDisplay is used to ensure the user's pokemon is always displayed in the bottom right of the battleScreen.
        if (flipDisplay) {
            System.out.println(battleScreen(atkPokemon, defPokemon));
        } else {
            System.out.println(battleScreen(defPokemon, atkPokemon));
        }

        // if the defending pokemon has fainted, tell the user
        if (defPokemon.hasFainted) {
            if (flipDisplay) {
                System.out.println("The foe's " + defPokemon.name + " fainted!");
            } else {
                System.out.println(defPokemon.name + " fainted!");
            }
            
        } //if the defending pokemon lives, he attacks. We then check if the other pokemon fainted from the attack
        else {
            battleAttack(defPokemon, defMove, atkPokemon);
            faintedCheck(atkPokemon);
        };
    }

    //checks to see if a pokemon has fainted. Sets hp to 0 so we don't have a negative health value.
    public static void faintedCheck(Pokemon defPokemon) {
        
        if (defPokemon.currentHp <= 0) {
            defPokemon.currentHp = 0;//sets hp to 0 so it's not displaying a negative value
            defPokemon.hasFainted = true;
        }
    }

    //calculates battle order based on the pokemons speed. Also used to ensure the sys.outs are displayed in the correct order and under the right conditions.
    public static void battleSequence(Pokemon userPokemon, Move userMove, Pokemon compPokemon, Move compMove, int speedTie) {

        //if user's pokemon is faster
        if (userPokemon.spd > compPokemon.spd) {

            //player's attack
            battleTurn(userPokemon, userMove, compPokemon, compMove, true);

            //after the computer's attack, tells the user the result of the battle
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
            battleTurn(compPokemon, compMove, userPokemon, userMove, false);

            ////after the players's attack, tells the user the result of the battle
            if (compPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
                System.out.println("The foe's " + compPokemon.name + " fainted!");
            } else if (!userPokemon.hasFainted) {
                System.out.println(battleScreen(userPokemon, compPokemon));
            };
            
        }
        //speed tie, random who goes first
        else {

            //if the random number for deciding speed rolled 0, the user moves first
            if (speedTie == 0) {
                //player's attack
                battleTurn(userPokemon, userMove, compPokemon, compMove, true);

                //after the computer's attack, tells the user the result of the battle
                if (userPokemon.hasFainted) {
                    System.out.println(battleScreen(userPokemon, compPokemon));
                    System.out.println(userPokemon.name + " fainted!");
                } else {
                    System.out.println(battleScreen(userPokemon, compPokemon));
                }
            }
            //if the random number for deciding speed rolled 1, the user computer first
            else {

                //computer's attck
                battleTurn(compPokemon, compMove, userPokemon, userMove, false);

                ////after the players's attack, tells the user the result of the battle
                if (compPokemon.hasFainted) {
                    System.out.println(battleScreen(userPokemon, compPokemon));
                    System.out.println("The foe's " + compPokemon.name + " fainted!");
                } else if (!userPokemon.hasFainted) {
                    System.out.println(battleScreen(userPokemon, compPokemon));
                }
            }  
        }   
    }

    //decides which final message to print when the winner has been decided
    public static void matchEnd(Trainer user, Trainer comp) {

        if (user.outOfPokemon) {
            playerLost(user.prizeMoney);
        } else {
            cynthiaLost(comp.prizeMoney);
        }
    }

    //prints if the player defeated Cynthia
    public static void cynthiaLost(int prizeMoney) {
        //payout = level of last pokemon in opponent's party * base (Champion $200) https://bulbapedia.bulbagarden.net/wiki/Prize_money
        System.out.println();
        System.out.println("You have defeated Champion Cynthia");
        System.out.println("...Just a few minutes ago, you were the most powerful challenger.");
        System.out.println("And just now, you became the most powerful of all the Trainers.");
        System.out.println("You are now our newest Champion!");
        System.out.println("You got $" + prizeMoney + "for winning!");
        System.out.println();
    }


    //prints if the player lost to the opponent
    public static void playerLost(int prizeMoney) {
        //Lost money = player's highest pokemon lvl * base (120 at 8 badges) https://bulbapedia.bulbagarden.net/wiki/Black_out
        System.out.println();
        System.out.println("You are out of usable Pokemon!");
        System.out.println("You paid out $" + prizeMoney + " to the winner.");
        System.out.println("... ... ... ...");
        System.out.println("You blacked out!");
        System.out.println();
    }

}