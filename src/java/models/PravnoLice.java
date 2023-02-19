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
public class PravnoLice {
    private int id;
    private String naziv;
    private String sediste;
    private String imePrezime;
    private ArrayList<VirtuelniServer> virtuelniServer;
    private ArrayList<FizickiServer> fizickiServer;

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

    public PravnoLice(int id, String naziv, String sediste, String imePrezime) {
        this.id = id;
        this.naziv = naziv;
        this.sediste = sediste;
        this.imePrezime = imePrezime;
        this.virtuelniServer = new ArrayList<>();
        this.fizickiServer = new ArrayList<>();
    }
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSediste() {
        return sediste;
    }

    public void setSediste(String sediste) {
        this.sediste = sediste;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    
    
}
