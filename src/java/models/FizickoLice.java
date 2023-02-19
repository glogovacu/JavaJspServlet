/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Uros
 */
public class FizickoLice {
    private int id;
    private String ime;
    private String prezime;
    private String adresa;
    private ArrayList<VirtuelniServer> virtuelniServer;
    private ArrayList<FizickiServer> fizickiServer;
    
    public double ukupnaCenaFizicki(){
        if(fizickiServer.isEmpty() )
        {
            return 0;
        }
        int cena = 0;
        for(FizickiServer fs:fizickiServer)
        {
            cena +=fs.getCena();
        }
        return cena;
    }
    public double ukupnaCenaVirtuelna(){
        if(fizickiServer.isEmpty() )
        {
            return 0;
        }
        int cena = 0;
        for(VirtuelniServer vs:virtuelniServer)
        {
            
        }
        return cena;
    }

    public ArrayList<VirtuelniServer> getVirtuelniServer() {
        return virtuelniServer;
    }

    public void setVirtuelniServer(ArrayList<VirtuelniServer> virtuelniServer) {
        this.virtuelniServer = virtuelniServer;
    }

    public ArrayList<FizickiServer> getFizickiServer() {
        return fizickiServer;
    }

    public void setFizickiServer(ArrayList<FizickiServer> fizickiServer) {
        this.fizickiServer = fizickiServer;
    }

    public FizickoLice(int id,String ime, String prezime, String adresa) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.virtuelniServer = new ArrayList<>();
        this.fizickiServer = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    
    
}
