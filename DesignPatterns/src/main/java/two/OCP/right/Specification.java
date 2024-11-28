package two.OCP.right;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
