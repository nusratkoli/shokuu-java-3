
public class Animation extends MyFrame {
	public void run() {
		int y = 100;
		int x = 30;
		
		while(x<=170){
			//1
			clear();
			//2
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			System.out.println(x);
			x += 5;

			sleep(0.1);
		}
		while(y<=200) {
		 
			//1
			clear();
			//2
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			System.out.println(x);
			y+= 5;

			sleep(0.1);
		
		
		}
		 while (x>30)
		 {
			//1
				clear();
				//2
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				System.out.println(x);
				x -= 5;

				sleep(0.1);
			 
		 }
		  while(y>170)
		  {
			//1
				clear();
				//2
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				System.out.println(x);
				y+= 5;

				sleep(0.1);
			
		  }
		
		

	}

}
