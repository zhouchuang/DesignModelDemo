package Interpreter;

/**
 * @author zhouchuang
 * @create 2020-03-29 20:53
 */
public class English extends Expression {
    @Override
    protected String expression(String value) {
        String note = null;
        switch (value){
            case "1":
                note = "One";
                break;
            case "2":
                note = "Two";
                break;
            case "3":
                note = "Three";
                break;
        }
        return note;
    }

}
