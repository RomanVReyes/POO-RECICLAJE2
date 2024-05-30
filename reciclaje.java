import java.io.Serializable;
import java.util.List;

class MaterialReciclable implements Serializable {
    private String nombre;
    private String tipo;

    public MaterialReciclable(String nombre, String tipo) {
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
}

class ContenedorReciclaje implements Serializable {
    private String id;
    private MaterialReciclable material;
    private double capacidad;

    public ContenedorReciclaje(String id, MaterialReciclable material, double capacidad) {
        this.id = id;
        this.material = material;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MaterialReciclable getMaterial() {
        return material;
    }

    public void setMaterial(MaterialReciclable material) {
        this.material = material;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}

class PuntoRecoleccion implements Serializable {
    private String direccion;
    private double latitud;
    private double longitud;
    private List<ContenedorReciclaje> contenedores;

    public PuntoRecoleccion(String direccion, double latitud, double longitud, List<ContenedorReciclaje> contenedores) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.contenedores = contenedores;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<ContenedorReciclaje> getContenedores() {
        return contenedores;
    }

    public void setContenedores(List<ContenedorReciclaje> contenedores) {
        this.contenedores = contenedores;
    }
}

class Reciclador implements Serializable {
    private String nombre;
    private String dni;

    public Reciclador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

class PlantaReciclaje implements Serializable {
    private String nombre;
    private String ubicacion;

    public PlantaReciclaje(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
