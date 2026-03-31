package generics.resumescreener;

public class DataScientist extends JobRole {

    public DataScientist(String name) {
        super(name);
    }

    @Override
    public String getRoleType() {
        return "Data Scientist";
    }
}

