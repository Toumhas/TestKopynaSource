import java.util.*;

public abstract class Bojovnik extends Figurka {
    protected int maxKapacita;
    protected int zbyvajiciKapacita;

    public Bojovnik (int energie, int maxKapacita) {
        super(energie);
        this.maxKapacita = maxKapacita;
        this.zbyvajiciKapacita = maxKapacita;
    }

    //Scenar 1 nemusi existovat
    @Override
    public void naPlochu(List<Figurka> plocha) {
        for(Iterator<Figurka> iterator = plocha.iterator(); iterator.hasNext();) {
            Figurka figurka = iterator.next();
            if(this.muzePohltit(figurka) && this.pohltit(figurka)) {
                iterator.remove();
            }
        }
        plocha.add(this);
    }

    public int getMaxKapacita() {
        return maxKapacita;
    }

    public void setMaxKapacita(int maxKapacita) {
        this.maxKapacita = maxKapacita;
    }

    public int getZbyvajiciKapacita() {
        return zbyvajiciKapacita;
    }

    public void setZbyvajiciKapacita(int zbyvajiciKapacita) {
        this.zbyvajiciKapacita = zbyvajiciKapacita;
    }

    @Override
    public int getSkutecnaEnergie() {
        return this.energie + (maxKapacita - zbyvajiciKapacita);
    }

    //Scenar 1 nemusi existovat
    protected boolean muzePohltit(Figurka figurka) {
        if(this.getClass().equals(figurka.getClass()))
            return false;
        if(!figurka.jeNazivu)
            return false;
        return true;
    }

    //Scenar 1 nemusi existovat
    protected boolean pohltit (Figurka figurka) {
        if(this.zbyvajiciKapacita >= figurka.getSkutecnaEnergie()) {
            figurka.kaput();
            this.zbyvajiciKapacita -= figurka.getSkutecnaEnergie();
            return true;
        }
        return false;
    }
}
