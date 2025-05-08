package gg.rohan.dhooker.object.util.immutable;

import gg.rohan.delegasm.Delegasm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@Delegasm(List.class)
public class ImmutableCopiedList<E> extends Delegasm_ImmutableCopiedList<E> implements List<E> {

    public ImmutableCopiedList(final List<E> inner) {
        super(new ArrayList<>(inner));
    }

    @Override
    public void add(int arg0, E arg1) {
        throw this.unsupported();
    }

    @Override
    public E set(int arg0, E arg1) {
        throw this.unsupported();
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends E> arg1) {
        throw this.unsupported();
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        throw this.unsupported();
    }

    @Override
    public void replaceAll(UnaryOperator<E> arg0) {
        throw this.unsupported();
    }

    @Override
    public E remove(int arg0) {
        throw this.unsupported();
    }

    @Override
    public void sort(Comparator<? super E> arg0) {
        throw this.unsupported();
    }

    @Override
    public boolean addAll(Collection<? extends E> arg0) {
        throw this.unsupported();
    }

    @Override
    public boolean remove(Object arg0) {
        throw this.unsupported();
    }

    @Override
    public boolean removeIf(Predicate<? super E> arg0) {
        throw this.unsupported();
    }

    @Override
    public void clear() {
        throw this.unsupported();
    }

    @Override
    public boolean add(E arg0) {
        throw this.unsupported();
    }

    public UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException("This list is immutable");
    }
}
