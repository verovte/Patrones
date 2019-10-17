package mvl;
/*
 * @author verovte
 */
public class ClientFacade {
    
    public static void main(String[] args) {

        MobileFacade facade = new MobileFacade();
        Mobile mobile = facade.on();

        System.out.println("---------------");

        facade.off(mobile);
    }
    
}
