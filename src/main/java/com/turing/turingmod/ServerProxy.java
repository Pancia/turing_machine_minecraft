package com.turing.turingmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;

public class ServerProxy extends CommonProxy {
	public void registerBlocks(Register<Block> event) {
		super.registerBlocks(event);
	}

	public void registerItemBlocks(Register<Item> event) {
		super.registerItemBlocks(event);
	}
}
