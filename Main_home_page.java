package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Main_home_page extends JFrame  implements ActionListener{
	JMenuItem i1,i3,j1,j2,j3,k1,k2,k3,t1,t2,t3,st1,st2,s1,s2 ,about;
	Main_home_page(){
		
		//Font font=new Font("Arial Rounded MT ",Font.TRUETYPE_FONT,10);

		JPanel login; 
		login= new JPanel();
		login.setLayout(null);
		login.setSize(600, 600);
		login.setBackground(new Color(1, 0, 0, 60));
		login.setBounds(1, 0, 1400, 900);
	    
		
		
		
		setSize(1400, 900);
		setLayout(null);
		//setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Admin login page");
		setBackground(Color.DARK_GRAY);

		setResizable(false);
		
		
		
		
		
		
		JMenuBar menubar= new JMenuBar();
		
		
		JMenu menu=  new JMenu("fix customer");
		//menu.setFont(font);
		i1= new JMenuItem("Add Customer");
		 i3= new JMenuItem("view Info");
		//JMenuItem i4= new JMenuItem("Add Customer");
		  
        
		menu.add(i1);
		menu.add(i3);
		
		menubar.add(menu);
		/*
		 * 
		 * second phase 
		 * 
		 * 
		 * 
		 */
JMenu common=  new JMenu("common customer");
		
		 j1= new JMenuItem("Add Customer");
		 j2= new JMenuItem("Update Customer");
		 j3= new JMenuItem("view Info");
		//JMenuItem i4= new JMenuItem("Add Customer");
		 
		common.add(j1);
		common.add(j2);
		common.add(j3);
		
		menubar.add(common);
		
		
		ImageIcon backgroung_Image = new ImageIcon("abc.png");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1400, 900, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		add(bg);
		//bg.add(login);
		//bg.add(head);
		bg.add(login);
		bg.setBounds(0, 0, 1400, 900);
		setVisible(true);

		
		
/*
 * 
 * package custpmer
 * 
 * 		
 */
JMenu package1=  new JMenu("---");
		
		 k1= new JMenuItem("--");
		 k2= new JMenuItem("--");
		 k3= new JMenuItem("--");
		//JMenuItem i4= new JMenuItem("Add Customer");
		 
		package1.add(k1);
		package1.add(k2);
		package1.add(k3);
		
		menubar.add(package1);
		
		
		
		
		
		setJMenuBar(menubar);
		
		
/*
 * 
 * target customer
 * 
 * 		
 */
		
		/*
		 * 
		 * 
		 */
		
JMenu target=  new JMenu("Target customer");
		
		 t1= new JMenuItem("Add Customer");
		 t2= new JMenuItem("Update Customer");
		 t3= new JMenuItem("view Info");
		//JMenuItem i4= new JMenuItem("Add Customer");
		 
		target.add(t1);
		target.add(t2);
		target.add(t3);
		
		menubar.add(target);
		
		
		
		
		
		setJMenuBar(menubar);
		
		/*
		 * 
		 * staf manage
		 * 
		 */

		
		
JMenu staf=  new JMenu("about");
		
		 st1= new JMenuItem(" About developer ");
		 st2= new JMenuItem("system info");
		//JMenuItem h3= new JMenuItem("Imp");
		//JMenuItem i4= new JMenuItem("Add Customer");
		 
		 staf.add(st1);
		 staf.add(st2);
		//help.add(h3);
		
		menubar.add(staf);
		
		
		
		setJMenuBar(menubar);
		
		
		/*
 * 
 * help
 * 	
 */

	/*
	 * 
	 * about 
	 * 	
	 */
		
JMenu about=  new JMenu("...");
		
		JMenuItem s1= new JMenuItem("...");
		JMenuItem s2= new JMenuItem("...");
		//JMenuItem h3= new JMenuItem("Imp");
		//JMenuItem i4= new JMenuItem("Add Customer");
		 
		 about.add(s1);
		 about.add(s2);
		//help.add(h3);
		
		menubar.add(about);
		
		
		
		setJMenuBar(menubar);
			
		
	    setVisible(true);
	s1.addActionListener(this);	
	i1.addActionListener(this);
	i3.addActionListener(this);
	j1.addActionListener(this);
	j2.addActionListener(this);
	j3.addActionListener(this);
	k1.addActionListener(this);
	k2.addActionListener(this);
	k3.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);
	st1.addActionListener(this);
	st2.addActionListener(this);
    about.addActionListener(this);
		
	}
	
	public static void main(String[] args) throws Exception {
	new Main_home_page();
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i1) {
			 new Add_Fix_coustomer();
			//setVisible(false);
			
		}
		if(e.getSource()==i3) {

			new View_fix_customer();
			//setVisible(false);
			
		}
		
		
	if(e.getSource()==k1) {
	
	//setVisible(false);
	}
	if(e.getSource()==k2) {
		
	}
	if(e.getSource()==k3) {
		
	}
	if(e.getSource()==t1) {
		 new Add_target_cos();
		
	}
	if(e.getSource()==t2) {
		new Updated_targeted_cos();
		
	}
	if(e.getSource()==t3) {
		new View_target1();
		
	}
if(e.getSource()==st1) {
	new About2();
		
	}

	if(e.getSource()==st2) {
		new Help_system();

		
	}

if(e.getSource()==j1) {
  new 	Add_common_customer();
}
if(e.getSource()==j2) {
	 new Update_Common_customer();
}
if(e.getSource()==j3) {
	 new View_common();
}

if(e.getSource()==s1) {
	new Help_system();
	
}if(e.getSource()==s2) {
	
	
}






















}}