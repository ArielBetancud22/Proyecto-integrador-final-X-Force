//Menu logico del conversor de temperatura
package app.xforce.integradorjava;
        
import java.util.Scanner;

public class MenuConverTempLogico {
    
    private Scanner entrada = new Scanner(System.in);
    
    private MenuConversorDeTemperaturaGrafico menuConversorDeTemperaturaGrafico = new MenuConversorDeTemperaturaGrafico();
   
    public MenuConverTempLogico(){
    }
    
    public void menuConvtempLogico(){
        
        while (true) {            
            menuConversorDeTemperaturaGrafico.menuConversorDeTemperaturaGrafico();
            
            try {
                Integer opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 1) {
                    
                }else if (opcion == 2){
                    
                }else if (opcion == 3){
                    
                }else if (opcion == 4){
                    
                }else if (opcion == 5){
                    
                }else if (opcion == 6){
                    
                }else if (opcion == 7){
                    break;
                }else {
                    menuConversorDeTemperaturaGrafico.errorNumeroIncorrecto(opcion);
                }
            } catch (Exception e) {
                menuConversorDeTemperaturaGrafico.errorNoNumero();
            }
            
        }
    }

    
}
