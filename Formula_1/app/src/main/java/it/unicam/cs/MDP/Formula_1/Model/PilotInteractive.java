package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;

public class PilotInteractive extends Pilot{
    public PilotInteractive(Track track, String name, Vehicle vehicle) {
        super(track, name, vehicle);
    }

    @Override
    public TypePilot getTypePilot(){
        return TypePilot.INTERACTIVE;
    }

    @Override
    public String movement(Position pos,Deque<Pilot> pilots) {
        return this.getVehicle().movement(pos, pilots);
    }
}
