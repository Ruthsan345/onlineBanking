package onlinenetbanking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */ import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class TRANSFER_FUND extends javax.swing.JFrame {

    /**
     * Creates new form TRANSFER_FUND
     */
    public TRANSFER_FUND() {
        initComponents();
           try
{ 
    String v=LOGIN2.t3.getText();
   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","swetha123");
PreparedStatement ps=conn.prepareStatement("select BENEFICIARY_ACC_NO from  BENEFICIARY where acc_no='"+v+"'");
ResultSet rs=ps.executeQuery();
//PreparedStatement ps1=conn.prepareStatement("select balance,branchname,ifsc_no from account1");
//ResultSet rs1=ps1.executeQuery();
DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
tm.setRowCount(0);
while(rs.next())
{
   Object o[]={rs.getInt( "BENEFICIARY_ACC_NO")};//,rs.getString("RESPONSE")};//,rs.getString("mobile"),rs1.getString("ifsc_no"),rs1.getString("branchname"),rs1.getString("balance")};
      tm.addRow(o);
	  
}
   
  
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e);
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        T1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label1.setName("RECIEVER ACC_NO"); // NOI18N
        label1.setText("RECIEVER ACC_NO");

        label2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label2.setName("AMOUNT"); // NOI18N
        label2.setText("AMOUNT");

        textField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button1.setLabel("TRANSFER");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "BENEFICIARY_ACC_NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("                        TRANSFER FUND");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinenetbanking/mt.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinenetbanking/back1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
        CHOICE CH2=new CHOICE();
		CH2.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_textField2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
      Random rand =new Random();
        if(Integer.parseInt(textField2.getText())<5000 &&Integer.parseInt(textField2.getText())>1  )
        {
            
      try{
                                           //int a=Integer.parseInt(LOGIN.t3.getText());
                                           String a=LOGIN2.t3.getText();
                                            String j = null;
                                           // System.out.print(a);
                                            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","swetha123");
                                             String sqll="select *from account1 where acc_no='"+T1.getText()+"'";
                                            PreparedStatement pss=conn.prepareStatement(sqll);
                                            ResultSet rs1=pss.executeQuery();
                                            if(rs1.next()){
                                                    int rand1 = rand.nextInt(10000-1001)+1001;     //random no generated
                                                     JOptionPane.showMessageDialog(null," "+rand1);
                                       String sqlo="select mobile from account_info where acc_no= '"+a+"' ";  //to fetch the phone number from my aadhar database

  
            PreparedStatement pst1 = conn.prepareStatement(sqlo);
            ResultSet rso=pst1.executeQuery();
   
            if (rso.next()){
                JOptionPane.showMessageDialog(null," "+rso.getString(1));
              //  JOptionPane.showMessageDialog(null," step 1 passed");
             String mono=rso.getString(1).toString();    
            JOptionPane.showMessageDialog(null,"fetch successfull " +mono);
           
       
            try {
			// Construct data
			String apiKey = "apikey=" + "C1L8Iucf+kA-2L77ptR8HhjBgg42E8H5Exp2Xv3ylX";   //this is your api key da karuvaaya
			String message = "&message=" + "YOUR OTP IS "+rand1;
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + mono;

			// Send data
			
			HttpURLConnection conn2 = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn2.setDoOutput(true);
			conn2.setRequestMethod("POST");
			conn2.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn2.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
		}
            
         
            
            String getval =JOptionPane.showInputDialog("Please enter the OTP that is sent to  "+mono);     //this will get your otp input  
            int otp=Integer.parseInt(getval);
            if (rand1==otp){              // this will check your otp


               //if the condition is true 
                       
                                      //      String sql="insert into transaction values(0,'"+a+"',SYSDATE,'"+textField2.getText()+"',transfer,'"+ T1.getText()+"')";
                                             String sql="insert into transaction values(?,?,SYSDATE,?,?,?)";
                                            PreparedStatement ps=conn.prepareStatement(sql);
                                           ps.setString(1,"1");
                                            ps.setString(2,a);
                                            // ps.setString(1,'sysdate');
                                             ps.setString(3,textField2.getText());
                                             ps.setString(4,"transfer");
                                             ps.setString(5,T1.getText());
                                             
                                            
                                            /*ResultSet rs=ps.executeQuery();
                                            if(rs.next()){
                                                JOptionPane.showMessageDialog(null,"LOGINNNNNNNNNNNNN");
                                                
                                            }
                                            else
                                            {
                                                 JOptionPane.showMessageDialog(null,"LOGINNNNNNNNNNNNNooooo");
                                            }*/
                                            ps.executeUpdate();
                                            //  JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESSFULL");
                                           
                                            String sql1="create or replace PROCEDURE TRANSFER(p_sender IN NUMBER, p_receiver IN NUMBER, p_amount IN NUMBER)\n" +
"IS\n" +
"BEGIN\n" +
"UPDATE ACCOUNT1 SET BALANCE = BALANCE - p_amount \n" +
"WHERE ACC_NO = p_sender;\n" +
"UPDATE ACCOUNT1 SET BALANCE = BALANCE + p_amount\n" +
"WHERE ACC_NO = p_receiver;\n" +
"END;"                                                  ;
                                             PreparedStatement ps1=conn.prepareStatement(sql1);
                                             ps1.executeUpdate();
                                              // JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESSFULL");
                                             
                                           String sql2="{call TRANSFER(?,?,?)}";
                                             //PreparedStatement ps1=conn.prepareStatement(sql2);
                                             CallableStatement cs=conn.prepareCall(sql2);
                                              cs.setString(1,a);
                                             cs.setString(2,T1.getText());
                                             cs.setString(3,textField2.getText());
                                              cs.executeQuery();
                                               JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESSFULL");
                                               
                                                String sql5="SELECT BALANCE FROM ACCOUNT1 WHERE ACC_NO='"+a+"'";
                                            PreparedStatement ps5=conn.prepareStatement(sql5);
                                                ResultSet rs=ps5.executeQuery();
                                                
                                                if(rs.next()){
                                                 j=rs.getString("balance");
                                                }
                                                JOptionPane.showMessageDialog(null, "CURRENT BALANCE " + j);
                                            
                                            conn.close();

              }
            else{
                JOptionPane.showMessageDialog(null,"OTP NOT VALID");
			 
			  
			  }                                  
                                           // String sql="select * from tlogin where user_name='"+t1.getText()+"' and password='"+t2.getText()+"'";
                                  
                               //      login lllk=new login();
                                          //  lllk.setVisible(true);
                                           }
                                            }
                                            else{
                                                 JOptionPane.showMessageDialog(null,"ACCOUNT NUMBER NOT VALID");
                                                 
                                                 
                                                 
                                            }
                                                }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                                          CHOICE CH=new CHOICE();
                                          CH.setVisible(true);
                                          this.dispose();
        }
                     else{
    
         JOptionPane.showMessageDialog(null, "TRANSACTION LIMIT IS 5000 OR TRSANSACTION AMOUNT IS LESS THAN ZERO");
    }
    
    }//GEN-LAST:event_button1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        CHOICE CH=new CHOICE();
        CH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i =jTable1.getSelectedRow();
     DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
        T1.setText(mod.getValueAt(i,0).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    
   
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
            java.util.logging.Logger.getLogger(TRANSFER_FUND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSFER_FUND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSFER_FUND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSFER_FUND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSFER_FUND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField T1;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField2;
    // End of variables declaration//GEN-END:variables
}
