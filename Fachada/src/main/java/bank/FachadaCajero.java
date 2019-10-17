package bank;
/**
 *
 * @author verovte
 */
public class FachadaCajero{

    private Autentificacion autentificacion = new Autentificacion();

    private Cajero cajero = new Cajero();

    private Cuenta cuenta = null;

    public void introducirCredenciales(){

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

    public void sacarDinero(){

        if(cuenta != null){

            int cantidad = cajero.introducirCantidad();

            boolean tiene_dinero = cajero.tieneSaldo(cantidad);

            if(tiene_dinero){

                boolean hay_saldo_suficiente = ((int)cuenta.comprobarSaldoDisponible()) >= cantidad;

                if(hay_saldo_suficiente){

                    cuenta.bloquearCuenta();

                    cuenta.retirarSaldo(cantidad);

                    cuenta.actualizarCuenta();

                    cuenta.desbloquearCuenta();

                    cajero.expedirDinero();

                    cajero.imprimirTicket();

                } else{

                    cuenta.alFallar();

                  }

                }

            }

        }

}
