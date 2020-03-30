package Interpreter;

/**
 * @author zhouchuang
 * @create 2020-03-29 20:39
 */
public abstract class Expression {
    public void interpret(Context context){
        while(true){
            if(context.getText().length()==0){
                return ;
            }else{
                String value = context.getText().substring(0,1);
                if(excute(value)==false){
                    return ;
                }else{
                    context.setText(context.getText().substring(1));
                }
            }
        }

    }

    protected abstract  String expression(String value);

    private boolean excute(String value) {
        String note = null;
        note = expression(value);
        if(note==null){
            return false;
        }else{
            System.out.println(note);
            return true;
        }
    }
}
