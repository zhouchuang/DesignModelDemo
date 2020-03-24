package Builder;

public class BuilderB extends Builder<Product> {

    public Product product  = super.create(Product.class);

    @Override
    public void buildPartA() {
        product.add("X");
    }

    @Override
    public void buildPartB() {
        product.add("Y");
    }
}
