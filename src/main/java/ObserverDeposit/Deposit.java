package ObserverDeposit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:54
 */
public class Deposit {
    private static class DepositHandler{
        private static final Deposit deposit = new Deposit();
    }
    public static Deposit instance(){
        return DepositHandler.deposit;
    }

    enum Event{
        Back(1),Out(2);
        private int value;

        Event(int value) {
            this.value = value;
        }
    }

    private Map<Integer,List<NotifyCallback>> maps = new HashMap<Integer,List<NotifyCallback>>();



    public void addEventList(Event event,NotifyCallback callback){
        List<NotifyCallback> list = maps.get(event.value);
        if(list==null){
            list = new ArrayList<>();
            maps.put(event.value,list);
        }
        list.add(callback);
    }

    public void trigger(Event event) {
        maps.get(event.value).forEach(callback -> callback.process());
    }
}
