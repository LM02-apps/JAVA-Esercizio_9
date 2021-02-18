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
       
        Vector<Giorno> listagiorni=new Vector<>();
        listagiorni.addElement(g1);
        listagiorni.addElement(g2);
       
        ViaggioPerSingoli v1=new ViaggioPerSingoli("prova",20);
        ViaggioPerGruppi v2=new ViaggioPerGruppi("prova2",35);
       
       
        Vector<Viaggio>listaviaggi=new Vector<>();
        listaviaggi.addElement(v1);
        listaviaggi.addElement(v2);
       
        v1.PrezzoViaggioSingoli(v1);
       //LISTA GIORNI VIENE INIZIALIZZATA A 0, RISOLVERE
       //IL SIZE DI LISTAGIORNI TORNA UN PARAMETRO CORRETTO
        System.out.println(listagiorni.size());
        
       //AGGIUNTA GIORNO E VIAGGIO OK
       //RIMOZIONE GIORNO E VIAGGIO OK
       
       
      

    }
    
}
