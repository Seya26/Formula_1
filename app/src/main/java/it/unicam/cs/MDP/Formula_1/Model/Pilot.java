package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;

public abstract class Pilot implements iPilot{

    private final Track track;
    private String name;
    private boolean winner;
    private Vehicle vehicle;

    public Pilot(Track track, String name, Vehicle vehicle) {
        this.track = track;
        this.name = name;
        this.vehicle = vehicle;
        this.winner = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public Track getTrack(){
        return this.track;
    }

    @Override
    public Vehicle getVehicle() { return vehicle; }

    @Override
    public abstract TypePilot getTypePilot();

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public boolean isWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return "| Pilota ->" +
                " Nome = " + name  +
                ", Veicolo = " + vehicle.getName() +
                ", Posizione = " + vehicle.getPosition().toString() +
                '.';
    }

    @Override
    public abstract String movement(Position pos, Deque<Pilot> pilots);
}
