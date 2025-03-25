package gg.rohan.dhooker.object.util;

public enum TriState {

    TRUE,
    FALSE,
    UNSET,
    ;

    public static TriState fromBoolean(boolean bool) {
        return bool ? TRUE : FALSE;
    }

    public boolean toBoolean() {
        return this == TRUE;
    }

    public boolean toBoolean(boolean def) {
        return this == UNSET ? def : this == TRUE;
    }

    public static boolean isExplicitSet(TriState state) {
        return state != null && state != UNSET;
    }

}
