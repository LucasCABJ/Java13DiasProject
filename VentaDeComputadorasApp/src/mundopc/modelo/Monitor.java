package mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private String tamaño;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, String tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
