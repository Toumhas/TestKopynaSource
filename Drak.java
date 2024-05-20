public class Drak extends Bojovnik{
    public Drak(int energie) {
        super(energie, energie / 4);
    }

    @Override
    public String toString() {
        return ("Drak ( " + (this.jeNazivu ? "živý" : "kaput") +
                " \n   původní energie = " + this.getEnergie() +
                " \n   maxKapacita = " + this.getMaxKapacita() +
                " \n   kapacita = " + this.getZbyvajiciKapacita() +
                " \n   energie celkem = " + this.getSkutecnaEnergie() +
                "\n" + ")");
    }
}
