package com.github.MrGalaxy.subcraft_2.core.handlers;

import net.minecraft.item.ItemStack;

import com.github.MrGalaxy.subcraft_2.item.mod_items;

import cpw.mods.fml.common.IFuelHandler;

/**
 * Subcraft-2
 * 
 * Fuel Handler class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class FuelHandler implements IFuelHandler
{
	//200 units for one item
	
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel.itemID == mod_items.item_light_coal.itemID)
            return 2200;
		else
		
		return 0;
	}
	
}