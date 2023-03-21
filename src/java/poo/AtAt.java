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
public class AtAt extends Naves{
DecimalFormat df = new DecimalFormat("#.00");
    
    public AtAt() {
    }

    public AtAt(String tipoNave, int cantidadPasajeros, double consumoCombustible, int cantidadDeNaves) {
        super(tipoNave, cantidadPasajeros, consumoCombustible, cantidadDeNaves);
    }
    
    @Override
    public String combustibleTotalNecesario(double totalParsec){ 
        double total, temp;
        temp = (totalParsec * cantidadDeNaves * cantidadPasajeros) * 0.25;
        total = temp - totalParsec;
        return df.format(total);
    } 
    
}
