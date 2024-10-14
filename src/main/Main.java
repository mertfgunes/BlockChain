package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	
	// hash = digital signature 
	// each block will have list of transactions and the previous hash.
	
	ArrayList <Block> blockChain = new ArrayList<>();
	public static void main(String[] args) {

		String [] genesisTransactions = {"satoshi sent mert 10 bitcoin", "faruk sent 10 bitcoins to mert"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		String[] block2Transaction = {"satoshi sent mert 10 bitcoin", "mert sent 10 bitcoins to starbucks"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transaction);
		

		System.out.println("Hash of block1 : ");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of block2 : ");
		System.out.println(block2.getBlockHash());
	}
}