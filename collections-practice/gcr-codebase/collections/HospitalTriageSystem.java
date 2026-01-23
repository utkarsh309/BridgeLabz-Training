package collections;

import java.util.PriorityQueue;
import java.util.Comparator;

// Patient class
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

// Comparator class
class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {
        // Higher severity should come first
        return p2.severity - p1.severity;
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {

        // PriorityQueue with custom comparator
        PriorityQueue<Patient> queue = new PriorityQueue<>(new PatientComparator());

        // Add patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        // Treat patients by priority
        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
