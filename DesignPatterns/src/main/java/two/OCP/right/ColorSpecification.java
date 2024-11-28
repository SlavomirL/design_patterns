package two.OCP.right;

import two.OCP.ocp.Color;
import two.OCP.wrong.Product;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }


}
