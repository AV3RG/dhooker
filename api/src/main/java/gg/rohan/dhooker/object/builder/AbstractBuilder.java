package gg.rohan.dhooker.object.builder;

public interface AbstractBuilder<BUILDER, CLASS> extends Cloneable {

    CLASS build();

    BUILDER reset();

    BUILDER from(CLASS object);

}
