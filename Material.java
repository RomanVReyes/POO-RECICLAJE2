import java.io.Serializable;

public class Material implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String tipo;
    
    public Material(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Material{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
}
