package proglab26;
import ru.ifmo.se.pokemon.*;
import pokemons.*;
public class Main {

	public static void main(String[] args) {
		Battle b = new Battle();
		Xatu xatu = new Xatu("ptenchik", 1);
		Natu natu = new Natu("ptenec", 1);
		Ralts ralts = new Ralts("Onion", 1);
		Mewtwo mewtwo = new Mewtwo("Lega", 1);
		Kirlia kirlia = new Kirlia("skirt", 1);
		Gallade gallade = new Gallade("fighter", 1);
		
		b.addAlly(natu);
		b.addAlly(gallade);
		b.addAlly(ralts);
		
		b.addFoe(mewtwo);
		b.addFoe(xatu);
		b.addFoe(kirlia);
		b.go();
	}

	public final static boolean chance(double d){
		return d > Math.random();
	}
	public final static Status getCondition(Pokemon p){
		return getCondition(p);
	}
	public static boolean forFacade(Pokemon p){
		Status s = getCondition(p);
		return (s == Status.BURN) | (s == Status.POISON) | (s == Status.PARALYZE);
		
	}
	public static boolean forDreamEater(Pokemon p){
		Status s = getCondition(p);
		return (s == Status.SLEEP);
		
	}
}
