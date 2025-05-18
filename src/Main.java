import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        Auto AutoD = new Auto();
        System.out.println("AutoDefecto = " + AutoD);


        for( int i =1; i<= 3; i ++){
            System.out.println("ingrese datos para el auto "+i+ ":");
            System.out.println("Matricula: ");
            String Matricula = gato.nextLine();
            System.out.println("Color: ");
            String Color = gato.nextLine();
            System.out.println("Marca: ");
            String Marca = gato.nextLine();
            System.out.println("Modelo: ");
            String Modelo = gato.nextLine();
            System.out.println("Cant Puertas: ");
            String Puertas =gato.nextLine();
            System.out.println("Año: ");
            int Anio = Integer.parseInt(gato.nextLine());
            System.out.println("El auto esta a la venta ,Si/No?: ");
            String Venta = gato.nextLine();
            System.out.println("El necesita una revision ,Si/No?: ");
            String Revision = gato.nextLine();
            System.out.println("Cilindrada del motor: ");
            int Cilindrada = Integer.parseInt(gato.nextLine());
            //seleccion de combustibles ya predeterminados
            System.out.println("Seleccione el tipo de combustible:");
            System.out.println("1. Nafta");
            System.out.println("2. Gasoil");
            System.out.println("3. Eléctrico");
            System.out.println("4. Híbrido");
            String tipoCombustible = "";

            int opcionCombustible = Integer.parseInt(gato.nextLine());
            if (opcionCombustible == 1) {
                tipoCombustible = "Nafta";
            } else if (opcionCombustible == 2) {
                tipoCombustible = "Gasoil";
            } else if (opcionCombustible == 3) {
                tipoCombustible = "Eléctrico";
            } else if (opcionCombustible == 4) {
                tipoCombustible = "Híbrido";
            } else {
                tipoCombustible = "Desconocido";
                System.out.println("Tipo no reconocido, se registró como 'Desconocido'");
            }

            Motor motor = new Motor(Cilindrada,tipoCombustible);
            Auto AutoU = new Auto(Matricula, Color, Marca, Modelo, Puertas, Anio, Venta, Revision, motor);

            if (i == 1) {
                //motor gasoil asignado al auto 2
                Motor motorGasoil = new Motor(1600, "Gasoil");
                AutoU.setMotor(motorGasoil);
                System.out.println("Se asignó un motor a gasoil al auto " + i);
            }
            if(i == 2){
                AutoU.pintarDeVerde();
                System.out.println("el auto "+i+" ha sido pintado de verde");
            }
            if (AutoU.pagaPatente()) {
                System.out.println("El auto " + i + " DEBE pagar patente.");
            } else {
                System.out.println("El auto " + i + " NO paga patente.");
            }
            System.out.println("se han creado " +Auto.getCantidadAutos() +" Autos");
            System.out.println("Auto = " +i+ AutoU);
        }
    }
}