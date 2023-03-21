/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
import java.text.DecimalFormat;
/**
 *
 * @author samue
 */
public class Naves {
DecimalFormat df = new DecimalFormat("#.00");
    
    public String tipoNave;
    public int cantidadPasajeros;
    public double cantidadParsec;
    public double consumoCombustible;
    public int cantidadDeNaves;

    public Naves() {
    }

    public Naves(String tipoNave, int cantidadPasajeros, double consumoCombustible, int cantidadDeNaves) {
        this.tipoNave = tipoNave;
        this.cantidadPasajeros = cantidadPasajeros;
        this.consumoCombustible = consumoCombustible;
        this.cantidadDeNaves = cantidadDeNaves;
    }

    public double getCantidadParsec() {
        return cantidadParsec;
    }

    public void setCantidadParsec(double cantidadParsec) {
        this.cantidadParsec = cantidadParsec;
    } 
    
    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getCantidadDeNaves() {
        return cantidadDeNaves;
    }

    public void setCantidadDeNaves(int cantidadDeNaves) {
        this.cantidadDeNaves = cantidadDeNaves;
    }
    
    public String combustibleTotalNecesario(double totalParsec, int cantNaves, int cantPasajeros){
        double total = totalParsec * cantNaves * cantPasajeros;
        return df.format(total);
    }  
    
    
    
}
