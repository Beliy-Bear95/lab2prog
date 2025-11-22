package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public final class Xatu extends Natu{
	public Xatu(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC, Type.FLYING);
		super.setStats(65, 75, 70, 95, 70, 95);
		
		AirSlash airslash = new AirSlash(75, 95);
		super.addMove(airslash);
	}

}