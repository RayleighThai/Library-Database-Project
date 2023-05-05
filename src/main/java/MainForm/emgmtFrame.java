package MainForm;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rayleigh Thai
 */
public class emgmtFrame extends javax.swing.JFrame {
    public emgmtFrame() {
        initComponents();
        addb.setVisible(false);
        bonusp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        olist = new javax.swing.JTable();
        backb = new javax.swing.JButton();
        refreshb = new javax.swing.JButton();
        infopane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        esalt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enamet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etitlet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lphonet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        laddt = new javax.swing.JTextField();
        eidt = new javax.swing.JTextField();
        lnamet = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lidt = new javax.swing.JTextField();
        addb = new javax.swing.JButton();
        newb = new javax.swing.JButton();
        updb = new javax.swing.JButton();
        delb = new javax.swing.JButton();
        bonusb = new javax.swing.JButton();
        bonusp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        inct = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        incb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Employee(s): ");

        olist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Salary", "Library Location", "Library Phone #"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        olist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(olist);
        if (olist.getColumnModel().getColumnCount() > 0) {
            olist.getColumnModel().getColumn(0).setResizable(false);
            olist.getColumnModel().getColumn(0).setPreferredWidth(3);
            olist.getColumnModel().getColumn(1).setResizable(false);
            olist.getColumnModel().getColumn(1).setPreferredWidth(70);
            olist.getColumnModel().getColumn(2).setResizable(false);
            olist.getColumnModel().getColumn(2).setPreferredWidth(15);
            olist.getColumnModel().getColumn(3).setResizable(false);
            olist.getColumnModel().getColumn(3).setPreferredWidth(135);
            olist.getColumnModel().getColumn(4).setResizable(false);
            olist.getColumnModel().getColumn(4).setPreferredWidth(45);
        }

        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        refreshb.setText("Refresh");
        refreshb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbActionPerformed(evt);
            }
        });

        jLabel5.setText("Salary");

        jLabel2.setText("Full Name");

        jLabel3.setText("Title");

        jLabel6.setText("Library:");

        jLabel7.setText("Library Adress: ");

        jLabel8.setText("Library Phone: ");

        jLabel4.setText("Employee ID");

        eidt.setEditable(false);

        jLabel9.setText("Library ID");

        addb.setText("Add");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infopaneLayout = new javax.swing.GroupLayout(infopane);
        infopane.setLayout(infopaneLayout);
        infopaneLayout.setHorizontalGroup(
            infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etitlet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enamet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eidt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esalt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopaneLayout.createSequentialGroup()
                        .addComponent(lidt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infopaneLayout.createSequentialGroup()
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lnamet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laddt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infopaneLayout.createSequentialGroup()
                                .addComponent(lphonet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addb)))
                        .addGap(108, 108, 108))))
        );
        infopaneLayout.setVerticalGroup(
            infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infopaneLayout.createSequentialGroup()
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(eidt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(etitlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(enamet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(esalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infopaneLayout.createSequentialGroup()
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lidt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lnamet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(laddt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lphonet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addb))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        newb.setText("New");
        newb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbActionPerformed(evt);
            }
        });

        updb.setText("Update");
        updb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updbActionPerformed(evt);
            }
        });

        delb.setText("Delete");
        delb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbActionPerformed(evt);
            }
        });

        bonusb.setText("Pay Increase");
        bonusb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusbActionPerformed(evt);
            }
        });

        jLabel10.setText("Increment Increase ");

        jLabel11.setText("in percentage(%). ie: 8 for 8%");

        incb.setText("Increase");
        incb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bonuspLayout = new javax.swing.GroupLayout(bonusp);
        bonusp.setLayout(bonuspLayout);
        bonuspLayout.setHorizontalGroup(
            bonuspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bonuspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bonuspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(bonuspLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inct))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bonuspLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(incb)))
                .addContainerGap())
        );
        bonuspLayout.setVerticalGroup(
            bonuspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bonuspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bonuspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(incb)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infopane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshb))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backb)
                        .addGap(111, 111, 111)
                        .addComponent(newb)
                        .addGap(101, 101, 101)
                        .addComponent(updb)
                        .addGap(99, 99, 99)
                        .addComponent(delb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bonusb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bonusp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infopane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(bonusp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backb)
                    .addComponent(newb)
                    .addComponent(updb)
                    .addComponent(delb)
                    .addComponent(bonusb))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fclose(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        fclose();
        guimanager back = new guimanager();
        back.setVisible(true);
    }//GEN-LAST:event_backbActionPerformed

    private void refreshbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbActionPerformed
        refresh();
    }//GEN-LAST:event_refreshbActionPerformed
    
    void geteinfo(String id) {
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
           String query = "SELECT * FROM employee where e_id = \""+id + "\"";
           System.out.println(query);
           Statement sta = connection.createStatement();
           ResultSet rs = sta.executeQuery(query); 
           while(rs.next())
           {
                eidt.setText(rs.getString("e_id"));
                enamet.setText(rs.getString("e_fullname"));
                etitlet.setText(rs.getString("e_title"));
                esalt.setText(rs.getString("e_salary"));
           }
           connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
                }
    }
    
    void getlinfo(String name) {
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
           String query = "SELECT * FROM library where l_name = \""+name + "\"";
           System.out.println(query);
           Statement sta = connection.createStatement();
           ResultSet rs = sta.executeQuery(query); 
           while(rs.next())
           {
               lidt.setText(rs.getString("l_id"));
                lnamet.setText(rs.getString("l_name"));
                laddt.setText(rs.getString("l_address"));
                lphonet.setText(rs.getString("l_phone"));
           }
           connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
    }
    
    private void olistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olistMouseClicked
        int index = olist.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) olist.getModel();
        String eid = model.getValueAt(index, 0).toString();
        String lname = model.getValueAt(index, 3).toString();
        geteinfo(eid);
        getlinfo(lname);
    }//GEN-LAST:event_olistMouseClicked

    private void newbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbActionPerformed
        JOptionPane.showMessageDialog(this, "REQUIRED: Please enter Employee Name, Library location!");
        eidt.setText("");
        enamet.setText("");
        etitlet.setText("");
        esalt.setText("");
        lidt.setText("");
        lnamet.setText("");
        laddt.setText("");
        lphonet.setText("");
        addb.setVisible(true);
    }//GEN-LAST:event_newbActionPerformed
    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        String name = enamet.getText();
        String lid = lidt.getText();
        if (name.equals("") || lid.equals(""))
        {
            JOptionPane.showMessageDialog(this, "REQUIRED: Please enter Employee Name, Library location!");
        }
        else {
            addnewe(name, lid);
        }
    }//GEN-LAST:event_addbActionPerformed
    int getnid() {
        int nid = -1;
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
           String query = "select max(e_id) from employee where e_title = \"clerk\";";
           System.out.println(query);
           Statement sta = connection.createStatement();
           ResultSet rs = sta.executeQuery(query); 
           while(rs.next())
           {
                nid = Integer.parseInt(rs.getString("max(e_id)")) + 1;
           }
           connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
        return nid;
    }
    void addnewe(String name, String lid) {
        int eid = getnid();
        if (eid < 0) {
            eid = 1;
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
            String insert = "Insert into `employee` (e_id, e_fullname, l_id) values (\""+ eid+ "\", \""+ name +"\", \""+ lid + "\")" ;
            System.out.println(insert);
           Statement sta = connection.createStatement();
           sta.executeUpdate(insert); 
           connection.close();
           addb.setVisible(false);
           JOptionPane.showMessageDialog(this, "New entry added");
           refresh();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
    }
    
    private void updbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updbActionPerformed
        String name = enamet.getText();
        String title = etitlet.getText();        
        try {
            int eid = Integer.parseInt(eidt.getText());
            int sal = Integer.parseInt(esalt.getText());
            int lid = Integer.parseInt(lidt.getText());
            updatee(eid, name, title, sal, lid);
            refresh();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter numerical value for Employee ID, Employee Salary, Library ID and Library Phone!");
        }
    }//GEN-LAST:event_updbActionPerformed
    void updatee(int id, String n, String t, int s, int lid) {
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
           String query = "update employee set e_fullname = \"" + n 
                   + "\", e_title = \"" + t
                   + "\", e_salary = \"" + s
                   + "\", l_id = \"" + lid
                   + "\" where e_id = \"" + id +"\"; ";
           System.out.println(query);
           Statement sta = connection.createStatement();
           sta.executeUpdate(query); 
           connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
    }
    
    private void delbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbActionPerformed
       String id = eidt.getText();
       try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root", "");              
            Statement sta = connection.createStatement();
            String str = "DELETE FROM `employee` WHERE e_id = " + id;
            System.out.println(str);
            sta.executeUpdate(str);
            JOptionPane.showMessageDialog(this, "Employee has been removed.");
            refresh();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }  
    }//GEN-LAST:event_delbActionPerformed

    private void bonusbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusbActionPerformed
        bonusp.setVisible(true);
    }//GEN-LAST:event_bonusbActionPerformed

    private void incbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incbActionPerformed
        int index = olist.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Please select an employee!");
        }
        else {
            String id = eidt.getText();
            try {
                float inc = Float.parseFloat(inct.getText());
                int sal = Integer.parseInt(esalt.getText());
                increase(id, sal, inc);
            } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter numerical value for Employee ID, Employee Salary, Library ID and Library Phone!");
            }
            JOptionPane.showMessageDialog(this, "This Employee now have new pay.");
            refresh();
            bonusp.setVisible(false);
        }
    }//GEN-LAST:event_incbActionPerformed
    
    void increase(String id, int s, float inc) {
        float bump = 1 + (inc/100);
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
           String query = "update employee set e_salary = salaryinc(\"" + s 
                   + "\", " + bump
                   + ") where e_id = \"" + id +"\"; ";
           System.out.println(query);
           Statement sta = connection.createStatement();
           sta.executeUpdate(query); 
           connection.close();
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
    }
    
    public void refresh() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/number_1", "root","");
            String query = "SELECT * FROM number_1.employee as e join library as l on l.l_id = e.l_id order by e_id;";
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);  
            DefaultTableModel model = (DefaultTableModel) olist.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                String[] table = new String[5];
                table[0] = rs.getString("e_id");
                table[1] = rs.getString("e_fullname");
                table[2] = rs.getString("e_salary");
                table[3] = rs.getString("l_name");
                table[4] = rs.getString("l_phone");
                model.addRow(table);
            }
            olist.setModel(model);
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(emgmtFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emgmtFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emgmtFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emgmtFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emgmtFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    private javax.swing.JButton backb;
    private javax.swing.JButton bonusb;
    private javax.swing.JPanel bonusp;
    private javax.swing.JButton delb;
    private javax.swing.JTextField eidt;
    private javax.swing.JTextField enamet;
    private javax.swing.JTextField esalt;
    private javax.swing.JTextField etitlet;
    private javax.swing.JButton incb;
    private javax.swing.JTextField inct;
    private javax.swing.JPanel infopane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField laddt;
    private javax.swing.JTextField lidt;
    private javax.swing.JTextField lnamet;
    private javax.swing.JTextField lphonet;
    private javax.swing.JButton newb;
    private javax.swing.JTable olist;
    private javax.swing.JButton refreshb;
    private javax.swing.JButton updb;
    // End of variables declaration//GEN-END:variables
}