
// Data Access Layer: Manages storage and retrieval of items
import java.util.List;
import java.util.ArrayList;
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
