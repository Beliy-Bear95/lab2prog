package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Natu extends Pokemon{
	public Natu(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC, Type.FLYING);
		super.setStats(40, 50, 45, 70, 45, 70);
		
		Facade facade = new Facade(70, 100);
		
		DreamEater dreameater = new DreamEater(100, 100);
		
		SteelWing steelwing = new SteelWing(70, 90);
		super.setMove(facade, dreameater, steelwing);
	}

}
