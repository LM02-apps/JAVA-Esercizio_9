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
public abstract class Viaggio 
{
    public String titolo;
    public double costo;
    public Vector<Giorno> listagiorni;
    static double quotafissagiornaliera=25;

    public Viaggio(String titolo, double costo) {
        this.titolo = titolo;
        this.costo = costo;
        listagiorni=new Vector<Giorno>();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Vector<Giorno> getListagiorni() {
        return listagiorni;
    }

    public void setListagiorni(Vector<Giorno> listagiorni) {
        this.listagiorni = listagiorni;
    }

    public static double getQuotafissagiornaliera() {
        return quotafissagiornaliera;
    }

    public static void setQuotafissagiornaliera(double quotafissagiornaliera) {
        Viaggio.quotafissagiornaliera = quotafissagiornaliera;
    }


    public String toString() {
        String viaggio="Viaggio{" + "titolo=" + titolo + ", costo=" + costo + ", listagiorni=" + listagiorni + '}';
        return viaggio;
    }
   
        public boolean equals(Viaggio v){
        if(titolo.equals(v.titolo) && costo==v.costo && listagiorni.equals(v.listagiorni) && quotafissagiornaliera==v.quotafissagiornaliera)
            return true;
        else
            return false;
    }
        
    public void AddGiorno(Giorno i)
    {
          listagiorni.addElement(i);
    }
    
    public void RemoveGiorno(Giorno i)
    {
        listagiorni.removeElement(i);
    }
    
    public abstract double Prezzo();

    
    
}
