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
public class VirtuelniServer {
    private int procesor;
    private int ram;
    private int diskovi;
    private int bandwidth;
    private String operativni;
    private float cena;
    private Date datumPocetka;
    private Date datumKraja;

    public VirtuelniServer(int procesor, int ram, int diskovi, int bandwidth, String operativni, float cena, Date datumPocetka, Date datumKraja) {
        this.procesor = procesor;
        this.ram = ram;
        this.diskovi = diskovi;
        this.bandwidth = bandwidth;
        this.operativni = operativni;
        this.cena = cena;
        this.datumPocetka = datumPocetka;
        this.datumKraja = datumKraja;
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

    public String getOperativni() {
        return operativni;
    }

    public void setOperativni(String operativni) {
        this.operativni = operativni;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    
    

}
