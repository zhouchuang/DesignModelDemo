package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 22:46
 */
public abstract class  Trigger implements ITrigger  {
    Deposit deposit = Deposit.instance();
    public void  trigger(Event event){
        deposit.trigger(event);
    }
}
