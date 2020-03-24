package FactoryMethod;

public class VolunteerFactory implements ILeifengFactory<Volunteer> {
    @Override
    public Volunteer create() {
        return new Volunteer("志愿者");
    }
}
