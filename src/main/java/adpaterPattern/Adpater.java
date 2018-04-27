package adpaterPattern;

public class Adpater implements Wizard{
	private Archer archer;
	
	public Adpater(Archer archer) {
		this.archer = archer;
	}
	
	public void fireBall() {
		System.out.println("Arch enhancement --> firing ");
		archer.shot();
		System.out.println("fire ball out");
	}
	

}
