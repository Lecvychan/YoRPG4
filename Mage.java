//Lecvy Chan
//11.14.2013
//9844
//HW #25




public abstract class Mage extends Character{ 
    private String _name = "Merlin";

    public Mage () {
	_hitPts = 90;
	_strength = 100;
	_defense = 20;
	_attack = .75;
    }

    public Mage (String name) {
	this();
	_name = name;
    }

    public Mage (String setname, int sethp, int setstrength, int setdefense, double setad) {
	_name = setname;
	_hitPts = sethp;
	_strength = setstrength;
	_defense = setdefense;
	_attack = setad;
    }
    public void specialize (){
	    _defense = 0;
	    _attack = 1.2;
	    	    }

    public void normalize () {
	_defense = 20 ;
	_attack = .75;

    }

    public static String about () {
	return "Mage hits so hard like makes you want to cry. But he's also practically naked and wears no armor so he dies pretty fast too. High risk, high reward.";
    }


}
