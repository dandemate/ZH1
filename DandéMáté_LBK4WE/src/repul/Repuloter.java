
package repul;

public class Repuloter {
    private Repulogep[] repulo;
    private int szamlalo;

    public Repuloter(Repulogep[] repulo) {
        this.repulo = repulo;
        this.szamlalo = 0;
    }

    public Repulogep[] getRepulo() {
        return repulo;
    }

    public void setRepulo(Repulogep[] repulo) {
        this.repulo = repulo;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo() {
        this.szamlalo++;
    }
    
    
    
    public boolean addRepulogep(Repulogep r){
        if(this.szamlalo==getRepulo().length)
            return false;
        else{
            
            this.setSzamlalo();
            
            this.repulo[this.getSzamlalo()] = r;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Repuloter{" + "repulo=" + repulo + ", szamlalo=" + szamlalo + '}';
    }
    
    
}
