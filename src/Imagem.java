import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Imagem extends Desenho {

    public static double L = 300;
    public static double x = 200, y = 200;

    public static void sq1(Graphics2D g){
        ArrayList<Double[]> meio = new ArrayList<>(Arrays.asList(
                new Double[]{x, y},
                new Double[]{x - (L * 0.1339745962), y - (L / 2)},
                new Double[]{x + (L * 0.1339745962), y - (L / 2)}
        ));

        ArrayList<Double[]> canto = new ArrayList<>(Arrays.asList(
                new Double[]{x, y},
                new Double[]{x - (L * 0.2588190451), y - (L * 0.4482877361)},
                new Double[]{x, y - (L * 0.7071067812)},
                new Double[]{x + (L * 0.2588190451), y - (L * 0.4482877361)}
        ));

        //TODO
    }
}
