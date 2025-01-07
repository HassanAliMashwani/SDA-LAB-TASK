# Auction Management System

This Java application is an Auction Management System that enables users to manage auction items, start auctions, close auctions, and track the sale of items. The application uses a layered architecture for clear separation of concerns:

1. **Entity Layer**: Defines core domain objects, such as `AuctionItem`.
2. **Data Access Layer**: Manages storage and retrieval of auction items through the `AuctionRepository`.
3. **Service Layer**: Contains business logic for managing auctions via the `AuctionService`.
4. **Presentation Layer**: The entry point of the application (`AuctionApplication`) where user interaction takes place.

---

## Features

- **Add Items**: Add new auction items to the system with a unique ID, name, and starting price.
- **Start Auctions**: Change the state of items from "Created" to "Started."
- **Close Auctions**: Sell items to a buyer, recording the buyer's name and the sold price, and changing the state to "Sold."
- **View Items**: Display all items, including their state, buyer, and sold price (if sold).
- **Sold and Unsold Items**: Separate listings for sold and unsold items.

---

# How to Run the Application
## Run the Code in VS Code

1. **Prerequisites**:
   - Ensure you have Java Development Kit (JDK) installed (version 8 or higher).
   - Save the following files in the same directory:
     - `AuctionItem.java`
     - `AuctionRepository.java`
     - `AuctionService.java`
     - `AuctionApplication.java`

2. **Compile the Code**:
   Navigate to the directory containing the files and compile all `.java` files:
   ```bash
   javac *.java
   ```

3. **Run the Application**:
   Execute the main application class:
   ```bash
   java AuctionApplication
   ```
4. **Run the Application**:<br>
     simple run the code

---

## Example Usage

- **Adding Items**:
  ```
  Item added with state: Created
  ```
- **Starting Auctions**:
  ```
  Auction started for item: 1
  ```
- **Closing Auctions**:
  ```
  Auction closed for item: 1, Buyer: Alice, Sold Price: 150.0
  ```
- **Viewing All Items**:
  ```
  Auction Items:
  Item ID: 1, Name: Antique Vase, Starting Price: 100.0, State: Sold, Buyer: Alice, Sold Price: 150.0
  Item ID: 2, Name: Vintage Watch, Starting Price: 200.0, State: Sold, Buyer: Bob, Sold Price: 250.0
  Item ID: 3, Name: Rare Coin, Starting Price: 50.0, State: Created
  ```
- **Viewing Sold and Unsold Items**:
  ```
  Sold Items:
  Item ID: 1, Name: Antique Vase, Starting Price: 100.0, State: Sold, Buyer: Alice, Sold Price: 150.0
  Item ID: 2, Name: Vintage Watch, Starting Price: 200.0, State: Sold, Buyer: Bob, Sold Price: 250.0

  Unsold Items:
  Item ID: 3, Name: Rare Coin, Starting Price: 50.0, State: Created
  ```

---

## Directory Structure
```
AuctionManagementSystem/
├── AuctionItem.java
├── AuctionRepository.java
├── AuctionService.java
├── AuctionApplication.java
└── README.md
```

---

## Notes

- The `AuctionItem` class contains the following attributes:
  - `itemId`: Unique identifier for the item.
  - `itemName`: Name of the item.
  - `startingPrice`: Initial price of the item.
  - `state`: Current state of the item (Created, Started, or Sold).
  - `buyer`: Name of the buyer (only for sold items).
  - `soldPrice`: Final selling price (only for sold items).

- Only items in the "Started" state can be sold.
- Attempting to sell an item that has not started will result in an error message.

---

## Author
This application was designed and implemented to demonstrate core object-oriented programming concepts and basic auction management functionality.

