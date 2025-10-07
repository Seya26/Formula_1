package it.unicam.cs.MDP.Formula_1.Model;

import java.util.ArrayDeque;
import java.util.Deque;

public class Race implements iRace{

    private Track track;
    private Deque<Pilot> pilots;

    private boolean started;

    public Race(Track track, Deque<Pilot> pilots) {
        this.track = track;
        this.pilots = pilots;
        this.started = true;
    }

    @Override
    public Track getTrack() {
        return track;
    }

    @Override
    public Deque<Pilot> getPilots() {
        return pilots;
    }

    @Override
    public void start() {
        started = true;
    }

    @Override
    public boolean isStarted(){
        return started;
    }

    @Override
    public void finish() {
        started = false;
    }

    @Override
    public Pilot getWinner() {
        return this.pilots
                .stream()
                .filter(Pilot::isWinner)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Pilot checkWinner(){
        Deque<Pilot> pilotInRace = new ArrayDeque<>(this.getPilots().stream().filter(pilot -> pilot.getVehicle().getStatus() != VehicleStatus.CRASHED).toList());
        for(int i = 0; i < pilotInRace.size(); i++){
            Position pos = pilotInRace.stream().toList().get(i).getVehicle().getPosition();
            if(this.getTrack().getFinishLine().stream().anyMatch(p -> p.getX() == pos.getX() && p.getY() == pos.getY()))
            {
                Pilot winner = pilotInRace.stream().toList().get(i);
                winner.setWinner(true);
                return winner;
            }
        }
        return null;
    }
}
