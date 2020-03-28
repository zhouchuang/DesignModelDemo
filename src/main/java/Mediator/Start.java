package Mediator;

public class Start {
    public static void main(String[] args) {
        UnitedNations unitedNations = new UnitedNations();
        USA usa = new USA(unitedNations,"美国佬");
        Japan japan = new Japan(unitedNations,"小日本");

        unitedNations.add(usa);
        unitedNations.add(japan);
        usa.delcare("小日本，军费得加钱");
        japan.delcare("加你妹的钱，美国佬");
    }
}
