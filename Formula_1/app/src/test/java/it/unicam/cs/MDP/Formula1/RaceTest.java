package it.unicam.cs.MDP.Formula1;

import it.unicam.cs.MDP.Formula_1.Model.*;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.PilotReader;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

public class RaceTest {

    @Test
    public void raceTest() throws IOException {
        TrackReader trackReader = new TrackReader("testFiles\\circuito.txt");
        Track t = trackReader.readTrack();
        PilotReader pilotReader = new PilotReader(t, "testFiles\\Piloti.txt");
        Deque<Pilot> p = pilotReader.readPilot();
        Race race = new Race(t, p);

        assertNotNull(race);
        assertFalse(p.getFirst().isWinner());
        p.getFirst().movement(new Position(2,7), p);
        p.getFirst().setWinner(true);
        assertTrue(p.getFirst().isWinner());
        assertEquals(p.getFirst(), race.checkWinner());
        assertFalse(p.getLast().isWinner());
        assertNotEquals(p.getLast(), race.checkWinner());
    }
}
