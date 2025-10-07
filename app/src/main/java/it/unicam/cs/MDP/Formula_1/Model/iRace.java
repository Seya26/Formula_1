package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;

/**
 * Interfaccia che rappresenta la gara di formula 1 datosi il tracciato e i piloti partecipanti
 */

public interface iRace {

    /**
     * Restituisce il tracciato di gara
     * @return tracciato
     */
    Track getTrack();

    /**
     * Restituisce i piloti presenti nella gara
     * @return lista di piloti
     */
    Deque<Pilot> getPilots();

    /**
     * Imposta true quando la gara inizia
     */
    void start();

    /**
     * Restituisce true se la gara è iniziata, false altrimenti
     * @return true se la gara è iniziata, false altrimenti
     */
    boolean isStarted();

    /**
     * Imposta true quando la gara finisce
     */
    void finish();

    /**
     * Restituisce il vincitore della gara
     *
     * @return vincitore
     */
    Pilot getWinner();

    /**
     * Restituisce true se qualcuno ha vinto, false altrimenti
     *
     * @return true se qualcuno ha vinto, false altrimenti
     */
    Pilot checkWinner();
}
