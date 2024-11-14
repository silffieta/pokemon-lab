package moves.status;

import ru.ifmo.se.pokemon.*;

public class Play_Nice extends SpecialMove {
    public Play_Nice(Type type, double pow, double acc) { super(type, pow, acc); }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.ATTACK, 1);
    }
    @Override
    protected String describe() {
        return "used " + this.getClass().getSimpleName();
    }
}
