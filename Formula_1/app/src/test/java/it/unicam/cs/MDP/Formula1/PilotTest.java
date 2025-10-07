package it.unicam.cs.MDP.Formula1;

import it.unicam.cs.MDP.Formula_1.Model.*;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.PilotReader;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

public class PilotTest {

    @Test
    public void pilotTest() throws IOException {
        TrackReader trackReader = new TrackReader("testFiles\\circuito.txt");
        Track t = trackReader.readTrack();
        PilotReader pilotReader = new PilotReader(t, "testFiles\\Piloti.txt");
        Deque<Pilot> p = pilotReader.readPilot();
        assertEquals(3, p.size());
        assertEquals("Seya", p.getFirst().getName());
        assertNotNull(p.getFirst().getVehicle());
        assertEquals(TypePilot.INTERACTIVE, p.getFirst().getTypePilot());
        assertEquals("Luna", p.getLast().getName());
        assertEquals(TypePilot.BOT, p.getLast().getTypePilot());
        assertNotNull(p.getLast().getVehicle());
        p.getFirst().setName("Thiago");
        Vehicle v = p.getFirst().getVehicle();
        assertNotEquals("Seya",p.getFirst().getName());
        assertFalse(p.contains(new PilotInteractive(t, "Seya", v)));
        assertEquals("Thiago", p.getFirst().getName());
        assertFalse(p.contains(new PilotBot(t, "Cristiano", null)));
        assertEquals(false, p.getFirst().isWinner());
    }
}
