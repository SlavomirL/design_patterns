package two.OCP.wrong;

import two.OCP.ocp.Color;
import two.OCP.ocp.Size;

public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.color = color;
        this.name = name;
        this.size = size;
    }
}
