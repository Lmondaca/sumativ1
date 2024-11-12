/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumativa1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Sumativa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        boolean flag1=true;
        Socios socio =null;
        while(flag1){
            System.out.println("Ingrese el número de la operación según el siguiente menú: ");
            System.out.println("1. Registrar Socio. ");
            System.out.println("2. Ver datos del Socio. ");
            System.out.println("3. Cancelar Cuota. ");
            System.out.println("4. Consultar cuota cancelada. ");
            System.out.println("5. Consultar Total de cuotas pagadas por el socio. ");
            System.out.println("6. Salir del programa. ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                if (opcion == 1) {
                    System.out.println("Ingrese numero de socio. ");
                    int numSocio =Integer.parseInt(scanner.nextLine());
                    String rut= scanner.nextLine();
                    if (!validarRut(rut)){
                        System.out.println("Ingrese rut valido ");
                        continue;
                    }
                    String nombre =scanner.nextLine();
                    String appPaterno= scanner.nextLine();
                    String appMaterno =scanner.nextLine();
                    String correo = scanner.nextLine();
                    String domicilio =scanner.nextLine();
                    String region = scanner.nextLine();
                    String ciudad = scanner.nextLine();
                    String comuna = scanner.nextLine();
                    String telefono= scanner.nextLine();
                    Cuentas cuenta = new Cuentas(numSocio,5000, 0);
                    socio = new Socios(numSocio, rut, nombre, appPaterno, appMaterno, correo, domicilio, region, ciudad, comuna, telefono, cuenta);
                    
                    
                }
                else if( opcion==2){
                    if(socio==null){
                        System.out.println("Registre un socio para ver sus datos.");
                        continue;
                    }
                    socio.verDatos();
                    
                }
                else if (opcion == 3) {
                    if (socio == null) {
                        System.out.println("Registre un socio para cancelar cuota.");
                        continue;
                    }
                    try {
                        int montoCancelar = Integer.parseInt(scanner.nextLine());
                        socio.cancelarCuota(montoCancelar);
                    } catch (Exception e) {
                        System.out.println("Ingrese monto válido.");
                    }

                }
                else if(opcion ==4){
                    if (socio == null) {
                        System.out.println("Registre un socio para consultar cuota cancelada.");
                        continue;
                    }
                    socio.consultarCuota();
                    
                    
                }
                else if(opcion ==5){
                    if (socio == null) {
                        System.out.println("Registre un socio para consultar total de cuotas pagadas.");
                        continue;
                    }
                    socio.consultarTotales();
                    
                }
                else if(opcion==6){
                    flag1= false;
                    
                }
                
                else{
                System.out.println("Ingrese una opcion de entre las mostradas.");
            }
            } catch (Exception e) {
                System.out.println("Ingrese una opción valida. ");
            }

            

        }
        scanner.close();
    }
    public static boolean validarRut(String rut){
        if(rut.length() <11 || rut.length()>12 ){
            return false;
        }
        if(rut.charAt(rut.length()-2)!='-'){
            return false;
        }
        return true;
    }
    
}
