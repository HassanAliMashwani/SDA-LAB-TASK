
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
