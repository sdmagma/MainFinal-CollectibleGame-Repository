public class Monster
{
	private String monster;
	private Collectibles collectible;
	
	public Monster(String monster, Collectibles collectible)
	{
		this.monster = monster;
		this.collectible = collectible;
	}

	public String getMonsterName()
	{
		return monster;
	}
	
	public Collectibles getMonsCollectible()
	{
		return collectible;
	}
}
