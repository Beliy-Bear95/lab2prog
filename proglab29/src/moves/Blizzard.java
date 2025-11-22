package moves;

import proglab26.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public final class Blizzard extends SpecialMove{
	public Blizzard(double pow, double acc){
		super(Type.ICE, pow, acc);
	}
	@Override	
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		
		if (Main.chance(0.1)){
			Effect.freeze(p);
		}
	}
	
	@Override	
	protected void applySelfEffects(Pokemon p){
		super.applySelfEffects(p);
	}
	
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}