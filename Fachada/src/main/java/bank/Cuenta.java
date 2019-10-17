package bank;
/*
 * @author verovte
 */
public class Cuenta{
    double saldo;
    
    Cuenta (double saldo){
        this.saldo=saldo;
    }

        /* ... */

    public double comprobarSaldoDisponible(){
        return saldo;
    }

    public boolean bloquearCuenta(){return false;}

    public void retirarSaldo(int cantidad){
        System.out.println("RETIRANDO "+cantidad+" EUROS");
    }

    public void actualizarCuenta(int cantidad){
        this.saldo-=cantidad;
}

    public void alFallar(){
        System.out.println("SALDO NO DISPONIBLE EN ESTA CUENTA");
    }

    void desbloquearCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
