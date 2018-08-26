import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        add(new JTeste());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
