package Builder;

public class Start {
    public static void main(String[] args) {
        BuilderA builderA = new BuilderA();
        BuilderB builderB = new BuilderB();
        Director director = new Director();
        builderA.product.show();
        director.builder(builderA);
        builderA.product.show();
        builderB.product.show();
        director.builder(builderB);
        builderB.product.show();

    }
}
