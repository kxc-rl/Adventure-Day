package kenziec.jprinc.fin;

public class Decision {


	public void tryDecision(Player player) {
		if(meetsPrerequisites(player)) {
			doDecision(player);
		} else {
			informPlayer("Missing password");
		}
	}
	
	private void doDecision(Player p) {
		p.changeLocation(null);
	}
	
	private boolean meetsPrerequisites(Player player) {
		
	}
	
}
