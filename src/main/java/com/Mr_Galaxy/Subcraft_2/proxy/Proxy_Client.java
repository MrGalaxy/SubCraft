package com.Mr_Galaxy.Subcraft_2.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Proxy_Client extends Proxy_Common
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

}