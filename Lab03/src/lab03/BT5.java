package lab03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BT5 extends JFrame {

    private static final long serialVersionUID = 1L;

    public BT5(String title) {
        setTitle(title);

        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest, BorderLayout.WEST);
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast, BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.yellow);
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        getContentPane().add(pnBorder);
    }

    public static void main(String[] args) {
        BT5 bt5 = new BT5("BorderLayout");
        bt5.setSize(250, 250);
        bt5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt5.setLocationRelativeTo(null);
        bt5.setVisible(true);
    }
}
