import java.util.concurrent.TimeUnit;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane;  
import javax.swing.*;
import java.util.*;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.*;  


public class Level extends JFrame implements ActionListener
{
int selectedOption;
int count=0,i;
//public boolean timeup = false;

private JButton b3_3,b_exit,b[]=new JButton[10],jb;
private JButton c[]=new JButton[17],c4_4;
private JButton d[]=new JButton[26],d5_5;

public  void Leveleasy()
 {   
	jb=new JButton("TIME LEFT:");
	count=1;
	JFrame fr_easy=new JFrame();
    fr_easy.setExtendedState( fr_easy.getExtendedState()|JFrame.MAXIMIZED_BOTH );  
    fr_easy.setLayout(null);  
	GridLayout g =new GridLayout(3,3);
	JPanel p=new JPanel(g);
	Color mycolor = new Color(102, 51, 1);
	 String[] s = new String[]{"3","2","4","1","8","5","7","6",""};
	for(i=0;i<9;i++)
	{
	
	b[i+1]=new JButton(); 
	b[i+1].setLabel(s[i]);
	}	
	b3_3=new JButton("3X3");
	b_exit=new JButton("EXIT"); 
	for(i=1;i<=9;i++)
		{
		b[i].setBackground(mycolor);
		b[i].setForeground(Color.WHITE);
		b[i].setFont(new Font("Sans Serif", Font.PLAIN, 60));
		}
	b3_3.setBackground(mycolor);
	b3_3.setForeground(Color.WHITE);
	b3_3.setFont(new Font("Sans Serif", Font.PLAIN, 35));
	jb.setBackground(mycolor);
	jb.setForeground(Color.WHITE);
	jb.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	b3_3.addActionListener(this);
	fr_easy.add(b3_3);
	b_exit.setBackground(mycolor);
	b_exit.setForeground(Color.WHITE);
	b_exit.setFont(new Font("Sans Serif", Font.PLAIN, 40));
	b_exit.addActionListener(this);
	fr_easy.add(b_exit);
	jb.addActionListener(this);
	for(i=1;i<=9;i++) {
    b[i].addActionListener(this);  
	}
    b_exit.addActionListener(e -> {
     selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Are you sure to quit the game?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
		if (selectedOption == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
	});	 
    for(i=1;i<=9;i++){
		p.add(b[i]);
		b[i].setVisible(true);
	   }
	   
	   fr_easy.add(jb);
	   fr_easy.add(p);
	   
	   JLabel labeleasy=new JLabel("03:00");
	   labeleasy.setForeground(Color.RED);
	    labeleasy.setBounds(700,60,200,100);
	   labeleasy.setFont(new Font("Serif",Font.BOLD,50));
	   fr_easy.add(labeleasy);
	   
	   MyTime time = new MyTime();	
	   //method to refresh label with time.
	   time.updateLabel(labeleasy,180);
	   //System.out.println(timeup);
	 
	   
	   
	   b3_3.setBounds(900 ,60,120,70);
	   p.setBounds(750,250,450,450);
	   b_exit.setBounds(880,800,200,70);
	   fr_easy.dispose();
	   fr_easy.pack();
	   fr_easy.setVisible(true);
	   
	
 }



public  void Levelmedium()
{   
	count=2;
	JFrame fr=new JFrame();
    fr.setExtendedState( fr.getExtendedState()|JFrame.MAXIMIZED_BOTH );  
    fr.setLayout(null);  
	GridLayout g =new GridLayout(4,4);
	JPanel p=new JPanel(g);
	Color mycolor = new Color(102, 51, 1);
	 String[] s = new String[]{"4","5","7","11","3","6","15","10","2","13","1","12","","8","9","14"};
	for(i=0;i<16;i++)
	{
	
	c[i+1]=new JButton(); 
	c[i+1].setLabel(s[i]);
	}	
	c4_4=new JButton("4X4");
	b_exit=new JButton("EXIT"); 
	for(i=1;i<=16;i++)
		{
		c[i].setBackground(mycolor);
		c[i].setForeground(Color.WHITE);
		c[i].setFont(new Font("Sans Serif", Font.PLAIN, 60));
		}
	c4_4.setBackground(mycolor);
	c4_4.setForeground(Color.WHITE);
	c4_4.setFont(new Font("Sans Serif", Font.PLAIN, 35));
	c4_4.addActionListener(this);
	fr.add(c4_4);
	b_exit.setBackground(mycolor);
	b_exit.setForeground(Color.WHITE);
	b_exit.setFont(new Font("Sans Serif", Font.PLAIN, 40));
	fr.add(b_exit);
	for(i=1;i<=16;i++) {
    c[i].addActionListener(this);  
	}
    b_exit.addActionListener(e -> {
     int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Are you sure to quit the game?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
		if (selectedOption == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
	});	 
    for(i=1;i<=16;i++){
		p.add(c[i]);
		c[i].setVisible(true);
	   }
	   fr.add(p);
	   c4_4.setBounds(900 ,60,120,70);
	   p.setBounds(750,250,450,450);
	   b_exit.setBounds(880,800,200,70);
	   
	   JLabel labelmedium = new JLabel("06:00");
	   labelmedium.setForeground(Color.RED);
	   labelmedium.setBounds(700,60,250,100);
	   
	   MyTime time = new MyTime();
	   //method to refresh label with time.
	   time.updateLabel(labelmedium,360);
	   labelmedium.setFont(new Font("Serif",Font.BOLD,50));
	   fr.add(labelmedium);
	   fr.dispose();
	   fr.pack();
	   fr.setVisible(true);
	
	
	
}

public  void Levelhard()
{   
	count=3;
	JFrame fr=new JFrame();
    fr.setExtendedState(fr.getExtendedState()|JFrame.MAXIMIZED_BOTH );  
    fr.setLayout(null);  
	GridLayout g =new GridLayout(5,5);
	JPanel p=new JPanel(g);
	Color mycolor = new Color(102, 51, 1);
	 String[] s = new String[]{"4","5","21","16","7","11","22","3","17","","20","15","10","24","2","19","23","13","1","12","6","8","18","9","14"};
	for(i=0;i<25;i++)
	{
	
	d[i+1]=new JButton(); 
	d[i+1].setLabel(s[i]);
	}	
	d5_5=new JButton("5X5");
	b_exit=new JButton("EXIT"); 
	for(i=1;i<=25;i++)
		{
		d[i].setBackground(mycolor);
		d[i].setForeground(Color.WHITE);
		d[i].setFont(new Font("Sans Serif", Font.PLAIN, 60));
		}
	d5_5.setBackground(mycolor);
	d5_5.setForeground(Color.WHITE);
	d5_5.setFont(new Font("Sans Serif", Font.PLAIN, 35));
	d5_5.addActionListener(this);
	fr.add(d5_5);
	b_exit.setBackground(mycolor);
	b_exit.setForeground(Color.WHITE);
	b_exit.setFont(new Font("Sans Serif", Font.PLAIN, 40));
	fr.add(b_exit);
	for(i=1;i<=25;i++) {
    d[i].addActionListener(this);  
	}
    b_exit.addActionListener(e -> {
     int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Are you sure to quit the game?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
		if (selectedOption == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
	});	 
    for(i=1;i<=25;i++){
		p.add(d[i]);
		d[i].setVisible(true);
	   }
	   fr.add(p);
	   d5_5.setBounds(900 ,60,120,70);
	   p.setBounds(730,230,550,550);
	   b_exit.setBounds(880,900,200,70);
	   
	   JLabel labelhard = new JLabel("09:00");
	   labelhard.setForeground(Color.RED);
	   labelhard.setBounds(700,60,250,100);
	   labelhard.setFont(new Font("Serif",Font.BOLD,50));
	   MyTime time = new MyTime();
	   //method to refresh label with time.
	   time.updateLabel(labelhard,600);
	 
	   fr.add(labelhard);
	   fr.dispose();
	   fr.pack();
	   fr.setVisible(true);

}




public void actionPerformed(ActionEvent e){ 
   if(count==1){ 
    if(e.getSource() == b[1]){  
        String label=b[1].getLabel();  
        if(b[2].getLabel().equals(""))
		{  
            b[2].setLabel(label);  
            b[1].setLabel("");  
        }  
        if(b[4].getLabel().equals(""))
		{  
            b[4].setLabel(label);  
            b[1].setLabel("");  
        }  
    }  
    if(e.getSource()==b[2]){  
        String label=b[2].getLabel();  
        if(b[1].getLabel().equals(""))
		{  
            b[1].setLabel(label);  
            b[2].setLabel("");  
        }  
        if(b[3].getLabel().equals(""))
		{  
            b[3].setLabel(label);  
            b[2].setLabel("");  
        }  
        if(b[5].getLabel().equals(""))
		{  
            b[5].setLabel(label);  
            b[2].setLabel("");  
        }  
    }  
    if(e.getSource()==b[3]){  
        String label=b[3].getLabel();  
        if(b[2].getLabel().equals(""))
		{  
            b[2].setLabel(label);  
            b[3].setLabel("");  
        }  
        if(b[6].getLabel().equals(""))
		{  
            b[6].setLabel(label);  
            b[3].setLabel("");  
        }  
    }  
    if(e.getSource()==b[4])
	{  
        String label=b[4].getLabel();  
        if(b[1].getLabel().equals(""))
		{  
            b[1].setLabel(label);  
            b[4].setLabel("");  
        }  
        if(b[7].getLabel().equals(""))
		{  
            b[7].setLabel(label);  
            b[4].setLabel("");  
        }  
        if(b[5].getLabel().equals(""))
		{  
            b[5].setLabel(label);  
            b[4].setLabel("");  
        }  
    }  
    if(e.getSource()==b[5]){  
	 
        String label=b[5].getLabel();  
        if(b[2].getLabel().equals(""))
		{  
            b[2].setLabel(label);  
            b[5].setLabel("");  
        }  
        if(b[6].getLabel().equals(""))
		{  
            b[6].setLabel(label);  
            b[5].setLabel("");  
        }  
        if(b[4].getLabel().equals(""))
		{  
            b[4].setLabel(label);  
            b[5].setLabel("");  
        }  
        if(b[8].getLabel().equals(""))
		{  
            b[8].setLabel(label);  
            b[5].setLabel("");  
        }  
    }  
    if(e.getSource()==b[6]){  
        String label=b[6].getLabel();  
        if(b[9].getLabel().equals(""))
		{  
            b[9].setLabel(label);  
            b[6].setLabel("");  
        }  
        if(b[3].getLabel().equals(""))
		{  
            b[3].setLabel(label);  
            b[6].setLabel("");  
        }  
        if(b[5].getLabel().equals(""))
		{  
            b[5].setLabel(label);  
            b[6].setLabel("");  
        }  
    }  
    if(e.getSource()==b[7]){  
        String label=b[7].getLabel();  
        if(b[4].getLabel().equals(""))
		{  
            b[4].setLabel(label);  
            b[7].setLabel("");  
        }  
        if(b[8].getLabel().equals(""))
		{  
            b[8].setLabel(label);  
            b[7].setLabel("");  
        }  
    }  
    if(e.getSource()==b[8]){  
        String label=b[8].getLabel();  
        if(b[9].getLabel().equals(""))
		{  
            b[9].setLabel(label);  
            b[8].setLabel("");  
        }  
        if(b[7].getLabel().equals(""))
		{  
            b[7].setLabel(label);  
            b[8].setLabel("");  
        }  
        if(b[5].getLabel().equals("")){  
            b[5].setLabel(label);  
            b[8].setLabel("");  
        }  
    }  
    if(e.getSource()==b[9]){  
        String label=b[9].getLabel();  
        if(b[6].getLabel().equals(""))
		{  
            b[6].setLabel(label);  
            b[9].setLabel("");  
        }  
        if(b[8].getLabel().equals(""))
		{  
            b[8].setLabel(label);  
            b[9].setLabel("");  
        }  
    }  
//congrats code for level easy
 if(b[1].getLabel().equals("1")&&b[2].getLabel().equals("2")&&b[3].getLabel()    
    .equals("3")&&b[4].getLabel().equals("4")&&b[5].getLabel().equals("5")    
     &&b[6].getLabel().equals("6")&&b[7].getLabel().equals("7")&&b[8].getLabel()    
	.equals("8")&&b[9].getLabel().equals(""))
	{     
     JOptionPane.showMessageDialog(this,"Congratulations!!!! You Won ");
	 System.exit(0); 

             			
	}
   }
 if(count==2){
	 
   
	if(e.getSource() == c[1]){
  		
        String label=c[1].getLabel();  
        if(c[2].getLabel().equals(""))
		{  
            c[2].setLabel(label);  
            c[1].setLabel("");  
        }  
        if(c[5].getLabel().equals(""))
		{  
            c[5].setLabel(label);  
            c[1].setLabel("");  
        }  
    }  
    if(e.getSource()==c[2]){
        String label=c[2].getLabel();  
        if(c[1].getLabel().equals(""))
		{  
            c[1].setLabel(label);  
            c[2].setLabel("");  
        }  
        if(c[3].getLabel().equals(""))
		{  
            c[3].setLabel(label);  
            c[2].setLabel("");  
        }  
        if(c[6].getLabel().equals(""))
		{  
            c[6].setLabel(label);  
            c[2].setLabel("");  
        }  
    }  
    if(e.getSource()==c[3]){ 

        String label=c[3].getLabel();  
        if(c[2].getLabel().equals(""))
		{  
            c[2].setLabel(label);  
            c[3].setLabel("");  
        }  
         if(c[4].getLabel().equals(""))
		{  
            c[4].setLabel(label);  
            c[3].setLabel("");  
        } 
		if(c[7].getLabel().equals(""))
		{  
            c[7].setLabel(label);  
            c[3].setLabel("");  
        }
    }  
    if(e.getSource()==c[4])
	{  
        String label=c[4].getLabel();  
        if(c[3].getLabel().equals(""))
		{  
            c[3].setLabel(label);  
            c[4].setLabel("");  
        }  
        if(c[8].getLabel().equals(""))
		{  
            c[8].setLabel(label);  
            c[4].setLabel("");  
        }  
          
    }  
    if(e.getSource()==c[5]){  
        String label=c[5].getLabel();  
        if(c[1].getLabel().equals(""))
		{  
            c[1].setLabel(label);  
            c[5].setLabel("");  
        }  
        if(c[6].getLabel().equals(""))
		{  
            c[6].setLabel(label);  
            c[5].setLabel("");  
        }  
        if(c[9].getLabel().equals(""))
		{  
            c[9].setLabel(label);  
            c[5].setLabel("");  
        }  
          
    }  
    if(e.getSource()==c[6]){  
        String label=c[6].getLabel();  
        if(c[2].getLabel().equals(""))
		{  
            c[2].setLabel(label);  
            c[6].setLabel("");  
        }  
        if(c[5].getLabel().equals(""))
		{  
            c[5].setLabel(label);  
            c[6].setLabel("");  
        }  
        if(c[7].getLabel().equals(""))
		{  
            c[7].setLabel(label);  
            c[6].setLabel("");  
        } 
		if(c[10].getLabel().equals(""))
		{  
            c[10].setLabel(label);  
            c[6].setLabel("");  
        }		
    }  
    if(e.getSource()==c[7]){  
        String label=c[7].getLabel();  
        if(c[3].getLabel().equals(""))
		{  
            c[3].setLabel(label);  
            c[7].setLabel("");  
        }  
        if(c[6].getLabel().equals(""))
		{  
            c[6].setLabel(label);  
            c[7].setLabel("");  
        }  
		if(c[8].getLabel().equals(""))
		{  
            c[8].setLabel(label);  
            c[7].setLabel("");  
        }
		if(c[11].getLabel().equals(""))
		{  
            c[11].setLabel(label);  
            c[7].setLabel("");  
        }
    }  
    if(e.getSource()==c[8]){  
        String label=c[8].getLabel();  
        if(c[4].getLabel().equals(""))
		{  
            c[4].setLabel(label);  
            c[8].setLabel("");  
        }  
        if(c[7].getLabel().equals(""))
		{  
            c[7].setLabel(label);  
            c[8].setLabel("");  
        }  
        if(c[12].getLabel().equals("")){  
            c[12].setLabel(label);  
            c[8].setLabel("");  
        }  
    }  
    if(e.getSource()==c[9]){  
        String label=c[9].getLabel();  
        if(c[5].getLabel().equals(""))
		{  
            c[5].setLabel(label);  
            c[9].setLabel("");  
        }  
        if(c[10].getLabel().equals(""))
		{  
            c[10].setLabel(label);  
            c[9].setLabel("");  
        } 
		if(c[13].getLabel().equals(""))
		{  
            c[13].setLabel(label);  
            c[9].setLabel("");  
        }		
    }
	if(e.getSource()==c[10]){  
        String label=c[10].getLabel();  
        if(c[6].getLabel().equals(""))
		{  
            c[6].setLabel(label);  
            c[10].setLabel("");  
        }  
        if(c[9].getLabel().equals(""))
		{  
            c[9].setLabel(label);  
            c[10].setLabel("");  
        }  
		if(c[11].getLabel().equals(""))
		{  
            c[11].setLabel(label);  
            c[10].setLabel("");  
        }
		if(c[14].getLabel().equals(""))
		{  
            c[14].setLabel(label);  
            c[10].setLabel("");  
        }
    }
	if(e.getSource()==c[11]){  
        String label=c[11].getLabel();  
        if(c[7].getLabel().equals(""))
		{  
            c[7].setLabel(label);  
            c[11].setLabel("");  
        }  
        if(c[10].getLabel().equals(""))
		{  
            c[10].setLabel(label);  
            c[11].setLabel("");  
        }  
		if(c[12].getLabel().equals(""))
		{  
            c[12].setLabel(label);  
            c[11].setLabel("");  
        }
		if(c[15].getLabel().equals(""))
		{  
            c[15].setLabel(label);  
            c[11].setLabel("");  
        }
    }
		if(e.getSource()==c[12]){  
        String label=c[12].getLabel();  
			if(c[8].getLabel().equals(""))
		{  
            c[8].setLabel(label);  
            c[12].setLabel("");  
        }  
			if(c[16].getLabel().equals(""))
		{  
            c[16].setLabel(label);  
            c[12].setLabel("");  
        }  
			if(c[11].getLabel().equals(""))
		{  
            c[11].setLabel(label);  
            c[12].setLabel("");  
        }
		
    }
	if(e.getSource() == c[13]){  
        String label=c[13].getLabel();  
        if(c[9].getLabel().equals(""))
		{  
            c[9].setLabel(label);  
            c[13].setLabel("");  
        }  
        if(c[14].getLabel().equals(""))
		{  
            c[14].setLabel(label);  
            c[13].setLabel("");  
        }  
    }
	if(e.getSource() == c[14]){
	
        String label=c[14].getLabel();  
        if(c[13].getLabel().equals(""))
		{  
            c[13].setLabel(label);  
            c[14].setLabel("");  
        }  
        if(c[10].getLabel().equals(""))
		{  
            c[10].setLabel(label);  
            c[14].setLabel("");  
        }  
		
		if(c[15].getLabel().equals(""))
		{  
            c[15].setLabel(label);  
            c[14].setLabel("");  
        }
    }
	if(e.getSource() == c[15]){  
        String label=c[15].getLabel();  
        if(c[11].getLabel().equals(""))
		{  
            c[11].setLabel(label);  
            c[15].setLabel("");  
        }  
        if(c[14].getLabel().equals(""))
		{  
            c[14].setLabel(label);  
            c[15].setLabel("");  
        }  
		
		if(c[16].getLabel().equals(""))
		{  
            c[16].setLabel(label);  
            c[15].setLabel("");  
        }
    }
	
    if(e.getSource()==c[16])
	{  
        String label=c[16].getLabel();  
        if(c[12].getLabel().equals(""))
		{  
            c[12].setLabel(label);  
            c[16].setLabel("");  
        }  
        if(c[15].getLabel().equals(""))
		{  
            c[15].setLabel(label);  
            c[16].setLabel("");  
        }  
          
    }  
	//congrats code for level medium
	if(c[1].getLabel().equals("1")&&c[2].getLabel().equals("2")&&c[3].getLabel()    
    .equals("3")&&c[4].getLabel().equals("4")&&c[5].getLabel().equals("5")    
     &&c[6].getLabel().equals("6")&&c[7].getLabel().equals("7")&&c[8].getLabel()    
	.equals("8")&&c[9].getLabel().equals("9")&&c[10].getLabel().equals("10")&&c[11].getLabel().equals("11")
	&&c[12].getLabel().equals("12")&&c[13].getLabel().equals("13")&&c[14].getLabel().equals("14")&&c[15].getLabel().equals("15")
	&&c[16].getLabel().equals(" "))
	{     
     JOptionPane.showMessageDialog(this,"Congratulations!!!! You Won ");
	 System.exit(0);

             			
	}
  }
   if(count==3){
	    if(e.getSource() == d[1]){
  		
        String label=d[1].getLabel();  
        if(d[2].getLabel().equals(""))
		{  
            d[2].setLabel(label);  
            d[1].setLabel("");  
        }  
        if(d[6].getLabel().equals(""))
		{  
            d[6].setLabel(label);  
            d[1].setLabel("");  
        }  
    }  
    if(e.getSource()==d[2]){
        String label=d[2].getLabel();  
        if(d[1].getLabel().equals(""))
		{  
            d[1].setLabel(label);  
            d[2].setLabel("");  
        }  
        if(d[3].getLabel().equals(""))
		{  
            d[3].setLabel(label);  
            d[2].setLabel("");  
        }  
        if(d[7].getLabel().equals(""))
		{  
            d[7].setLabel(label);  
            d[2].setLabel("");  
        }  
    }  
    if(e.getSource()==d[3]){ 

        String label=d[3].getLabel();  
        if(d[2].getLabel().equals(""))
		{  
            d[2].setLabel(label);  
            d[3].setLabel("");  
        }  
         if(d[4].getLabel().equals(""))
		{  
            d[4].setLabel(label);  
            d[3].setLabel("");  
        } 
		if(d[8].getLabel().equals(""))
		{  
            d[8].setLabel(label);  
            d[3].setLabel("");  
        }
    }  
    if(e.getSource()==d[4])
	{  
        String label=d[4].getLabel();  
        if(d[3].getLabel().equals(""))
		{  
            d[3].setLabel(label);  
            d[4].setLabel("");  
        }
		if(d[5].getLabel().equals(""))
		{  
            d[5].setLabel(label);  
            d[4].setLabel("");  
        }		
        if(d[9].getLabel().equals(""))
		{  
            d[9].setLabel(label);  
            d[4].setLabel("");  
        }
		 
          
    }  
    if(e.getSource()==d[5]){  
        String label=d[5].getLabel();  
        if(d[4].getLabel().equals(""))
		{  
            d[4].setLabel(label);  
            d[5].setLabel("");  
        }  
        if(d[10].getLabel().equals(""))
		{  
            d[10].setLabel(label);  
            d[5].setLabel("");  
        }  
          
    }  
    if(e.getSource()==d[6]){  
        String label=d[6].getLabel();  
        if(d[1].getLabel().equals(""))
		{  
            d[1].setLabel(label);  
            d[6].setLabel("");  
        }  
        if(d[7].getLabel().equals(""))
		{  
            d[7].setLabel(label);  
            d[6].setLabel("");  
        }  
        if(d[11].getLabel().equals(""))
		{  
            d[11].setLabel(label);  
            d[6].setLabel("");  
        } 
				
    }  
    if(e.getSource()==d[7]){  
        String label=d[7].getLabel();  
        if(d[2].getLabel().equals(""))
		{  
            d[2].setLabel(label);  
            d[7].setLabel("");  
        }  
        if(d[6].getLabel().equals(""))
		{  
            d[6].setLabel(label);  
            d[7].setLabel("");  
        }  
		if(d[8].getLabel().equals(""))
		{  
            d[8].setLabel(label);  
            d[7].setLabel("");  
        }
		if(d[12].getLabel().equals(""))
		{  
            d[12].setLabel(label);  
            d[7].setLabel("");  
        }
    }  
    if(e.getSource()==d[8]){  
        String label=d[8].getLabel();  
        if(d[3].getLabel().equals(""))
		{  
            d[3].setLabel(label);  
            d[8].setLabel("");  
        }  
        if(d[7].getLabel().equals(""))
		{  
            d[7].setLabel(label);  
            d[8].setLabel("");  
        } 
       if(d[9].getLabel().equals(""))
		{  
            d[9].setLabel(label);  
            d[8].setLabel("");  
        }		
        if(d[13].getLabel().equals("")){  
            d[13].setLabel(label);  
            d[8].setLabel("");  
        }  
    }  
    if(e.getSource()==d[9]){  
        String label=d[9].getLabel();  
        if(d[4].getLabel().equals(""))
		{  
            d[4].setLabel(label);  
            d[9].setLabel("");  
        }  
        if(d[10].getLabel().equals(""))
		{  
            d[10].setLabel(label);  
            d[9].setLabel("");  
        } 
		if(d[14].getLabel().equals(""))
		{  
            d[14].setLabel(label);  
            d[9].setLabel("");  
        }	
		if(d[8].getLabel().equals(""))
		{  
            d[8].setLabel(label);  
            d[9].setLabel("");  
        }		
    }
	if(e.getSource()==d[10]){  
        String label=d[10].getLabel();  
        if(d[5].getLabel().equals(""))
		{  
            d[5].setLabel(label);  
            d[10].setLabel("");  
        }  
        if(d[9].getLabel().equals(""))
		{  
            d[9].setLabel(label);  
            d[10].setLabel("");  
        }  
		if(d[15].getLabel().equals(""))
		{  
            d[15].setLabel(label);  
            d[10].setLabel("");  
        }
    }
	if(e.getSource()==d[11]){  
        String label=d[11].getLabel();  
        if(d[6].getLabel().equals(""))
		{  
            d[6].setLabel(label);  
            d[11].setLabel("");  
        }  
        if(d[12].getLabel().equals(""))
		{  
            d[12].setLabel(label);  
            d[11].setLabel("");  
        }  
		if(d[16].getLabel().equals(""))
		{  
            d[16].setLabel(label);  
            d[11].setLabel("");  
        }
		if(d[15].getLabel().equals(""))
		{  
            d[15].setLabel(label);  
            d[11].setLabel("");  
        }
    }
		if(e.getSource()==d[12]){  
        String label=d[12].getLabel();  
			if(d[7].getLabel().equals(""))
		{  
            d[7].setLabel(label);  
            d[12].setLabel("");  
        }  
			if(d[17].getLabel().equals(""))
		{  
            d[17].setLabel(label);  
            d[12].setLabel("");  
        }  
			if(d[13].getLabel().equals(""))
		{  
            d[13].setLabel(label);  
            d[12].setLabel("");  
        }
		
		if(d[11].getLabel().equals(""))
		{  
            d[11].setLabel(label);  
            d[12].setLabel("");  
        }
		
    }
	if(e.getSource() == d[13]){  
        String label=d[13].getLabel();  
        if(d[8].getLabel().equals(""))
		{  
            d[8].setLabel(label);  
            d[13].setLabel("");  
        } 

		if(d[12].getLabel().equals(""))
		{  
            d[12].setLabel(label);  
            d[13].setLabel("");  
        }		
        if(d[14].getLabel().equals(""))
		{  
            d[14].setLabel(label);  
            d[13].setLabel("");  
        }  
		
		if(d[15].getLabel().equals(""))
		{  
            d[15].setLabel(label);  
            d[13].setLabel("");  
        }
    }
	if(e.getSource() == d[14]){
	
        String label=d[14].getLabel();  
        if(d[13].getLabel().equals(""))
		{  
            d[13].setLabel(label);  
            d[14].setLabel("");  
        }  
        if(d[9].getLabel().equals(""))
		{  
            d[9].setLabel(label);  
            d[14].setLabel("");  
        }  
		
		if(d[15].getLabel().equals(""))
		{  
            d[15].setLabel(label);  
            d[14].setLabel("");  
        }
		
		if(d[19].getLabel().equals(""))
		{  
            d[19].setLabel(label);  
            d[14].setLabel("");  
        }
    }
	if(e.getSource() == d[15]){  
        String label=d[15].getLabel();  
        if(d[10].getLabel().equals(""))
		{  
            d[10].setLabel(label);  
            d[15].setLabel("");  
        }  
        if(d[14].getLabel().equals(""))
		{  
            d[14].setLabel(label);  
            d[15].setLabel("");  
        }  
		
		if(d[20].getLabel().equals(""))
		{  
            d[20].setLabel(label);  
            d[15].setLabel("");  
        }
    }
	
    if(e.getSource()==d[16])
	{  
        String label=d[16].getLabel();  
        if(d[11].getLabel().equals(""))
		{  
            d[11].setLabel(label);  
            d[16].setLabel("");  
        }  
        if(d[17].getLabel().equals(""))
		{  
            d[17].setLabel(label);  
            d[16].setLabel("");  
        } 
		
		if(d[21].getLabel().equals(""))
		{  
            d[21].setLabel(label);  
            d[10].setLabel("");  
        }
          
    }

		if(e.getSource() == d[17]){
	
        String label=d[17].getLabel();  
        if(d[12].getLabel().equals(""))
		{  
            d[12].setLabel(label);  
            d[17].setLabel("");  
        }  
        if(d[16].getLabel().equals(""))
		{  
            d[16].setLabel(label);  
            d[17].setLabel("");  
        }  
		
		if(d[18].getLabel().equals(""))
		{  
            d[18].setLabel(label);  
            d[17].setLabel("");  
        }
		
		if(d[22].getLabel().equals(""))
		{  
            d[22].setLabel(label);  
            d[17].setLabel("");  
        }
    }
		if(e.getSource() == d[18]){
	
        String label=d[18].getLabel();  
        if(d[13].getLabel().equals(""))
		{  
            d[13].setLabel(label);  
            d[18].setLabel("");  
        }  
        if(d[17].getLabel().equals(""))
		{  
            d[17].setLabel(label);  
            d[18].setLabel("");  
        }  
		
		if(d[19].getLabel().equals(""))
		{  
            d[19].setLabel(label);  
            d[18].setLabel("");  
        }
		
		if(d[23].getLabel().equals(""))
		{  
            d[23].setLabel(label);  
            d[18].setLabel("");  
        }
    }
	if(e.getSource() == d[19]){
	
        String label=d[19].getLabel();  
        if(d[14].getLabel().equals(""))
		{  
            d[14].setLabel(label);  
            d[19].setLabel("");  
        }  
        if(d[18].getLabel().equals(""))
		{  
            d[18].setLabel(label);  
            d[19].setLabel("");  
        }  
		
		if(d[20].getLabel().equals(""))
		{  
            d[20].setLabel(label);  
            d[19].setLabel("");  
        }
		
		if(d[24].getLabel().equals(""))
		{  
            d[24].setLabel(label);  
            d[19].setLabel("");  
        }
    }
		if(e.getSource() == d[20]){
	
        String label=d[20].getLabel();  
        if(d[15].getLabel().equals(""))
		{  
            d[15].setLabel(label);  
            d[20].setLabel("");  
        }  
        if(d[19].getLabel().equals(""))
		{  
            d[19].setLabel(label);  
            d[20].setLabel("");  
        }  
		
		if(d[25].getLabel().equals(""))
		{  
            d[25].setLabel(label);  
            d[20].setLabel("");  
        }
		
		
    }
	if(e.getSource() == d[21]){
	
        String label=d[21].getLabel();  
        if(d[16].getLabel().equals(""))
		{  
            d[16].setLabel(label);  
            d[21].setLabel("");  
        }  
        if(d[22].getLabel().equals(""))
		{  
            d[22].setLabel(label);  
            d[21].setLabel("");  
        }  
		
		
    }
	if(e.getSource() == d[22]){
	
        String label=d[22].getLabel();  
        if(d[17].getLabel().equals(""))
		{  
            d[17].setLabel(label);  
            d[22].setLabel("");  
        }  
        if(d[21].getLabel().equals(""))
		{  
            d[21].setLabel(label);  
            d[22].setLabel("");  
        }  
		
		if(d[23].getLabel().equals(""))
		{  
            d[23].setLabel(label);  
            d[22].setLabel("");  
        }
		
		
    }
	if(e.getSource() == d[23]){
	
        String label=d[23].getLabel();  
        if(d[18].getLabel().equals(""))
		{  
            d[18].setLabel(label);  
            d[23].setLabel("");  
        }  
        if(d[22].getLabel().equals(""))
		{  
            d[22].setLabel(label);  
            d[23].setLabel("");  
        }  
		
		if(d[24].getLabel().equals(""))
		{  
            d[24].setLabel(label);  
            d[23].setLabel("");  
        }
		
		
    }
	if(e.getSource() == d[24]){
	
        String label=d[24].getLabel();  
        if(d[19].getLabel().equals(""))
		{  
            d[19].setLabel(label);  
            d[24].setLabel("");  
        }  
        if(d[23].getLabel().equals(""))
		{  
            d[23].setLabel(label);  
            d[24].setLabel("");  
        }  
		
		if(d[25].getLabel().equals(""))
		{  
            d[25].setLabel(label);  
            d[24].setLabel("");  
        }
		
		
    }
	if(e.getSource() == d[25]){
	
        String label=d[25].getLabel();  
        if(d[20].getLabel().equals(""))
		{  
            d[20].setLabel(label);  
            d[25].setLabel("");  
        }  
        if(d[24].getLabel().equals(""))
		{  
            d[24].setLabel(label);  
            d[25].setLabel("");  
        }  
		
		
    }
	//congrats code for level hard
	if(d[1].getLabel().equals("1")&&d[2].getLabel().equals("2")&&d[3].getLabel()    
    .equals("3")&&d[4].getLabel().equals("4")&&d[5].getLabel().equals("5")    
     &&d[6].getLabel().equals("6")&&d[7].getLabel().equals("7")&&d[8].getLabel()    
	.equals("8")&&d[9].getLabel().equals("9")&&d[10].getLabel().equals("10")&&d[11].getLabel().equals("11")
	&&d[12].getLabel().equals("12")&&d[13].getLabel().equals("13")&&d[14].getLabel().equals("14")&&d[15].getLabel().equals("15")
	&&d[16].getLabel().equals("16")&&d[17].getLabel().equals("17")&&d[18].getLabel().equals("18")&&d[19].getLabel().equals("19")
	&&d[20].getLabel().equals("20")&&d[21].getLabel().equals("21")&&d[22].getLabel().equals("22")&&d[23].getLabel().equals("23")
	&&d[24].getLabel().equals("24")&&d[25].getLabel().equals(""))
	{     
     JOptionPane.showMessageDialog(this,"Congratulations!!!! You Won ");
	 System.exit(0);

             			
	}
   }
   
   
  }
  
}

 
     
	
	
 
