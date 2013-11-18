public class Catwo extends Character {

    public Catwo() {
	super();
	_hitPts = 150;
	_strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	_defense = 20;
	_attack = 1;
    }

    public String getName() { 
	return "Nameless CATTTWWWOOOO. Roar, snarl, hiss!"; 
    }
    public void specialize() { }

    public void normalize() { }


    public static String about() {
	String blurb;
	blurb = "A savage beast. Hellbent on destroying adventurers. ";
	blurb += "Hath ye Fear?";
	return blurb;
    }


}
