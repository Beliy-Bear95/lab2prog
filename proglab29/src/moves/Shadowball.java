package moves;
import proglab26.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public final class Shadowball extends SpecialMove{
	public Shadowball(double pow, double acc){
		super(Type.GHOST, pow, acc);
		
	}
	
	@Override	
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		
		if (Main.chance(0.2)){
			Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
			p.addEffect(e);
		}
	}
	
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
