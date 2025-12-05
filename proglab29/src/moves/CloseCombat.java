package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public final class CloseCombat extends PhysicalMove{
	public CloseCombat(double pow, double acc){
		super(Type.FIGHTING, pow, acc);
		
	}
	
	@Override	
	protected void applySelfEffects(Pokemon p){
		super.applySelfEffects(p);
		Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
		Effect c = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(e);
		p.addEffect(c);
	}
	
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}