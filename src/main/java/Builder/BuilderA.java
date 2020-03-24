package Builder;

public class BuilderA extends Builder<Product> {

    public Product product  = super.create(Product.class);
    @Override
    public void buildPartA() {
        product.add("A");
    }

    @Override
    public void buildPartB() {
        product.add("B");
    }
}
