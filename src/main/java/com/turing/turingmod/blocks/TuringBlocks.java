package com.turing.turingmod.blocks;

import com.turing.turingmod.blocks.BitBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public final class TuringBlocks {
	
	static Block bitBlock;
	static Item itemBitBlock;
    
    public static void registerBlocks(IForgeRegistry<Block> registry) {
        bitBlock = new BitBlock();
    		registry.registerAll(bitBlock);
    }
    
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
    		itemBitBlock = new ItemBlock(bitBlock).setRegistryName(bitBlock.getRegistryName());
    	 	registry.registerAll(itemBitBlock);
    }
}
