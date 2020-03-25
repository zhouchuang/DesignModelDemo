package AbstractFactory;

public class OracleRoleServer implements IRole {
    @Override
    public void update() {
        System.out.println("oracle insert into role ");
    }

    @Override
    public void query() {
        System.out.println("oracle select role where id = 1");
    }

    @Override
    public void delete() {
        System.out.println("oracle delete role");
    }
}
