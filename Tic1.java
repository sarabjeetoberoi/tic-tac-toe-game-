import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Tic1 extends JFrame implements ActionListener
{ JFrame f;
  JButton b[],c,r;
Icon ic1,ic2,icon;
Icon i1,i2,i3,i4,i5,i6,i7,i8,i9;
int i;
boolean state=true;
JMenuBar menubar;
    JMenu menu,submenu;
    JMenuItem menuitem,exit;
    JRadioButtonMenuItem rbmenuitem;
    JCheckBoxMenuItem cbmenuitem;
    
public void button()
{ b=new JButton[9];
r=new JButton("RESET");
  for(i=0;i<b.length;i++)
 { b[i]=new JButton();
   f.add(b[i]);
 }
    
   f.add(r);  

       r.setBounds(180,400,100,100);
       b[0].setBounds(40,100,100,100);
        b[3].setBounds(40,200,100,100);
        b[6].setBounds(40,300,100,100);
        b[1].setBounds(140,100,100,100);
        b[4].setBounds(140,200,100,100);
        b[7].setBounds(140,300,100,100);
        b[2].setBounds(240,100,100,100);
        b[5].setBounds(240,200,100,100);
        b[8].setBounds(240,300,100,100);


b[0].addActionListener(this);
b[1].addActionListener(this);
b[2].addActionListener(this);
b[3].addActionListener(this);
b[4].addActionListener(this);
b[5].addActionListener(this);
b[6].addActionListener(this);
b[7].addActionListener(this);
b[8].addActionListener(this);
r=new JButton("RESET");  
r.setBounds(180,400,100,100);  
f.add(r);  
r.addActionListener(this);  

} 
 Tic1(String s)
{ 
  f=new JFrame(s);
 c=new JButton("START THE GAME");
 c.setBounds(240,200,200,200); 
  c.addActionListener(this);
  f.add(c); 
 ic1=new ImageIcon("1.jpg");  
ic2=new ImageIcon("2.jpg");

 menubar=new JMenuBar();
    menu=new JMenu("Settings");
    menubar.add(menu);
    menuitem=new JMenuItem("Full Screen");
    menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
    menu.add(menuitem);
    menu.addSeparator();
    menuitem.addActionListener(this);
    rbmenuitem=new JRadioButtonMenuItem("VS PLAYER");
    rbmenuitem.setSelected(true);
   rbmenuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
   ButtonGroup group= new ButtonGroup();
    group.add(rbmenuitem);
    menu.add(rbmenuitem);
    rbmenuitem=new JRadioButtonMenuItem("VS COMPUTER");
    rbmenuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.ALT_MASK));
    group.add(rbmenuitem);
    menu.add(rbmenuitem);
    cbmenuitem = new JCheckBoxMenuItem("LOL");
    cbmenuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4,ActionEvent.ALT_MASK));
    //cbMenuItem.setMnemonic(KeyEvent.VK_C);
    //cbMenuItem.setIcon(new ImageIcon("images/find.gif"));
    menu.add(cbmenuitem);
    cbmenuitem = new JCheckBoxMenuItem("Another one");
    cbmenuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5,ActionEvent.ALT_MASK));
    //cbMenuItem.setMnemonic(KeyEvent.VK_H);
    //cbMenuItem.setIcon(new ImageIcon("images/cut.gif"));
    menu.add(cbmenuitem);
    submenu=new JMenu("CONTROLS");
    menuitem=new JMenuItem("HIIII");
    menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6,ActionEvent.ALT_MASK));
    submenu.add(menuitem); 
    menuitem=new JMenuItem("HAHAHAHAHA");
    menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7,ActionEvent.ALT_MASK));
    submenu.add(menuitem);
    menu.add(submenu);
    exit=new JMenuItem("Exit");
    exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
    exit.addActionListener(this); 
    menu.add(exit);
    menu = new JMenu("Help");
    menubar.add(menu);
    menuitem=new JMenuItem("About");
    menu.add(menuitem);
   
	f.setJMenuBar(menubar);




f.setLayout(null);
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e)
{ if(e.getActionCommand().equals("Exit"))
    {System.exit(0);}

   if(e.getSource()==c)
    { f.remove(c);    
      f.repaint(); 
   button();  
   }
    if(e.getSource()==r){  
 for(i=0;i<=8;i++){  
   b[i].setIcon(null);  
        }    
    }  
for (i=0;i<b.length;i++)
    {  
      if(e.getSource()==b[i])
       {
        if(b[i].getIcon()==null)
         {if (state==true)
                        {icon=ic1;
                        state=false;}
         else 
            {icon=ic2;state=true;
              }
        b[i].setIcon(icon);
          }
        }
 }
 i1=b[0].getIcon();
i2=b[1].getIcon();
i3=b[2].getIcon();
i4=b[3].getIcon();
i5=b[4].getIcon();
i6=b[5].getIcon();
i7=b[6].getIcon();
i8=b[7].getIcon();
i9=b[8].getIcon();
 
if((i1==i2)&&(i2==i3)&&(i1!=null))
{if(i1==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else


if((i4==i5)&&(i5==i6)&&(i4!=null))
{ if(i4==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}


}
else

if((i7==i8)&&(i8==i9)&&(i7!=null))
{
if(i7==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else

if((i1==i4)&&(i4==i7)&&(i1!=null))
{
if(i1==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else


if((i2==i5)&&(i5==i8)&&(i2!=null))
{
if(i2==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else

if((i3==i6)&&(i6==i9)&&(i3!=null))
{
if(i3==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else

if((i1==i5)&&(i5==i9)&&(i1!=null))
{
if(i1==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
else
if((i3==i5)&&(i5==i7)&&(i3!=null))
{
if(i3==ic1){JOptionPane.showMessageDialog(Tic1.this,"!!!Player1 won!!! click reset");}
 else{JOptionPane.showMessageDialog(Tic1.this,"!!!Player2 won!!! click reset");}
}
  else
if((i1!=null)&&(i2!=null)&&(i3!=null)&&(i4!=null)&&(i5!=null)&&(i6!=null)&&(i7!=null)&&(i8!=null)&&(i9!=null))
{ JOptionPane.showMessageDialog(Tic1.this,"!!!MATCH DRAWN!!! click reset");
}



} 

public static void main(String s[])
{ new Tic1("Tic1");
}
}
