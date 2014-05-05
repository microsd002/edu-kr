package sample;

import model.Point;

import java.io.File;
import java.io.IOException;
import java.util.List;



public interface PointConverter {
    
    public List<Point> convertFromFile(File pointsFile) throws IOException;

}

