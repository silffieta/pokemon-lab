package moves.status;

import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove {
    public SwaggerMove(Type type, double pow, double acc) {
        super(type, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
        super.applyOppEffects(pokemon);
    }
}
    