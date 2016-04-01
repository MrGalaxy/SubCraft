package com.Mr_Galaxy.Subcraft_2.block.block;

import java.util.Random;

import com.Mr_Galaxy.Subcraft_2.block.general_block;
import com.Mr_Galaxy.Subcraft_2.item.mod_items;

import net.minecraft.block.material.Material;

/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class oreblock_quartz extends general_block
{
	public oreblock_quartz(int id, Material material) 
	{
		super(id, material);
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 3;
    }
	
    //public int idDropped(int par1, Random par2Random, int par3)
    //{
    //    return mod_items.item_quartz.itemID;
    //}
}