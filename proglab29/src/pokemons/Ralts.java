package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon{
	public Ralts(String name, int level){
		super(name, level);
		super.setType(Type.PSYCHIC, Type.FAIRY);
		super.setStats(28, 25, 25, 45, 35, 40);
		
		Facade facade = new Facade(70, 100);
		
		DreamEater dreameater = new DreamEater(100, 100);
		super.setMove(facade, dreameater);
	}
}
