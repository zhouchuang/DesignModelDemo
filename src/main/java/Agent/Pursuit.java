package Agent;

public class Pursuit implements GiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }

    public void flowers() {
        System.out.println(schoolGirl.getName()+"送你❀");
    }

    public void dolls() {
        System.out.println(schoolGirl.getName()+"送你娃娃");
    }
}
