
public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("zelda","Swoord",500);
//		System.out.println(player.getName());
//		System.out.println(player.getWeapon());
//		System.out.println(player.getHealth());
		
		 player.damageByGun2();
		 player.damageByGun2();
		 player.damageByGun2();
		 player.heal();
		
		Player2 betterPlayer = new Player2("Sam", "Machine gun", 80,false);
		betterPlayer.damageByGun2();
		betterPlayer.damageByGun2();

	}
}
