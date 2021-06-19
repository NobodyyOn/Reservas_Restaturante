
import java.util.Scanner;

public class Menu extends Padre{
    Scanner sc = new Scanner(System.in);
    public int opcion=0;

    public int menu(){
        // ===============================================================================//
        //                               MENUS                                            //
        System.out.println("╔════════════════════════════════════════════════╗ ");
        System.out.println("║                     [Menu]                     ║");
        System.out.println("║ [Si desea Realizar una reservacion digite (1)] ║");
        System.out.println("║                                                ║");
        System.out.println("║  1.Realizar una Reservacion                    ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        opcion=sc.nextInt();
        return opcion;

    }
    public int menuPlus(){
        System.out.println("╔════════════════════════════════════════════╗ ");
        System.out.println("║                     [Menu]                 ║");
        System.out.println("║    [Digite la opcion que desee]            ║");
        System.out.println("║                                            ║");
        System.out.println("║  1.Realizar una Reservacion                ║");
        System.out.println("║  2.Cancelar una Reservacion                ║");
        System.out.println("║  ----------------------------------        ║");
        System.out.println("║  -Modificar la información de una reserva  ║");
        System.out.println("║  3.Fecha de la reserva                     ║");
        System.out.println("║  4.Cantidad de acompañantes                ║");
        System.out.println("║  5.Motivo de la asistencia                 ║");
        System.out.println("║  6.Decoracion de la mesa                   ║");
        System.out.println("║  ----------------------------------        ║");
        System.out.println("║  -Consultar una Reserva dada:              ║");
        System.out.println("║  7.Fecha especifica                        ║");
        System.out.println("║  8.Codigo de la reserva                    ║");
        System.out.println("║  9.Numero de documento                     ║");
        System.out.println("╚════════════════════════════════════════════╝");
        opcion=sc.nextInt();
        return opcion;
    }
    // ===============================================================================//

    //  Pedir datos de Reservacion
    public int documento(){
        System.out.println("Ingrese su Número de Documento");
        documento=sc.nextInt();
        return documento;

    }

    public int acompañantes(){
        System.out.println("Ingrese la cantidad de acompañantes");
        cantidad=sc.nextInt();
        return cantidad;
    }

    public double contacto(){
        System.out.println("Ingrese su Número de contacto");
        contacto=sc.nextDouble();
        return contacto;
    }

    public String nombre(){
        sc.nextLine();
        System.out.println("Ingrese su Nombre");
        nombre=sc.nextLine();
        return nombre;
    }

    public String correo(){
        sc.nextLine();
        System.out.println("Ingrese su Correo electrónico");
        correo=sc.nextLine();
        return correo;
    }

    public String fechaReserva(){
        System.out.println("Ingrese su Fecha de reserva (dia/mes/año)");
        System.out.println("Recuerde dia/mes/año (adjuntando / despues de cada dato -sin espacios-)" );
        fechaReserva=sc.nextLine();
        return fechaReserva;
    }

    public String motivo(){
        sc.nextLine();
        System.out.println("Ingrese el motivo de su reservacion");
        motivo=sc.nextLine();
        return motivo;
    }

    public String tipoDecoracion(){

        System.out.println("Ingrese el tipo de la decoracion que desea");
        tipoDecoracion=sc.nextLine();
        return tipoDecoracion;
    }

    public String fechaReserva_2(){
        sc.nextLine();
        System.out.println("Ingrese su Fecha de reserva (dia/mes/año)");
        System.out.println("Recuerde dia/mes/año (adjuntando / despues de cada dato -sin espacios-)" );
        fechaReserva=sc.nextLine();
        return fechaReserva;
    }

    public String tipoDecoracion_2(){
        sc.nextLine();
        System.out.println("Ingrese el tipo de la decoracion que desea");
        tipoDecoracion=sc.nextLine();
        return tipoDecoracion;
    }
    // ===============================================================================//

    // Textos de eliminacion y cambio
    public int txtEliminacion(){
        System.out.println("Esta a punto de eliminar su reservacion");
        System.out.println("¿Esta seguro de proceder?");
        System.out.println("Digite [1] para continuar..");
        System.out.println("Digite [0] para regresar..");
        auxOpcion = sc.nextInt();
        if (auxOpcion == 1) {
            System.out.println("  -Porfavor digite el CODIGO de su Reservacion:");
            codigoReservacion = sc.nextInt();
            return codigoReservacion;
        }
        else{
            return 0;
        } }

    // ===============================================================================//
    public int txtFecha() {
        sc.nextLine();
        System.out.println("Esta a punto de modificar su fecha de reservacion");
        System.out.println("¿Esta seguro de proceder?");
        System.out.println("Digite [1] para continuar..");
        System.out.println("Digite [0] para regresar..");
        auxOpcion = sc.nextInt();
        if (auxOpcion == 1) {
            System.out.println(" -Porfavor digite el CODIGO de su Reservacion:");
            codigoReservacion = sc.nextInt();
            return codigoReservacion;
        }
        else{
            return 0;
        }
    }
    // ===============================================================================//
    public int txtAcompañantes(){
        System.out.println("Esta a punto de modificar la cantidad de acompañantes");
        System.out.println("¿Esta seguro de proceder?");
        System.out.println("Digite [1] para continuar..");
        System.out.println("Digite [0] para regresar..");
        auxOpcion = sc.nextInt();
        if (auxOpcion == 1) {
            System.out.println("  -Porfavor digite el CODIGO de su Reservacion:");
            codigoReservacion = sc.nextInt();
            return codigoReservacion;
        }
        else{
            return 0;
        }
    }
    // ===============================================================================//
    public int txtMotivo(){
        System.out.println("Esta a punto de modificar el motivo de su aistencia");
        System.out.println("¿Esta seguro de proceder?");
        System.out.println("Digite [1] para continuar..");
        System.out.println("Digite [0] para regresar..");
        auxOpcion = sc.nextInt();
        if (auxOpcion == 1) {
            System.out.println("  -Porfavor digite el CODIGO de su Reservacion:");
            codigoReservacion = sc.nextInt();
            return codigoReservacion;
        }
        else{
            return 0;
        }
    }
    // ===============================================================================//
    public int txtDecoracion(){
        System.out.println("Esta a punto de modificar la peticion de decoracion de su reservacion");
        System.out.println("¿Esta seguro de proceder?");
        System.out.println("Digite [1] para continuar..");
        System.out.println("Digite [0] para regresar..");
        auxOpcion = sc.nextInt();
        if (auxOpcion == 1) {
            System.out.println("  -Porfavor digite el CODIGO de su Reservacion:");
            codigoReservacion = sc.nextInt();
            return codigoReservacion;
        }
        else{
            return 0;
        }
    }
    // ===============================================================================//

}
