package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Deque;

/**
 * Interfaccia che descrive un veicolo di formula 1
 * @param <Position>
 */

public interface iVehicle<Position> {

    /**
     * Restituisce il nome del veicolo
     * @return nome veicolo
     */
    nameVehicle getName();


    /**
     * Restituisce il tracciato a cui gareggia il veicolo
     * @return tracciato
     */
    String getTrack();

    /**
     * Imposta il nome del veicolo
     * @param name
     */
    void setName(nameVehicle name);

    /**
     * Restituisce la posizione attuale del veicolo
     *
     * @return posizione
     */
    Position getPosition();

    /**
     * Imposta la posizione del veicolo
     * @param pos
     */
    void setPosition(Position pos);

    /**
     * Restituisce lo stato del veicolo
     * @return stato del veicolo
     */
    VehicleStatus getStatus();

    /**
     * Imposta un nuovo stato per il veicolo
     * @param vs
     */
    void setStatus(VehicleStatus vs);

    /**
     * Metodo che invoca il movimento di un veicolo e restituisce una stringa di risultato
     * @param pos_movement
     * @param pilots
     * @return stringa di risultato
     */
    String movement(Position pos_movement, Deque<Pilot> pilots);

    /**
     * Restituisce il pilota col veicolo nella posizione specificata
     * @param pos
     * @param pilots
     * @return pilota col veicolo
     */
    Pilot getVehicleAt(Position pos, Deque<Pilot> pilots);
}
