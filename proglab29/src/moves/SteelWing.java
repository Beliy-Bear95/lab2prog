package moves;

import proglab26.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public final class SteelWing extends PhysicalMove{
	public SteelWing(double pow, double acc){
		super(Type.STEEL, pow, acc);
		
	}
	
	@Override	
	protected void applySelfEffects(Pokemon p){
		super.applySelfEffects(p);
		
		if (Main.chance(0.1)){
			Effect c = new Effect().stat(Stat.DEFENSE, +1);
			p.addEffect(c);
	    }
	}
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}