package ShopInventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Product a1 = new Product("P001", "Potatoes", 380);
        Product a2 = new Product("P002", "Tomatoes", 278);
        Product a3 = new Product("P003", "Carrots", 369);


        inventory.addProduct(a1);
        inventory.addProduct(a2);
        inventory.addProduct(a3);


        inventory.printAllProducts();


        System.out.println("\nSearching for product P002:");
        Product found = inventory.findProduct("P002");
        if (found != null) System.out.println(found);


        inventory.addProduct(new Product("P002", "Tomatoes", 52));
        System.out.println("\nAfter adding:");
        inventory.printAllProducts();


        System.out.println("\nRemoving product PO03:");
        inventory.removeProduct("P003");
        inventory.printAllProducts();


        System.out.println("\nSearching for product:");
        inventory.findProduct("P007");
    }
}