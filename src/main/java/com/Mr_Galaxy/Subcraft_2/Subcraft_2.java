package com.Mr_Galaxy.Subcraft_2;

import com.Mr_Galaxy.Subcraft_2.reference.reference;
import com.Mr_Galaxy.Subcraft_2.reference.version;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Subcraft 2
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
    
    @Mod(
        modid = reference.MOD_ID,
        name = reference.MOD_NAME,
        version = version.MOD_BUILD_NUMBER,
        dependencies = reference.DEPENDENCIES
        )
    
    //@NetworkMod(
    //    clientSideRequired = true,
    //    serverSideRequired = false,
    //    channels = {Reference.CHANNEL_NAME},
    //    packetHandler = Packet_Handler.class
    //    )
    
public class Subcraft_2
{
	@Instance(reference.MOD_ID)
        public static Subcraft_2 instance;
	
	@EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
			
        }
	
	@EventHandler
        public void Init(FMLInitializationEvent event)
        {
			
        }
	
	@EventHandler
		public void postInit (FMLPostInitializationEvent event)
		{
			
		}
}