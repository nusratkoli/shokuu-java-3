
public class Animation extends MyFrame {
	public void run () 
	{
		int x = 30;
		while (x<=170)
		{
			//1画面を消す
			clear();
			//(2)
			setColor(0,128,0);
			fillOval(x,80,80,100);
			x+=5;
			sleep(0.1);
		}
	}

}