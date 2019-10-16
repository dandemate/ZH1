
package Feladat_2;

public class Mozi {
    private String filmcim;
    private int ev;
    private String rendezo;
    private int koltseg;
    private int bevetel;
    private int nyereseg;

    public Mozi(String filmcim, int ev, String rendezo, int koltseg, int bevetel) {
        this.filmcim = filmcim;
        this.ev = ev;
        this.rendezo = rendezo;
        this.koltseg = koltseg;
        this.bevetel = bevetel;
        this.nyereseg = bevetel-koltseg;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public void setFilmcim(String filmcim) {
        this.filmcim = filmcim;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public String getRendezo() {
        return rendezo;
    }

    public void setRendezo(String rendezo) {
        this.rendezo = rendezo;
    }

    public int getKoltseg() {
        return koltseg;
    }

    public void setKoltseg(int koltseg) {
        this.koltseg = koltseg;
    }

    public int getBevetel() {
        return bevetel;
    }

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }

    public int getNyereseg() {
        return nyereseg;
    }
    
    
    
    @Override
    public String toString() {
        return "Mozi{" + "filmcim=" + filmcim + ", ev=" + ev + ", rendezo=" + rendezo + ", koltseg=" + koltseg + ", bevetel=" + bevetel + '}';
    }
    
    
}
