package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SalesConfirmGUI implements ActionListener {

    private JFrame mainFrame;
    private JPanel buttonPanel , textPanel;
    private JLabel mainLabel;
    private JButton yesButton , noButton;

    public SalesConfirmGUI() {
        mainFrame = new JFrame("Confirm");

        textPanel = new JPanel();
        textPanel.setBackground(new Color(179, 205, 224));
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(179, 205, 224));
        mainLabel = new JLabel("Are you sure you want to save these values?  The record is permanent!");
        yesButton = new JButton("Yes");
        yesButton.setPreferredSize(new Dimension(80, 25));
        noButton = new JButton("Back");
        noButton.setPreferredSize(new Dimension(80, 25));
    }

    public void setGUI() {
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
        textPanel.add(Box.createRigidArea(new Dimension(0,0)));
        textPanel.setBorder(BorderFactory.createEmptyBorder(20,80,80,100));

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.add(Box.createRigidArea(new Dimension(0,0)));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,50,50,200));

        buttonPanel.add(Box.createHorizontalGlue());
        textPanel.add(mainLabel);

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(yesButton);
        Dimension minSize = new Dimension(5, 0);
        Dimension prefSize = new Dimension(5, 0);
        Dimension maxSize = new Dimension(Short.MIN_VALUE, 0);
        buttonPanel.add(new Box.Filler(minSize, prefSize, maxSize));

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(noButton);

        Dimension minSize1 = new Dimension(5, 0);
        Dimension prefSize1 = new Dimension(5, 0);
        Dimension maxSize1 = new Dimension(Short.MIN_VALUE, 0);
        buttonPanel.add(new Box.Filler(minSize1, prefSize1, maxSize1));
        buttonPanel.add(Box.createHorizontalGlue());

        mainFrame.add(textPanel , BorderLayout.CENTER);
        mainFrame.add(buttonPanel , BorderLayout.SOUTH);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        yesButton.addActionListener(this);
        noButton.addActionListener(this);

        mainFrame.pack();
        mainFrame.setSize(600, 200);
        mainFrame.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {
            mainFrame.dispose();
        }
        else if(e.getActionCommand().equals("Yes")) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        SalesConfirmGUI dummy = new SalesConfirmGUI();
        dummy.setGUI();
    }
}
