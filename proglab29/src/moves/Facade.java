package moves;
import proglab26.Main;

import ru.ifmo.se.pokemon.*;
public final class Facade extends PhysicalMove{
	public Facade(double pow, double acc){
		super(Type.NORMAL, pow, acc);
		
	}
	
	protected void applyOppDamage(Pokemon def, double damage, Pokemon att){
		if (Main.forFacade(att)){
		def.setMod(Stat.HP, (int) Math.round(damage*2));
		}
		else{
		def.setMod(Stat.HP, (int) Math.round(damage));
		}
	}
	
	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}