package Composite;

public class Region extends AbstractArea {

    public Region(String name) {
        super(name);
        super.setDeep(3);
    }
    @Override
    public void add(Component component){
        System.out.println("不能添加");
    }
    @Override
    public void remove(Component component) {
        System.out.println("不能删除");
    }
}
