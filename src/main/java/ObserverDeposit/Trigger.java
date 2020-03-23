package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 22:46
 */
public abstract class  Trigger  {
    Deposit deposit = Deposit.instance();
    public void  trigger(Deposit.Event event){
        deposit.trigger(event);
    }
}
