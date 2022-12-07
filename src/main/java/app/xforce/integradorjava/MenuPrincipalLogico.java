
package app.xforce.integradorjava;

import java.util.Scanner;

public class MenuPrincipalLogico {
    
    private Scanner entrada = new Scanner(System.in);
    
    private MenuPrincipalGrafico menuPrincipalGrafico = new MenuPrincipalGrafico();
    
    private MenuCalculadoraLogico menuCalculadoraLogico = new MenuCalculadoraLogico();
    
    private MenuConverTempLogico menuConverTempLogico = new MenuConverTempLogico();
    
    public MenuPrincipalLogico() {
    }
    
    public void menuPrincipalLogico(){
        
        
        while (true) {
            
            menuPrincipalGrafico.menuPrincipalGrafico();
            
            try {
                menuPrincipalGrafico.ingresarOpcion();
                Integer opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 1){
                    
                    menuCalculadoraLogico.menuCalculadoraLogico();
                } else if( opcion == 2 ){

                } else if(opcion  == 3 ){
                    
                    menuConverTempLogico.menuConvtempLogico();
                } else if(opcion  == 4 ){
                    break;
                } else {
                    menuPrincipalGrafico.errorNumeroIncorrecto(opcion);
                }  
            } catch (Exception e) {
                menuPrincipalGrafico.errorNoNumero();
            }
            
        
                    
        }
        
    }
}
