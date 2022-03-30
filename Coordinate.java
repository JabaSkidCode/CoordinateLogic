package Move;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Coordinate implements KeyListener {
	protected static int x;
	protected static int y;
	protected static int z;
	public boolean EntityMove;
	public boolean EntityJump;
	private static boolean isW = false;
    private static boolean isS = false;
    private static boolean isA = false;
    private static boolean isB = false;
    private static boolean isSpace = false; 
    private static boolean isShift = false; 
	/**
	 * @return the x
	 */
	public static int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public static int getY() {
		return y;
	}
	/**
	 * @return the z
	 */
	public static int getZ() {
		return z;
	}
	/**
	 * @param x the x to set
	 */
	public static void setX(int x) {
		Coordinate.x = x;
	}
	/**
	 * @param y the y to set
	 */
	public static void setY(int y) {
		Coordinate.y = y;
	}
	/**
	 * @param z the z to set
	 */
	public static void setZ(int z) {
		Coordinate.z = z;
	}
	
/*
 * Code a moving logic example if u need must go forward u tap on W if u need back tap on s
 *  
 */
public void keyPressed(KeyEvent event) {

	 int keyCode = event.getKeyCode();
	 if (event.getKeyCode()==KeyEvent.VK_W) {
		 isW = true;	
		 x+=1;
			 System.out.println("X : " + x);
			  /*
			   * Write your code / move logic here
			   */
	       
		 	
		 	}
	 if (event.getKeyCode()==KeyEvent.VK_S) {
		 isS = true;
		 x-=1;
			 System.out.println("X : " + x);
			 /*
			   * Write your code / move logic here
			   */
		
		 	
}
	 if (event.getKeyCode()==KeyEvent.VK_A) {
		 isA = true;
		 z+=1;
			 System.out.println("Z : " + z);
			 /*
			   * Write your code / move logic here
			   */
	
			
	 }
	 if (event.getKeyCode()==KeyEvent.VK_D) {
		 isB = true;
		 z-=1;
			 System.out.println("Z : " + z);
			 /*
			   * Write your code / move logic here
			   */
			
			
	 }
	 if (event.getKeyCode()==KeyEvent.VK_SPACE) {
		 isSpace = true;
		 y+=1;
			 System.out.println("Y : " + y);
			 /*
			   * Write your code / move logic here
			   */
		
		
	 }
	 if (event.getKeyCode()==KeyEvent.VK_SHIFT) {
		  isShift = true;
		  y-=1;
			 System.out.println("Y : " + y);
			 }
	 	/*
	 	 * Write your code / move logic here
	 	 */
			
			
	 }
public void keyTyped(KeyEvent arg0) {}
public void keyReleased(KeyEvent event) {
	  if (event.getKeyCode()==KeyEvent.VK_W) {
			 isW = false;	
	
			 	
			 	}
		 if (event.getKeyCode()==KeyEvent.VK_S) {
			 isS = false;
			
			 	
	 }
		 if (event.getKeyCode()==KeyEvent.VK_A) {
			 isA = false;
		
				
		 }
		 if (event.getKeyCode()==KeyEvent.VK_D) {
			 isB = false;
		
				
		 }
		 if (event.getKeyCode()==KeyEvent.VK_SPACE) {
			 isSpace = false;
		
			
		 }
		 if (event.getKeyCode()==KeyEvent.VK_SHIFT) {
			  isShift = false;
		
		 }
	
}
public static void main(String[] args) {
	
	  
	 JFrame f = new JFrame("Cords example");
	 
		f.setBounds(40,40,500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);

	
	
		
		Coordinate a = new Coordinate();
		f.addKeyListener(a);	
}}

