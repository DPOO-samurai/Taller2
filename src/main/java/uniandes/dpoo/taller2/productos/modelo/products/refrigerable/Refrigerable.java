package uniandes.dpoo.taller2.productos.modelo.products.refrigerable;

public class Refrigerable implements IRefrigerable{
    Refrigerable(int maximum_storage_temperature) {
        this.maximum_storage_temperature = maximum_storage_temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerable)) return false;

        Refrigerable that = (Refrigerable) o;

        return maximum_storage_temperature == that.maximum_storage_temperature;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("maximum storage temperature = ").append(maximum_storage_temperature).append('\n')
                .toString();
    }

    public int maximum_storage_temperature;
}
