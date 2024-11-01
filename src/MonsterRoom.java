public class MonsterRoom implements Room
{
	private Monster monster;
	
	public MonsterRoom(Monster monster)
	{
		this.monster = monster;
	}

	public Collectibles getCollectible() 
	{
		return monster.getMonsCollectible();
	}

	
}
