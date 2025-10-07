package it.unicam.cs.MDP.Formula_1.Model.FileReader;

import it.unicam.cs.MDP.Formula_1.Model.Track;

import java.io.IOException;

/**
 * Interfaccia che ha il compito di descrivere la lettura del file del tracciato
 */
public interface iTrackReader {

    Track readTrack() throws IOException;
}
