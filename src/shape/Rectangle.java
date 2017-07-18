package shape;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
	  public Rectangle(){
		  this.shapevisitor = new Yescontain() ;
	  }
    public void draw(Graphics g) {
    	Graphics2D g2 = (Graphics2D)g;
    	g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,(float) trongsuot/100));
    	 g2.setStroke(new BasicStroke(thickness));
    	float dash[] = { 10 };
    	if(dashed){
        g2.setStroke(new BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dash, 0));
    	}
    	g2.setColor(color);
     	// ------------ Them phan nay la no doi mau
        if(gradient){
        	 GradientPaint redtowhite = new GradientPaint(x, y,col1, x+width, y+height,col2);
        	g2.setPaint(redtowhite);
        }
           //------------------End ----------
        if(filled){       	
            g2.fillRect(x, y, width, height); 
        }
        else{
            g2.drawRect(x, y, width, height); 
        }
    }

}
