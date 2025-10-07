package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;

/**
 * Interfaccia che descrive un player partecipante alla gara
 */
public interface iPilot {

    /**
     * Restituisce il nome del pilota
     * @return nome del pilota
     */
    String getName();

    /**
     * Imposta un nuovo nome per il pilota
     * @param Name
     */
    void setName(String Name);

    /**
     * Restituisce il tracciato in cui il pilota gareggia
     * @return tracciato
     */
    Track getTrack();

    /**
     * Restituisce il veicolo guidato dal pilota
     * @return Veicolo del pilota
     */
    Vehicle getVehicle();

    /**
     * Imposta il veicolo del pilota
     * @param vehicle
     */
    void setVehicle(Vehicle vehicle);

    /**
     * Imposta true se ha vinto, false altrimenti
     * @param winner
     */
    void setWinner(boolean winner);

    /**
     * Restituisce true se il pilota ha vinto la gara, false altrimenti
     * @return true se ha vinto, false altrimenti
     */
    boolean isWinner();

    /**
     * Restituisce il tipo del pilota (BOT, INTERACTIVE)
     * @return tipo del pilota
     */
    TypePilot getTypePilot();

    /**
     * Effettua un movimento di un veicolo e restituisce un aggiornamento di testo
     * @param pilots
     * @param pos
     * @return stringa di testo
     */
    String movement(Position pos,Deque<Pilot> pilots);

}
