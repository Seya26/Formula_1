package it.unicam.cs.MDP.Formula1;

import it.unicam.cs.MDP.Formula_1.Controller.Controller;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.PilotReader;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import it.unicam.cs.MDP.Formula_1.Model.Pilot;
import it.unicam.cs.MDP.Formula_1.Model.Track;
import it.unicam.cs.MDP.Formula_1.Model.TypePilot;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

public class PilotReaderTest {

    @Test
    public void readPilot() throws IOException{
        TrackReader trackReader = new TrackReader("testFiles\\circuito.txt");
        Track t = trackReader.readTrack();
        PilotReader pilotReader = new PilotReader(t, "testFiles\\Piloti.txt");
        Deque<Pilot> p = pilotReader.readPilot();
        assertNotNull(p.getFirst());
        assertNotNull(p.getLast());
        assertEquals(3, p.size());
        assertNotEquals(4, p.size());
    }
}
