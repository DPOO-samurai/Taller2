package uniandes.dpoo.taller2.productos.modelo.products.perishable;

public class NPerishable implements IPerishable {
    public NPerishable() {
    }

    public NPerishable(int toxicity_level) {
        setToxic(toxicity_level);

    }

    public void setToxic(int toxicity_level) {
        this.toxic = toxicity_level != 0;
        this.toxicity_level = toxicity_level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NPerishable)) return false;

        NPerishable that = (NPerishable) o;

        if (toxic != that.toxic) return false;
        if (toxicity_level != that.toxicity_level) return false;
        return maximum_storage_temperature == that.maximum_storage_temperature;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("toxic = ").append(toxic).append('\n')
                .append("toxicity level = ").append(toxicity_level).append('\n')
                .append("maximum storage temperature = ").append(maximum_storage_temperature).append('\n')
                .toString();
    }

    public boolean toxic;
    public int toxicity_level;
    public int maximum_storage_temperature = 50;
}
