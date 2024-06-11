import java.util.Vector;
public class DisplayVehicleVector extends MyFrame {
	public void run () {
		java.util.Vector<Vehicle>vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,5,0));
		vehicles.add(new Train(180,170,14,0));
		vehicles.add(new Train(180,220,-13,0));
		vehicles.add(new Truck(10,290,7,0));
		vehicles.add(new Truck(10,320,7,0));
		
		for(int i =0; i <30; i++) {
			clear();
			
			for (int j=0; j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
		}
	}

}