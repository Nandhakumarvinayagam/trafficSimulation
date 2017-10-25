package trafficSimulation;
import java.util.*;
import java.util.concurrent.*;
import java.time.LocalDateTime;

public class Simulation {

	public static void main(String[] args) {
		int no_of_cars = 10;
		int simulation_time = 100;
		int block_size = 2000;
		String size_of_the_grid = "4x4";
		int entry_point[] = new int [2];
		int exit_point[] = new int [2];
		startSimulation();
	}
	public static void startSimulation() {
		Random n = new Random();
		LocalDateTime now = LocalDateTime.now();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		int noOfEnteredCars = 0;
		System.out.println("The Simulation has started at " + hour + " hrs : " + minute + " minutes : " + second + " seconds ");
		long arrivalTimes[] = new long [10];
		for (int i = 0 ; i < 10 ; i++) {
				arrivalTimes[i] = n.nextInt(100);
		}
		Arrays.sort(arrivalTimes);
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		for (long i : arrivalTimes) {
			executorService.scheduleAtFixedRate(App::carEntryEvent(noOfEnteredCars + 1),0,i,TimeUnit.SECONDS);
			noOfEnteredCars += 1;
		}
	}
	public static void carEntryEvent(int y) {
		Car c = new Car(y);
		return;
	}
}
	
