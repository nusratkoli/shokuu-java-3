
public class RectIf extends MyFrame{
	public void run() {
//		int x =30;
//		int y =30;
//		setColor(0,128,0);
//		int i;
//		for (i=0; i<9 ; i++) 
//		{
//		
//			
//				fillRect(x,y,10,100);
//				
//			
//			
//			
//			x+=20;
//			y+=20;
//			
//		}
//		
//		setColor(0,128,0);
//		int x=30;
//		int i ;
//		
//		
//		
//		int h =20;
//		for (i=0; i<9 ; i++)
//		{
//			fillRect(x,100,10,h);
//			h+=20;
//			x+=20;
//		}
		
		int x = 30;
		int r =0;
		int g =0;
		int b =0;
		
		for (int i=0; i<9 ; i++) {
			setColor (r,g,b);
			fillRect(x,100,10,100);
		
		x+=20;
		r+=20;
		g+=20;
		b+=20;
		}

		
	}

}
