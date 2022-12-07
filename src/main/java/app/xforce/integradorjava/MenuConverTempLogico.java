//Menu logico del conversor de temperatura
package app.xforce.integradorjava;
        
import app.xforce.integradorjava.operaciones.convTemperatura.GradosCaF;
import app.xforce.integradorjava.operaciones.convTemperatura.GradosCaK;
import app.xforce.integradorjava.operaciones.convTemperatura.GradosFaC;
import app.xforce.integradorjava.operaciones.convTemperatura.GradosFaR;
import app.xforce.integradorjava.operaciones.convTemperatura.GradosKaC;
import app.xforce.integradorjava.operaciones.convTemperatura.GradosRaF;
import java.util.Scanner;

public class MenuConverTempLogico {
    
    private Scanner entrada = new Scanner(System.in);
    
    private TextoDelConversor textoDelConversor = new TextoDelConversor();
    
    private MenuConversorDeTemperaturaGrafico menuConversorDeTemperaturaGrafico = new MenuConversorDeTemperaturaGrafico();
    
    private GradosCaF gradosCaF = new GradosCaF();
    
    private GradosCaK gradosCaK = new GradosCaK();
    
    private GradosFaC gradosFaC = new GradosFaC();
    
    private GradosFaR gradosFaR = new GradosFaR();
    
    private GradosKaC gradosKaC = new GradosKaC();
    
    private GradosRaF gradosRaF = new GradosRaF();
    
    
   
    public MenuConverTempLogico(){
    }
    
    public void menuConvtempLogico(){
        
        while (true) {            
            
            menuConversorDeTemperaturaGrafico.menuGraficoConversor();
            try {
                Integer opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 1) {//Grados Celcius a kelvin
                    this.textoDelConversor.TextoDconversor();
                    this.gradosCaK.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosCaK.gradosCak());
                }else if (opcion == 2){//Grados Kelvin a Celsius
                    this.textoDelConversor.TextoDconversor();
                    this.gradosKaC.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosKaC.gradosKaC());
                }else if (opcion == 3){//Fahrenheit a Rankine
                    this.textoDelConversor.TextoDconversor();
                    this.gradosFaR.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosFaR.gradosFaR());
                }else if (opcion == 4){//Rankine a Fahrenheit
                    this.textoDelConversor.TextoDconversor();
                    this.gradosRaF.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosRaF.gradosRaF());
                }else if (opcion == 5){//Grados Celsius a Fahrenheit
                    this.textoDelConversor.TextoDconversor();
                    this.gradosCaF.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosCaF.gradosCaF());
                }else if (opcion == 6){//Fahrenheit a Celsius
                    this.textoDelConversor.TextoDconversor();
                    this.gradosFaC.setGradosIngresados(Float.parseFloat(entrada.nextLine()));
                    this.textoDelConversor.SalidaDconversor(this.gradosFaC.gradosFaC());
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
