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