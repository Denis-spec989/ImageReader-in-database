package imagereaderdb;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

public class MyImage extends JComponent
{
   private Image         image;
   private BufferedImage buf;
    
   public void setImage(BufferedImage buf)
   {
        this.buf=buf;
        if (buf!=null)  repaint();
   }
   @Override
   protected void paintComponent(Graphics g) 
   {
        if (buf!=null) 
        {
            double k=(double)getWidth()/buf.getWidth();
            int h=(int)(buf.getHeight()*k);
            image=buf.getScaledInstance(getWidth(),h,Image.SCALE_FAST);
            
            if (image!=null) 
            {
                Graphics2D g2=(Graphics2D) g;
                g2.drawImage(image, 0, 0, null);
            }
        }
        else 
        {
            Font font =new Font("Times New Roman",Font.BOLD,20);
            g.setFont(font);
            Color newColor = new Color(255,0,0);
            g.setColor(newColor);
            g.drawString("No image here!", 40, 40);
            g.drawString("Please choose one from the list on the left", 40, 80);
            
        }
        
    }
}
