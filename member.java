import java.awt.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class member implements ActionListener{
	Frame f4;
	Button b1,b2;
	
	CheckboxGroup cb;
	Checkbox c1, c2, c3;
	Label l1,l2,l3,l14,l4,l5,l6,l20;
	

	
	public member(){
	f4 = new Frame("REGISTRATION FORM");

        Label w=new Label("Membership Drive",Label.CENTER); 
        w.setFont(new java.awt.Font("TimesRoman", 3, 36));
        w.setBounds(250,30, 400, 100);
        w.setBackground(Color.cyan);
        f4.add(w);
	
        cb = new CheckboxGroup();
	c1 = new Checkbox("1 Year",cb,false);
c1.setFont(new java.awt.Font("Arial Black",1,20));
	c2 = new Checkbox("3 Years",cb,true);
c2.setFont(new java.awt.Font("Arial Black",1,20));
        c3 = new Checkbox("Life-time",cb,true);
c3.setFont(new java.awt.Font("Arial Black",1,20));
        
	c1.setBounds(200,150,100,30);
	c2.setBounds(200,250,100,30);
        c3.setBounds(200,350,100,30);
       
	f4.add(c1);
	f4.add(c2);
        f4.add(c3);
       
        
	l1=new Label("AMOUNT : 5000" );
	l1.setBounds(200,200,200,30);
l1.setFont(new java.awt.Font("Arial Black",2,20));
	f4.add(l1);

	

	l2=new Label("AMOUNT : 12000");
l2.setFont(new java.awt.Font("Arial Black",2,20));
	l2.setBounds(200,300,200,30);
	f4.add(l2);

	

l3=new Label("AMOUNT : 100000");
l3.setFont(new java.awt.Font("Arial Black",2,20));
	l3.setBounds(200,400,220,30);
	f4.add(l3);

	

        l20 = new Label("");
        l20.setBounds(100, 600, 500, 50);
        f4.add(l20);

	
b1=new Button("Perks");
b1.setFont(new java.awt.Font("Arial Black",1,20));
	b1.setBounds(200,450,120,30); 
	b1.addActionListener(this); 
b1.setBackground(Color.yellow);
        b1.setForeground(Color.red);
	f4.add(b1);

      

	b2=new Button("Confirm");
b2.setFont(new java.awt.Font("Arial Black",1,20));
	b2.setBounds(200,550,120,30); 
	b2.addActionListener(this); 
b2.setBackground(Color.yellow);
        b2.setForeground(Color.red);
	f4.add(b2);
        

    
	f4.setSize(700,700);
	f4.setBackground(Color.CYAN);
	f4.setLayout(null);
	f4.setVisible(true);
	 f4.addWindowListener(new WindowAdapter() {
		@Override
	    public void windowClosing(WindowEvent e) {
			f4.dispose();
		}
	  });
    }
    @Override
    public void actionPerformed(ActionEvent e){
String s1=cb.getSelectedCheckbox().getLabel();
      
	  if (e.getSource() == b2 ) {
l20.setText("You have purchased membership for " +s1);
	} 

}


	public static void main(String[] args) {
		member m1 = new member();

	}

}
