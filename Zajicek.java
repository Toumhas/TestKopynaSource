public class Zajicek extends Figurka {
    public Zajicek(int energie) {
        super(energie);
    }

    @Override
    public String toString() {
        return ("Zajíček ( " + (this.jeNazivu ? "živý" : "kaput") +
                " \n   energie = " + this.getEnergie() +
                "\n" + ")");
    }
}
