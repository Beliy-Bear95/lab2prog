package moves;

import java.util.Random;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public final class Psywave extends SpecialMove{
	public Psywave(double pow, double acc){
		super(Type.PSYCHIC, pow, acc);
		
	}
    
	
    protected int ranval(){
    Random random = new Random();

	int minDamage = 50;
	int maxDamage = 150;
	int step = 10;

	int numberOfValues = (maxDamage - minDamage) / step + 1;

	int x = minDamage + random.nextInt(numberOfValues) * step;
	return x;
	}
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
		int x = ranval();
		int level = 1;
		double damage = (int) (level * x)/50;
		return damage;
	}


	@Override
	protected String describe(){
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}