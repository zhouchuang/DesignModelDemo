package FactoryMethod;

public interface ILeifengFactory<T extends  Leifeng> {
    T create();
}
