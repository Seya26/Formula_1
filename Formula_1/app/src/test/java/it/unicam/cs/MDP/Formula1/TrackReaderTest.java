package it.unicam.cs.MDP.Formula1;

import it.unicam.cs.MDP.Formula_1.Controller.Controller;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import it.unicam.cs.MDP.Formula_1.Model.Track;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TrackReaderTest {

    @Test
    public void readTrack() throws IOException {
        TrackReader trackReader = new TrackReader("testFiles\\circuito.txt");
        Track t = trackReader.readTrack();
        assertNotNull(t.getGrid());
        assertNotNull(t.getHeight());
        assertNotNull(t.getWidth());
        assertNotNull(t.getStartLine());
        assertNotNull(t.getFinishLine());
    }
}
