public class Rytir extends Bojovnik {
    public Rytir(int energie) {
        super(energie, energie / 2);
    }

    @Override
    public String toString() {
        return ("Rytíř ( " + (this.jeNazivu ? "živý" : "kaput") +
                " \n   původní energie = " + this.getEnergie() +
                " \n   maxKapacita = " + this.getMaxKapacita() +
                " \n   kapacita = " + this.getZbyvajiciKapacita() +
                " \n   energie celkem = " + this.getSkutecnaEnergie() +
                "\n" + ")");
    }
}
