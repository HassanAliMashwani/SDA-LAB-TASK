import java.util.List;

// Main Layer: Application Entry

// Main Layer: Application Entry
public class HostelSystem {
    public static void main(String[] args) {
        // Create 10 students with service preferences
        List<Student> students = List.of(
            new Student("Hassan", 21, 20000, false, "AC"),       // Eligible
            new Student("Ali", 22, 45000, false, "Shared Room"), // Eligible
            new Student("Mashwani", 23, 60000, false, "AC"),     // Rejected (Outstanding fees)
            new Student("Aalyan", 20, 15000, false, "Single Room"), // Eligible
            new Student("Ghazi", 18, 50000, false, "Shared Room"), // Rejected (Boundary case)
            new Student("Hadi", 19, 0, false, "Single Room"),    // Eligible
            new Student("Umer", 24, 30000, false, "AC"),         // Eligible
            new Student("Huzaifa", 25, 35000, false, "AC"),      // Eligible
            new Student("Abubakkar", 22, 25000, false, "Shared Room"), // Eligible
            new Student("Hamza", 19, 55000, false, "Single Room") // Rejected (Outstanding fees)
        );

        // Setup Hostel Processor
        HostelProcessor processor = new HostelProcessor();

        // Add filters
        processor.addFilter(new EligibilityFilter());
        processor.addFilter(new PaymentFilter());
        processor.addFilter(new ServicesAvailabilityFilter());

        // Add observers
        processor.addObserver(new EmailNotifier());

        // Process each student
        for (Student student : students) {
            processor.processStudent(student);
        }
    }
}