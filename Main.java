public class Main {
    public static void main(String[] args) {
        CentroDeReciclaje centro = new CentroDeReciclaje();

        Contenedor contenedor1 = new Contenedor("C1");
        contenedor1.agregarMaterial(new Material("Botella", "Plástico"));
        contenedor1.agregarMaterial(new Material("Periódico", "Papel"));

        Contenedor contenedor2 = new Contenedor("C2");
        contenedor2.agregarMaterial(new Material("Botella", "Vidrio"));

        centro.agregarContenedor(contenedor1);
        centro.agregarContenedor(contenedor2);

        // Guardar datos en archivo
        centro.guardarDatos("centro_de_reciclaje.dat");

        // Cargar datos desde archivo
        CentroDeReciclaje centroCargado = CentroDeReciclaje.cargarDatos("centro_de_reciclaje.dat");

        System.out.println("Datos cargados: " + centroCargado);
    }
}
