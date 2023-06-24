package main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame window = new JFrame();
		//Background space image
		//BufferedImage myImage = null;
		//try {
		//	myImage = ImageIO.read(new File("C:\\Users\\Kmohanim.ANT\\eclipse-workspace\\SpaceInvaders_Remasterd\\src\\Space.png"));
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		Image logo = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kmohanim.ANT\\eclipse-workspace\\SpaceInvaders_Remasterd\\src\\logo.png");
		window.setIconImage(logo);	
		
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("SPACE INVADERS!!");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		//window.setContentPane(new ImagePanel(myImage));
		
		gamePanel.startGameThread();
		
	}

}
