package Demo;

/**
 * @author zhouchuang
 * @create 2020-04-08 22:07
 */
public class DataTypeCompare {
    public static void main(String[] args) {
        int a = 300;
        int b = 300;
        System.out.println(a==b);

        float c = 0.1f;
        double d = 0.1d;
        System.out.println(c==d);

        Float e = new Float(0.2f);
        Double f = new Double(0.2d);
        System.out.println(f.equals(e));

        Integer g = 1;
        Integer h = 1;
        System.out.println(g==h);

        Integer g1 = new Integer(1);
        Integer h1 = new Integer(1);
        System.out.println(g1==h1);

        // -128 ~ 127  Integer a = 127 转化成 Integer i = Integer.valueOf(127);
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a1==b1);
        Integer c1 = 128;
        Integer d1 = 128;
        System.out.println(c1==d1);

    }
}
