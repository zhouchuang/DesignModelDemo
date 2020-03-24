package FactoryMethod;

public class Start {
    public static void main(String[] args) {
        UndergraduateFactory undergraduateFactory  = new UndergraduateFactory();
        Undergraduate undergraduate = undergraduateFactory.create();
        undergraduate.sweep();
        undergraduate.wash();


        VolunteerFactory volunteerFactory = new VolunteerFactory();
        Volunteer volunteer  = volunteerFactory.create();
        volunteer.wash();
        volunteer.sweep();
    }
}
