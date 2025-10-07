package it.unicam.cs.MDP.Formula_1.Controller;

import it.unicam.cs.MDP.Formula_1.Model.FileReader.PilotReader;
import it.unicam.cs.MDP.Formula_1.Model.FileReader.TrackReader;
import it.unicam.cs.MDP.Formula_1.Model.Pilot;
import it.unicam.cs.MDP.Formula_1.Model.Track;

import java.io.*;
import java.util.Deque;
import java.util.logging.Logger;

public class Controller implements iController{

    private boolean activated;

    public Controller(){
        activated = true;
    }

    @Override
    public void newGame() {
        activated = true;
    }

    @Override
    public Track initTrackReader() throws IOException {
        TrackReader trackReader = new TrackReader("Files\\circuito.txt");
        return trackReader.readTrack();
    }

    @Override
    public Deque<Pilot> initPilotReader (Track track) throws IOException{
        PilotReader reader_p = new PilotReader(track , "Files\\Piloti.txt");
        return reader_p.readPilot();
    }

    @Override
    public boolean getActivated(){
        return this.activated;
    }
    @Override
    public void endGame() {
        activated = false;
    }
}
