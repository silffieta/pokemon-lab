package moves.status;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends SpecialMove {
    public PlayNice(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "used Play Nice" ;
    }
}
