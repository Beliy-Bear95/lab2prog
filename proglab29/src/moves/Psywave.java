package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public final class Psywave extends SpecialMove{
	public Psywave(double pow, double acc){
		super(Type.PSYCHIC, pow, acc);
		
	}
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}