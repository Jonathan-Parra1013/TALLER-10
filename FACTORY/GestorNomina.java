import java.util.ArrayList;

public class GestorNomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ConfiguracionNomina config = new ConfiguracionNomina();

    public ConfiguracionNomina getConfig() {
        return config;
    }

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            String[] datos = linea.split(";");
            // Delegamos la creación al Factory
            Empleado nuevoEmpleado = EmpleadoFactory.crearEmpleado(datos);
            empleados.add(nuevoEmpleado);
        }
    }

    public void imprimirSalud() {
        System.out.println("Salud en GestorNomina:  " + config.getPorcentajeSalud() * 100 + " %");
    }

    public void imprimirNomina() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + ": " + String.format("%.0f", e.calcularSalario()));
        }
    }
}