import java.awt.*;
import javax.swing.*;
public class Kite extends JPanel
{
 public void paintComponent(Graphics g)
 {
   super.paintComponent(g);
   int x1[]={264,18,264,512};
   int y1[]={25,220,420,220};
   g.setColor(Color.ORANGE);

   int x2[]={264,164,364};
   int y2[]={320,420,440};
   g.setColor(Color.BLUE);
   g.fillPolygon(x2,y2,3);
   
   g.setColor(Color.GRAY);
   g.drawLine(264,25,264,440);
   g.drawLine(254,345,194,435);
   
   g.drawLine(274,345,334,435);
   g.drawArc(-45,122,620,522,38,104);
   g.setColor(Color.RED);
   g.fillOval(130,170,95,50);
   g.fillOval(301,170,95,50);
    }
  public static void main(String arg[])
  {
  Kite k=new Kite();
  JFrame j= new JFrame();
  j.setTitle("Kite Drawing");
j.add(k,BorderLayout.CENTER);
j.setLocationRelativeTo(null);
j.setLocation(70,500);
j.setSize(550,500);
j.setVisible(true);
}
}  
   
   