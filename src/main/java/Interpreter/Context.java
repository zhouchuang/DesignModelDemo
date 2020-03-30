package Interpreter;

/**
 * @author zhouchuang
 * @create 2020-03-29 20:45
 */
public class Context {
    private String text;

    public Context(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
