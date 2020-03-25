package AbstractFactory;

public class OracleUserServer implements IUser {
    @Override
    public void insert() {
        System.out.println("oracle insert into user");
    }

    @Override
    public void get() {
        System.out.println("oracle select user where id = 1");
    }

    @Override
    public void delete() {
        System.out.println("oracle delete user");
    }
}
