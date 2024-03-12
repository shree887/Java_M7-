import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class MaharajPattern 
{
	public static void main(String[] args) {
		File file = new File("C:\\Users\\qsp\\Desktop\\Java_M7\\maharaj.jpg");
		try{
			BufferedImage image = ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++){
				for(int j=0;j<image.getWidth();j++){
					Color clr = new Color(image.getRGB(j,i));
					if((clr.getRed()==0)&&(clr.getGreen()==0)&&(clr.getBlue()==0)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}catch(Exception e ){
			System.out.println("Exception Occured");
		}
	}
}