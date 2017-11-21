package com.turing.turingmod;

import com.turing.turingmod.blocks.BlockModelRegister;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	public void registerBlocks(Register<Block> event) {
		super.registerBlocks(event);
	}

	public void registerItemBlocks(Register<Item> event) {
		super.registerItemBlocks(event);
		BlockModelRegister.registerModels();
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
}
