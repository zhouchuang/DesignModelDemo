package Bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Mobile implements IBrand {
    protected String name;

    List<ISoft> apps = new ArrayList<>();
    @Override
    public void install(ISoft iSoft) {
        apps.add(iSoft);
    }

    @Override
    public void run(ISoft iSoft) {
        boolean flag = false;
        for(ISoft soft : apps){
            if(soft==iSoft){
                System.out.print(name);
                soft.run();
                flag = true;
                break;
            }
        }
        if(flag==false)
            System.out.println(name+"没有安装"+iSoft.getClass().getSimpleName());
    }
}
