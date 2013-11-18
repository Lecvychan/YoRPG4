

public class Mulan extends Character {

    private String _name = "Mulan";
 
    public Mulan() {
        _hitPts = 125;
        _strength = 150;
        _defense = 50;
        _attack = .2;
    }


    public Mulan( String name ) {
        this();
        _name = name;
    }


    public String getName() { return _name; }


    
    public void specialize() {
        _attack = .5;
        _defense = 30;
    }

 
    public void normalize() {
        _attack = .2;
        _defense = 50;
    }


    public static String about() {
        return "Mighty and brave girl-power enthusiast and epic Warrior from ancient China. Crafty and clever, slays Monsters with wit and skills. Strong defensive skills but weaker offense, be careful when outnumbered.";
    }


}
