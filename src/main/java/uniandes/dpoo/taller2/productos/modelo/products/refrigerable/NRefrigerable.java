package uniandes.dpoo.taller2.productos.modelo.products.refrigerable;

public class NRefrigerable implements IRefrigerable {
    NRefrigerable(boolean resist_heat) {
        this.resist_heat = resist_heat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NRefrigerable)) return false;

        NRefrigerable that = (NRefrigerable) o;

        return resist_heat == that.resist_heat;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("resist heat = ").append(resist_heat).append('\n')
                .toString();
    }

    public boolean resist_heat;
}
