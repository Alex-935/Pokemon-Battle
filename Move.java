

public class Move {
    
    //attributes
    String name;
    String type;//flying, rock, fire, etc
    String category;//phys - physical, spec - special, stat - status
    int power;
    int accuracy;//likelihood aa move hits
    int pp;//number of times a move can be used
    int currentPP;
    String secondaryEffect;//states what secondary effect a move has. e.g, burn, freeze, sleep, poison, etc.
    int secondaryChance;//the probability out of 100 of a secondary effect occuring when a move is used. e.g. Scald has a chance to burn opponent
    int priority;

    //constructor
    Move(String name, String type, String category,
        int power, int accuracy, int pp, String secondaryEffect, int secondaryChance, int priority) {

        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.priority = priority;
        this.pp = pp;
        this.currentPP = pp;
        this.secondaryEffect = secondaryEffect;
        this.secondaryChance = secondaryChance;
        
    }
}
