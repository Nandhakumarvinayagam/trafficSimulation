package trafficSimulation;

public class Car{
	public int carID;
	int car_length = 10;
	int car_speed = 5;
	double car_acceleration = 2.5 ;
	double car_deceleration = 2.5 ;
	public Car(int id) {
		carID = id;
		System.out.println("car" + id + "has entered the grid");
	}
}
