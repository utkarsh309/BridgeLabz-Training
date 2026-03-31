package generics.resumescreener;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public String getRoleType() {
        return "Software Engineer";
    }
}
