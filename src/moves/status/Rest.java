package moves.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove {
    public Rest(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        Effect myEffect = new Effect();
        myEffect.stat(Stat.HP, 50);
    }

    @Override
    protected String describe() {
        return "used Rest ";
    }
}
