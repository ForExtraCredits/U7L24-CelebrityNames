import java.io.*;
import java.util.*;

/**
 * Write a description of class CelebrityNames here.
 * 
 * @author Roger Jaffe
 * @version 2015-01-19
 */
public class Tester {
    public static double main(String args[]) throws IOException { 
        MonteCarlo mcObj = new MonteCarlo(5,3,2);
        double pie;
        int sqrCount = 0, cirCount, x, y;
        for (x = 0; x >=100; x++) {
            x = MonteCarlo.nextRainDrop_x();
            y = MonteCarlo.nextRainDrop_y();
            Boolean in = MonteCarlo.insideCircle(x,y);
            if(in == true)
                cirCount++;
        }
        sqrCount++;
        pie = cirCount * 4 / (sqrCount * 4);
        return pie;
    }
}