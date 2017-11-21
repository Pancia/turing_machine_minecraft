package com.turing.turingmod.blocks;

import com.turing.turingmod.TuringMod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockModelRegister {
	
	public static void registerModels() {
	    reg(TuringBlocks.bitBlock);
	}
	
    public static void reg(Block block) {
    		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, 
    				new ModelResourceLocation(TuringMod.prependModId(block), "normal"));
    }
}
