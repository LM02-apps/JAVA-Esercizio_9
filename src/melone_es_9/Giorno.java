/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_es_9;

import java.util.Objects;

/**
 *
 * @author 4BIA
 */
public class Giorno 
{
    public int numeroordine;
    public String nomeluogo;
    public String descrizione;

    public Giorno(int numeroordine, String nomeluogo, String descrizione) {
        this.numeroordine = numeroordine;
        this.nomeluogo = nomeluogo;
        this.descrizione = descrizione;
    }

    public int getNumeroordine() {
        return numeroordine;
    }

    public void setNumeroordine(int numeroordine) {
        this.numeroordine = numeroordine;
    }

    public String getNomeluogo() {
        return nomeluogo;
    }

    public void setNomeluogo(String nomeluogo) {
        this.nomeluogo = nomeluogo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public String toString() {
        String giorno="Giorno{" + "numeroordine=" + numeroordine + ", nomeluogo=" + nomeluogo + ", descrizione=" + descrizione + '}';
        return giorno;
    }


    public boolean equals(Giorno g){
        if(numeroordine==g.numeroordine && nomeluogo.equals(g.nomeluogo) && descrizione.equals(g.descrizione))
            return true;
        else
            return false;
    }

    
    
}
