/*=============================================
  class Archer -- the protagonist of Ye Olde RPG

  A Archer is a Character, and thus has all the attributes and 
  capabilities of a Character -- and then some (possibly).
  A Archer's attributes -- along with the way she does things -- 
  set her apart from other types of Characters.
  The defining attributes of a Archer, and the way she goes about 
  doing things, are specified below. Read on!
  =============================================*/

public class Archer extends Character {

    private String _name = "K. Everdeen";

    public Archer() {
	_hitPts = 100;
	_strength = 50;
	_defense = 50;
	_attack = .6;
	_accuracy = 65;
    }

    public Archer( String name ) {
	this();
	_name = name;
    }

    public String getName() { return _name; }
public int getHealth () {return _hitPts;}
    public void specialize() {
	_attack = .80;
	_defense = 30;
    }

    public void normalize() {
	_attack = .6;
	_defense = 50;
    }


    public static String about() {
	return "Mighty Archer from a bygone era. Flinger of huge arrows, slayer of huger monsters. Like to kill from afar? This is you.";
    }


}
