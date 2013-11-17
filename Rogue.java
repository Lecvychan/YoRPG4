//Lecvy Chan
//11.14.2013
//9844
//HW #25



public abstract class Rogue extends Character{ 

    private String _name = "John Cena";

    public Rogue () {
	_hitPts = 100;
	_strength = 100;
	_defense = 30;
	_attack = .6;
	_accuracy = 70;
    }

    public Rogue (String name) {
	this();
	_name = name;
    }

    public Rogue (String setname, int sethp, int setstrength, int setdefense, double setad, int setaccuracy) {
	_name = setname;
	_hitPts = sethp;
	_strength = setstrength;
	_defense = setdefense;
	_attack = setad;
	_accuracy = setaccuracy;
    }
public int getHealth () {return _hitPts;}
    public String getName () {
	return _name;
    }


  public void specialize (){
	    _defense = 10;
	    _attack = .95;	      }

    public void normalize () {
	    _defense = 30;
	    _attack = .6;
	  	}





    public static String about () {
	return "Silent Killer. Utilizes targetted hits to deal heavy damage, while wearing lighter armor to move faster.";
    }
}
