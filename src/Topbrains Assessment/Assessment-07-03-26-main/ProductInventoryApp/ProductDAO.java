package ProductInventoryApp;

import ProductInventoryApp.Product;
import ProductInventoryApp.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class ProductDAO {

    public void addProduct(Product p) {
        String sql = "INSERT INTO products VALUES (?,?,?,?,?,?,NOW())";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setString(3, p.getCategory());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getQuantity());
            ps.setDouble(6, p.getRating());

            ps.executeUpdate();
            System.out.println("Product added successfully.");

        } catch (SQLException e) {
            System.out.println("Error adding product.");
        }
    }

    public void viewAllProducts() {
        String sql = "SELECT * FROM products";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("ID Name Category Price Qty Rating");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("product_id") + " " +
                        rs.getString("product_name") + " " +
                        rs.getString("category") + " " +
                        rs.getDouble("price") + " " +
                        rs.getInt("quantity") + " " +
                        rs.getDouble("rating")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving products.");
        }
    }

    public void viewProductById(int id) {

        String sql = "SELECT * FROM products WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt("product_id") + " " +
                        rs.getString("product_name") + " " +
                        rs.getString("category") + " " +
                        rs.getDouble("price") + " " +
                        rs.getInt("quantity") + " " +
                        rs.getDouble("rating"));
            } else {
                System.out.println("Product not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error.");
        }
    }

    public void updatePrice(int id, double price) {

        if (price <= 0) {
            System.out.println("Price must be > 0");
            return;
        }

        String sql = "UPDATE products SET price=? WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, price);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Price updated successfully.");
            else
                System.out.println("Product not found.");

        } catch (SQLException e) {
            System.out.println("Error updating price.");
        }
    }

    public void updateQuantity(int id, int qty) {

        if (qty < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }

        String sql = "UPDATE products SET quantity=? WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, qty);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Quantity updated.");

        } catch (SQLException e) {
            System.out.println("Error updating quantity.");
        }
    }

    public void deleteProduct(int id) {

        String sql = "DELETE FROM products WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Product deleted.");
            else
                System.out.println("Product does not exist.");

        } catch (SQLException e) {
            System.out.println("Error deleting.");
        }
    }

    public void searchProduct(String keyword) {

        String sql = "SELECT * FROM products WHERE product_name LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("product_name"));
            }

        } catch (SQLException e) {
            System.out.println("Error searching.");
        }
    }

    public void lowStock() {

        String sql = "SELECT * FROM products WHERE quantity < 5";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("Low Stock Products");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("product_id") + " " +
                        rs.getString("product_name") + " " +
                        rs.getInt("quantity"));
            }

        } catch (SQLException e) {
            System.out.println("Error.");
        }
    }
}