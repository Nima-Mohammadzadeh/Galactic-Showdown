package entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import main.GamePanel;

public class BulletController {
	
	private LinkedList<Bullet> b = new LinkedList<Bullet>();
	
	GamePanel gp;
	Bullet TempBullet;
	
	
	public BulletController(GamePanel gp) { 
		this.gp = gp;
		
		addBullet(new Bullet(100, 300, gp));
	}
	
	public void update() {
		for(int i =0; i< b.size(); i++) {
			TempBullet = b.get(i);
			
			TempBullet.update();
		}
	}
	
	
	public void draw(Graphics2D g2) {
		for( int i = 0; i< b.size(); i++) {
			TempBullet = b.get(i);
			
			TempBullet.draw(g2);
		}
	}
	
	public void addBullet(Bullet block) {
		b.add(block);
	}
	
	public void removeBullet(Bullet block) {
		b.remove(block);
	}

}
