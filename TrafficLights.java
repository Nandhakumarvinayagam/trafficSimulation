package trafficSimulation;

public class TrafficLights {
	
	String traffLightNS[][] = new String[4][4];
	String traffLightWE[][] = new String[4][4];
	void setTrafficLights() {
		for (int i = 0; i < 4 ; i++) 
			for(int j = 0; j < 4 ; j++){
			traffLightNS[i][j]="green";
			traffLightWE[i][j]="red";
		}
		
	}
}
