package Visitor;

public class Start {
    public static void main(String[] args) {
        Man man = new Man();
        Wuman wuman = new Wuman();
        Failure failure = new Failure();
        Success success = new Success();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(man);
        objectStructure.attach(wuman);

        objectStructure.display(failure);
        objectStructure.display(success);
    }
}
