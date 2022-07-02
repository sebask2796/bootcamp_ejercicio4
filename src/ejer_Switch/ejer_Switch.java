package ejer_Switch;

/**
 *
 * @author sebas
 */
public class ejer_Switch {

    
    public static void main(String[] args) {
    
        var numeromes = 3;
        var estacion = "";  
        
        switch(numeromes = 7){
            case 1,3 :
                estacion = "primavera";
                System.out.print("es primavera");
                break;
            case 4,6 :
                estacion= "verano";
                System.out.print("es verano");
                break;
            case 7,9:
                estacion = "otono";
                System.out.print("es otoño");
                break;
            case 10,12:
                estacion = "invierno";
                System.out.print("es invierno");
                break;    
            default:
                 System.out.print("esta no es la estacion correcta");
        } 
    }
}
