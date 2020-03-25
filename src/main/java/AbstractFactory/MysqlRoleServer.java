package AbstractFactory;

public class MysqlRoleServer implements IRole {
    @Override
    public void update() {
        System.out.println("mysql insert into role ");
    }

    @Override
    public void query() {
        System.out.println("mysql select role where id = 1");
    }

    @Override
    public void delete() {
        System.out.println("mysql delete role");
    }
}
