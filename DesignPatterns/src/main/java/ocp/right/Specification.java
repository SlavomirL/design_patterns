package ocp.right;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
