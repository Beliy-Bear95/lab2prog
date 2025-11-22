package moves;

import proglab26.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public final class DreamEater extends SpecialMove{
	public DreamEater(double pow, double acc){
		super(Type.PSYCHIC, pow, acc);
		
	}
	public static Stat HP;
	
	protected double getHP(Pokemon p) {
		return getHP(p);
	}
	protected double getStat(Stat stat){
		return getStat(stat);
		
	}
	
	
	protected void applyOppDamage(Pokemon def, double damage, Pokemon att){
		super.applySelfEffects(def);
		if (Main.forDreamEater(def)){
			int c = (int) getHP(def);
			int v = (int) getStat(HP);
			int d = (v-c)/2;
			Effect e = new Effect().stat(Stat.HP, +d);
			def.addEffect(e);
		}
		else{
		;
		}
	}
	
	

	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}