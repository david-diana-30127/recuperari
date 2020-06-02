/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mihai.hulea
 */
public class FlightController {
    private List<Drone> drones=new ArrayList<Drone>();

    public void addDrone(Drone d){
        this.drones.add(d);
    }

    public Drone findById(String id){
        Drone aux= new Drone();
        for(int i=0;i<drones.size();i++)
            if(drones.get(i).getId().equals(id)) return this.drones.get(i);
        return null;
    }

    public List<Drone> getAllByState(boolean state){
        List<Drone> aux= new ArrayList<Drone>();
        for(int i=0;i<this.drones.size();i++)
            if(this.drones.get(i).getState()==state)aux.add(this.drones.get(i));
        return aux;
    }

    public void remove(String id){
        for(int i=0;i<drones.size();i++)
            if(drones.get(i).getId().equals(id))this.drones.remove(i);
    }

    /**
     * Return number of entities.
     *
     * @return
     */
    public int count(){
        return this.drones.size();
    }
}