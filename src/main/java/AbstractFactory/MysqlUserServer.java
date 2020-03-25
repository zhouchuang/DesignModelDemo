package AbstractFactory;

public class MysqlUserServer implements IUser {
    @Override
    public void insert() {
        System.out.println("mysql insert into user");
    }

    @Override
    public void get() {
        System.out.println("mysql select user where id = 1");
    }

    @Override
    public void delete() {
        System.out.println("mysql delete user");
    }
}
