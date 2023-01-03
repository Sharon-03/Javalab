import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUItrafficlight extends JPanel implements ActionListener{
JRadioButton r1,r2,r3;
Color r_c,g_c,y_c;
GUItrafficlight(){
setBounds(0,0,640,480);
r1=new JRadioButton("Red");
r2=new JRadioButton("Yellow");
r3=new JRadioButton("Green");
r1.setSelected(true);
r_c=Color.red;
y_c=getBackground();
g_c=getBackground();
ButtonGroup b=new ButtonGroup();
b.add(r1);
b.add(r2);
b.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
}
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawOval(50,50,50,50);
g.drawOval(50,120,50,50);
g.drawOval(50,190,50,50);
g.setColor(r_c);
g.fillOval(50,50,50,50);
g.setColor(y_c);
g.fillOval(50,120,50,50);
g.setColor(g_c);
g.fillOval(50,190,50,50);
}
public void actionPerformed(ActionEvent e) {
if(r1.isSelected()==true) {
r_c=Color.red;
y_c=getBackground();
g_c=getBackground();
}
else if(r2.isSelected()==true) 
{
r_c=Color.white;
y_c=Color.yellow;
g_c=Color.white;
}
else if(r3.isSelected()==true)
{
r_c=Color.white;
y_c=Color.white;
g_c=Color.green;
}
repaint();
}
public static void main(String[] args) 
{
JFrame f=new JFrame("Traffic light");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
GUItrafficlight tl=new GUItrafficlight();
f.add(tl);
}
}
