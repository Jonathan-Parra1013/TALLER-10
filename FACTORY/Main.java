public class Main {
    public static void main(String[] args) {
        GestorNomina gestor = new GestorNomina();
        
        // --- Carga desde texto (Ahora usando Factory Method) ---
        String[] lineas = {
            "FIJO;Ana Ruiz;3500000",
            "HORAS;Luis Gómez;120;18000",
            "CONTRATISTA;Marta Díaz;4200000", 
            "PRACTICANTE;Juan Pérez;1300000"  
        };
        
        System.out.println("Cargando nómina desde texto...");
        gestor.cargar(lineas);
        gestor.imprimirNomina();
    }
}