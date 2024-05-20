import java.util.*;

public abstract class Figurka {
    protected int energie;
    protected boolean jeNazivu;

    public Figurka() {
    }

    public Figurka(int energie) {
        this.energie = energie;
        this.jeNazivu = true;
    }

    public Figurka(int energie, boolean jeNazivu) {
        this.energie = energie;
        this.jeNazivu = jeNazivu;
    }

    public int getEnergie() {
        return this.energie;
    }

    public int getSkutecnaEnergie() {
        return this.energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public boolean jeNazivu() {
        return this.jeNazivu;
    }

    public void kaput() {
        this.jeNazivu = false;
    }

    public void naPlochu(List<Figurka> plocha) {
        plocha.add(this);
    }
}
