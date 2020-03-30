package Visitor;

public class Failure implements Action {
    @Override
    public void manDisplay(Man man) {
        System.out.println(man.getClass().getSimpleName()+"失败了会喝酒");
    }

    @Override
    public void wumanDisplay(Wuman wuman) {
        System.out.println(wuman.getClass().getSimpleName()+"失败了会流泪");
    }
}
