import java.util.LinkedList;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html

public class LootTable
{
	private LinkedList<Common> commonLT;
	private LinkedList<Rare> rareLT;
	private LinkedList<Epic> epicLT;
	private LinkedList<Legendary> legendaryLT;
	
	public LootTable(LinkedList<Common> commonLT, LinkedList<Rare> rareLT, LinkedList<Epic> epicLT, LinkedList<Legendary> legendaryLT)
	{
		this.commonLT = commonLT;
		this.rareLT = rareLT;
		this.epicLT = epicLT;
		this.legendaryLT = legendaryLT;
	}
	
	public void addCommon(Common item)
	{
		commonLT.add(item);
	}
	
	public void addRare(Rare item)
	{
		rareLT.add(item);
	}
	
	public void addEpic(Epic item)
	{
		epicLT.add(item);
	}
	
	public void addLegendary(Legendary item)
	{
		legendaryLT.add(item);
	}

	public Common getCommon(int index)
	{
		return commonLT.get(index);
	}
	
	public Rare getRare(int index)
	{
		return rareLT.get(index);
	}
	
	public Epic getEpic(int index)
	{
		return epicLT.get(index);
	}
	
	public Legendary getLegendary(int index)
	{
		return legendaryLT.get(index);
	}
	
	public int getCommonSize()
	{
		return commonLT.size();
	}
	
	public int getRareSize()
	{
		return rareLT.size();
	}
	
	public int getEpicSize()
	{
		return epicLT.size();
	}
	
	public int getLegendarySize()
	{
		return legendaryLT.size();
	}
}
