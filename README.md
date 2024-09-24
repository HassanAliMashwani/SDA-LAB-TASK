# SDA-LAB-TASK

**HOME TASK
HASSAN ALI MASHWANI
 **
Creator Principle - General Responsibility Assignment Software Principle (GRASP)
The Creator is one of the GRASP (General Responsibility Assignment Software Patterns) principles, which are a set of guidelines for assigning responsibilities to classes and objects in object-oriented design. The Creator principle helps in determining which class should be responsible for creating instances of another class.
Explanation
The Creator principle suggests that a class should be responsible for creating an instance of another class if one or more of the following criteria are true:
•	Contains: The class contains the object being created.
•	Aggregates: The class aggregates the object being created.
•	Uses: The class uses the object being created.
•	Initializes: The class has the initializing data that will be passed to the object being created.
By following the Creator principle, you ensure that objects are created in a logical place within your system, leading to better organization and encapsulation.
Sure! This Java code defines a simple order management system involving three main classes: `OrderItem`, `Order`, and `Customer`. Here’s a breakdown of each component:

 1. OrderItem Class
- Purpose: Represents an individual item in an order.
- Attributes:
  - `productName`: The name of the product.
  - `quantity`: The number of units ordered.
  - `unitPrice`: The price per unit of the product.
- Constructor: The constructor is private, meaning `OrderItem` instances can only be created from within the `Order` class.
- Getters: Provides read-only access to the item's attributes, enforcing immutability (no setters).
- Method:
  - `getTotalPrice()`: Calculates the total price for that specific item (quantity multiplied by unit price).

 2. Order Class
- Purpose: Represents a customer's order which can contain multiple `OrderItem` instances.
- Attributes:
  - `orderId`: Unique identifier for the order.
  - `items`: A list to store multiple `OrderItem` objects.
- Constructor: Initializes the order with a unique `orderId`.
- Methods:
  - `addItem(String productName, int quantity, double unitPrice)`: Creates a new `OrderItem` and adds it to the order.
  - `getItems()`: Returns the list of items in the order.
  - `calculateTotal()`: Computes the total amount for the order by summing the total prices of all items.

 3. Customer Class
- Purpose: Represents a customer who can place orders.
- Attributes:
  - `customerId`: Unique identifier for the customer.
- Constructor: Initializes the customer with a `customerId`.
- Method:
  - `placeOrder(int orderId)`: Allows the customer to create a new `Order`.

 4. Main Class
- Purpose: Contains the `main` method, which serves as the entry point for the application.
- Flow of Execution:
  - A `Customer` object is created with a unique ID.
  - The customer places a new order with a specific order ID.
  - Two items are added to the order (a laptop and a mouse).
  - The order summary is printed to the console, including each item's name, quantity, and total price.
  - Finally, the total order amount is calculated and displayed.
  - 
Advantages:
1.	Encapsulation: The `Order` class controls the creation of `OrderItem`, leading to better encapsulation.
2.	Simplified Client Code: The client code (the part of the code that uses `Order` and `OrderItem`) is simplified since it doesn't need to know about the creation process of `OrderItem`.
3.	Cohesion: The responsibility for managing order items is logically grouped within the `Order` class, making the system more cohesive.
4.	
Conclusion
The Creator principle from GRASP is a powerful guideline that helps determine where object creation responsibilities should be placed. By following this principle, you ensure that your system is more organized, maintainable, and easier to understand. The Creator principle enhances cohesion and encapsulation, which are key to building robust and scalable object-oriented systems.


