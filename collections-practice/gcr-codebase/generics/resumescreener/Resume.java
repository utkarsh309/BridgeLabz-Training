package generics.resumescreener;

public class Resume<T extends JobRole> {

    private T jobApplication;

    public Resume(T jobApplication) {
        this.jobApplication = jobApplication;
    }

    public T getJobApplication() {
        return jobApplication;
    }

    public void processResume() {
        System.out.println("Processing resume of "
                + jobApplication.getCandidateName()
                + " for role: "+ jobApplication.getRoleType());
    }
}

