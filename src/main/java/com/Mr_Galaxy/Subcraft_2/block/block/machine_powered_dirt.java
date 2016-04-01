package com.Mr_Galaxy.Subcraft_2.block.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class machine_powered_dirt extends Block
{

	public machine_powered_dirt(Material materialIn)
	{
		super(materialIn);
	}
	/*
    @SideOnly(Side.CLIENT)
    private Icon machine_powered_dirt_A;
    
    @SideOnly(Side.CLIENT)
    private Icon machine_powered_dirt_B;

        protected machine_powered_dirt(int par1)
        {
            super(par1, Material.ground);
            this.setTickRandomly(true);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            this.setLightOpacity(255);
            this.setCreativeTab(Subcraft_2.Subcraft_2_Machine_tab);
        }

        /**
         * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
         * cleared to be reused)
         */
        /*
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
        {
            return AxisAlignedBB.getAABBPool().getAABB((double)(par2 + 0), (double)(par3 + 0), (double)(par4 + 0), (double)(par2 + 1), (double)(par3 + 1), (double)(par4 + 1));
        }

        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        /*
        public boolean isOpaqueCube()
        {
            return false;
        }

        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        /*
        public boolean renderAsNormalBlock()
        {
            return false;
        }

        @SideOnly(Side.CLIENT)

        /**
         * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
         */
        /*
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 1 ? (par2 > 0 ? this.machine_powered_dirt_A : this.machine_powered_dirt_B) : Block.dirt.getBlockTextureFromSide(par1);
        }

        /**
         * returns true if there is at least one cropblock nearby (x-1 to x+1, y+1, z-1 to z+1)
         */
        /*
        @SuppressWarnings("unused")
        private boolean isCropsNearby(World par1World, int par2, int par3, int par4)
        {
            byte b0 = 0;

            for (int l = par2 - b0; l <= par2 + b0; ++l)
            {
                for (int i1 = par4 - b0; i1 <= par4 + b0; ++i1)
                {
                    int j1 = par1World.getBlockId(l, par3 + 1, i1);

                    Block plant = blocksList[j1];
                    if (plant instanceof IPlantable && canSustainPlant(par1World, par2, par3, par4, ForgeDirection.UP, (IPlantable)plant))
                    {
                        return true;
                    }
                }
            }

            return false;
        }


        /**
         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
         * their own) Args: x, y, z, neighbor blockID
         */
        /*
        public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
        {
            super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
            Material material = par1World.getBlockMaterial(par2, par3 + 1, par4);

            if (material.isSolid())
            {
                par1World.setBlock(par2, par3, par4, mod_blocks.machine_powered_dirt.blockID);
            }
        }

        /**
         * Returns the ID of the items to drop on destruction.
         */
        /*
        public int idDropped(int par1, Random par2Random, int par3)
        {
            return mod_blocks.machine_powered_dirt.idDropped(0, par2Random, par3);
        }

        @SideOnly(Side.CLIENT)

        /**
         * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
         */
        /*
        public int idPicked(World par1World, int par2, int par3, int par4)
        {
            return mod_blocks.machine_powered_dirt.blockID;
        }

        @SideOnly(Side.CLIENT)

        /**
         * When this method is called, your block should register all the icons it needs with the given IconRegister. This
         * is the only chance you get to register icons.
         */
        /*
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.machine_powered_dirt_A = par1IconRegister.registerIcon(this.getTextureName() + "_wet");
            this.machine_powered_dirt_B = par1IconRegister.registerIcon(this.getTextureName() + "_dry");
        }
        */
    }