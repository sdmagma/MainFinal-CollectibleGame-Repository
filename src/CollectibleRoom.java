public class CollectibleRoom implements Room
{
	private Collectibles collectible;
	
	public CollectibleRoom(Collectibles collectible)
	{
		this.collectible = collectible;
	}
	
	public Collectibles getCollectible() 
	{
		return collectible;
	}
}
