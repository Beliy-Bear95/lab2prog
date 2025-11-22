package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Mewtwo extends Pokemon{
	public Mewtwo(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC);
		super.setStats(106, 110, 90, 154, 90, 130);
		
		Shadowball shadowball = new Shadowball(80, 100);
		
		Blizzard blizzard = new Blizzard(110, 70);
				
		Facade facade = new Facade(70, 100);
		
		Psywave psywave = new Psywave(100, 100);
		super.setMove(shadowball, blizzard, facade, psywave);
		
		
	}

}
