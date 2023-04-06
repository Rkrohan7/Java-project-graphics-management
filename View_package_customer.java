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

public class View_package_customer extends JFrame implements ActionListener {
     
   JTable j1;
   JButton b1;
  String h[]= {"ID","NAME","MID ","SUR ","CON ","ADDR ","EMIL","P_TYPE  ","  B_TYPE","P_AMOUNT ","P_PAID ","BORROW","TOTAL"};
   //String h[]={"ID","NAME","BNAME ","CONTACT","EMAIL"};
   String d[][]=new String[100][13];
   int i=0 ,j=0;
   
    View_package_customer()
    {
       
        setBounds(450,150,800,300);
        try
        {
            String q="select * from package_customer";
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
            	 * 
            	 * 
            	 * 
            	 */
                d[i][j++]=rs.getString("ID");
                d[i][j++]=rs.getString("NAME");
                d[i][j++]=rs.getString("MID");
                 d[i][j++]=rs.getString("SUR");
                 d[i][j++]=rs.getString("CON");
                 d[i][j++]=rs.getString("ADDR");
                 d[i][j++]=rs.getString("EMIL");
                 d[i][j++]=rs.getString("P_TYPE");
                 d[i][j++]=rs.getString("B_TYPE");
                 d[i][j++]=rs.getString("P_AMOUNT");
                 d[i][j++]=rs.getString("P_PAID");
                 d[i][j++]=rs.getString("BORROW");
                 d[i][j++]=rs.getString("TOTAL");


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
        new  View_package_customer();
    }

}
