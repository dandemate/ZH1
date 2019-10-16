
package Feladat_2;

import java.util.Arrays;
import java.util.Scanner;

public class Teszt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = Integer.parseInt(sc.nextLine());
        
        Mozi[] m = new Mozi[n];
        
        String[] sor;
        for(int i=0; i<n; i++){
            sor = sc.nextLine().split(";");
            
            m[i] = new Mozi(sor[0], Integer.parseInt(sor[1]), sor[2], Integer.parseInt(sor[3]), Integer.parseInt(sor[4]));
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(m[i].getNyereseg()>m[j].getNyereseg()){
                    Mozi tmp = m[i];
                    m[i] = m[j];
                    m[j] = tmp;
                }
                else if(m[i].getNyereseg()==m[j].getNyereseg()){
                    if(m[i].getEv()>m[j].getEv()){
                        Mozi tmp = m[i];
                        m[i] = m[j];
                        m[j] = tmp;
                    }
                    else if(m[i].getEv()==m[j].getEv()){
                        if(m[i].getBevetel()>m[j].getBevetel()){
                            Mozi tmp = m[i];
                            m[i] = m[j];
                            m[j] = tmp;
                        }
                        else if(m[i].getBevetel()==m[j].getBevetel()){
                            if(m[i].getFilmcim().compareTo(m[j].getFilmcim())==1){
                                Mozi tmp = m[i];
                                m[i] = m[j];
                                m[j] = tmp;
                            }
                        }
                    }
                }
            }
        }
        
        for (Mozi e : m) {
            System.out.println(e.toString());
        }
        
        
        
    }
}
