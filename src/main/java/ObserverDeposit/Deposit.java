package ObserverDeposit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:54
 */
public class Deposit implements IEventList,ITrigger{
    private static class DepositHandler {
        private static final Deposit deposit = new Deposit();
    }
    public static Deposit instance(){
        return DepositHandler.deposit;
    }

    private Map<Integer,List<NotifyCallback>> maps = new HashMap<Integer,List<NotifyCallback>>();

    @Override
    public void addEventList(Event event,NotifyCallback callback){
        List<NotifyCallback> list = maps.get(event.getValue());
        if(list==null){
            list = new ArrayList<>();
            maps.put(event.getValue(),list);
        }
        list.add(callback);
    }

    @Override
    public void trigger(Event event) {
        maps.get(event.getValue()).forEach(callback -> callback.process());
    }
}
