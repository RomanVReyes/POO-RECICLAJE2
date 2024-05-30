import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contenedor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private List<Material> materiales;

    public Contenedor(String id) {
        this.id = id;
        this.materiales = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }

    @Override
    public String toString() {
        return "Contenedor{" + "id=" + id + ", materiales=" + materiales + '}';
    }
}
