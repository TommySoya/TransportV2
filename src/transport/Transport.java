package transport;

import java.util.Date;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 19:47
 * @version: 2.0
 * @modified By:
 */
public class Transport {

    private String id;
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;

    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    public void drivingMethod(Transport transport) {
        System.out.println(transport.id);
    }
}
