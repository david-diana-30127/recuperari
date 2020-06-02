
package aut.utcluj.isp.ex1;

public class Drone {

  private String id;
      private boolean state;

  public   Drone(String dR1, boolean b) {
        this.state=b;
    }

 public Drone(String dR3) {
        this.id=dR3;
        this.state=true;
    }

    public String getId() {
        return id;
    }

    public boolean isState() {
        return state;
    }
    public String toString(){
      return "Drone_"+this.id;
    }

}
