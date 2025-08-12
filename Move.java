public class Move {
    
    //attributes
    String name;
    String type;//flying, rock, fire, etc
    String category;//physical, special, status
    int power;
    int accuracy;//likelihood aa move hits
    int pp;//number of times a move can be used
    int currentPP;

    //constructor
    Move(String name, String type, String category,
        int power, int accuracy, int pp) {

        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.currentPP = pp;
        
    }
}
