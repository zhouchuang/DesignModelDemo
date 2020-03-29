package Interpreter;

/**
 * @author zhouchuang
 * @create 2020-03-29 20:55
 */
public class Transfer {
    private Context context;

    public Transfer(String text) {
        this.context = new Context(text);
    }
    public void expression(){
        while(context.getText().length()>0){
            String key = context.getText().substring(0,1);
            Expression expression = null;
            if("C".equals(key)){
                expression = new Chinese();
            }else {
                expression = new English();
            }
            this.context.setText(context.getText().substring(1));
            expression.interpret(context);
        }
    }
}
