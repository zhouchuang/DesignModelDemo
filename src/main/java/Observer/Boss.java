package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:30
 */
public class Boss implements Subject {


    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notice() {
        observers.forEach(observer -> observer.update(()-> System.out.println("老板来了")));
    }
}
