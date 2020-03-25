package AbstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AccessServer {
    private static String db = "";
    static {
        Properties properties=new Properties();
        try {
            InputStream is=AccessServer.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(is);
            is.close();
            db = (String)properties.get("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static IUser createUserServer(){
        try {
            return (IUser) Class.forName("AbstractFactory."+db+"UserServer").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IRole createRoleServer(){
        try {
            return (IRole) Class.forName("AbstractFactory."+db+"RoleServer").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
