package uniandes.dpoo.taller2.productos.modelo.products;

import uniandes.dpoo.taller2.productos.modelo.products.perishable.IPerishable;

public class Product extends AbstractProduct {
    Product(String name, double weight, double volume, IPerishable perishable) {
        super(name, weight, volume);
        this.perishable = perishable;
    }

    @Override
    public boolean equals(Object o) {
        Product that = (Product) o;
        return super.equals(o) && perishable.equals(that.perishable);
    }

    @Override
    public String toString() {
        if (perishable != null) {
            return super.toString() + "\n" + perishable.toString();
        } else{
            return super.toString();
        }
    }

    public IPerishable perishable;
}
