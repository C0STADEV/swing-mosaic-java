import javax.swing.*;
import java.awt.*;

/**
 * A JPanel that displays a colorful mosaic pattern using a 2D matrix
 * 
 * @author gustavo rech costa
 */
public class Mosaic extends JPanel {
    // 12x13 matrix (n > 0 = colored, n = 0 = background)
    int[][] matrix = {
        {0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 5, 4, 4, 4, 5, 0, 0, 0, 0},
        {0, 0, 0, 5, 4, 3, 3, 3, 4, 5, 0, 0, 0},
        {0, 0, 5, 4, 3, 2, 2, 2, 3, 4, 5, 0, 0},
        {0, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 0},
        {5, 4, 3, 2, 1, 1, 1, 1, 1, 2, 3, 4, 5},
        {5, 4, 3, 2, 1, 1, 1, 1, 1, 2, 3, 4, 5},
        {0, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 0},
        {0, 0, 5, 4, 3, 2, 2, 2, 3, 4, 5, 0, 0},
        {0, 0, 0, 5, 4, 3, 3, 3, 4, 5, 0, 0, 0},
        {0, 0, 0, 0, 5, 4, 4, 4, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0}
    };
    
    // defines the size of each square in pixels
    int pixelSize = 30;
    
    // defines the square colors based on the value
    private Color getColor(int value) {
        switch (value) {
            case 0: return Color.WHITE;
            case 1: return new Color(0, 150, 255);      // Light blue
            case 2: return new Color(255, 140, 0);      // Orange
            case 3: return new Color(180, 0, 255);      // Purple
            case 4: return new Color(0, 200, 100);      // Green
            case 5: return new Color(0, 50, 180);       // Dark blue
            default: return Color.GRAY; 
        }
    }
    
    // draws the squares on the matrix 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                g.setColor(getColor(matrix[i][j])); // set color based on matrix value
                g.fillRect(j * pixelSize, i * pixelSize, pixelSize, pixelSize); // draw the square on screen
                g.setColor(Color.LIGHT_GRAY); // set the border color of the square
                g.drawRect(j * pixelSize, i * pixelSize, pixelSize, pixelSize);
            }
        }
    }
    
    // creates the window to display the mosaic
	public static void createWindow() {
        JFrame frame = new JFrame("Mosaic");
        Mosaic panel = new Mosaic();
        
        frame.setContentPane(panel);
        frame.setSize(405, 398);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}