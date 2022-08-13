package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SalesGUI implements ActionListener {
    private JFrame mainFrame;
    private JPanel buttonPanel;
    private JPanel yearAndNotice;
    private JPanel endTotalPanel;
    private JPanel begTotalPanel;
    private JPanel soldTotalPanel;
    private JPanel cashPanel;
    private JPanel purchPanel;
    private JPanel totExpensePanel;
    private JPanel goodsHeadPanel;
    private JPanel goodsPanel;
    private JPanel expensesPanel;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel southPanel;
    private JPanel westPanel;
    private JPanel fullCenterPanel;
    private JPanel allCenterPanels;
    private JButton btnCalculate;
    private JButton btnSave;
    private JButton btnExit;
    private JTextField endValueField;
    private JTextField beginValueField;
    private JTextField totalSoldField;
    private JTextField cashValueFiled;
    private JTextField purchaseField;
    private JTextField totalExpenseField;
    private JTextField noticeField;
    private JTextField endDateField;
    private JTextField beginDateField;
    private JLabel expenseLabel2;
    private JLabel cashLabel;
    private JLabel cashLabel2;
    private JLabel purchasesLabel;
    private JLabel purchasesLabel2;
    private JLabel expenseLabel;
    private JLabel endValLabel;
    private JLabel beginValLabel;
    private JLabel totalSoldLabel ;
    private JLabel totalSoldLabel2;
    private JPanel noticePanel;
    private JLabel northLabel;
    private JTable salesTable;
    private JScrollPane scrollPane;
    private JComboBox yearComboBox;

    public SalesGUI() {
        mainFrame = new JFrame("Sales");
        salesTable = new JTable();
        yearAndNotice = new JPanel();
        scrollPane = new JScrollPane();

        String[] years = { "Current Year", "2021", "2020", "2019"};
        yearComboBox = new JComboBox(years);

        noticePanel = new JPanel();
        fullCenterPanel = new JPanel();
        allCenterPanels = new JPanel();
        endTotalPanel = new JPanel();
        begTotalPanel = new JPanel();
        soldTotalPanel = new JPanel();
        cashPanel = new JPanel();
        purchPanel = new JPanel();
        totExpensePanel = new JPanel();
        goodsHeadPanel = new JPanel();
        goodsPanel = new JPanel();
        expensesPanel = new JPanel();
        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();
        westPanel = new JPanel();

        northLabel = new JLabel("INVENTORY SALES");
        northLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        northLabel.setForeground(new Color(84, 140, 168));

        buttonPanel = new JPanel();
        btnCalculate = new JButton("Calculate");
        btnSave = new JButton("Save");
        btnExit = new JButton("Exit");

        endValueField = new JTextField("R 13 010");
        endValueField.setEditable(true);
        endDateField = new JTextField("30-Jun-2021");
        endDateField.setEditable(true);
        endDateField.setPreferredSize(new Dimension(100, 20));
        beginDateField = new JTextField("01-Jun-2021");
        beginDateField.setPreferredSize(new Dimension(100, 20));
        beginDateField.setEditable(true);
        beginValueField = new JTextField("R 11 680");
        beginValueField.setEditable(true);
        ////je me suis arreter ici avec les "true"
        totalSoldField = new JTextField("R ");
        totalSoldField.setEditable(false);
        cashValueFiled = new JTextField();
        purchaseField = new JTextField("R");
        purchaseField.setEditable(false);
        totalExpenseField = new JTextField("R");
        totalExpenseField.setEditable(false);


        noticeField = new JTextField("Records are current. You may create a new sales record.");
        noticeField.setFont(new Font("Tahoma", Font.BOLD, 14));
        noticeField.setForeground(new Color(84, 140, 168));

        noticeField.setEditable(false);
        endValLabel = new JLabel("(a)Total Product Value(end)");
        beginValLabel = new JLabel("(b)Total Product Value(begin)");

        cashLabel = new JLabel("Enter value of cash");
        cashLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        cashLabel.setForeground(new Color(84, 140, 168));
        cashLabel2 = new JLabel("cash in hand(from sales)");
        cashLabel2.setFont(new Font("Tahoma", Font.BOLD, 12));
        cashLabel2.setForeground(new Color(84, 140, 168));

        totalSoldLabel = new JLabel("(c)Total Goods Sold");
        totalSoldLabel2 = new JLabel("(b) - (a) - (d)");
        purchasesLabel = new JLabel("(d)Value of purchases");
        purchasesLabel2 = new JLabel("All purchases from suppliers");
        expenseLabel = new JLabel("Total Expenses");
        expenseLabel2 = new JLabel("(c) - cash");

        salesTable = new JTable();
    }

    public void setGUI()
    {
        createTable();
        goodsHeadPanel = new JPanel();
        goodsHeadPanel.setLayout(new BoxLayout(goodsHeadPanel, BoxLayout.PAGE_AXIS));
        goodsHeadPanel.add(Box.createRigidArea(new Dimension(0,0)));
        goodsHeadPanel.setBorder(BorderFactory.createEmptyBorder(5,5,0,10));

        goodsPanel.add(Box.createRigidArea(new Dimension(0,10)));
        goodsPanel.setLayout(new BoxLayout(goodsPanel, BoxLayout.PAGE_AXIS));
        goodsPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        expensesPanel.setLayout(new BoxLayout(expensesPanel, BoxLayout.PAGE_AXIS));
        expensesPanel.add(Box.createRigidArea(new Dimension(0,0)));
        expensesPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));
        centerPanel.add(Box.createRigidArea(new Dimension(0,0)));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        allCenterPanels.setLayout(new BoxLayout(allCenterPanels, BoxLayout.PAGE_AXIS));

        fullCenterPanel.setLayout(new BoxLayout(fullCenterPanel, BoxLayout.LINE_AXIS));
        fullCenterPanel.add(Box.createRigidArea(new Dimension(0,0)));
        fullCenterPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
        westPanel.setBorder(BorderFactory.createEmptyBorder(0,40,0,400));

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.add(Box.createRigidArea(new Dimension(0,0)));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        buttonPanel.setBackground(new java.awt.Color(179, 205, 224));

        yearAndNotice.setLayout(new BoxLayout(yearAndNotice, BoxLayout.LINE_AXIS));

        endTotalPanel.add(Box.createHorizontalGlue());
        endTotalPanel.add(Box.createRigidArea(new Dimension(0,0)));
        endTotalPanel.add(endValLabel);
        endTotalPanel.add(Box.createRigidArea(new Dimension(80,0)));
        endTotalPanel.add(endDateField);
        endTotalPanel.add(Box.createRigidArea(new Dimension(30,0)));

        begTotalPanel.add(Box.createHorizontalGlue());
        begTotalPanel.add(Box.createRigidArea(new Dimension(0,0)));
        begTotalPanel.add(beginValLabel);
        begTotalPanel.add(Box.createRigidArea(new Dimension(70,0)));
        begTotalPanel.add(beginDateField);
        begTotalPanel.add(Box.createRigidArea(new Dimension(30,0)));

        soldTotalPanel.add(Box.createRigidArea(new Dimension(0,0)));
        soldTotalPanel.add(totalSoldLabel);
        soldTotalPanel.add(Box.createRigidArea(new Dimension(125,0)));
        soldTotalPanel.add(totalSoldLabel2);
        soldTotalPanel.add(Box.createRigidArea(new Dimension(56,0)));


        cashPanel.add(Box.createRigidArea(new Dimension(35,0)));
        cashPanel.add(cashLabel);
        cashPanel.add(Box.createRigidArea(new Dimension(119,0)));
        cashPanel.add(cashLabel2);
        cashPanel.add(Box.createRigidArea(new Dimension(0,0)));


        purchPanel.add(Box.createRigidArea(new Dimension(50,0)));
        purchPanel.add(purchasesLabel);
        purchPanel.add(Box.createRigidArea(new Dimension(108,0)));
        purchPanel.add(purchasesLabel2);
        purchPanel.add(Box.createRigidArea(new Dimension(0,0)));

        totExpensePanel.add(Box.createRigidArea(new Dimension(0,0)));
        totExpensePanel.add(expenseLabel);
        totExpensePanel.add(Box.createRigidArea(new Dimension(145,0)));
        totExpensePanel.add(expenseLabel2);
        totExpensePanel.add(Box.createRigidArea(new Dimension(65,0)));

        westPanel.add(Box.createHorizontalGlue());
        westPanel.add(Box.createRigidArea(new Dimension(140,0)));
        Dimension minSizeCtrW = new Dimension(5, 0);
        Dimension prefSizeCtrW = new Dimension(0, 30);
        Dimension maxSizeCtrW = new Dimension(Short.MIN_VALUE, 0);
        westPanel.add(new Box.Filler(minSizeCtrW, prefSizeCtrW, maxSizeCtrW));
        westPanel.add(endValueField);
        westPanel.add(beginValueField);
        westPanel.add(totalSoldField);
        westPanel.add(cashValueFiled);
        westPanel.add(purchaseField);
        westPanel.add(totalExpenseField);
        westPanel.add(Box.createRigidArea(new Dimension(0,50)));

        noticeField.add(Box.createHorizontalGlue());
        noticePanel.add(noticeField);

        //goodsHeadPanel.add(goodSoldHead);

        goodsPanel.add(endTotalPanel);
        goodsPanel.add(begTotalPanel);
        goodsPanel.add(soldTotalPanel);

        expensesPanel.add(cashPanel);
        expensesPanel.add(purchPanel);
        expensesPanel.add(totExpensePanel);
        expensesPanel.add(Box.createRigidArea(new Dimension(0,0)));

        northPanel.add(northLabel);
        northPanel.setBorder(BorderFactory.createEmptyBorder(5,0,10,510));
        northPanel.setBackground(new java.awt.Color(179, 205, 224));

        centerPanel.add(Box.createRigidArea(new Dimension(0,10)));
        centerPanel.add(goodsHeadPanel);
        centerPanel.add(goodsPanel);
        centerPanel.add(expensesPanel);

        fullCenterPanel.add(centerPanel);
        fullCenterPanel.add(westPanel);

        allCenterPanels.add(fullCenterPanel);
        allCenterPanels.add(Box.createRigidArea(new Dimension(0,0)));

        noticePanel.add(Box.createRigidArea(new Dimension(0,0)));
        noticePanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,100));

        allCenterPanels.add(yearAndNotice);

        yearAndNotice.add(yearComboBox);
        yearAndNotice.add(noticePanel);

        yearComboBox.setBorder(BorderFactory.createEmptyBorder(0,60,0,65));

        allCenterPanels.add(Box.createRigidArea(new Dimension(0,5)));
        allCenterPanels.add(scrollPane);

        scrollPane.add(Box.createRigidArea(new Dimension(0,0)));
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0,60,0,80));

        allCenterPanels.add(Box.createRigidArea(new Dimension(0,0)));

        Dimension minSizeCtr = new Dimension(5, 0);
        Dimension prefSizeCtr = new Dimension(0, 150);
        Dimension maxSizeCtr = new Dimension(Short.MIN_VALUE, 0);
        centerPanel.add(new Box.Filler(minSizeCtr, prefSizeCtr, maxSizeCtr));

        southPanel.add(buttonPanel);
        southPanel.setBackground(new java.awt.Color(179, 205, 224));

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btnCalculate);

        Dimension minSize = new Dimension(5, 0);
        Dimension prefSize = new Dimension(5, 0);
        Dimension maxSize = new Dimension(Short.MIN_VALUE, 0);
        buttonPanel.add(new Box.Filler(minSize, prefSize, maxSize));

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btnSave);

        btnSave.setPreferredSize(new Dimension(80, 25));
        Dimension SaveminSize = new Dimension(5, 0);
        Dimension SaveprefSize = new Dimension(5, 0);
        Dimension SavemaxSize = new Dimension(Short.MIN_VALUE, 0);
        buttonPanel.add(new Box.Filler(SaveminSize, SaveprefSize, SavemaxSize));


        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btnExit);

        btnExit.setPreferredSize(new Dimension(80, 25));
        buttonPanel.add(Box.createHorizontalGlue());

        mainFrame.add(northPanel, BorderLayout.NORTH );
        mainFrame.add(allCenterPanels, BorderLayout.CENTER );
        //mainFrame.add(westPanel, BorderLayout.EAST);
        mainFrame.add(southPanel, BorderLayout.SOUTH);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        btnCalculate.addActionListener(this);
        btnExit.addActionListener(this);
        btnSave.addActionListener(this);

        mainFrame.pack();
        mainFrame.setSize(750, 550);
        mainFrame.show();

    }

    private void createTable() {
        salesTable.setBackground(new java.awt.Color(179, 205, 224));

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"May", "R 10 300", "R 1 300", "R18 550", "R11 680"},
                        {"June", null, null, "R11 680", "R13 010"},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Month", "Sales" , "Expenses",
                        "Beginning Stock", "Ending Stock"
                }) {});
        scrollPane.setViewportView(salesTable);
        //salesTable.getColumnModel().getColumn(3).setPreferredWidth(70);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getActionCommand().equals("Save")) {
                SalesConfirmGUI obj = new SalesConfirmGUI();
                obj.setGUI();
            }

            else if(e.getActionCommand().equals("Exit")) {
                System.exit(0);
            }
            else if(e.getActionCommand().equals("Calculate")) {
                String cashStr = cashValueFiled.getText();
                int cashInt = Integer.parseInt(cashStr);

                if(cashInt < 0) {
                    JOptionPane.showMessageDialog(null, "cash cannot be a negative value.");
                    cashValueFiled.setText("");
                }
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        SalesGUI obj = new SalesGUI();
        obj.setGUI();
    }
}
