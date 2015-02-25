package de.ra.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Window extends JFrame {

    private JPanel pnlOptions, pnlGrid;

    private JLabel lblHeader;

    private JButton btnInfo;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    Window frame = new Window();
                    frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Window()
    {
        setTitle("Mapmaker v0.1.03");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createWidgets();
        addWidgets();

        setSize(1000, 600);
        setLocation(800, 200);
    }

    private void addWidgets()
    {
        getContentPane().setLayout(null);
        getContentPane().add(lblHeader);
        getContentPane().add(btnInfo);
        getContentPane().add(pnlOptions);
        getContentPane().add(pnlGrid);
    }

    private void createWidgets()
    {
        // Header
        lblHeader = new JLabel("TI3 Mapmaker");
        lblHeader.setFont(lblHeader.getFont().deriveFont(Font.PLAIN, 11));
        lblHeader.setForeground(Color.black);
        lblHeader.setBackground(Color.white);
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setBounds(0, 0, 1000, 20);

        // Infobutton
        btnInfo = new JButton("Info...");
        btnInfo.setBounds(5, 530, 200, 25);

        // Options panel
        pnlOptions = new JPanel();
        pnlOptions.setLayout(null);
        pnlOptions.setBounds(5, 20, 200, 500);
        pnlOptions.setBackground(Color.BLACK);

        // Grid panel
        pnlGrid = new JPanel();
        pnlGrid.setLayout(null);
        pnlGrid.setBounds(210, 20, 770, 500);
        pnlGrid.setBackground(Color.BLACK);
    }
}
