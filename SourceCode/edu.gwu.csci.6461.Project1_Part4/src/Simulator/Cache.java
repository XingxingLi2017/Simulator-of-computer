package Simulator;
import java.util.ArrayList;
//Cache is implemented based on ArrayList data structure.
public class Cache {

	public ArrayList<CacheLine> cacheList;
	
	public Cache() {
		// TODO Auto-generated constructor stub
		cacheList = new ArrayList<>(16);
		for(int i = 0 ; i < 16 ; i++)
		{
			CacheLine newline = new CacheLine();
			cacheList.add(newline);
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 = "cache list:\n";
		for(int i = 0 ; i < cacheList.size() ; i++)
		{
			s1 = s1+ cacheList.get(i).toString()+"\n";
		}
		return s1;
	}
	
	//if function find tag in cache,function will return the index
	//if it can't find tag, it will return -1.
	public int tagExists(int tag)
	{
		for(int i = 0 ; i < cacheList.size(); i++)
		{
			if(cacheList.get(i).tag == tag)
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean isCacheFull()
	{
		if(cacheList.size() == 16) return true;
		else {
			return false;
		}
	}
	
	// test main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cache aCache = new Cache();
		CacheLine bCacheLine = new CacheLine();
		for(int i = 0 ;i< bCacheLine.words.length;i++)
		{
			bCacheLine.words[i] = (short) (i + 1);
		}
		aCache.cacheList.add(bCacheLine);
		aCache.cacheList.add(bCacheLine);
		aCache.cacheList.add(bCacheLine);
		System.out.println(aCache.toString());
		System.out.println(aCache.isCacheFull());

	}

}
