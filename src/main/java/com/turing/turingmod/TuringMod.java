package com.turing.turingmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = TuringMod.MODID, version = TuringMod.VERSION)
@Mod.EventBusSubscriber
public class TuringMod {
    public static final String MODID = "turingmod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide="com.turing.turingmod.ClientProxy", 
		    		serverSide="com.turing.turingmod.ServerProxy")
    public static CommonProxy proxy;
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
    		proxy.registerBlocks(e);
    }
    
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
    		proxy.registerItemBlocks(e);
    }
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent e) {
    		proxy.preInit(e);
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent e) {
    		proxy.init(e);
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
    }
    
    public static String prependModId(String s) {
    		return MODID + ":" + s;
    }
    
    public static String prependModId(Block b) {
		return prependModId(b.getUnlocalizedName().substring(5));
    }
}
