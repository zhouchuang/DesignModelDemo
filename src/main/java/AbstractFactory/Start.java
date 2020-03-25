package AbstractFactory;

public class Start {
    public static void main(String[] args) {
        IRole iRole = AccessServer.createRoleServer();
        iRole.query();
        iRole.update();

        IUser iUser = AccessServer.createUserServer();
        iUser.get();
        iUser.insert();
    }
}
