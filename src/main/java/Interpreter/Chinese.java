package Interpreter;

/**
 * @author zhouchuang
 * @create 2020-03-29 20:47
 */
public class Chinese extends Expression {
    @Override
    protected String  expression(String value) {
        String note = null;
        switch (value){
            case "1":
                note = "一";
                break;
            case "2":
                note = "二";
                break;
            case "3":
                note = "三";
                break;
        }
        return note;
    }

}
