/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_es_9;

import java.util.Vector;

/**
 *
 * @author 4BIA
 */
public class Melone_Es_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Giorno g1=new Giorno(3,"Roma","Terme di Caracalla, Musei capitolini, Catacombe");
        Giorno g2=new Giorno(4,"Firenze","Santa Maria Novella");
        Giorno g3=new Giorno(5,"Firenze","Sorgane");
        Giorno g4=new Giorno(6,"Firenze","Campi Bisenzio");
        Giorno g5=new Giorno(7,"Firenze","Novoli");
        
        ViaggioPerSingoli v1=new ViaggioPerSingoli("singolo",20);
        ViaggioPerGruppi v2=new ViaggioPerGruppi("gruppi",120,30);
        Agenzia a1=new Agenzia("acegamer");
       
        v2.AddGiorno(g1);
        v2.AddGiorno(g2);
        v2.AddGiorno(g3);
        v2.AddGiorno(g4);
        v2.AddGiorno(g5);
        
        a1.addViaggio(v1);
        a1.addViaggio(v2);
        
        a1.CalcoloViaggio(v1);
        a1.CalcoloViaggio(v2);
       //LISTA GIORNI VIENE INIZIALIZZATA A 0, RISOLVERE
       //IL SIZE DI LISTAGIORNI TORNA UN PARAMETRO CORRETTO
        
       //AGGIUNTA GIORNO E VIAGGIO OK
       //RIMOZIONE GIORNO E VIAGGIO OK
       
       
      

    }
    
}
