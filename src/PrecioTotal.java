public class PrecioTotal {
    // Atributos
    private Double totalCafe = 0.0;
    private Double totalCafeExportacion = 0.0;
    private Double totalCafeNacional = 0.0;
    private Cafe[] listaCafe;

    // Constructor
    PrecioTotal(Cafe[] pCafes) {
        // Código
        this.listaCafe = pCafes;
    }

    public void mostrarTotales() {
        // Código
        for (int i = 0; i < listaCafe.length; i++) {
            if (listaCafe[i] instanceof Cafe) {
                totalCafe += listaCafe[i].calcularPrecio();
            }
            if(listaCafe[i] instanceof CafeExportacion){
                totalCafeExportacion += listaCafe[i].calcularPrecio();
            }
            if(listaCafe[i] instanceof CafeNacional){
                totalCafeNacional += listaCafe[i].calcularPrecio();
            }
        }
        // Mostramos los resultados
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }

}
