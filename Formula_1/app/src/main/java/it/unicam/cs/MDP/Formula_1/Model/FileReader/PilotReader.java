package it.unicam.cs.MDP.Formula_1.Model.FileReader;

import it.unicam.cs.MDP.Formula_1.Model.*;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PilotReader implements iPilotReader {

    private final Track track;
    private File fileName;
    private Deque<String> pilotsFile = new ArrayDeque<>();
    private Deque<Pilot> pilots = new ArrayDeque<>();


    public PilotReader(Track track,String fileName)
    {
        this.track = track;
        this.fileName = new File(fileName);
    }

    @Override
    public Deque<Pilot> readPilot () throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String[] infos = input.readLine().split(";");

        pilotsFile.addAll(Arrays.asList(infos));

        for(String p : pilotsFile){
            String[] typeandName = p.trim().split(",");
            String type = typeandName[0].trim();
            String name = typeandName[1].trim();

            Vehicle v = new Vehicle(track);
            if(type.equalsIgnoreCase("Bot")) {
                pilots.add(new PilotBot(track, name, v ));
            }else if (type.equalsIgnoreCase("Interactive")) {
                pilots.add(new PilotInteractive(track, name, v));
            }else {
                System.out.println("Errore di inserimento dati nel file");
            }
        }
        input.close();
        return pilots;
    }
}

