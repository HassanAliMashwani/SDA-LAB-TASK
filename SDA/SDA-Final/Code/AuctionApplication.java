import java.util.List;
import java.util.ArrayList;

// Entity Layer: Defines core domain objects
class AuctionItem {
    private int itemId;
    private String itemName;
    private double startingPrice;
    private String state;
    private String buyer;
    private double soldPrice;

    public AuctionItem(int itemId, String itemName, double startingPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.startingPrice = startingPrice;
        this.state = "Created"; // Initial state
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Name: " + itemName + ", Starting Price: " + startingPrice + ", State: " + state + 
                (state.equals("Sold") ? ", Buyer: " + buyer + ", Sold Price: " + soldPrice : "");
    }
}


// Data Access Layer: Manages storage and retrieval of items

class AuctionRepository {
    private List<AuctionItem> items;

    public AuctionRepository() {
        items = new ArrayList<>();
    }

    public void save(AuctionItem item) {
        items.add(item);
    }

    public AuctionItem findById(int itemId) {
        for (AuctionItem item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    public List<AuctionItem> findAll() {
        return items;
    }
}


// Service Layer: Contains business logic for managing auctions
class AuctionService {
    private AuctionRepository repository;

    public AuctionService(AuctionRepository repository) {
        this.repository = repository;
    }

    public void addItem(AuctionItem item) {
        repository.save(item);
        System.out.println("Item added with state: " + item.getState());
    }

    public void startAuction(int itemId) {
        AuctionItem item = repository.findById(itemId);
        if (item != null && item.getState().equals("Created")) {
            item.setState("Started");
            System.out.println("Auction started for item: " + itemId);
        } else {
            System.out.println("Cannot start auction. Item is not in the Created state.");
        }
    }

    public void closeAuction(int itemId, String buyer, double soldPrice) {
        AuctionItem item = repository.findById(itemId);
        if (item != null && item.getState().equals("Started")) {
            item.setState("Sold");
            item.setBuyer(buyer);
            item.setSoldPrice(soldPrice);
            System.out.println("Auction closed for item: " + itemId + ", Buyer: " + buyer + ", Sold Price: " + soldPrice);
        } else {
            System.out.println("Cannot close auction. Item is not in the Started state.");
        }
    }

    public void viewItems() {
        System.out.println("Auction Items:");
        for (AuctionItem item : repository.findAll()) {
            System.out.println(item);
        }
    }

    public void viewSoldAndUnsoldItems() {
        System.out.println("\nSold Items:");
        for (AuctionItem item : repository.findAll()) {
            if (item.getState().equals("Sold")) {
                System.out.println(item);
            }
        }

        System.out.println("\nUnsold Items:");
        for (AuctionItem item : repository.findAll()) {
            if (!item.getState().equals("Sold")) {
                System.out.println(item);
            }
        }
    }
}


// main class
// Presentation Layer: Handles user interaction
public class AuctionApplication {
    public static void main(String[] args) {
        AuctionRepository repository = new AuctionRepository();
        AuctionService service = new AuctionService(repository);

        // Add items to the auction
        service.addItem(new AuctionItem(1, "Antique Vase", 100.0));
        service.addItem(new AuctionItem(2, "Vintage Watch", 200.0));
        service.addItem(new AuctionItem(3, "Rare Coin", 50.0));

        // Start auction for items
        service.startAuction(1);
        service.startAuction(2);

        // Close auctions and record sales
        service.closeAuction(1, "Alice", 150.0);
        service.closeAuction(2, "Bob", 250.0);

        // Attempt to close an auction that wasn't started
        service.closeAuction(3, "Charlie", 70.0);

        // View all items
        service.viewItems();

        // View sold and unsold items
        service.viewSoldAndUnsoldItems();
    }
}
