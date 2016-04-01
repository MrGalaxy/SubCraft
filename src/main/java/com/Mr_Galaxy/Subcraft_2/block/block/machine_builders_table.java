package com.Mr_Galaxy.Subcraft_2.block.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.Mr_Galaxy.Subcraft_2.block.general_machine_block;

/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class machine_builders_table extends general_machine_block
{

	public machine_builders_table(int id, Material material)
	{
		super(id, material);
	}
	/*
    @SideOnly(Side.CLIENT)
    private Icon machine_builders_tableIconTop;
    
    @SideOnly(Side.CLIENT)
    private Icon machine_builders_tableIconFront;

    protected machine_builders_table(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(Subcraft_2.Subcraft_2_Machine_tab);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
	/*
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.machine_builders_tableIconTop : (par1 == 0 ? Block.planks.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.machine_builders_tableIconFront));
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	/*
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(this.getTextureName() + "_side");
        this.machine_builders_tableIconTop = par1IconRegister.registerIcon(this.getTextureName() + "_top");
        this.machine_builders_tableIconFront = par1IconRegister.registerIcon(this.getTextureName() + "_front");
    }

    /**
     * Called upon block activation (right click on the block.)
     */
	/*
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
            return true;
        }
    }
    */
}