package Visitor;

public class Success implements Action {
    @Override
    public void manDisplay(Man man) {
        System.out.println(man.getClass().getSimpleName()+"成功了会喝酒");
    }

    @Override
    public void wumanDisplay(Wuman wuman) {
        System.out.println(wuman.getClass().getSimpleName()+"成功了会逛街");
    }
}
