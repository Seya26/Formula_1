package it.unicam.cs.MDP.Formula_1.Model.FileReader;

import it.unicam.cs.MDP.Formula_1.Model.Position;
import it.unicam.cs.MDP.Formula_1.Model.Track;
import it.unicam.cs.MDP.Formula_1.Model.TrackCellType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrackReader implements iTrackReader {

    private File fileName;
    private static final char START_CHAR = 'S';
    private static final char FINISH_CHAR = 'F';
    private static final char RACE_CHAR = '-';
    private TrackCellType[][] grid;
    private List<Position> startLine = new ArrayList<>();
    private List<Position> finishLine = new ArrayList<>();
    private int width;
    private int height;

    public TrackReader(String fileName) {
        this.fileName = new File(fileName);
    }

    @Override
    public Track readTrack() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.fileName));

        String[] infos = input.readLine().split(";");
        this.width = Integer.parseInt(infos[0]);
        this.height = Integer.parseInt(infos[1]);
        this.grid = new TrackCellType[height][width];

        for (int y = 0; y < height; y++) {
            input.readLine();
            for (int x = 0; x < width; x++) {
                char c = (char) input.read();
                if (c == START_CHAR) {
                    startLine.add(new Position(x,y));
                    grid[y][x] = TrackCellType.START;
                } else if (c == FINISH_CHAR) {
                    finishLine.add(new Position(x,y));
                    grid[y][x] = TrackCellType.FINISH;
                } else if (c == RACE_CHAR) {
                    grid[y][x] = TrackCellType.RACE;
                } else {
                    grid[y][x] = TrackCellType.WALL;
                }
            }
        }
        input.close();
        return new Track(grid, startLine, finishLine, width, height);
    }
}
