import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pokemonBattle {

    public static void main(String[] args) {

        //Moves     Max PP: 8/5ths of base PP, 40 - 64, 30 - 48, 15 - 24, 10 - 16, 5 - 8
        Move aerialAce = new Move("Aerial Ace", "Flying", "Phys", 60, 100, 20, null, 0, 0);//guaranteed hit
        Move airSlash = new Move("Air Slash", "Flying", "Spec", 75, 95, 15, null, 0, 0);
        Move ancientPower = new Move("Ancient Power", "Rock", "Spec", 60, 100, 5, null, 0,  0);
        Move auraSphere = new Move("Aura Sphere", "Fighting", "Spec", 80, 100, 20, null, 0,  0);//guaranteed hit
        Move blizzard = new Move("Blizzard", "Ice", "Spec", 110, 70,5, null, 0,  0);
        Move bodyPress = new Move("Body Press", "Fighting", "Phys", 80, 100,10, null, 0,  0);
        Move braveBird = new Move("Brave Bird", "Flying", "Phys", 120, 100, 15, null, 0,  0);
        Move bulletPunch = new Move("Bullet Punch", "Steel", "Phys", 40, 100, 30, null, 0, 1);
        Move closeCombat = new Move("Close Combat", "Fighting", "Phys", 120, 100, 5, null, 0,  0);
        Move crunch = new Move("Crunch", "Dark", "Phys", 80, 100, 15, null, 0,  0);
        Move crushClaw = new Move("Crush Claw", "Normal", "Phys", 75, 95, 10, null, 0,  0);
        Move darkPulse = new Move("Dark Pulse", "Dark", "Spec", 80, 100, 15, null, 0,  0);
        Move dazzlingGleam = new Move("Dazzling Gleam", "Fairy", "Spec", 80, 100, 10, null, 0,  0);
        Move dig = new Move("Dig", "Ground", "Phys", 80, 100, 10, null, 0,  0);
        Move dragonAscent = new Move("Dragon Ascent", "Flying", "Phys", 120, 100, 5, null, 0,  0);
        Move dragonClaw = new Move("Dragon Claw", "Dragon", "Phys", 80, 100, 15, null, 0,  0);
        Move earthPower = new Move("Earth Power", "Ground", "Spec", 90, 100, 10, null, 0,  0);
        Move earthquake = new Move("Earthquake", "Ground", "Phys", 100, 100, 10, null, 0,  0);
        Move energyBall = new Move("Energy Ball", "Grass", "Spec", 90, 100, 10, null, 0,  0);
        Move extremeSpeed = new Move("Extreme Speed", "Normal", "Phys", 80, 100, 5, null, 0,  2);
        Move flamethrower = new Move("Flamethrower", "Fire", "Spec", 90, 100, 15, null, 0,  0);
        Move gigaImpact = new Move("Giga Impact", "Normal", "Phys", 150, 90, 5, null, 0,  0);
        Move hammerArm = new Move("Hammer Arm", "Fighting", "Phys", 100, 90, 10, null, 0,  0);
        Move hydroPump = new Move("Hydro Pump", "Water", "Spec", 110, 80, 5, null, 0,  0);
        Move hyperBeam = new Move("Hyper Beam", "Normal", "Spec", 150, 90, 5, null, 0,  0);
        Move iceBeam = new Move("Ice Beam", "Ice", "Spec", 90, 100, 10, null, 0,  0);
        Move icePunch = new Move("Ice Punch", "Ice", "Phys", 75, 100, 15, null, 0,  0);
        Move ironHead = new Move("Iron Head", "Steel", "Phys", 80, 100, 15, null, 0,  0);
        Move ironTail = new Move("Iron Tail", "Steel", "Phys", 100, 75, 15, null, 0,  0);
        Move judgement = new Move("Judgement", "Normal", "Spec", 100, 100, 10, null, 0,  0);
        Move metalClaw = new Move("Metal Claw", "Steel", "Phys", 50, 95, 35, null, 0,  0);
        Move meteorMash = new Move("Meteor Mash", "Steel", "Phys", 90, 90, 10, null, 0,  0);
        Move outrage = new Move("Outrage", "Dragon", "Phys", 120, 100, 10, null, 0,  0);
        Move psychic = new Move("Psychic", "Psychic", "Spec", 90, 100, 10, null, 0,  0);
        Move scald = new Move("Scald", "Water", "Spec", 80, 100, 15, null, 0,  0);
        Move shadowBall = new Move("Shadow Ball", "Ghost", "Spec", 80, 100, 15, null, 0,  0);
        Move sludgeBomb = new Move("Sludge Bomb", "Poison", "Spec", 90, 100, 10, null, 0,  0);
        Move stoneEdge = new Move("Stone Edge", "Rock", "Phys", 100, 80, 5, null, 0,  0);
        Move suckerPunch = new Move("Sucker Punch", "Dark", "Phys", 80, 100, 5, null, 0,  1);//had pover of 80 pre gen-7
        Move throatChop = new Move("Throat Chop", "Dark", "Phys", 80, 100, 15, null, 0,  0);
        Move thunder = new Move("Thunder", "Electric", "Spec", 110, 70, 10, null, 0,  0);
        Move waterPulse = new Move("Water Pulse", "Water", "Spec", 60, 100, 20, null, 0,  0);
        Move xScissor = new Move("X-Scissor", "Bug", "Phys", 80, 100, 15, null, 0,  0);
        Move zenHeadbutt = new Move("Zen Headbutt", "Psychic", "Phys", 80, 90, 15, null, 0,  0);

        //Pokemon      Lv. 50 Stat calculaator: https://pycosites.com/pkmn/stat.php   Sets: https://calc.pokemonshowdown.com/ 
        Pokemon cynthiasSpiritomb = new Pokemon("Spiritomb", 50, new ArrayList<>(Arrays.asList("Ghost", "Dark")), new ArrayList<>(Arrays.asList(shadowBall, darkPulse, psychic, suckerPunch)),  110, 97, 113, 97, 113, 40);
        Pokemon cynthiasRoserade = new Pokemon("Roserade", 50, new ArrayList<>(Arrays.asList("Grass", "Poison")), new ArrayList<>(Arrays.asList(dazzlingGleam, shadowBall, sludgeBomb, energyBall)),  120, 75, 70, 130, 110, 95);
        Pokemon cynthiasTogekiss = new Pokemon("Togekiss", 50, new ArrayList<>(Arrays.asList("Fairy", "Flying")), new ArrayList<>(Arrays.asList(airSlash, dazzlingGleam, auraSphere, waterPulse)),  145, 55, 100, 125, 120, 85);
        Pokemon cynthiasLucario = new Pokemon("Lucario", 50, new ArrayList<>(Arrays.asList("Fighting", "Steel")), new ArrayList<>(Arrays.asList(closeCombat, meteorMash, psychic, earthquake)),  130, 115, 75, 120, 75, 95);
        Pokemon cynthiasMilotic = new Pokemon("Milotic", 50, new ArrayList<>(Arrays.asList("Water", null)), new ArrayList<>(Arrays.asList(hydroPump, blizzard, iceBeam, scald)),  155, 65, 84, 105, 130, 86);
        Pokemon cynthiasGarchomp = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), new ArrayList<>(Arrays.asList(outrage, earthquake, stoneEdge, gigaImpact)),  183, 150, 115, 100, 105, 122);
        Pokemon cyrusWeavile = new Pokemon("Weavile", 50, new ArrayList<>(Arrays.asList("Dark", "Ice")), new ArrayList<>(Arrays.asList(icePunch, throatChop, dig, aerialAce)), 130, 125, 70, 50, 90, 130);
        Pokemon stevensSkarmory = new Pokemon("Skarmory", 50, new ArrayList<>(Arrays.asList("Steel", "Flying")), new ArrayList<>(Arrays.asList(bodyPress, braveBird, xScissor, ironHead)),  125, 85,145,45, 75, 75);
        Pokemon stevensClaydol = new Pokemon("Claydol", 50, new ArrayList<>(Arrays.asList("Ground", "Psychic")), new ArrayList<>(Arrays.asList(iceBeam, dazzlingGleam, psychic, earthPower)),  120, 75, 110, 75, 125, 80);
        Pokemon stevensAggron = new Pokemon("Aggron", 50, new ArrayList<>(Arrays.asList("Steel", "Rock")), new ArrayList<>(Arrays.asList(stoneEdge, earthquake, ironTail, dragonClaw)),  130, 115, 185, 65, 65, 55);
        Pokemon stevensCradily = new Pokemon("Cradily", 50, new ArrayList<>(Arrays.asList("Rock", "Grass")), new ArrayList<>(Arrays.asList(energyBall, ancientPower, sludgeBomb, hyperBeam)),  146, 86, 102, 86, 112, 48);
        Pokemon stevensArmaldo = new Pokemon("Armaldo", 50, new ArrayList<>(Arrays.asList("Rock", "Bug")), new ArrayList<>(Arrays.asList(xScissor, stoneEdge, ironTail, crushClaw)),  135, 130, 105, 75, 85, 50);
        Pokemon stevensMetagross = new Pokemon("Metagross", 50, new ArrayList<>(Arrays.asList("Steel", "Psychic")), new ArrayList<>(Arrays.asList(zenHeadbutt, meteorMash, bulletPunch, hammerArm)),  140, 154, 135, 100, 95, 75);
        Pokemon arceus = new Pokemon("Arceus", 50, new ArrayList<>(Arrays.asList("Normal", null)), new ArrayList<>(Arrays.asList(judgement, shadowBall, thunder, extremeSpeed)), 180, 125, 125, 125, 125, 125);
        Pokemon garchomp = new Pokemon("Garchomp", 50, new ArrayList<>(Arrays.asList("Dragon", "Ground")), new ArrayList<>(Arrays.asList(flamethrower, earthquake, outrage, crunch)),  168, 135, 100, 85, 90, 107);
        Pokemon lucario = new Pokemon("Lucario", 50, new ArrayList<>(Arrays.asList("Fighting", "Steel")), new ArrayList<>(Arrays.asList(closeCombat, meteorMash, psychic, earthquake)),  130, 115, 75, 120, 75, 95);
        Pokemon metagross = new Pokemon("Metagross", 50, new ArrayList<>(Arrays.asList("Steel", "Psychic")), new ArrayList<>(Arrays.asList(zenHeadbutt, meteorMash, bulletPunch, hammerArm)),  140, 154, 135, 100, 95, 75);
        Pokemon milotic = new Pokemon("Milotic", 50, new ArrayList<>(Arrays.asList("Water", null)), new ArrayList<>(Arrays.asList(hydroPump, blizzard, iceBeam, scald)),  155, 65, 84, 105, 130, 86);
        Pokemon rayquaza = new Pokemon("Rayquaza", 50, new ArrayList<>(Arrays.asList("Dragon", "Flying")), new ArrayList<>(Arrays.asList(dragonAscent, earthquake, outrage, extremeSpeed)), 165, 155, 95, 155, 95, 100);
        Pokemon roserade = new Pokemon("Roserade", 50, new ArrayList<>(Arrays.asList("Grass", "Poison")), new ArrayList<>(Arrays.asList(dazzlingGleam, shadowBall, sludgeBomb, energyBall)),  120, 75, 70, 130, 110, 95);
        Pokemon spiritomb = new Pokemon("Spiritomb", 50, new ArrayList<>(Arrays.asList("Ghost", "Dark")), new ArrayList<>(Arrays.asList(shadowBall, darkPulse, psychic, suckerPunch)),  110, 97, 113, 97, 113, 40);
        Pokemon togekiss = new Pokemon("Togekiss", 50, new ArrayList<>(Arrays.asList("Fairy", "Flying")), new ArrayList<>(Arrays.asList(airSlash, dazzlingGleam, auraSphere, waterPulse)),  145, 55, 100, 125, 120, 85);
        Pokemon weavile = new Pokemon("Weavile", 50, new ArrayList<>(Arrays.asList("Dark", "Ice")), new ArrayList<>(Arrays.asList(metalClaw, throatChop, dig, aerialAce)), 130, 125, 70, 50, 90, 130);
        
        //Pokemon Teams
        ArrayList<Pokemon> team1 = new ArrayList<>(Arrays.asList(weavile, metagross, togekiss, garchomp, arceus, rayquaza));
        ArrayList<Pokemon> cynthiasTeam = new ArrayList<>(Arrays.asList(cynthiasSpiritomb, cynthiasRoserade, cynthiasTogekiss, cynthiasLucario, cynthiasMilotic, cynthiasGarchomp));
        ArrayList<Pokemon> cyrusTeam = new ArrayList<>(Arrays.asList(cyrusWeavile));
        ArrayList<Pokemon> stevensTeam = new ArrayList<>(Arrays.asList(stevensSkarmory, stevensClaydol, stevensAggron, stevensCradily, stevensArmaldo, stevensMetagross));
        //Array of pokemon teams to choose from
        ArrayList<ArrayList<Pokemon>> pokeTeams = new ArrayList<>(Arrays.asList(team1, cynthiasTeam));

        //Trainers    -  https://bulbapedia.bulbagarden.net/wiki/Prize_money
        Trainer user;
        Trainer cynthia = new Trainer("Champion Cynthia", cynthiasTeam, 200);
        Trainer cyrus = new Trainer("Team Galactic Boss Cyrus", cyrusTeam, 280);
        Trainer steven = new Trainer("Champion Steven", stevensTeam, 200);
        //Array of available Trainers to choose from
        ArrayList<Trainer> trainers = new ArrayList<>(Arrays.asList(cynthia, cyrus, steven));


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
        String choice = "";
        String moveSelection = "";//stored value of move selected by user
        Move userMove = null;//the move the user has picked for this turn
        Move compMove;//the move the computer is using this turn
        int speedTie;//used for determining which pokemon goes first in the event their speeds are the same


        //Greets user and gets the pokemon the user would like to use
        pokemonSelection(pokeTeams);
        accepted = false;
        while (!accepted) { 

            System.out.print("\nPlease select the number of the team you'd like to use: ");
            choice = scanner.nextLine();

            //ensures the number of the team is valid
            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {  
                accepted = true;
            }
        }
        //set user's chosen pokemon to their Pokemon
        user = new Trainer("user", pokeTeams.get(Integer.parseInt(choice) - 1), 120);

        //Get the trainer the user would like to face
        trainerSelection(trainers);
        accepted = false;
        while (!accepted) { 

            System.out.print("Please select the number of the Trainer you would like to face: ");
            choice = scanner.nextLine();

            //ensures the number of the trainer is valid
            if (choice.equals("1") ||  choice.equals("2") || choice.equals("3")) {  
                accepted = true;
            }
        }
        //set user's chosen pokemon to their pokemon
        Trainer comp = trainers.get(Integer.parseInt(choice) - 1);

        //Prints text for start of the battle
        startBattle(user, comp);


        // repeats battle sequence until we get a winner. True while neither pokemon has fainted.
        while (user.remainingPokemon > 0 && comp.remainingPokemon > 0) {

            //print out user's pokemon's moves and a number to select them with, alongside the remaining pp
            System.out.println("What will " + user.currentPokemon.name + " do?");
            for (int i = 0; i < 4; i++) {
                System.out.println((i + 1) + ". " + user.currentPokemon.moves.get(i).name + "  PP: " + user.currentPokemon.moves.get(i).currentPP + "/" + user.currentPokemon.moves.get(i).pp);
            }
            //Gives the additional option to switch pokemon
            System.out.println("5. Switch");

            //needs to be reset every iteration of while loop
            accepted = false;
            //Asks the user to enter which move they want to use until they give an acceptable answer
            while (!accepted) { 

                System.out.print("Please enter the number of the move you want to use: ");
                moveSelection = scanner.nextLine();

                //Only if the user selected a move
                //check that the user has entered the number of a move
                if (moveSelection.equals("1") || moveSelection.equals("2") || moveSelection.equals("3") || moveSelection.equals("4")) {  
                    accepted = true;

                    //check that the move still has pp
                    if (user.currentPokemon.moves.get(Integer.parseInt(moveSelection) - 1).currentPP == 0) {
                        System.out.println("You don't have enough PP to use that move");
                        accepted = false;
                    }
                    else{
                        //if there is enough pp, reduce the remaining pp by 1
                        user.currentPokemon.moves.get(Integer.parseInt(moveSelection) - 1).currentPP -= 1;
                        //userMove becomes the move the user wants to use
                        userMove = user.currentPokemon.moves.get(Integer.parseInt(moveSelection) - 1);
                    }
                }

                //if the user selected to switch pokemon
                else if (moveSelection.equals("5")) {
                    
                    String oldPokemon = user.currentPokemon.name;
                    userSwitchPokemon(user);
                    //switching happens instead of using a move for that turn
                    System.out.printf("%s, switch out!\nCome Back!\n", oldPokemon);
                    System.out.printf("Go! %s!", user.currentPokemon.name);
                    userMove = null;
                    accepted = true;
                }

            }

            System.out.println();

            //computerMove
            compMove = comp.currentPokemon.moves.get(random.nextInt(1, 5) - 1);

            speedTie = random.nextInt(0, 2);//used for determining which pokemon goes first in the event their speeds are the same
            //Perorm both players attacks and print the result
            battleSequence(user, user.currentPokemon, userMove, comp, comp.currentPokemon, compMove, speedTie);

            //Displays match outcome when either pokemon has fainted
            if (user.remainingPokemon == 0 || comp.remainingPokemon == 0) {
            //if (user.currentPokemon.hasFainted || comp.currentPokemon.hasFainted) {

                matchEnd(user, comp);
            };

        };
        scanner.close();
    }

    public static void pokemonSelection(ArrayList<ArrayList<Pokemon>> pokeDex) {

        //Greeting Message
        System.out.println("*****************************************");
        System.out.println(" Welcome to the Pokemon Battle Simulator");
        System.out.println("*****************************************");

        //Outputs each of the team of Pokemon and a number to select them
        System.out.println("Which team of Pokemon would you like to use: ");
        for (int i = 0; i < pokeDex.size(); i++) {

            //goes through the team array and prints the name of each pokemon
            System.out.print("Team " + (i + 1) + ". ");
            for (Pokemon poke : pokeDex.get(i)) {
                System.out.print(poke.name + ", ");
            }
            System.out.println();
        }
    }

    public static void trainerSelection(ArrayList<Trainer> trainers) {

        //Outputs each of the trainer's names and a number to select them
        System.out.println("\nWhich Trainer would you like to face: ");
        for (int i = 0; i < trainers.size(); i++) {
            System.out.println((i + 1) + ". " + trainers.get(i).name);  
        }
    }

    //displays message welcoming you when copde is first ran
    public static void startBattle(Trainer user, Trainer comp) {
        
        // Start Battle Dialogue
        System.out.println("\nYou are challenged by " + comp.name);
        System.out.println(comp.name + " sent out " + comp.currentPokemon.name + "!");
        System.out.println("Go! " + user.currentPokemon.name + "!");
        System.out.println(battleScreen(user.currentPokemon, comp.currentPokemon));
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

        //Accuracy: 
        Random atkDmgRand = new Random();
        int accuracy = atkDmgRand.nextInt(1, 101);
        if (move.accuracy < accuracy) {
            System.out.println(attackingPokemon.name + "'s attack missed!");
            return 0;
        }

        //Phys/Special split. Uses different attack stats based on whether the move is a physical or a special move. 
        //Status moves deal no damage but have an effect instead
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

        //type effectiveness
        double multiplier = 1;//multiplier we are going to multiply the moves damage with
        //list of pokemon types
        ArrayList<String> typesList = new ArrayList<>(Arrays.asList("Normal", "Fire", "Water", "Electric", "Grass", 
                "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel", "Fairy"));
        //for each pokemon type
        for (int i = 0; i < 18; i++) {
            if (move.type.equals(typesList.get(i))) {

                //multiply the damage by the type-on-type damage multiplyer.    e.g Fire is 2x effective against grass, fire is 1/2 effective against water
                multiplier = Double.parseDouble(defendingPokemon.weaknesses.get(i));
                baseDamage *= multiplier;
            }
        }
        //chooses relevant text to display when multiplier is not 1
        if (multiplier == 2.0 || multiplier == 4.0) {
            System.out.println("It's super effective!");
        } else if (multiplier == 0.5 || multiplier == 0.25) {
           System.out.println("It's not very effective..."); 
        } else if (multiplier == 0.0) {
            System.out.println("It doesn't effect " + defendingPokemon.name + "...");
        }


        //STAB - Same-Type Attack Bonus. If the pokemon's and moves type are the same, the move does 1.5x damage
        if (move.type.equals(attackingPokemon.type.get(0)) || move.type.equals(attackingPokemon.type.get(1))) {
            baseDamage *= 1.5;
        }

        //Adds randomly fluctuating battle damage
        baseDamage *= atkDmgRand.nextDouble(0.85, 1.0000000000000001);

        //critical hits
        if (atkDmgRand.nextInt(1, 17) == 1) {
            baseDamage *= 1.5;//Gen 6 onwards formula
            System.out.println("A critical hit!");
        }

        //Modifiers:
        //System.out.println("The damage is: " + baseDamage);
        //Math.floor(baseDamage)
        return (int) Math.floor(baseDamage);
    }

    //displays move use, calculates the damage and applies it to defending pokemon
    public static void battleAttack(Pokemon atkPokemon, Move atkMove, Pokemon defPokemon) {

        //when the user has chosen a move instead of switching pokemon
        if (atkMove != null) {
            //prints the name of the move the user selected
            System.out.println(atkPokemon.name + " used "+ atkMove.name + "!");
            //calculate moves Damage
            int damage = calculateDamage(atkPokemon, atkMove, defPokemon);
            //Deal damage
            defPokemon.currentHp -= damage;

            //secondary move effects
            Random secondaryRandom = new Random();
            int secondaryEffectChance = secondaryRandom.nextInt(1, 101);
            if (atkMove.secondaryChance < secondaryEffectChance) {
                /*
                Switch Statement
                */
            }
        }
    }

    //deals with actual fighting sequence, adds checks to ensure a fainted pokemon cannot attack
    public static void battleTurn(Trainer user, Pokemon atkPokemon, Move atkMove, Trainer comp, Pokemon defPokemon, Move defMove, Boolean flipDisplay) {
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
                comp.remainingPokemon -= 1;
                compSwitchPokemon(user, comp);
            } else {
                System.out.println(defPokemon.name + " fainted!");
                user.remainingPokemon -= 1;

                //only switches pokemon if the user has a pokemon left to fight
                if (user.remainingPokemon > 0) {
                    userSwitchPokemon(user);
                }
            }
            
        } 
        //if the defending pokemon lives, he attacks. We then check if the other pokemon fainted from the attack
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
    public static void battleSequence(Trainer user, Pokemon userPokemon, Move userMove, Trainer comp, Pokemon compPokemon, Move compMove, int speedTie) {

        //used to decide who attacks first.
        int userPriority = 0;
        int compPriority = 0;

        if (userMove != null) {
            userPriority = userMove.priority;
        } else if (compMove != null) {
            compPriority = compMove.priority;
        }

        //if the users move has priority over the computers
        if (userPriority > compPriority) {
            
            userAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);
        } 
        //if the computers move has priority over the users
        else if (userPriority < compPriority) {
            compAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);
        } 
        //if both moves have the same priority
        else {

            //if user's pokemon is faster
            if (userPokemon.spd > compPokemon.spd) {

                userAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);             
            } 
            //if computer's pokemon is faster
            else if (userPokemon.spd < compPokemon.spd) {

                compAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);            
            }
            //speed tie, random who goes first
            else {

                //if the random number for deciding speed rolled 0, the user moves first
                if (speedTie == 0) {

                    //player's attack first
                    userAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);
                }
                //if the random number for deciding speed rolled 1, the user computer first
                else {
                    //computer attacks first
                    compAttacksFirst(user, userPokemon, userMove, comp, compPokemon, compMove);
                }  
            }
        }   
    }

    public static void userAttacksFirst(Trainer user, Pokemon userPokemon, Move userMove, Trainer comp, Pokemon compPokemon, Move compMove) {

        //player's attack
        battleTurn(user, userPokemon, userMove, comp, compPokemon, compMove, true);

        //after the computer's attack, tells the user the result of the battle
        if (userPokemon.hasFainted) {
            System.out.println(battleScreen(userPokemon, compPokemon));
            System.out.println(userPokemon.name + " fainted!");
            user.remainingPokemon -= 1;

            //only switches pokemon if the user has a pokemon left to fight
            if (user.remainingPokemon > 0) {
                userSwitchPokemon(user);
            }

        } else if (!compPokemon.hasFainted) {
            System.out.println(battleScreen(userPokemon, compPokemon));
        }
    }

    public static void compAttacksFirst(Trainer user, Pokemon userPokemon, Move userMove, Trainer comp, Pokemon compPokemon, Move compMove) {

        //computer's attck
        battleTurn(user, compPokemon, compMove, comp, userPokemon, userMove, false);

        ////after the players's attack, tells the user the result of the battle
        if (compPokemon.hasFainted) {
            System.out.println(battleScreen(userPokemon, compPokemon));
            System.out.println("The foe's " + compPokemon.name + " fainted!");
            comp.remainingPokemon -= 1;
            compSwitchPokemon(user, comp);
        } else if (!userPokemon.hasFainted && userMove != null) {
            System.out.println(battleScreen(userPokemon, compPokemon));
        }
    }

    
    //used to switch pokemon during battle
    public static void userSwitchPokemon(Trainer user) {

        System.out.println("Your team is: ");
        for (int i = 0; i < user.team.size(); i++) {
            if (user.team.get(i).currentHp == 0) {
                System.out.println((i + 1) + ". " + user.team.get(i).name + " (Fainted!)");
            }
            else {
                System.out.println((i + 1) + ". " + user.team.get(i).name);
            }
        }

        Scanner switchScanner = new Scanner(System.in);
        boolean accepted = false;
        while (!accepted) { 
            
            System.out.print("Which Pokemon would you like to switch to?: ");
            String option = switchScanner.nextLine();

            if (option.equals("1") ||  option.equals("2") || option.equals("3") || option.equals("4") ||  option.equals("5") || option.equals("6")) {  
            
                if (user.team.get(Integer.parseInt(option) - 1).currentHp > 0) {
                    
                    user.currentPokemon = user.team.get(Integer.parseInt(option) - 1);
                    accepted = true;
                }
                else {
                    System.out.println(user.team.get(Integer.parseInt(option) - 1).name + " can't battle!");
                    accepted = false;
                }
            }
        }
        //for better spacing in the terminal message
        System.out.println();
    }

    //Computer switches pokemon
    public static void compSwitchPokemon(Trainer user, Trainer comp) {

        for (int i = 0; i < comp.team.size(); i++) {
            
            //finds the index of the pokemon that fainted, and selects the next pokemon
            if (comp.currentPokemon.name.equals(comp.team.get(i).name)) {
            
                //prevents out of bounds error when team has all fainted
                if (i != 5) {
                    comp.currentPokemon = comp.team.get(i + 1);
                    System.out.print(comp.name + " sent out " + comp.currentPokemon.name + "!\n");
                    System.out.print(battleScreen(user.currentPokemon, comp.currentPokemon));
                    break;
                }
            }
        }
    }


    //decides which final message to print when the winner has been decided
    public static void matchEnd(Trainer user, Trainer comp) {

        if (user.acePokemon.hasFainted) {
            playerLost(user.prizeMoney);
        } else {

            //choses which trainer defeat message to print
            switch(comp.name) {

                case "Champion Cynthia" -> {cynthiaLost(comp.prizeMoney);}
                case "Team Galactic Boss Cyrus" -> {cyrusLost(comp.prizeMoney);}
                case "Champion Steven" -> {stevenLost(comp.prizeMoney);}
                default -> {System.out.println("Congratulations, you won");}
            }
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
        System.out.println("You got $" + prizeMoney + " for winning!");
        System.out.println();
    }

    //prints if the player defeated Cyrus
    public static void cyrusLost(int prizeMoney) {
        //payout = level of last pokemon in opponent's party * base (Champion $200) https://bulbapedia.bulbagarden.net/wiki/Prize_money
        System.out.println();
        System.out.println("You have defeated Team Galactic Boss Cyrus");
        System.out.println("Not after all the sacrifices we've made to get this far!");
        System.out.println("What of my new world?!\nOf my new galaxy?!");
        System.out.println("Was this all a dream to be swept away by your reality?!");
        System.out.println("You got $" + prizeMoney + " for winning!");
        System.out.println();
    }

    public static void stevenLost(int prizeMoney) {
        System.out.println();
        System.out.println("You have defeated Champion Steven");
        System.out.println("Come to think of it, ever since our paths first crossed in Granite Cave in Dewford,\nI had this feeling.");
        System.out.println("I thought that you would eventually become champion.\nMy predictions usually come true.");
        System.out.println("And where will you go from here?");
        System.out.println("... ... ... ... ...\n... ... ... ... ...");
        System.out.println("Fufufu, even I couldn't tell you that.");
        System.out.println("You got $" + prizeMoney + " for winning!");
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