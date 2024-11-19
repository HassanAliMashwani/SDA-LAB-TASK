// Base Layer: Models

// Base Layer: Models
class Student {
    private String name;
    private int age;
    private double outstandingFees;
    private boolean specialNeeds;
    private String preferredService;

    public Student(String name, int age, double outstandingFees, boolean specialNeeds, String preferredService) {
        this.name = name;
        this.age = age;
        this.outstandingFees = outstandingFees;
        this.specialNeeds = specialNeeds;
        this.preferredService = preferredService;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getOutstandingFees() { return outstandingFees; }
    public boolean hasSpecialNeeds() { return specialNeeds; }
    public String getPreferredService() { return preferredService; }
}

// Filter Layer: Abstract Pipe & Filter Interface
interface HostelFilter {
    String applyFilter(Student student);
}

// Eligibility Filter
class EligibilityFilter implements HostelFilter {
    @Override
    public String applyFilter(Student student) {
        if (student.getAge() >= 18 && student.getAge() <= 25 && !student.hasSpecialNeeds()) {
            return "Eligible";
        }
        return "Rejected due to age or special needs.";
    }
}

// Payment Filter
class PaymentFilter implements HostelFilter {
    @Override
    public String applyFilter(Student student) {
        if (student.getOutstandingFees() < 50000) {
            return "Payment Approved";
        }
        return "Rejected due to outstanding fees.";
    }
}

// Services Availability Filter
class ServicesAvailabilityFilter implements HostelFilter {
    @Override
    public String applyFilter(Student student) {
        // Example: Only students whose name length exceeds 5 get AC/Single room preference.
        if (student.getPreferredService().equals("AC")) {
            return student.getName().length() > 5 ? "Service Approved: AC" : "Rejected: Service AC unavailable for short names.";
        } else if (student.getPreferredService().equals("Single Room")) {
            return student.getName().length() > 5 ? "Service Approved: Single Room" : "Rejected: Single Room not available.";
        } else if (student.getPreferredService().equals("Shared Room")) {
            return "Service Approved: Shared Room";
        }
        return "Rejected: Invalid Service Preference.";
    }
}

// Observer Pattern: Notifier for Approved Students
interface HostelObserver {
    void notifyApproval(Student student);
}

class EmailNotifier implements HostelObserver {
    @Override
    public void notifyApproval(Student student) {
        System.out.println("Notification sent: " + student.getName() + " has been processed for hostel allotment.");
    }
}