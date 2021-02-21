package uniandes.dpoo.taller2.productos.modelo.products;

public abstract class AbstractProduct {

    AbstractProduct(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractProduct)) return false;

        AbstractProduct that = (AbstractProduct) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.volume, volume) != 0) return false;
        return name.equals(that.name);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("name = ").append(name).append('\n')
                .append("weight = ").append(weight).append('\n')
                .append("volume = ").append(volume).append('\n')
                .toString();
    }

    public String name;
    public double weight;
    public double volume;
}
