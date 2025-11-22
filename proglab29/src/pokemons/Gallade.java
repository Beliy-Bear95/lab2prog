package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public final class Gallade extends Kirlia{
	public Gallade(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC, Type.FIGHTING);
		super.setStats(68, 125, 65, 65, 115, 80);
		
		CloseCombat closecombat = new CloseCombat(120, 100);
		super.addMove(closecombat);
	}

}