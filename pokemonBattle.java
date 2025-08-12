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

        //Pokemon
        Pokemon userPokemon = new Pokemon("Rayquaza", 50, new ArrayList<>(Arrays.asList("Dragon", "Flying")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)), 105, 150, 90, 150, 90, 95);
        Pokemon compPokemon = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)),  108, 130, 95, 80, 85, 102);
        
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

        //UI output
        System.out.println("*****************************************");
        System.out.println(" Welcome to the Pokemon Battle Simulator");
        System.out.println("*****************************************");
        //System.out.println("");
        System.out.println(battleScreen(userPokemon, compPokemon));

        System.out.println(userPokemon.name + " has the following moves: ");
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
        
        
        System.out.println(userPokemon.moves.get(Integer.parseInt(moveSelection) - 1).name);

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

    




}