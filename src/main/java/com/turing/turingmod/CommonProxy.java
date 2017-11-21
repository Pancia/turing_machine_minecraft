package com.turing.turingmod;

import com.turing.turingmod.blocks.TuringBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void registerBlocks(Register<Block> event) {
		System.out.println("TuringMod registerBlocks");
		
        TuringBlocks.registerBlocks(event.getRegistry());
	}

	public void registerItemBlocks(Register<Item> event) {
		System.out.println("TuringMod registerItemBlocks");
		
        TuringBlocks.registerItemBlocks(event.getRegistry());
   	}

	public void preInit(FMLPreInitializationEvent e) {
		System.out.println(">>> PRE INIT");
	}
	
	public void init(FMLInitializationEvent e) {
		System.out.println(">>> INIT");
	}

	public void postInit(FMLPostInitializationEvent e) {
		System.out.println(">>> POST INIT");
	}
}
