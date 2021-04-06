/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class BT4 extends JFrame {

    private static final long serialVersionUID = 1L;

    public BT4(String title) {
        setTitle(title);
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        JButton bn1 = new JButton("BoxLayout");
        bn1.setForeground(Color.red);
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        bn1.setFont(font);
        pnBox.add(bn1);
        JButton bn2 = new JButton("X_AXIS");
        bn2.setForeground(Color.BLUE);
        bn2.setFont(font);
        pnBox.add(bn2);
        JButton bn3 = new JButton("Y_AXIS");
        bn3.setForeground(Color.YELLOW);
        bn3.setFont(font);
        pnBox.add(bn3);
        Container con = getContentPane();
        con.add(pnBox);
    }

    public static void main(String[] args) {
        BT4 bt4 = new BT4("hoc BoxLayout");
        bt4.setSize(600, 100);
        bt4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt4.setLocationRelativeTo(null);
        bt4.setVisible(true);
    }
}
