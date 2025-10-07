package it.unicam.cs.MDP.Formula_1.Controller;

import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import it.unicam.cs.MDP.Formula_1.Model.Pilot;
import it.unicam.cs.MDP.Formula_1.Model.Track;
import it.unicam.cs.MDP.Formula_1.Model.Vehicle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Deque;

/**
 * Interfaccia che descrive il motore di gioco, che ha la responsabilità di avviare il gioco e inizializzare i vari file di dati
 */

public interface iController {

    /**
     * Metodo che da il via ad una gara
     */
    void newGame();

    /**
     * Metodo che inizializza il reader e restituisce infine il tracciato
     * @return tracciato
     * @throws IOException
     */
    Track initTrackReader() throws IOException;

    /**
     * Metodo che inizializza il reader e restituisce tutti i piloti
     * @param track
     * @return Piloti
     * @throws IOException
     */
    Deque<Pilot> initPilotReader(Track track) throws IOException;

    /**
     * Restituisce true se il controller del motore è acceso, false altrimenti
     * @return true se il controller del motore è acceso, false altrimenti
     */
    boolean getActivated();
    /**
     * Metodo che termina una gara
     */
    void endGame();

}
