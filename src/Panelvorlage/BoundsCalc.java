//package Panelvorlage;
//
//import java.awt.GraphicsDevice;
//import java.awt.GraphicsEnvironment;
//import java.awt.Rectangle;
//
//public class BoundsCalc {
//	
//	static final int WIDTH=1600;
//	static final int HEIGHT=900;
//	
//	
//	public static Rectangle calcBounds(int x, int y, int width, int height) {
//		
//		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//		int screenwidth = gd.getDisplayMode().getWidth();
//		int screenheight = gd.getDisplayMode().getHeight();
//		System.out.println(screenwidth);
//		
//		double wfactor=WIDTH/screenwidth;
//		double hfactor=HEIGHT/screenheight;
//		return new Rectangle((int)(x/wfactor), (int)(y/hfactor), (int)(width/wfactor), (int) (height/hfactor));
//	}
//	
//	public static int calcHeight(int height) {
//			
//			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//			int screenheight = gd.getDisplayMode().getHeight();		
//			double hfactor=HEIGHT/screenheight;
//			return  (int) (height/hfactor);
//		}
//	
//	public static int calcWidth(int width) {
//		
//		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//		int screenwidth = gd.getDisplayMode().getWidth();
//		double wfactor=WIDTH/screenwidth;
//		return  (int) (width/wfactor);
//	}
//
//
//}
