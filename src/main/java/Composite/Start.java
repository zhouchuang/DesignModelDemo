package Composite;

public class Start {
    public static void main(String[] args) {
        Province province  = new Province("湖南省");
        City city = new City("长沙市");
        Region region = new Region("望城区");
        Region region1 = new Region("大通湖区");
        City city1  = new City("益阳市");
        province.add(city);
        province.add(city1);
        city.add(region);
        city1.add(region1);
        province.show();
        System.out.println("=======================");
        city.show();
        System.out.println("=======================");
        region.show();
    }
}
