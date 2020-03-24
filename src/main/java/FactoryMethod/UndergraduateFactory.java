package FactoryMethod;

public class UndergraduateFactory implements ILeifengFactory<Undergraduate> {
    @Override
    public Undergraduate create() {
        return new Undergraduate("大学生");
    }
}
