package Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractArea implements Component {
    private String name;
    private List<Component> list = new ArrayList();
    private int deep;

    public AbstractArea setDeep(int deep) {
        this.deep = deep;
        return this;
    }

    public AbstractArea(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Component> getList() {
        return list;
    }

    @Override
    public void add(Component component){
        this.list.add(component);
        System.out.println("加入了"+component.toString());
    }
    @Override
    public void remove(Component component) {
        list.remove(component);
        System.out.println("删除了"+component.toString());
    }

    @Override
    public void show() {
        System.out.println("------".substring(0,this.deep*2)+getName());
        for(Component component : getList() ){
            component.show();
        }
    }
}
