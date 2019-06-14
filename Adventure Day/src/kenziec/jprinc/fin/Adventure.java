package kenziec.jprinc.fin;

public class Adventure {

	private Decision[] startingDecisions;
	private Player player;
	
	public void adventureStart() {
		Decision firstDecision = startingDecisions[0];
		firstDecision.tryDecision(player);
	}

}
