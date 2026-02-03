import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {

        double valorBaseConsumo;
        double impuestoConsumo;
        double propina;
        double totalPagar;
        String opcionPropina; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Bienvenido al sistema de facturación del restaurante TRADICION LLANERA");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Por favor, ingrese el valor base del consumo: $ ");
        valorBaseConsumo = scanner.nextDouble();

        // Cálculo del impuesto de consumo (8%)
        impuestoConsumo = valorBaseConsumo * 0.08;

        System.out.println("¿Desea incluir  propina? (SI/NO):");
        opcionPropina = scanner.next();

        // Cálculo de la propina (5%) 
        if (opcionPropina.equalsIgnoreCase("SI")) {
            propina = valorBaseConsumo * 0.05;
        } else {
            propina = 0; 
        }

        // Cálculo del total a pagar
        totalPagar = valorBaseConsumo + impuestoConsumo + propina;

        //Factura
        System.out.println("---------------------------------------------------");
        System.out.println("        FACTURA DE PAGO  -  TRADICION LLANERA      ");
        System.out.println("---------------------------------------------------");
        System.out.println("Valor base del consumo: $ " + valorBaseConsumo);
        System.out.println("Impuesto de consumo: $ " + impuestoConsumo);
        System.out.println("Propina: $ " + propina);
        System.out.println("Total a pagar: $ " + totalPagar);
        System.out.println("---------------------------------------------------");
       
        

    }
    
  
}