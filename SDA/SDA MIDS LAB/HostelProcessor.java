import java.util.ArrayList;
import java.util.List;
// Processing Layer: Pipe & Filter Processor

class HostelProcessor {
    private List<HostelFilter> filters = new ArrayList<>();
    private List<HostelObserver> observers = new ArrayList<>();

    public void addFilter(HostelFilter filter) {
        filters.add(filter);
    }

    public void addObserver(HostelObserver observer) {
        observers.add(observer);
    }

    public void processStudent(Student student) {
        boolean allPassed = true;
        System.out.println("Processing Student: " + student.getName());
        System.out.println("  - Preferred Service: " + student.getPreferredService());

        for (HostelFilter filter : filters) {
            String result = filter.applyFilter(student);
            System.out.println("  - " + result);
            if (result.startsWith("Rejected")) {
                allPassed = false;
            }
        }

        if (allPassed) {
            notifyObservers(student);
            System.out.println("  --> Room Allotted. Congratulations!");
        } else {
            System.out.println("  --> Room Not Allotted. Please review rejection reasons.");
        }

        System.out.println("----------------------------------");
    }

    private void notifyObservers(Student student) {
        for (HostelObserver observer : observers) {
            observer.notifyApproval(student);
        }
    }
}