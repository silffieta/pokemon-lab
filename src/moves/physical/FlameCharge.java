package moves.physical;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    public FlameCharge(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.SPEED, 1);
    }

    @Override
    protected String describe(){
        return "used Flame Charge " ;
    }
}
