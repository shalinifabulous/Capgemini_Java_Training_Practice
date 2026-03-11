package ProductInventoryApp;

import ProductInventoryApp.ProductDAO;
import ProductInventoryApp.Product;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        while (true) {

            System.out.println("\n===== PRODUCT INVENTORY MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. View Product By ID");
            System.out.println("4. Update Product Price");
            System.out.println("5. Update Product Quantity");
            System.out.println("6. Delete Product");
            System.out.println("7. Search Product By Name");
            System.out.println("8. Show Low Stock Products");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Category: ");
                        String cat = sc.nextLine();

                        System.out.print("Price: ");
                        double price = Double.parseDouble(sc.nextLine());

                        System.out.print("Quantity: ");
                        int qty = Integer.parseInt(sc.nextLine());

                        System.out.print("Rating: ");
                        double rating = Double.parseDouble(sc.nextLine());

                        dao.addProduct(new Product(id, name, cat, price, qty, rating));
                        break;

                    case 2:
                        dao.viewAllProducts();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        dao.viewProductById(Integer.parseInt(sc.nextLine()));
                        break;

                    case 4:
                        System.out.print("Product ID: ");
                        int pid = Integer.parseInt(sc.nextLine());

                        System.out.print("New Price: ");
                        double np = Double.parseDouble(sc.nextLine());

                        dao.updatePrice(pid, np);
                        break;

                    case 5:
                        System.out.print("Product ID: ");
                        int qid = Integer.parseInt(sc.nextLine());

                        System.out.print("New Quantity: ");
                        int nq = Integer.parseInt(sc.nextLine());

                        dao.updateQuantity(qid, nq);
                        break;

                    case 6:
                        System.out.print("Product ID: ");
                        dao.deleteProduct(Integer.parseInt(sc.nextLine()));
                        break;

                    case 7:
                        System.out.print("Enter keyword: ");
                        dao.searchProduct(sc.nextLine());
                        break;

                    case 8:
                        dao.lowStock();
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }
    }
}