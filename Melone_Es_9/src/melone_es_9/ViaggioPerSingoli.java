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
public class ViaggioPerSingoli extends Viaggio {

    public ViaggioPerSingoli(String titolo, double costo) {
        super(titolo, costo);

    }

    public double Prezzo() 

    {
        double prezzosingoli = 0;
        prezzosingoli = costo + (listagiorni.size() * quotafissagiornaliera);
        //LISTA GIORNI VIEN INIZIALIZZATA A 0, RISOLVERE
        
        return prezzosingoli;

    }

}
