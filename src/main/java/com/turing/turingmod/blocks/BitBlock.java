package com.turing.turingmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BitBlock extends Block {

	static String name = "bit_block";
	static String registryName = "bit_block";
	
    public BitBlock(Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(registryName);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BitBlock(float hardness, float resistance) {
        this(Material.ROCK, hardness, resistance);
    }

    public BitBlock() {
        this(2.0f, 10.0f);
    }
}
