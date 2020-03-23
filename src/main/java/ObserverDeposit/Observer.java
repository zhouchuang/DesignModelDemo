package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 22:31
 */
public abstract class Observer {
    Deposit deposit = Deposit.instance();
    public void  addEventList(Deposit.Event event,NotifyCallback notifyCallback){
        deposit.addEventList(event,notifyCallback);
    }
}
