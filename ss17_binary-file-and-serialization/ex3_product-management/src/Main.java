import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile (String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile (String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Ring", 200, "A", "New"));
        products.add(new Product(2, "Ring", 300, "B", "New"));
        products.add(new Product(3, "Ring", 400, "C", "New"));
        products.add(new Product(4, "Ring", 500, "D", "New"));

        writeDataToFile("/Users/clouq4d/Workspace/Java/ss17_binary-file-and-serialization/ex3_product-management/products.txt", products);
        List<Product> productDataFromFile = readDataFromFile("/Users/clouq4d/Workspace/Java/ss17_binary-file-and-serialization/ex3_product-management/products.txt");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }
}