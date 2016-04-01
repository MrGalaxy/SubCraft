package com.Mr_Galaxy.Subcraft_2.block.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.Mr_Galaxy.Subcraft_2.block.general_block;

/**
 * Subcraft-2
 * 
 * ore block Class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class oreblock_light_coal extends general_block
{
	public oreblock_light_coal(int id, Material material) 
	{
		super(id, material);
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    //public int idDropped(int par1, Random par2Random, int par3)
    //{
    //    return mod_items.item_light_coal.itemID;
    //}
}