package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Ralts{
	public Kirlia(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC, Type.FLYING);
		super.setStats(38, 35, 35, 65, 55, 50);
		
		MagicalLeaf magicalleaf = new MagicalLeaf(60, 100);
		super.addMove(magicalleaf);
	}

}