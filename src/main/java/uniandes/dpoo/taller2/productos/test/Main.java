package uniandes.dpoo.taller2.productos.test;

import uniandes.dpoo.taller2.productos.modelo.products.Product;
import uniandes.dpoo.taller2.productos.modelo.products.ProductBuilder;

public class Main {
    public static void main(String[] args) {
        ProductBuilder pb = new ProductBuilder()
                .setName("Apple")
                .setVolume(2.30)
                .setWeight(32.1);

        Product p = pb.getProduct();

        System.out.println(p.toString());
        System.out.println("Hello");
    }
}
