/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Uros
 */
public class FizickiServer {
    private int procesor;
    private int ram;
    private int diskovi;
    private int bandwidth;
    private float cena;
    private Date datumKupovanja;

    public Date getDatumKupovanja() {
        return datumKupovanja;
    }

    public void setDatumKupovanja(Date datumKupovanja) {
        this.datumKupovanja = datumKupovanja;
    }

    public FizickiServer(int procesor, int ram, int diskovi, int bandwidth, float cena) {
        this.procesor = procesor;
        this.ram = ram;
        this.diskovi = diskovi;
        this.bandwidth = bandwidth;
        this.cena = cena;
        this.datumKupovanja = new Date();
    }

    public int getProcesor() {
        return procesor;
    }

    public void setProcesor(int procesor) {
        this.procesor = procesor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiskovi() {
        return diskovi;
    }

    public void setDiskovi(int diskovi) {
        this.diskovi = diskovi;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
}
