package gg.rohan.dhooker.object.util.immutable;

import java.util.List;

public class Immutables {

    public static <T> List<T> nullableImmutable(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ImmutableCopiedList<>(list);
    }

}
