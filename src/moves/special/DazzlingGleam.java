package moves.special;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected String describe() {
        return "used Dazzling Gleam ";
    }
}
