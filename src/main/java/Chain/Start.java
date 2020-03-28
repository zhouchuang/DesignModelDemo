package Chain;

public class Start {
    public static void main(String[] args) {
        BigBoss bigBoss = new BigBoss("大老板",1000);
        CEO ceo = new CEO("CEO",500);
        Manager manager = new Manager("经理",100);
        manager.setNext(ceo.setNext(bigBoss));
        manager.process(50);
        manager.process(250);
        manager.process(750);
    }
}
