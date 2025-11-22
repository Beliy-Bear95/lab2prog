package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public final class MagicalLeaf extends SpecialMove{
	public MagicalLeaf(double pow, double acc){
		super(Type.GRASS, pow, acc);
		
	}
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}