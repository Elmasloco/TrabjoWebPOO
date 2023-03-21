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
public class Supremacy extends Naves{
DecimalFormat df = new DecimalFormat("#.00");

    public Supremacy() {
    }

    public Supremacy(String tipoNave, int cantidadPasajeros, double consumoCombustible, int cantidadDeNaves) {
        super(tipoNave, cantidadPasajeros, consumoCombustible, cantidadDeNaves);
    }
    
    @Override
   public String combustibleTotalNecesario(double totalParsec, int cantNaves, int cantPasajeros){
        double total = totalParsec * cantNaves * cantPasajeros * 0.1;
        return df.format(total);
    } 
    
    
}
