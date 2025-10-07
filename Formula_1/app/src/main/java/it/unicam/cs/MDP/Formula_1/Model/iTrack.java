package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;
import java.util.List;

/**
 * Interfaccia che rappresenta il tracciato di gara di formula 1
 * @param <P> posizione
 */

public interface iTrack<P> {

    /**
     * Restituisce la griglia del tracciato
     *
     * @return griglia tracciato
     */
    TrackCellType[][] getGrid();

    /**
     * Restituisce la lista delle coordinate della linea di partenza
     *
     * @return lista delle coordinate della partenza
     */
    List<Position> getStartLine();

    /**
     * Restituisce la lista delle coordinate della linea di arrivo
     *
     * @return lista delle coordinate dell'arrivo
     */
    List<Position> getFinishLine();

    /**
     * Restituisce la larghezza del tracciato
     * @return larghezza tracciato
     */
    int getWidth();

    /**
     * Restituisce l'altezza del tracciato
     * @return altezza del tracciato
     */
    int getHeight();

    /**
     * Stampa il tracciato sulla console
     */
     void printTrack(Deque<Pilot> pilots);

    /**
     * Restituisce lo stato di una cella del tracciato
     * @param pos
     * @return lo stato di una cella
     */
    TrackCellType getCellType(Position pos);

}
