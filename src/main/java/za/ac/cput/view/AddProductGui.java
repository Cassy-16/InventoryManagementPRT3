package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductGui extends JFrame implements ActionListener {
    private JFrame mainFrame;
    // private JPanel pnlFrame;
    private JPanel pnlTitle;
    private JLabel Title;
    private JLabel lblProdName;
    private JTextField productName;
    private JLabel lblQuantity;
    private JTextField txtQuantity;
    private JLabel lblPrice;
    private JTextField txtPrice;
    //private JPanel pnlButtons;
    private JButton btnAdd;
    private JButton btnCancel;

    public AddProductGui(){
        mainFrame = new JFrame(" Adding a product... ");
        pnlTitle = new JPanel();
        Title = new JLabel("Add item");
        lblProdName = new JLabel("Product Name:");
        lblQuantity = new JLabel("Quantity:");
        lblPrice = new JLabel("Price:");
        productName = new JTextField(" ");
        txtQuantity = new JTextField(" ");
        txtPrice = new JTextField(" ");
        btnCancel = new JButton("Cancel");
        btnAdd = new JButton("Add");
    }

    public void setGUI(){
        mainFrame.add(pnlTitle, BorderLayout.NORTH);
        pnlTitle.setBackground(new Color(100,151,177));
        pnlTitle.add(Title);
        pnlTitle.setVisible(true);

        //Components dimentions
        lblProdName.setBounds(160,90,40,90);
        lblProdName.setSize(100, 10);
        lblQuantity.setBounds(195,130, 40, 90);
        lblQuantity.setSize(100, 20);
        lblPrice.setBounds(210, 170, 40, 90);
        lblPrice.setSize(100, 10);
        productName.setBounds(270, 85, 40, 90);
        productName.setSize(130,20);
        txtQuantity.setBounds(270, 125, 40, 90);
        txtQuantity.setSize(130, 20);
        txtPrice.setBounds(270, 165, 40, 90);
        txtPrice.setSize(130, 20);
        btnCancel.setBounds(180, 360, 130, 20);
        btnAdd.setBounds(320, 360, 140, 20);
        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);

//Adding components to the Frame
        mainFrame.add(lblProdName);
        mainFrame.add(lblQuantity);
        mainFrame.add(lblPrice);
        mainFrame.add(productName);
        mainFrame.add(txtQuantity);
        mainFrame.add(txtPrice);
        mainFrame.add(btnCancel);
        mainFrame.add(btnAdd);

//Main Frame Set ups

        mainFrame.getContentPane().setBackground(new Color(179,205,224));
        mainFrame.setLocation(250, 90);
        mainFrame.setSize(650,450);
        mainFrame.setLayout(new GridLayout(4,2));
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }

    public boolean isFill() {
        boolean valid = true;

        if (productName.getText().equals("")){
            valid = false;
        }else if(txtQuantity.getText().equals("")){
            valid = false;
        }else if(txtPrice.getText().equals("")){
            valid = false;
        }else{
            valid = true;
        }
        return valid;
    }

    public static void main(String[] args) {
        new AddProductGui().setGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            if (isFill()) {
                JOptionPane.showMessageDialog(null, "Item was successfully added!");   //new Popup().setGUI(); // write the gui info to a file
            }
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        }
    }
}
