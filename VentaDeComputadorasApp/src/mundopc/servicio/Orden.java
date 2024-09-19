package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoraList;
    private static int contadorOrdenes;

    public Orden() {
        this.computadoraList = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregarComputadora(Computadora computadora) {
        this.computadoraList.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de computadoras: " + computadoraList.size());
        System.out.println();
        computadoraList.forEach(System.out::println);
    }
}
