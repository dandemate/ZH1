
package repul;

import java.util.Objects;

public class Repulogep {
    private int ferohely;
    private String tipus;
    private int maxSebesseg;

    public Repulogep(int ferohely, String tipus, int maxSebesseg) {
        this.ferohely = ferohely;
        this.tipus = tipus;
        this.maxSebesseg = maxSebesseg;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public String toString() {
        return "Repulogep{" + "ferohely=" + ferohely + ", tipus=" + tipus + ", maxSebesseg=" + maxSebesseg + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Repulogep other = (Repulogep) obj;
        if (this.ferohely != other.ferohely) {
            return false;
        }
        if (this.maxSebesseg != other.maxSebesseg) {
            return false;
        }
        if (!Objects.equals(this.tipus, other.tipus)) {
            return false;
        }
        return true;
    }
    
    
}
