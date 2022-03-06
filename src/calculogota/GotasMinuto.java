package calculogota;

public class GotasMinuto extends Suero {

    private double tiempo, sueroML, resultado, resultado1Hs, resultado8Hs, resultado24Hs;
    private static final double OCHOHORA = 8;


    public GotasMinuto(double microGota, double horasTotales, double ochoHora) {
        super(microGota, horasTotales);
        ochoHora = OCHOHORA;
    }

    public double getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueroML() {
        return this.sueroML;
    }

    public void setSueroML(double sueroML) {
        this.sueroML = sueroML;
    }

    @Override
    public void proceso(double tiempo, double sueroML) {
        this.resultado = this.sueroML / (this.tiempo * this.getMicroGota());
        this.resultado1Hs = this.getMicroGota() * this.resultado;
        this.resultado8Hs = this.resultado1Hs * OCHOHORA;
        this.resultado24Hs = this.resultado8Hs * this.getMicroGota();
        obtenerML();
    }

    public void obtenerML() {
        System.out.println("Son: " + Math.round(this.resultado) + " gotas por minutos.");
        System.out.println("En 1 hora se usan: " + Math.round(this.resultado1Hs) + " ml.");
        System.out.println("En 8 horas se usan : " + Math.round(this.resultado8Hs) + " ml.");
        System.out.println("En 24 horas se usan: " + Math.round(this.resultado24Hs) + " ml.");
    }

}
