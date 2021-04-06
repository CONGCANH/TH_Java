/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class BT3 extends JFrame {

    private static final long serialVersionUID = 1L;

    public BT3(String title) {
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.blue);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add control");
        JButton btn3 = new JButton("Uper line");
        JButton btn4 = new JButton("Full space");
        JButton btn5 = new JButton("Less line");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }

    public static void main(String[] args) {
        BT3 bt3 = new BT3("Demo FlowLayout");
        bt3.setSize(600, 100);
        bt3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt3.setLocationRelativeTo(null);
        bt3.setVisible(true);
    }
}
