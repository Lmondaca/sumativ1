/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumativa1;

/**
 *
 * @author Lucas
 */
public class Cuentas {
    private int numSocio;
    private int valorCuota;
    private int cantAportada;

    public Cuentas() {
    }

    public Cuentas(int numSocio, int valorCuota, int cantAportada) {
        this.numSocio = numSocio;
        this.valorCuota = valorCuota;
        this.cantAportada = cantAportada;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public int getCantAportada() {
        return cantAportada;
    }

    public void setCantAportada(int cantAportada) {
        this.cantAportada = cantAportada;
    }
    
    
    
    
}
