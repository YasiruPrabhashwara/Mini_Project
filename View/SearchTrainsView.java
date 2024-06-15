package View;

import Control.SearchTrainsController;
import Model.TrainModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchTrainsView extends JFrame {

    public JTextField trainNameTextField;
    public JButton searchButton;
    public JButton backButton;
    public JTable resultsTable;

    public SearchTrainsView() {
        initComponents();
    }

    private void initComponents() {
        JScrollPane jScrollPane3 = new JScrollPane();
        JTable jTable2 = new JTable();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable search_table = new JTable();
        JScrollPane jScrollPane4 = new JScrollPane();
        JTable jTable1 = new JTable();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JLabel Sbtn = new JLabel();
        trainNameTextField = new JTextField();
        searchButton = new JButton();
        backButton = new JButton();
        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        resultsTable = new JTable();

        jTable2.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        search_table.setBorder(BorderFactory.createEtchedBorder());
        search_table.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(search_table);

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sbtn.setBackground(new java.awt.Color(204, 0, 0));
        Sbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Sbtn.setForeground(new java.awt.Color(255, 255, 255));
        Sbtn.setText("Train Name");
        jPanel3.add(Sbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 30, 115, 40));

        trainNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(trainNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 38, 240, 30));

        searchButton.setBackground(new java.awt.Color(204, 0, 0));
        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchButton.setText("Search");
        jPanel3.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 39, 100, -1));

        backButton.setBackground(new java.awt.Color(204, 0, 0));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setText("Back");
        jPanel3.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 35, 110, 35));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/InterFaces/Image/20535134.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 153));

        resultsTable.setBackground(new java.awt.Color(0, 204, 204));
        resultsTable.setBorder(BorderFactory.createEtchedBorder());
        resultsTable.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(resultsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 730, 250));

        pack();
        setLocationRelativeTo(null);
    }
     public static void main(String args[]) {
         
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TrainModel model = new TrainModel();
                SearchTrainsView view = new SearchTrainsView();
                new SearchTrainsController(model, view);
                view.setVisible(true);
            }
        });
}
}
