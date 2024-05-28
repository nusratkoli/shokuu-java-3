
public class Car {
	int x,y,vx,vy;
	public Car(int x, int y, int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(100, 100, 40, 20);
		frame.fillRect(80, 120, 80, 20);
		
		frame.fillOval(90, 140, 20, 20);
		frame.fillOval(130, 140, 20, 20);
		
	}
	public void move() {
		x+=vx;
		y+=vy;
		}

}
