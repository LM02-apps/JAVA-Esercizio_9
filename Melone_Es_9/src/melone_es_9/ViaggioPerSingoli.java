/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_es_9;

/**
 *
 * @author 4BIA
 */
public class ViaggioPerSingoli extends Viaggio {

   
    
   public ViaggioPerSingoli(String titolo, double costo) {
        super(titolo, costo);
    }
    
    public double PrezzoViaggioSingoli(Viaggio x)
    {
        double prezzosingoli=0;
        
        prezzosingoli=x.costo+(x.listagiorni.size()*quotafissagiornaliera);
        return prezzosingoli;
        
    }
    
    
}
