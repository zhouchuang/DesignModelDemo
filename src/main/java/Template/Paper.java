package Template;

public abstract class Paper {
    protected void question1(){
        System.out.println("春节是哪天？");
        System.out.println("A:正月初一,B:二月初一,C:五月初五,D:八月十五");
        System.out.println("答案:"+answer1());
    }
    abstract String answer1();
}
