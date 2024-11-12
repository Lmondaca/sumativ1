/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumativa1;

/**
 *
 * @author Lucas
 */
public class Socios {
    private int socio;
    private String rut;
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String correo;
    private String domicilio;
    private String region;
    private String ciudad;
    private String comuna;
    private String numTelefono;
    private Cuentas cuenta;

    public Socios() {
    }

    public Socios(int socio, String rut, String nombre, String appPaterno, String appMaterno, String correo, String domicilio, String region, String ciudad, String comuna, String numTelefono, Cuentas cuenta) {
        this.socio = socio;
        this.rut = rut;
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.correo = correo;
        this.domicilio = domicilio;
        this.region = region;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.numTelefono = numTelefono;
        this.cuenta = cuenta;
    }

    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
    
    public void verDatos(){
        System.out.println("estoy aqui");
        
    }
    public void cancelarCuota(int valorCancela){
        
    }
    public void consultarCuota(){
        
    }
    public void consultarTotales(){
        
    }
}
