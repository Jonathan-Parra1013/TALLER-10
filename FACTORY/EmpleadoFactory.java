public class EmpleadoFactory {
    
    public static Empleado crearEmpleado(String[] datos) {
        String tipo = datos[0];
        String nombre = datos[1];
        double valorPrincipal = Double.parseDouble(datos[2]);

        switch (tipo.toUpperCase()) {
            case "FIJO":
                return new EmpleadoFijo(nombre, valorPrincipal);
            case "HORAS":
                double valorHora = Double.parseDouble(datos[3]);
                return new EmpleadoPorHoras(nombre, valorPrincipal, valorHora);
            case "COMISION":
                double ventas = Double.parseDouble(datos[3]);
                return new EmpleadoPorComision(nombre, valorPrincipal, ventas);
            case "CONTRATISTA":
                return new Contratista(nombre, valorPrincipal);
            case "PRACTICANTE":
                return new Practicante(nombre, valorPrincipal);
            default:
                throw new IllegalArgumentException("Tipo de empleado desconocido: " + tipo);
        }
    }
}