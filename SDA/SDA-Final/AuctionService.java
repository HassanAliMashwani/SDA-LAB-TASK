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