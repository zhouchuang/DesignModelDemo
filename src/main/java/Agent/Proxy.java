package Agent;

public class Proxy implements GiveGift{
    private SchoolGirl schoolGirl;
    private Pursuit pursuit;
    public Proxy(SchoolGirl schoolGirl){
        this.pursuit = new Pursuit(schoolGirl);
    }
    public void flowers() {
        this.pursuit.flowers();
    }

    public void dolls() {
        this.pursuit.dolls();
    }
}
