package moves;

import ru.ifmo.se.pokemon.*;
import proglab26.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public final class AirSlash extends PhysicalMove{
	public AirSlash(double pow, double acc){
		super(Type.FLYING, pow, acc);
		
	}
	
	@Override	
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		
		if (Main.chance(0.3)){
			Effect.flinch(p);
		}
	}
	
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}