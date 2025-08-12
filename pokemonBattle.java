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

        //UI output
        System.out.println("*****************************************");
        System.out.println(" Welcome to the Pokemon Battle Simulator");
        System.out.println("*****************************************");
        //System.out.println("");
        System.out.println("You are challenged by Champion Cynthia");
        System.out.println("Champion Cynthia sent out Garchomp!");
        System.out.println("Go! Rayquaza!");
        System.out.println(battleScreen(userPokemon, compPokemon));

        System.out.println("What will " + userPokemon.name + " do?");
        System.out.println("1. " + userPokemon.moves.get(0).name);
        System.out.println("2. " + userPokemon.moves.get(1).name);
        System.out.println("3. " + userPokemon.moves.get(2).name);
        System.out.println("4. " + userPokemon.moves.get(3).name);

        
        while (!accepted) { 

            System.out.print("Please enter the number of the move you want to use: ");
            moveSelection = scanner.nextLine();

            if (moveSelection.equals("1") || moveSelection.equals("2") || moveSelection.equals("3") || moveSelection.equals("4")) {
                
                accepted = true;
            }
        }
        
        userMove = userPokemon.moves.get(Integer.parseInt(moveSelection) - 1);

        battleSequence(userPokemon, userMove, compPokemon);
        System.out.println(battleScreen(userPokemon, compPokemon));



        scanner.close();
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

    public static void battleSequence(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon) {

        //prints the name of the move the user selected
        System.out.println(atkPokemon.name + " used "+ atkMove.name + "!");
        //calculate moves Damage
        int damage = calculateDamage(atkPokemon, atkMove, defPokemon);
        //Deal damage
        defPokemon.currentHp -= damage;
    }


}