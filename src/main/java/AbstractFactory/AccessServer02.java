package AbstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AccessServer02 {
    private static String db = "";
    static {
        Properties properties=new Properties();
        try {
            InputStream is= AccessServer02.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(is);
            is.close();
            db = (String)properties.get("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends IBase> T createServer(Class<T> clazz) {
        try {
            return (T) Class.forName("AbstractFactory."+db+clazz.getSimpleName().substring(1)+"Server").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
