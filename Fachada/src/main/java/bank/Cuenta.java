package bank;
/*
 * @author verovte
 */
public class Cuenta{

        /* ... */

    public double comprobarSaldoDisponible(){return 0;}

    public boolean bloquearCuenta(){return false;}

    public void retirarSaldo(int cantidad){}

    public boolean actualizarCuenta(){return false;
}

    public void alFallar(){}

    void desbloquearCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
