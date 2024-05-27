
public class Animation extends MyFrame {
	public void run () 
	{
		int y = 100;
		int x =30;
		while (true) {
		while (x<=170)
		{
			//1画面を消す
			clear();
			//(2)四
			setColor(0,128,0);
			fillRect(x,y,10,100);
			//x and y 
			
			x+=5;
			//y を
			sleep(0.1);
		}
		while (x>=30)
		{
			//1画面を消す
			clear();
			//(2)四
			setColor(0,128,0);
			fillRect(x,y,10,100);
			//x and y 
			
			x-=5;
			//y を
			sleep(0.1);
		}
		}
	}

}
