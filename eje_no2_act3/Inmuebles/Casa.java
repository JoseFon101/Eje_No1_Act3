/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author user
 */
public class Casa extends InmuebleVivienda{
    protected int númeroPisos; 

    public Casa(int identificadorInmobiliario, int área, String dirección,int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        super(identificadorInmobiliario, área, dirección, 
        númeroHabitaciones, númeroBaños);
        this.númeroPisos = númeroPisos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos = " + númeroPisos);
    }
}
