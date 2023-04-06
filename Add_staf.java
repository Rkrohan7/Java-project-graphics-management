package project ;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Add_staf implements ActionListener{

	
JPanel login,login1;
JFrame frame;
JLabel head,name,age,sal,time,exp,desi,id,search;
JTextField NAME,AGE,SAL,TIME,EXP,DESI,EXPERTIES,ID,SEARCH,ADDR;
JButton submit,SEA;
JTextArea area;
JButton update,delete,clear,back,home_page,exit;


	Add_staf(){

		
		

		frame=new JFrame();
		 search=new JLabel("search id :");
        login=new JPanel();
       login1=new JPanel();
 
 
		id=new JLabel("Id :");
	 name	=new JLabel("name");
		head=new JLabel("Add Staf");
		age=new JLabel("age :");
		sal=new JLabel("salary :");
	    time	=new JLabel(" duty time : ");
		exp=new JLabel("experiencs :");
		desi=new JLabel("Design :");
        //addr=new JLabel("Address :");		
		
        
        
        /*
         * 
         * button
         * 
         */
        
        update=new JButton("Update");
        delete=new JButton("Delete");
        clear=new JButton("Reset");
        back=new JButton("back");
        home_page=new JButton("<< home page");
        exit=new JButton("Exit");
        
       submit =new JButton("submit");
       // reset=new JButton("reset");
       // home=new JButton("<< home");
        back=new JButton(" << back");

    	Font font3=new Font("Arial Rounded MT",Font.BOLD,24);

    	Font font1=new Font("Arial Rounded MT",Font.BOLD,20);
	    Font tfont=new Font("Century Schoolbook",Font.BOLD,20);
		   
		
		
		
		
		
		
		
		
		
		Container c=frame.getContentPane();
		c.setBackground(Color.cyan);
		
		
		ImageIcon backgroung_Image = new ImageIcon("v2.png");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1960,1000, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		frame.add(bg);
		//bg.add(login);
		//bg.add(heading);

		bg.setBounds(0, 0, 1960,1000);
	
		frame.setVisible(true);
	    
//panel 

		login.setLayout(null);
		login.setSize(400, 350);
		login.setBackground(new Color(1, 0, 0, 30));
		login.setBounds(270, 80, 350, 50);
		 
		
		head.setBounds(950, 50, 850, 100);
		   bg.add(head);
		    Font font=new Font("Imprint MT Shadow",Font.BOLD,70);
		    head.setFont(font);
		
            search.setBounds(300, 50, 200, 100);
            search.setFont(font3);
            bg.add(search);
		    id.setBounds(300, 130, 100, 100);
		    id.setFont(font1);
		    bg.add(id); 
		    
		    name.setBounds(300, 200, 100, 100);
		    name.setFont(font1);
		    bg.add(name);
		
 
		    age.setBounds(300, 270, 100, 100);
		    age.setFont(font1);
		    bg.add(age);
		    
		    sal.setBounds(300, 340, 100, 100);
		    sal.setFont(font1);
		    bg.add(sal);
		    
		    time.setBounds(300, 410, 100, 100);
		    time.setFont(font1);
		    bg.add(time);
		    
		    exp.setBounds(300, 480, 100, 100);
		    exp.setFont(font1);
		    bg.add(exp);
		    
		    desi.setBounds(300, 550, 100, 100);
		    desi.setFont(font1);
		    bg.add(desi);
		    
		    
	        

	//NAME,AGE,SAL,TIME,EXP,DESI,EXPERTIES;
		    ID=new JTextField();
		    SEARCH=new JTextField();

		    NAME=new JTextField();
		    AGE =new JTextField();
	        SAL=new JTextField();
	        TIME=new JTextField();
	        EXP=new JTextField();
	        DESI=new JTextField();
	        EXPERTIES=new JTextField();
	        ADDR=new JTextField();

	        
	        SEARCH.setBounds(500, 90, 100, 30);
		    SEARCH.setFont(font1);
		    bg.add(SEARCH);
	        
	        
	        ID.setBounds(500, 170, 200, 30);
		    ID.setFont(font1);
		    bg.add(ID);
	        
		    NAME.setBounds(500, 240, 200, 30);
		    NAME.setFont(font1);
		    bg.add(NAME);
		

		    AGE.setBounds(500,300,200,30);
		    AGE.setFont(font1);
		    bg.add(AGE);
		    
		    SAL.setBounds(500,365,200,30);
		    SAL.setFont(font1);
		    bg.add(SAL);
		    
		    TIME.setBounds(500,440,200,30);
		    TIME.setFont(font1);
		    bg.add(TIME);
		    
		    EXP.setBounds(500,515,200,30);
		    EXP.setFont(font1);
		    bg.add(EXP);
		    
		    DESI.setBounds(500, 585, 200, 30);
		    DESI.setFont(font1);
		    bg.add(DESI);
		    

		    ADDR.setBounds(500, 655, 200, 30);
		    ADDR.setFont(font1);
		    bg.add(ADDR);
		    
		 
	
		    //texr area
		    
		     area=new JTextArea();
	         area.setBounds(1000,200,400,300);
	         bg.add(area);
	
	         /// pannel
	         

	 		login1.setLayout(null);
	 		//login1.setSize(400, 350);
	 		login1.setBackground(new Color(1, 0, 0, 70));
	 		login1.setBounds(150, 740, 1000, 60);
	 		 
	         
	         
	         
	         // buttons
	         
	         
	         
	         
	         SEA=new JButton("Search");
	        
	         
	        
	         update.setBounds(350,750,100,40);
	         bg.add(update);
	  
	         delete.setBounds(500,750,100,40);
	         bg.add(delete);
	         clear.setBounds(650,750,100,40);
	         bg.add(clear);
	         back.setBounds(800,750,100,40);
	         bg.add(back);
	         //home_page
	         exit.setBounds(950,750,100,40);
	         bg.add(exit);
	         
	         submit=new JButton("submit");
	         submit.setBounds(200,750,100,40);
	         bg.add(submit);
	        
	         /*
	          * 
	          *  pannl; add in pannale
	          *  
	          */
	         bg.add(login);
	         bg.add(login1);
	         
	         
	         
	         /*
	          * 
	          * add action  listner 
	          * 
	          * 
	          */
	         
	         update.addActionListener(this);
	         delete.addActionListener(this);
	         clear.addActionListener(this);
	         back.addActionListener(this);
	         home_page.addActionListener(this);
	         exit.addActionListener(this);
	         
	         submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//create table staf (id number(10),name varchar);
					try {
						save();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
					}
				
			});
	         
	}
	protected void save() throws SQLException {
		Connection conn=Connection_class.getconnection();
       
			String str="create table staf (?,?,?,?,?,?,?)";

		    PreparedStatement pst= conn.prepareStatement(str);	
		   
		    
		    int a=Integer.parseInt(ID.getText());
			 String b=NAME.getText();
			 String c=AGE.getText();
			 String d= SAL.getText();
			 
			 String e=TIME.getText();
			 String f=EXP.getText();
			 String g=DESI.getText();
			 String h=ADDR.getText();

		    
		    
		    
		    
		    
		    
		    pst.setInt(1, a);
		    pst.setString(2,b );
		    pst.setString(3,c);
		    pst.setString(4,d);
		    pst.setString(5,e);
		    pst.setString(6,f);
		    pst.setString(7,g);
		    pst.setString(8,h);




		    
		    
		    	pst.executeUpdate();
		    	System.out.println("succss");
				  JOptionPane.showMessageDialog(frame,"information succesful submit");  
				  area.setText("id : "+a+"\n name : "
							+b+ " \n age :"+c+"\n salary :"+d+"\n duty time : "+e+""
									+ "\n post :"+f+"\n experinces :"+g);
					   NAME.setText("");
			    	   AGE.setText("");
			    	   SAL.setText("");
			    	   TIME.setText("");
			    	   EXP.setText("");
			    	   DESI.setText("");
			    	   EXPERTIES.setText("");
			    	   ID.setText("");
			    	   SEARCH.setText("");
			    	   area.setText("");		
	}
	public static void main(String[] args) {
new Add_staf();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
//update,delete,clear,back,home_page,exit
		if(e.getSource()==update) {
			
		}
		
		if(e.getSource()==delete) {
			try {
				delete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
       if(e.getSource()==clear) {
    	   NAME.setText("");
    	   AGE.setText("");
    	   SAL.setText("");
    	   TIME.setText("");
    	   EXP.setText("");
    	   DESI.setText("");
    	   EXPERTIES.setText("");
    	   ID.setText("");
    	   SEARCH	.setText("");
    	   area.setText("");
		}
       if(e.getSource()==back) {
   		new Main_home_page();	
	frame.setVisible(false);
		}
       if(e.getSource()==home_page) {
		new Main_home_page();	
		}
       
       if(e.getSource()==exit) {
    	   frame.setVisible(false); //you can't see me!
    		frame.dispose(); //Destroy the JFrame object
    		
		}
       
	}

private void delete() throws SQLException {
	//area.setText(id);
	PreparedStatement pst;
	Connection conn=Connection_class.getconnection();
	pst=conn.prepareStatement("delete from package_customer  where id=?");
	int id=Integer.parseInt(SEARCH.getText());
	pst.setInt(1, id);
	 int b=pst.executeUpdate();
	System.out.println(b);
	if(id>1) {
	 JOptionPane.showMessageDialog(null,"record delete succesfully");	

	 NAME.setText("");
	   AGE.setText("");
	   SAL.setText("");
	   TIME.setText("");
	   EXP.setText("");
	   DESI.setText("");
	   EXPERTIES.setText("");
	   ID.setText("");
	   SEARCH	.setText("");
	   area.setText("");

	
	}else
		{
		 JOptionPane.showMessageDialog(null,"record not Found");	

		
		NAME.setText("");
	   AGE.setText("");
	   SAL.setText("");
	   TIME.setText("");
	   EXP.setText("");
	   DESI.setText("");
	   EXPERTIES.setText("");
	   ID.setText("");
	   SEARCH	.setText("");
	   area.setText("");
		}


}

}
