package Java8;


import java.lang.reflect.Constructor;

//静态>普通>构造
public class LifeCycle {
    // 静态属性  按程序的先后顺序
    private static String staticField = getStaticField();
    // 静态方法块
    static {
        System.out.println(staticField);
        System.out.println("静态方法块初始化");
        System.out.println("Static Patch Initial");
    }
    // 普通属性
    private String field = getField();
    // 普通方法块
    {
        System.out.println(field);
        System.out.println("普通方法块初始化");
        System.out.println("Field Patch Initial");
    }
    // 构造函数
    public LifeCycle() {
        System.out.println("构造函数初始化");
        System.out.println("Structure Initial ");
    }

    public static String getStaticField() {
        String statiFiled = "Static Field Initial";
        System.out.println("静态属性初始化");
        return statiFiled;
    }

    public static String getField() {
        String filed = "Field Initial";
        System.out.println("普通属性初始化");
        return filed;
    }
    // 主函数
    public static void main(String[] argc) {
        new LifeCycle();
        System.out.println("===================");
        try {
            LifeCycle cycle = LifeCycle.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();

        try {
            for (Constructor constructor : Single.class.getDeclaredConstructors()) {
                System.out.println(constructor.getName());
            }
            Constructor constructor   = Single.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Single single2 = (Single)constructor.newInstance();
            System.out.println(single2 == single1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
