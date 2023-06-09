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
public class DestructorEstelar extends Naves {
DecimalFormat df = new DecimalFormat("#.00");
    public DestructorEstelar() {
    }

    public DestructorEstelar(String tipoNave, int cantidadPasajeros, double consumoCombustible, int cantidadDeNaves) {
        super(tipoNave, cantidadPasajeros, consumoCombustible, cantidadDeNaves);
    }

   public String combustibleTotalNecesario(double totalParsec, int cantNaves, int cantPasajeros){
        double total = totalParsec * cantNaves * cantPasajeros;
        return df.format(total);
    } 

}
