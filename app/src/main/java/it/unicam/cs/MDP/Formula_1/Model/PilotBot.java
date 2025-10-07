package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;
import java.util.Random;
import java.util.Set;

public class PilotBot extends Pilot{

    public PilotBot(Track track, String name, Vehicle vehicle) {
        super(track, name, vehicle);
    }

    @Override
    public TypePilot getTypePilot() {return TypePilot.BOT; }

    @Override
    public String movement(Position pos ,Deque<Pilot> pilots) {
        Vehicle ve = this.getVehicle();
        Position present_position = ve.getPosition();
        Set<Position> possibleMove = present_position.calculateAdjacentPoints(present_position.getX(), present_position.getY());
        int randomMoveBOT = new Random().nextInt(possibleMove.size());
        int count = 0;
        for (Position p : possibleMove) {
            if (count == randomMoveBOT) {
                return ve.movement(p, pilots);
            }
            count++;
        }
        return "| Pilota non presente";
    }
}