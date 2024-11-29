package sec02.OCP.right;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
