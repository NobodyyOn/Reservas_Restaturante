import java.util.Scanner;

public class Registro extends Padre {
    //Arreglo de objetos de la Clase Reservas
    Reservas[] reservas = new Reservas[1000];
    Scanner sc = new Scanner(System.in);

    // ===============================================================================//

    // Objeto menu de la Clase Menu
    Menu menu = new Menu();

    // ===============================================================================//

    int cont=0;
    public Registro(){

        // Ciclo for para moverme por el arreglo de objetos
        for (int i = 0; i <reservas.length ; i++) {

            if(i==0){
                if(menu.menu()==1){  // Si es la primera reservacion del sistema hacemos uso del menu (1)
                    System.out.println("Proceso de Reservacion..");
                    // Se llaman los metodos de la Clase Menu
                    documento=menu.documento();
                    nombre=menu.nombre();
                    contacto=menu.contacto();
                    correo=menu.correo();
                    fechaReserva=menu.fechaReserva();
                    cantidad=menu.acompañantes();
                    motivo=menu.motivo();
                    tipoDecoracion=menu.tipoDecoracion();
                    reservas[i]=new Reservas(documento,nombre,contacto,correo,fechaReserva,cantidad,motivo,tipoDecoracion);
                    System.out.println("¡Gracias por realizar su reservacion!");
                    System.out.println("Su codigo de reservacion es: "+(i+1) +" Porfavor ANOTELO");
//                   System.out.println(reservas[i].getDocumento()+reservas[i].getNombre()+reservas[i].getContacto());
                    cont++;
                }
            }
            // ===============================================================================//
            // ===============================================================================//
            else{
                opcion=menu.menuPlus();     //Si ya hay por lo menos una reservacion en el sistema hacemos uso del menuPlus

                if(opcion==1){
                    System.out.println("Proceso de Reservacion..");
                    documento=menu.documento();
                    nombre=menu.nombre();
                    contacto=menu.contacto();
                    correo=menu.correo();
                    fechaReserva=menu.fechaReserva();
                    cantidad=menu.acompañantes();
                    motivo=menu.motivo();
                    tipoDecoracion=menu.tipoDecoracion();
                    reservas[i]=new Reservas(documento,nombre,contacto,correo,fechaReserva,cantidad,motivo,tipoDecoracion);
                    System.out.println("¡Gracias por realizar su reservacion!");
                    System.out.println("Su codigo de reservacion es: "+(i+1) +" Porfavor ANOTELO");
                    cont++;
                }


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==2){
                    codigoReservacion=menu.txtEliminacion();
                    if(codigoReservacion!=0) {
                        if(codigoReservacion>i){
                            System.out.println("Esta reservacion no existe ");
                        }
                        else{
                            reservas[codigoReservacion-1].setFechaReserva("x");
                            reservas[codigoReservacion-1].setDocumento(0);

                            System.out.println("Su reservacion ha sido eliminada con exito");
                        }}
                    i--;
                }


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==3){
                    codigoReservacion= menu.txtFecha();
                    if(codigoReservacion!=0) {
                        if(codigoReservacion>i){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(reservas[codigoReservacion - 1].getFechaReserva().equals("x")){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(bandera) {
                            System.out.println("Su fecha actual de reservacion es para:");
                            System.out.println(reservas[codigoReservacion - 1].getFechaReserva());
                            nuevaFecha = menu.fechaReserva_2();
                            reservas[codigoReservacion - 1].setFechaReserva(nuevaFecha);
                            System.out.println("Su fecha fue modificada con exito");
                            System.out.println("Su nueva fecha de reservacion es: " + reservas[codigoReservacion - 1].getFechaReserva());
                        }
                    }
                    i--;
                }


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==4){
                    codigoReservacion= menu.txtAcompañantes();
                    if(codigoReservacion!=0) {
                        if(codigoReservacion>i){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(reservas[codigoReservacion - 1].getFechaReserva().equals("x")){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(bandera) {
                            System.out.println("Su cantidad de acompañantes actuales es:");
                            System.out.println(reservas[codigoReservacion - 1].getCantidad());
                            cantidad = menu.acompañantes();
                            reservas[codigoReservacion - 1].setCantidad(cantidad);
                            System.out.println("La cantidad de acompañantes fue modificada con exito");
                            System.out.println("Sus acompañantes actuales son: " + reservas[codigoReservacion - 1].getCantidad());
                        }} i--; }


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==5){
                    codigoReservacion= menu.txtMotivo();
                    if(codigoReservacion!=0) {
                        if(codigoReservacion>i){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(reservas[codigoReservacion - 1].getFechaReserva().equals("x")){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(bandera){
                            System.out.println("Su peticion motivo actual es:");
                            System.out.println(reservas[codigoReservacion-1].getMotivo());
                            System.out.println("Ingrese la nueva peticion de decoracion:");
                            motivo=menu.motivo();
                            reservas[codigoReservacion-1].setMotivo(motivo);
                            System.out.println("Su motivo de reservacion fue modificado con exito");
                            System.out.println("Su motivo actual es: "+reservas[codigoReservacion-1].getMotivo());
                        } i--;}}

                // ===============================================================================//
                // ===============================================================================//

                else if(opcion==6){
                    codigoReservacion= menu.txtDecoracion();
                    if(codigoReservacion!=0) {
                        if(codigoReservacion>i){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(reservas[codigoReservacion - 1].getFechaReserva().equals("x")){
                            System.out.println("Esta reservacion no existe o fue cancelada");
                        }
                        else if(bandera){
                            System.out.println("Su peticion de decoracion actual es:");
                            System.out.println(reservas[codigoReservacion-1].getTipoDecoracion());
                            System.out.println("Ingrese la nueva peticion de decoracion:");
                            tipoDecoracion=menu.tipoDecoracion_2();
                            reservas[codigoReservacion-1].setTipoDecoracion(tipoDecoracion);
                            System.out.println("Su peticion de decoracion fue modificado con exito");
                            System.out.println("Su peticion de decoracion actual es: "+reservas[codigoReservacion-1].getTipoDecoracion());
                        } i--;}}


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==7) {
                    fechaReserva = menu.fechaReserva_2();
                    for (i = 0; i <cont; i++) {
                        if (reservas[i].getFechaReserva().equals(fechaReserva)) {
                            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
                            System.out.println("  *[El cliente " + reservas[i].getNombre() + "]                        *[Con No.Documento " + reservas[i].getDocumento() + "]\n"
                                    + "  *[Tiene una reserva ACTIVA para el :" + reservas[i].getFechaReserva()+" ]   *[No.Acompañantes "+reservas[i].getCantidad()+"]\n"
                                    + "  *[La tematica de decoracion es: "+reservas[i].getTipoDecoracion()+"]"+"     *[Su numero es: "+reservas[i].getContacto()+"]\n"
                                    + "  *[El motivo de su reservacion es: "+reservas[i].getMotivo()+"]"+"           *[Su correo es: "+reservas[i].getCorreo()+"]");
                            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════╝");
                            System.out.println(" ");
                        }
                        else if(i==cont-1){
                            if(reservas[cont-1].getFechaReserva()!=fechaReserva){
                                System.out.println("Esta reservacion no existe o fue cancelada");
                            }
                        }
                    }i--;}


                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==8){
                    System.out.println("Ingrese el CODIGO de reservacion");
                    codigoReservacion= sc.nextInt();
                    if( codigoReservacion>i){
                        System.out.println("Esta reservacion no existe o fue cancelada");
                    }
                    else if(reservas[codigoReservacion - 1].getDocumento()==0){
                        System.out.println("Esta reservacion no existe o fue cancelada");
                    }

                    else if (bandera){
                        System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
                        System.out.println("  *[El cliente " + reservas[codigoReservacion-1].getNombre() + "]                            *[Con No.Documento " + reservas[codigoReservacion-1].getDocumento() + "]\n"
                                + "  *[Tiene una reserva ACTIVA para el :" + reservas[codigoReservacion-1].getFechaReserva()+" ]    *[No.Acompañantes "+reservas[codigoReservacion-1].getCantidad()+"]\n"
                                + "  *[La tematica de decoracion es: "+reservas[codigoReservacion-1].getTipoDecoracion()+"]"+"      *[Su numero es: "+reservas[codigoReservacion-1].getContacto()+"]\n"
                                + "  *[El motivo de su reservacion es: "+reservas[codigoReservacion-1].getMotivo()+"]"+"           *[Su correo es: "+reservas[codigoReservacion-1].getCorreo()+"]");
                        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        System.out.println(" ");
                    }i--; }

                // ===============================================================================//
                // ===============================================================================//


                else if(opcion==9) {
                    documento = menu.documento();
                    for (i = 0; i <cont; i++) {
                        if (reservas[i].getDocumento()==documento) {
                            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
                            System.out.println("  *[El cliente " + reservas[i].getNombre() + "]                             *[Con No.Documento " + reservas[i].getDocumento() + "]\n"
                                    + "  *[Tiene una reserva ACTIVA para el :" + reservas[i].getFechaReserva()+" ]     *[No.Acompañantes "+reservas[i].getCantidad()+"]\n"
                                    + "  *[La tematica de decoracion es: "+reservas[i].getTipoDecoracion()+"]"+"       *[Su numero es: "+reservas[i].getContacto()+"]\n"
                                    + "  *[El motivo de su reservacion es: "+reservas[i].getMotivo()+"]"+"           *[Su correo es: "+reservas[i].getCorreo()+"]");
                            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                            System.out.println(" ");
                            System.out.println(" ");
                        }

                    }i--;} } } }

}

