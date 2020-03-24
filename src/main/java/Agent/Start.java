package Agent;

public class Start {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("巧碧螺");

        Proxy proxy  = new Proxy(schoolGirl);
        proxy.dolls();
        proxy.flowers();

    }
}
