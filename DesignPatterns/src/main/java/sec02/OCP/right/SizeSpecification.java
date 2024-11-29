package sec02.OCP.right;

import sec02.OCP.ocp.Size;
import sec02.OCP.wrong.Product;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
