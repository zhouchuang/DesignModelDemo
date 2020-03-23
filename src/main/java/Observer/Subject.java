package Observer;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:28
 */
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notice();
}
