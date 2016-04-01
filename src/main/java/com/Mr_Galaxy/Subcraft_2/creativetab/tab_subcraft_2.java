package com.github.MrGalaxy.subcraft_2.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Subcraft-2
 * 
 * Sub2 Creative Tab Class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Subcraft_2_tab extends CreativeTabs
{
    public Subcraft_2_tab(int i, String par1Str)
    {
        super(i, par1Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Block.beacon.blockID;
    }
}