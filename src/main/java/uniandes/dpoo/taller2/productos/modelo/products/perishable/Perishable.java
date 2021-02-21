package uniandes.dpoo.taller2.productos.modelo.products.perishable;

import uniandes.dpoo.taller2.productos.modelo.products.refrigerable.IRefrigerable;
import uniandes.dpoo.taller2.productos.modelo.products.refrigerable.Refrigerable;

public class Perishable implements IPerishable {

    public Perishable() {

    }

    public void setRefrigerable(Refrigerable refrigerable) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perishable)) return false;

        Perishable that = (Perishable) o;

        return refrigerable != null ? refrigerable.equals(that.refrigerable) : that.refrigerable == null;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(refrigerable.toString())
                .toString();
    }

    IRefrigerable refrigerable;
}
