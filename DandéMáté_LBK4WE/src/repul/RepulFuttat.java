
package repul;

public class RepulFuttat {
    
    public static void szamol(double távolság, Repulogep rep){
        
    }
    
    public static void main(String[] args) {
        Repulogep r1 = new Repulogep(1, "asd0", 100);
        Repulogep r2 = new Repulogep(2, "asd1", 200);
        Repulogep r3 = new Repulogep(3, "asd2", 300);
        Repulogep r4 = new Repulogep(4, "asd3", 400);
        Repulogep r5 = new Repulogep(5, "asd4", 500);
        Repuloter rt1 = new Repuloter(new Repulogep[6]);
        
        rt1.addRepulogep(r1);
        rt1.addRepulogep(r2);
        rt1.addRepulogep(r3);
        rt1.addRepulogep(r4);
        rt1.addRepulogep(r5);
        
        
        
    }
}
