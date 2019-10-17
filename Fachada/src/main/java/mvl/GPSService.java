package mvl;
/*
 * @author verovte
 */
public class GPSService implements  MobileService {
    
    public void start() {
        System.out.println("GPS Service started");
    }

    public void close() {
        System.out.println("GPS Service closed");
    }
    
}
