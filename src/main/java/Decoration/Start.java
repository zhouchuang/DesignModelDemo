package Decoration;

/**
 * @author zhouchuang
 * @create 2020-03-22 21:41
 */
public class Start {
    public static void main(String[] args) {
        Person person = new Person("tom");
        PantsFinery pantsFinery = new PantsFinery();
        TshirtFinery tshirtFinery = new TshirtFinery();
        CapFinery capFinery = new CapFinery();
        pantsFinery.decoration(person);
        tshirtFinery.decoration(pantsFinery);
        capFinery.decoration(tshirtFinery);
        capFinery.show();
    }
}
