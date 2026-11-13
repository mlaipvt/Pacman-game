import  javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int rowCount=21;
        int colCount=19;
        int tileSize=32;
        int boardWidth=colCount*tileSize;
        int boardHeight=rowCount*tileSize;


        JFrame frame=new JFrame("Pac Man");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Pacman pacman =new Pacman();
        frame.add(pacman);
        frame.pack();
        frame.setVisible(true);
        pacman.requestFocus(true);

    }
}