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
public class ViaggioPerGruppi extends Viaggio 
{
    static double quotagruppo=4;

    public ViaggioPerGruppi(String titolo, double costo) {
        super(titolo, costo);
    }
    
        public double PrezzoViaggioGruppi(Viaggio x)
    {
        double prezzogruppi=0;
        
        prezzogruppi=x.costo+(x.listagiorni.size()*quotafissagiornaliera)+quotagruppo;
        return prezzogruppi;
        
    }
}
