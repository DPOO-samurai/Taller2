package uniandes.dpoo.taller2.productos.modelo.products;

import uniandes.dpoo.taller2.productos.modelo.products.perishable.IPerishable;
import uniandes.dpoo.taller2.productos.modelo.products.perishable.Perishable;
import uniandes.dpoo.taller2.productos.modelo.products.perishable.NPerishable;

public class ProductBuilder {
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public ProductBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public IPerishable isPerishable(){
        this.perishable = new Perishable();
        return perishable;
    }

    public IPerishable isNPerishable(){
        this.perishable = new NPerishable();
        return perishable;
    }


    public Product getProduct() {
        return new Product(name, weight, volume, perishable);
    }

    private String name;
    private double weight;
    private double volume;
    private IPerishable perishable;
}
