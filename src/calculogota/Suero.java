package calculogota;

public class Suero {

    private double horas, dias, gotas, mlSuero;
    private static final double HORASTOTALES = 24;
    private static final double MICROGOTA = 3;
    
    public Suero(double microGota, double horasTotales) {
        microGota = MICROGOTA;
        horasTotales = HORASTOTALES;
    }

    public double getGotas() {
        return this.gotas;
    }

    public void setGotas(double gotas) {
        this.gotas = gotas;
    }

    public double getMlSuero() {
        return this.mlSuero;
    }

    public void setMlSuero(double mlSuero) {
        this.mlSuero = mlSuero;
    }

    public double getMicroGota() {
        return MICROGOTA;
    }

    public double getHorasTotales() {
        return HORASTOTALES;
    }

    public void proceso(double gotas, double mlSuero) {
        this.horas = this.mlSuero / (this.gotas * MICROGOTA);
        this.dias = HORASTOTALES / this.horas;
        obtener();
    }

    public void obtener() {
        System.out.println("Cambiar el suero cada: " + Math.round(this.horas) + " horas.");
        System.out.println("En 24hs se usan: " + Math.round(this.dias) + " sueros.");
    }

    @Override
    public String toString() {
        return "Suero{" + "microGota=" + MICROGOTA + ", horasTotales=" + HORASTOTALES + '}';
    }
}
