package Composite;

public class Province extends AbstractArea {

    public Province(String name) {
        super(name);
        super.setDeep(1);
    }

}
