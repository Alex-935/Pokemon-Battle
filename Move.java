public class Move {
    
    //attributes
    String name;
    String type;//flying, rock, fire, etc
    String category;//physical, special, status
    int power;
    int accuracy;

    //constructor
    Move(String name, String type, String category,
        int power, int accuracy) {

        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        
    }
}
