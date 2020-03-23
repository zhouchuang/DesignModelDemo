package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 23:05
 */
public interface IEventList {
    void addEventList(Event event,NotifyCallback callback);
}
