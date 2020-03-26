package Composite;

public class City extends AbstractArea {
    public City(String name) {
        super(name);
        super.setDeep(2);
    }
}
