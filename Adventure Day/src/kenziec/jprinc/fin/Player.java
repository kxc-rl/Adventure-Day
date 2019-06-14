package kenziec.jprinc.fin;

public class Player {

	private String playerName;
	private Location currentLocation;
	
	public boolean hasFlag(String flagName) {
		return true;
	}
	
	public void changeLocation(Location location) {
		this.currentLocation = location;
	}
	
}
