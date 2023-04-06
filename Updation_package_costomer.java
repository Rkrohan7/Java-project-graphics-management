package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public  class Updation_package_costomer  implements ActionListener{

	private JLabel head,code,name,midname,surname,contact,address,email,package_cos,type_costomer,package_amount,paid,
	               borrows,total_amount;
	private JButton delete,update,clear,cancel,search,calculation;
	private JTextField CODE,NAME,MIDNAME,SURNAME,CONTACT,EMAIL,PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT;
	private JTextArea ADDRESS;
	private JFrame frame;
	private JRadioButton rd,rd1,rd2;
	private ButtonGroup type; 
	private JComboBox combo,day,month,year;
	
	/*
	 * 
	 * constructor creation
	 * 
	 */
	
	Updation_package_costomer(){
		
		/*
		 * 
		 * all 
		 * frame settings 
		 */
		frame=new JFrame();
		frame.setTitle("Package costomer updation");
		
		//frame.setSize(1820,880);
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0,0,screensize.width,screensize.height);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.pack();
		
		Container c=frame.getContentPane();
		c.setBackground(Color.cyan);
		

		ImageIcon backgroung_Image = new ImageIcon("common.jpg");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1860,900, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		c.add(bg);
		//bg.add(login);
		//bg.add(heading);

		bg.setBounds(0, 0, 1860,900);
		frame.setVisible(true);
	    
		
		
		
		/*
		 * 
		 * object created all classes
		 *  
		 */
		
		head=new JLabel("updation customer details");
		code=new JLabel("code :");
		name=new JLabel("name :");
		midname=new JLabel("middle name :");
		surname=new JLabel("surname :");
		contact=new JLabel("contact no");
		address=new JLabel("address");
		email=new JLabel("email Id");
		package_cos=new JLabel("packge costomer");
		type_costomer=new JLabel("type costomer");
		package_amount=new JLabel("amount ");
		paid=new JLabel("paid");
		borrows=new JLabel("borrows");
		total_amount=new JLabel("total");
		
//all textfiled class objetc created
		
		CODE=new JTextField();
		NAME=new JTextField();
		MIDNAME=new JTextField();
		SURNAME=new JTextField();
		CONTACT=new JTextField();
		EMAIL=new JTextField();
		PACKAGE_AMOUNT=new JTextField();
		PAID=new JTextField();
		BORROWS=new JTextField();
		TOTAL_AMOUNT=new JTextField();
		
		ADDRESS=new JTextArea();
	
/*
 * 
 * 
 * button class object created
 */
		 
		   delete=new JButton("delete");
		   update=new JButton("update");
		   clear=new JButton("clear");
		 
		   search=new JButton("search");
		   calculation= new JButton("calculate");


		   

/*
 * font object created
 * 		
 */
		
		Font font1=new Font("Arial Rounded MT",Font.BOLD,20);
	    Font tfont=new Font("Century Schoolbook",Font.BOLD,20);
		   
		   
		   

		
/*
 * 
 * first side label settings
 * 	    
 */
	    head.setBounds(450, 50, 750, 100);
	   bg.add(head);
	    Font font=new Font("Imprint MT Shadow",Font.BOLD,70);
	    head.setFont(font);
	     
	    code.setBounds(100, 150, 100, 100);
	    code.setFont(font1);
	    bg.add(code);
	      
	    name.setBounds(100, 270, 100, 100);
	    name.setFont(font1);
	    bg.add(name);
	    
	    midname.setBounds(100, 340, 150, 100);
	    midname.setFont(font1);
	    bg.add(midname);
	    
	    surname.setBounds(100, 410, 100, 100);
	    surname.setFont(font1);
	    bg.add(surname);
	   
	    contact.setBounds(100, 480, 100, 100);
	    contact.setFont(font1);
	    bg.add(contact);
	    
	    address.setBounds(100, 550, 100, 100);
	    address.setFont(font1);
	    bg.add(address);
	   
/*
 * side fisrt
 * textfiled object created
 * 
 */
	    CODE.setBounds(200, 180, 150, 40);
	    CODE.setFont(tfont);
	    bg.add(CODE);

	    NAME.setBounds(300, 305, 150, 40);
	    NAME.setFont(tfont);
	    bg.add(NAME);
	
	    MIDNAME.setBounds(300, 375, 150, 40);
	    MIDNAME.setFont(tfont);
	    bg.add(MIDNAME);
	    
	   SURNAME.setBounds(300, 445, 150, 40);
	   SURNAME.setFont(tfont);
	   bg.add(SURNAME);
	    
	    CONTACT.setBounds(300, 515, 150, 40);
	    CONTACT.setFont(tfont);
	    bg.add(CONTACT);
	    
	    ADDRESS.setBounds(300, 585, 150, 80);
	    ADDRESS.setLineWrap(true);
	    ADDRESS.setFont(tfont);
	    bg.add(ADDRESS);
	
	    
	
	   
	// BUTTON SETTING
	    update.setBounds(1330, 250, 100, 50);
	    update.setFont(tfont);
	    bg.add(update);
	    
	     delete.setBounds(1330, 350, 100, 50);
	    delete.setFont(tfont);
	    bg.add(delete);
	    
	   
	    
	    clear.setBounds(1330, 450, 100, 50);
	    clear.setFont(tfont);
	    bg.add(clear);
	    
	    calculation.setBounds(1330, 550, 100, 50);
	    calculation.setFont(tfont);
	    bg.add(calculation); 
	    
	    
	    
	    search.setBounds(350, 180, 150, 40);
        search.setFont(tfont);
        bg.add(search);
        
  
  
  
  /*
 * 
 * second side
 * jabel object created
 * 
 */
	    
	    email.setBounds(600, 200, 100, 100);
	    email.setFont(font1);
	    bg.add(email);
	
	    package_cos.setBounds(600, 270, 300, 100);
	    package_cos.setFont(font1);
	    bg.add(package_cos);
	    
	
	    type_costomer.setBounds(600, 340, 300, 100);
	    type_costomer.setFont(font1);
	    bg.add(type_costomer);
	    
	    package_amount.setBounds(600, 410, 300, 100);
	    package_amount.setFont(font1);
	    bg.add(package_amount);
	    
	    paid.setBounds(600, 480, 300, 100);
	    paid.setFont(font1);
	    bg.add(paid);
	    
	    borrows.setBounds(600, 550, 300, 100);
	    borrows.setFont(font1);
	    bg.add(borrows);
	    
	    total_amount.setBounds(600, 620, 300, 100);
	    total_amount.setFont(font1);
	    bg.add(total_amount);
	   
	    
	    /*
	     * textfiled add 
	     * second side page
	     * 
	     */
	    
	    EMAIL.setBounds(850, 225, 150, 40);
	    //insert.setFont(font1);
	    EMAIL.setFont(tfont);
	    bg.add(EMAIL);
	     
	    PACKAGE_AMOUNT.setBounds(850, 440, 150, 40);
	    PACKAGE_AMOUNT.setFont(tfont);
	    //insert.setFont(font1);
	    bg.add(PACKAGE_AMOUNT);
	     
	    PAID.setBounds(850, 510, 150, 40);
	    PAID.setFont(tfont);
	    //insert.setFont(font1);
	    bg.add(PAID);
	   
	    BORROWS.setBounds(850, 580, 150, 40);
	    //insert.setFont(font1);
	    BORROWS.setFont(tfont);
	    bg.add(BORROWS);
	
	    TOTAL_AMOUNT.setBounds(850, 650, 150, 40);
	    //insert.setFont(font1);
	    TOTAL_AMOUNT.setFont(tfont);
	    bg.add(TOTAL_AMOUNT);
	
	
		   
/*
* 
* JComboBox object creation
* 	and all setting
* 
* and add the contAINER	   
*/
		   
		   String[] a= {
				   
				   "photo editing",
				   "banner editing",
				   "video editing",
				   "cenematic banner edit",
				   "dizital markiting",
				   "bussnes desin"};
		  combo=new JComboBox(a);
		   combo.setBounds(850, 300, 180, 40);
		   combo.setEditable(true);
		   combo.setFont(tfont);
		   bg.add(combo);
		   
	/*
	 * 
	 * 
	 * radio buutton add and all settings 
	 */
		   

		   
		rd=new JRadioButton("personal");   
		rd.setBounds(800,370,150,50);
		rd.setFont(tfont);
		bg.add(rd);
 
		 rd1=new JRadioButton("bussness");   
		rd1.setBounds(950,370,150,50);
		rd1.setFont(tfont);
		
		bg.add(rd1);
		
		 rd2=new JRadioButton("political");   
		rd2.setBounds(1100,370,150,50);
		rd2.setFont(tfont);
			
		bg.add(rd2);
		
		
		type=new ButtonGroup();
		type.add(rd);
		type.add(rd1);
		type.add(rd2);
		
		search.addActionListener(this);

		delete.addActionListener(this);
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				
				
				
				
				
				PreparedStatement stmt = null;
				Connection conn=Connection_class.getconnection();
				 int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update data?","Update",JOptionPane.YES_NO_OPTION);
				   if(p==0)
				   {
				      try {
				    	  
				    		
							int COD=Integer.parseInt(CODE.getText());      
							String NAM=NAME.getText();
							String MID=MIDNAME.getText();
							String SUR=SURNAME.getText();
							int CON=Integer.parseInt(CONTACT.getText());      
							String AREA=ADDRESS.getText();
							String EMA=EMAIL.getText();
							String com=type.getSelection().getActionCommand();
							String RADI=type.getSelection().getActionCommand();
							
						    int PAC=Integer.parseInt(PACKAGE_AMOUNT.getText());
						    int PAI=Integer.parseInt(PAID.getText());
				            int BOR=Integer.parseInt(BORROWS.getText());
					        int  TOT=Integer.parseInt(TOTAL_AMOUNT.getText());
					     
				 System.out.println("1");      
				    //update add_fix1 set NAME ='" + b+ "',ADDR='" + c + "',CONTACT ='" + d + "',EMAIL ='" + e+ "' where ID= " + ID.getText())
		PreparedStatement ps = conn.prepareStatement("update package_customer set NAME ='" + NAM+ "',MID ='" + MID+ "',SUR ='" + SUR + "', CON='" + CON+ "' , ADDR ='" + AREA + "'  , EMIL='" + EMA + "' , P_TYPE='" +com + "' , B_TYPE ='" + RADI + "' ,P_AMOUNT='" + PAC + "' , P_PAID ='" + PAI + "' ,BORROW ='" + BOR + "'  , TOTAL ='" + TOT + "'where ID= " + CODE.getText());
		System.out.println("2");		      
		System.out.println("3");		      
		ps.executeUpdate();
				       System.out.println("4");
				      JOptionPane.showMessageDialog(null,"Table Updated Successfully."); 
				       
				   } catch (Exception e1) {
				         
				       JOptionPane.showMessageDialog(null,"We face a Problem."); 
				   }
				   
				   }
				
			}

			
			
			
			
			
			
			
			
			
		});
		clear.addActionListener(this);
		cancel.addActionListener(this);
		calculation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				//PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT;
				Long baki =Long.parseLong(BORROWS.getText());
				Long current_amount =Long.parseLong(PACKAGE_AMOUNT.getText());
				Long paying=Long.parseLong(PAID.getText());
				
				
				Long addtion=baki+current_amount;
				Long sub=addtion-paying;
				
				
				
		       if(sub<=0) {
		    	   int set_0=0;
		    	   int intial=00;
		    	   BORROWS.setText(""+set_0);
		    	   TOTAL_AMOUNT.setText(sub+""); 
		    	   PACKAGE_AMOUNT.setText(""+intial);
		    	   
		       }else {
		    	   
		       	   
		    	   BORROWS.setText(sub+"");
		    	   TOTAL_AMOUNT.setText(""+"-"+sub); 
		    	  
		    	   
		      
				
				
				
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
	
	}
	
	
	
	
	
	
public void insert_values() throws SQLException {
	 
	
	
			
			
			/*
			 * 
			 * getting all values from 
			 * textfields
			 * 
			 * CODE,NAME,MIDNAME,SURNAME,CONTACT,EMAIL,PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT
			 */
	

			rd.setActionCommand("personal");
			rd1.setActionCommand("bussness");
			rd2.setActionCommand("political");
			
	
			
			int COD=Integer.parseInt(CODE.getText());      
			String NAM=NAME.getText();
			String MID=MIDNAME.getText();
			String SUR=SURNAME.getText();
			int CON=Integer.parseInt(CONTACT.getText());      
			String AREA=ADDRESS.getText();
			String EMA=EMAIL.getText();
			String com=type.getSelection().getActionCommand();
			String RADI=type.getSelection().getActionCommand();
			
		    int PAC=Integer.parseInt(PACKAGE_AMOUNT.getText());
		    int PAI=Integer.parseInt(PAID.getText());
            int BOR=Integer.parseInt(BORROWS.getText());
	        int  TOT=Integer.parseInt(TOTAL_AMOUNT.getText());
	     
			
			
			}
	
public static void main(String[] args) {
	    new  Updation_package_costomer();
		}






@Override
public void actionPerformed(ActionEvent e) {
//	private JButton delete,update,clear,cancel,print,exit,back,search;

if(e.getSource()==clear) {
	
	
	CODE.setText("");
    NAME.setText("");
    MIDNAME.setText("");
    SURNAME.setText("");
    CONTACT.setText("");
    EMAIL.setText("");
    PACKAGE_AMOUNT.setText("");
    PAID.setText("");
    BORROWS.setText("");
    TOTAL_AMOUNT.setText("");
    ADDRESS.setText("");
	
}

if(e.getSource()==delete) {
	try {
		delete();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

if(e.getSource()==search) {
	System.out.println("hi");
	try {
		search();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
	
}



}






private void delete() throws SQLException {
	//area.setText(id);
	PreparedStatement pst;
	Connection conn=Connection_class.getconnection();
	pst=conn.prepareStatement("delete from package_customer  where id=?");
	int id=Integer.parseInt(CODE.getText());
	pst.setInt(1, id);
	 int b=pst.executeUpdate();
	System.out.println(b);
	 JOptionPane.showMessageDialog(null,"record delete succesfully");	

	 CODE.setText("");
	    NAME.setText("");
	    MIDNAME.setText("");
	    SURNAME.setText("");
	    CONTACT.setText("");
	    EMAIL.setText("");
	    PACKAGE_AMOUNT.setText("");
	    PAID.setText("");
	    BORROWS.setText("");
	    TOTAL_AMOUNT.setText("");
	    ADDRESS.setText("");
		




}


private void search() throws SQLException {
	System.out.println("hjkm,");
	PreparedStatement pst;
	Connection conn=Connection_class.getconnection();
	String sql=" select name,mid,sur,con,addr,emil,p_type,b_type,p_amount,p_paid,borrow,total from package_customer where id=?";
	pst=conn.prepareStatement(sql);
	int id=Integer.parseInt(CODE.getText());
	
	pst.setInt(1, id);
	ResultSet rsmt=pst.executeQuery();
	if(rsmt.next()==false) {
		 JOptionPane.showMessageDialog(null,"record is not found");
	
	//	 CODE.setText("");
		 
		 
	}else
	{

		    NAME.setText(rsmt.getString("NAME"));
		    MIDNAME.setText(rsmt.getString("MID"));
		    SURNAME.setText(rsmt.getString("SUR"));
		    CONTACT.setText(rsmt.getString("CON"));

		    EMAIL.setText(rsmt.getString("EMIL"));
		    
		    PACKAGE_AMOUNT.setText(rsmt.getString("P_AMOUNT"));
		    PAID.setText(""+rsmt.getInt("P_PAID"));
		    BORROWS.setText(""+rsmt.getInt("BORROW"));
		    TOTAL_AMOUNT.setText(""+rsmt.getInt("TOTAL"));
		    ADDRESS.setText(rsmt.getString("ADDR"));

	}
	
}



}
























