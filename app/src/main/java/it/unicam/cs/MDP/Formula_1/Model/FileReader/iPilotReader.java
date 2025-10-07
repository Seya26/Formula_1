package it.unicam.cs.MDP.Formula_1.Model.FileReader;

import it.unicam.cs.MDP.Formula_1.Model.Pilot;

import java.io.IOException;
import java.io.Reader;
import java.util.Deque;

/**
 * interfaccia che ha il compito di descrivere la lettura del file dei piloti
 */

public interface iPilotReader {

    /**
     * Metodo che legge i piloti da un file .TXT e me li restituisce in un array
     * @return Array di stringhe coi nomi dei piloti
     */
    Deque<Pilot> readPilot() throws IOException;

}
