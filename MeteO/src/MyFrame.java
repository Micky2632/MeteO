import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel GamePanel = new MyPanel();
    public MyFrame(){
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(GamePanel, BorderLayout.CENTER);
    }
}
