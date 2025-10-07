package it.unicam.cs.MDP.Formula_1.Model;

import java.util.Set;

/**
 * Interfaccia che gestisce una generica posizione all'interno del tracciato
 */
public interface iPosition {

    /**
     * Restituisco il punto x della posizione
     * @return x
     */
    int getX();

    /**
     * Imposta il parametro x della posizione
     * @param x
     */
    void setX(int x);

    /**
     * Restituisce il parametro y della posizione
     * @return y
     */
    int getY();

    /**
     * Imposta il parametro y della posizione
     * @param y
     */
    void setY(int y);

    /**
     * Restituisce un Set contenente tutti i possibili punti successivi ad uno dato
     * @param x
     * @param y
     * @return Set<Position> di posizioni
     */
    Set<Position> calculateAdjacentPoints(int x, int y);
}
