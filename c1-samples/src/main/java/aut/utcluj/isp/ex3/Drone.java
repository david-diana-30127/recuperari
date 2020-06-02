
package aut.utcluj.isp.ex3;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class Drone {

    private String id;
    private boolean started;
    private int altitude;

   public  Drone(String d1, boolean b, int i) {
       this.id=d1;
       this.started=b;
       this.altitude=i;

    }

    Drone() {
        this.id= null;
        this.started=true;
        this.altitude=0;
    }

     public Drone(String dR3, boolean b) {
        this.id=dR3;
        this.started=b;
        this.altitude=0;
    }

    /**
     * Move the drone up.
     * Altitude will be incremented by 1 unit each time this method is invoked
     */
    public void moveUp() {
        this.altitude=this.altitude+1;
    }

    /**
     * Move the drone down
     * Altitude will be decremented by 1 unit each time this method is invoked
     */
    public void moveDown() {
        this.altitude=this.altitude-1;
    }


    public int getAltitude() {
        return this.altitude;
    }
    public String getId() {
        return this.id;
    }

public  boolean getState(){
        return this.started;
}
}
