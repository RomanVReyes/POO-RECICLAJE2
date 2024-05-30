import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CentroDeReciclaje implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Contenedor> contenedores;

    public CentroDeReciclaje() {
        this.contenedores = new ArrayList<>();
    }

    public void agregarContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void guardarDatos(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CentroDeReciclaje cargarDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (CentroDeReciclaje) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "CentroDeReciclaje{" + "contenedores=" + contenedores + '}';
    }
}
