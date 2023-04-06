package project;
/*
 * 
 *  ID                                                 
 NAME                                               
 MID                                              
 SUR                                               
 CON                                              
 ADDR                                            
 EMIL                                           
 P_TYPE                                      
 B_TYPE                                         
 P_AMOUNT                                   
 P_PAID                                          
 BORROW                                       
 TOTAL                   
 * 
 * 
 * 
 * 
 */
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class View_fix_customer extends JFrame implements ActionListener {
     
   JTable j1;
   JButton b1;
  String h[]= {"ID","NAME","ADDR","CONTACT ","EMAIL ","BORROW","TOTAL_A  "};
   //String h[]={"ID","NAME","BNAME ","CONTACT","EMAIL"};
   String d[][]=new String[10][7];
   int i=0 ,j=0;
   
    View_fix_customer()
    {
       
        setBounds(450,150,800,300);
        try
        {
            String q="select * from add_fix1";
    		Connection con=Connection_class.getconnection();
            PreparedStatement pst=con.prepareStatement(q);
    		ResultSet rs =pst.executeQuery();
            while(rs.next())
            {
            	/*
            	 * 
            	 * 
            	 * 
            	 * 
            	 * 
            	 *  ID                                                 
 ID                                                 NUMBER(10)
 NAME                                               VARCHAR2(100)
 ADDR                                               VARCHAR2(100)
 CONTACT                                            VARCHAR2(100)
 EMAIL                                              VARCHAR2(100)
 BORROW                                             NUMBER(10)
 TOTAL_A                                            NUMBER(10)

            	 * 
            	 * 
            	 * 
            	 * 
            	 * 
            	 * 
            	 * 
            	 */
                d[i][j++]=rs.getString("ID");
                d[i][j++]=rs.getString("NAME");
                d[i][j++]=rs.getString("ADDR");
                 d[i][j++]=rs.getString("CONTACT");
                 d[i][j++]=rs.getString("EMAIL");
                 d[i][j++]=rs.getString("BORROW");
                 d[i][j++]=rs.getString("TOTAL_A");
                

                 i++;
                 j=0;
            }
            j1=new JTable(d,h);
         
        }
        catch(Exception e)
                {
                   
                }
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        b1.addActionListener(this);
       
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
       try
       {
           j1.print();
       }
       catch(Exception e)
       {
           
       }
    }
    public static void main(String args[])
    {
        new  View_fix_customer();
    }

}
