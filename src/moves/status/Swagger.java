package moves.status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(Type type, double pow, double acc) {
        super(type, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "used " + this.getClass().getSimpleName();
    }
}
    