// Esta clase es para las pruebas, no se debe subir como parte de la solución
public class App {
    public static void main(String[] args) {
        // Prueba 1
        Cafe cafe[]=new Cafe[5];
        cafe[0]=new Cafe(250.0, 50, 'D');
        cafe[1]=new CafeNacional(180.0, 30);
        cafe[2]=new CafeExportacion(550.0, 80, 'B', 42, false);
        cafe[3]=new Cafe();
        cafe[4]=new Cafe(550.0, 20, 'D');
        PrecioTotal solucion1 = new PrecioTotal(cafe);
        solucion1.mostrarTotales();
    }
}