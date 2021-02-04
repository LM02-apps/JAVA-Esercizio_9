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
public class Agenzia 
{
    public String nomeagenzia;
  //  ArrayList<Viaggio> viaggio;
    public Vector <Viaggio> listaviaggi;
    
    public Agenzia(String nomeagenzia) {
        this.nomeagenzia = nomeagenzia;
        listaviaggi=new Vector <Viaggio>();
    }

    public String getNomeagenzia() {
        return nomeagenzia;
    }

    public void setNomeagenzia(String nomeagenzia) {
        this.nomeagenzia = nomeagenzia;
    }

    public Vector<Viaggio> getListaviaggi() {
        return listaviaggi;
    }

    public void setListaviaggi(Vector<Viaggio> listaviaggi) {
        this.listaviaggi = listaviaggi;
    }

 

    
    public String toString() {
        String agenzia="Agenzia{" + "nomeagenzia=" + nomeagenzia + ", viaggio=" + listaviaggi + '}';
        return agenzia;
    }

    public void addViaggio(Viaggio i)
    {
        listaviaggi.addElement(i);
    }
    
    public void removeViaggio(Viaggio i)
    {
        listaviaggi.removeElement(i);
    }
    
    
}
