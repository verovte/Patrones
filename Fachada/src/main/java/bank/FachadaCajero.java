package bank;

import java.io.IOException;

/**
 *
 * @author verovte
 */
public class FachadaCajero{

    private Autentificacion autentificacion = new Autentificacion();

    private Cajero cajero = new Cajero();

    private Cuenta cuenta = null;

    public void introducirCredenciales() throws IOException{

        boolean tarjeta_correcta = autentificacion.leerTarjeta(); 
        
        if(tarjeta_correcta){
            String clave = autentificacion.introducirClave();
            boolean clave_correcta = autentificacion.comprobarClave(clave);
            if(clave_correcta){
                cuenta = autentificacion.obtenerCuenta();
                return;
            }
        }
        
        autentificacion.alFallar();
        
    }

    public void sacarDinero() throws IOException{

        if(cuenta != null){

            int cantidad = cajero.introducirCantidad();

            boolean tiene_dinero = cajero.tieneSaldo(cantidad);

            if(tiene_dinero){

                boolean hay_saldo_suficiente = ((int)cuenta.comprobarSaldoDisponible()) >= cantidad;

                if(hay_saldo_suficiente){

                    cuenta.retirarSaldo(cantidad);

                    cuenta.actualizarCuenta(cantidad);

                    cajero.expedirDinero();

                    System.out.println(cajero.imprimirTicket(cuenta.saldo));

                } else{

                    cuenta.alFallar();

                  }

                }else {
                	cajero.alFallar();
                }

            }

        }

}
