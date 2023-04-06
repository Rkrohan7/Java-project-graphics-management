package project;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class View_target1 extends JFrame implements ActionListener {
     
   JTable j1;
   JButton b1;
  String h[]= {"ID","NAME","BNAME ","CONTACT ","EMAIL"};
   //String h[]={"ID","NAME","BNAME ","CONTACT","EMAIL"};
   String d[][]=new String[100][5];
   int i=0 ,j=0;
   
    View_target1()
    {
       
        setBounds(450,150,800,300);
        try
        {
            String q="select * from target_cos";
    		Connection con=Connection_class.getconnection();
            PreparedStatement pst=con.prepareStatement(q);
    		ResultSet rs =pst.executeQuery();
            while(rs.next())
            {
            	
                d[i][j++]=rs.getString("ID");
                d[i][j++]=rs.getString("NAME");
                d[i][j++]=rs.getString("BNAME");
                 d[i][j++]=rs.getString("CONTACT");
                 d[i][j++]=rs.getString("EMAIL");
                


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
        new  View_target1();
    }

}
