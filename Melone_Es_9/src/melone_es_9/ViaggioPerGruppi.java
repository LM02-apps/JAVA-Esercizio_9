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
    public int passeggeri;
    public ViaggioPerGruppi(String titolo, double costo, int passeggeri) {
        super(titolo, costo);
        this.passeggeri=passeggeri;
    }
    
        public double Prezzo()
    {
        double prezzogruppi=0;
        
        prezzogruppi=costo+(listagiorni.size()*quotafissagiornaliera)+(quotagruppo*passeggeri);
        return prezzogruppi;
        
    }
}
