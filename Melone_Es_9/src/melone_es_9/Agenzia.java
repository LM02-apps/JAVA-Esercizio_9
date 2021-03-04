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
    
    public void CalcoloViaggio(Viaggio x)
    {
            if (x instanceof ViaggioPerSingoli)
            {
                
                ViaggioPerSingoli vps=new ViaggioPerSingoli("",0);
                vps=(ViaggioPerSingoli)x;
                System.out.println("prezzosingolo: "+vps.Prezzo());
                
            }
            else
            {
                ViaggioPerGruppi vpg=new ViaggioPerGruppi("",0,0);
                vpg=(ViaggioPerGruppi)x;
                System.out.println("prezzogruppi: "+vpg.Prezzo());
            }
        
    }
    public void ListaViaggi()
    {
        Vector<Viaggio> viaggi=new Vector <Viaggio>();
        
        for (int i=0; i<listaviaggi.size();i++)
        {
            if (listaviaggi.get(i))
        }
        
    }
    
    
}
