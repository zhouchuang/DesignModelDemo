package Builder;

public abstract class Builder<T extends IProduct> {
    public T create(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public abstract void buildPartA();
    public abstract void buildPartB();
}
