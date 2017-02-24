package Simulator;
/**
 * This Class is named Memory. It's the simulated memory for the simulated computer.
 * We use Short to store data. Short is 16 bits, the same size of word. The size of memory is 4096 words.
 * **/

public class Memory {
	public short[] memory = new short[4096];
	public int size;
	public Cache cache;
	
	public Memory() {
		// TODO Auto-generated constructor stub
		size = memory.length;
		for(int i = 0; i < size ; i++)
		{
			memory[i] = 0;
		}
		cache = new Cache();
	}
	
	public int size() {
		return size;
	}
	
	/**
	 * this founction is to get content in memory through the index.
	 * Read action.
	 * @param int address.
	 * **/
	public short fetch(int address) {
		//first , find block in the cache
		int tag = address / 8;
		int index = address % 8;
		int flag = cache.tagExists(tag);
		//if target address doesn't exist in the cache, flag = -1;
		//we need to read the block that consists of target address into cache
		if(flag == -1)
		{
			CacheLine newLine = new CacheLine();
			for(int i =0 ; i < newLine.words.length ;i++)
			{
				newLine.words[i] = memory[tag * 8 + i];
			}
			newLine.tag = tag;
			
			if(!cache.isCacheFull())
			{
				cache.cacheList.add(newLine);
			}else {
				//FIFO based on arraylist data structure
				//because program use write-through method to write, the program just remove the block in  
				//cache and doesn't need to check.
				cache.cacheList.remove(0);
				cache.cacheList.add(newLine);
			}
			
			return newLine.words[index];
		}
		//if target address is in the cache, flag is the index of the block
		else {
			return cache.cacheList.get(flag).words[index];
		}
	}
	
	/**
	 * this founction can change the value of specified memory cell.
	 * Write action. 
	 * Use write-through method.
	 * @param int addr 
	 * short element
	 * **/
	public void set(int addr , short element) {
		//first , find block in the cache
		int tag = addr / 8;
		int index = addr % 8;
		int flag = cache.tagExists(tag);
		//if target address doesn't exist in the cache, flag = -1;
		if(flag == -1)
		{
			CacheLine newLine = new CacheLine();
			for(int i =0 ; i < newLine.words.length ;i++)
			{
				newLine.words[i] = memory[tag * 8 + i];
			}
			newLine.words[index] = element;
			newLine.tag = tag;
			
			if(!cache.isCacheFull())
			{
				cache.cacheList.add(newLine);
			}
			else 
			{
				cache.cacheList.remove(0);
				cache.cacheList.add(newLine);
			}
			
		}
		//if target address is in the cache, flag is the index of the block
		else {
			cache.cacheList.get(flag).words[index] = element;
		}
		
		//use write-through method to write in the memory and cache.
		memory[addr] = element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
