package main;

import java.util.Arrays;

public class Block {
	private int prevHash;
	private String[] transaction;
	
	private int blockHash;
	
	public Block(int prevHash, String[] transaction) {
		this.prevHash = prevHash;
		this.transaction = transaction;
		
		Object [] contens = {Arrays.hashCode(transaction), prevHash};
		this.blockHash = Arrays.hashCode(contens);
	}
	public int getPrevHas() {
		return prevHash;
	}
	public String[]  getTransaction () {
		return transaction;
	}
	public int getBlockHash() {
		return blockHash;
	}
}
