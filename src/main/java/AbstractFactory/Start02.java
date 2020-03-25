package AbstractFactory;

public class Start02 {
    public static void main(String[] args) {
        IRole iRole = AccessServer02.createServer(IRole.class);
        iRole.query();
        iRole.update();
        iRole.delete();

        IUser iUser = AccessServer02.createServer(IUser.class);
        iUser.get();
        iUser.insert();
        iUser.delete();
    }
}
