package com.Mr_Galaxy.Subcraft_2.block;

import com.Mr_Galaxy.Subcraft_2.Subcraft_2;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class general_block extends Block
{

	public general_block(int id, Material material) 
	{
		super(material);
		//this.setCreativeTab(Subcraft_2.Subcraft_2_tab);
	}
	
	//@SideOnly(Side.CLIENT)
    //public void registerIcons(IconRegister par1IconRegister)
	//{
	//	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	//}
}