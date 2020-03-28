package Mediator;

import java.util.ArrayList;
import java.util.List;

public class UnitedNations extends Mediator {

    List<Nation> list = new ArrayList<Nation>();

    @Override
    public void add(Nation nation) {
        list.add(nation);
    }

    @Override
    public void declare(String msg,Nation nation) {
        for(Nation nt : list){
            if(nation!=nt){
                nt.accept(msg);
            }
        }
    }
}
