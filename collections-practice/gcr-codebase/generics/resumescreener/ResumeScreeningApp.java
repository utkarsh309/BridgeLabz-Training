package generics.resumescreener;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {

    // Wildcard method
    public static void screenAllResumes(List<? extends JobRole> candidates) {

        System.out.println("\nScreening Candidates:");

        for (int i = 0; i < candidates.size(); i++) {
            JobRole role = candidates.get(i);
            System.out.println(role.getCandidateName()+ " applied for "+ role.getRoleType());
        }
    }

    public static void main(String[] args) {

        
        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("Utkarsh"));
        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("Neha"));
        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("Arjun"));

        // Processing resumes
        r1.processResume();
        r2.processResume();
        r3.processResume();

        // Screening pipeline using wildcard list
        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(new SoftwareEngineer("Utkarsh"));
        pipeline.add(new DataScientist("Neha"));
        pipeline.add(new ProductManager("Arjun"));

        screenAllResumes(pipeline);
    }
}

