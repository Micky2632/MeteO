import javax.swing.*;
import java.awt.*;
import java.io.File;

class MyPanel extends JPanel {
    Image MeTeo = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator+"MeteO"+ File.separator+"img"+ File.separator+ "1.png");

    public MyPanel(){
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(MeTeo,0,0,50,50,0,0,1024,1024,this);

    }
}
