package com.Mr_Galaxy.Subcraft_3;

import com.Mr_Galaxy.Subcraft_3.init.mod_blocks;
import com.Mr_Galaxy.Subcraft_3.init.mod_items;
import com.Mr_Galaxy.Subcraft_3.reference.reference;
import com.Mr_Galaxy.Subcraft_3.reference.version;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Subcraft 3
 * 
 * main Mod Class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
    
    @Mod(
        modid = reference.MOD_ID,
        name = reference.MOD_NAME,
        version = version.MOD_BUILD,
        dependencies = reference.DEPENDENCIES
        )
    
    
public class Subcraft_3
{
	@Instance(reference.MOD_ID)
    	public static Subcraft_3 instance;
		
	
	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    	//public static IProxy proxy;
		
	
	@EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
			
			//Configuration_Handler.init(event.getSuggestedConfigurationFile());
			
			mod_items.init();
			
			mod_blocks.init();
			
			
			
        }
	
	@EventHandler
        public void Init(FMLInitializationEvent event)
        {
			
        	//recipes.init();
        	
        	//Register our fuels
        	//GameRegistry.registerFuelHandler(new handler_fuel());
        	
        	
			
        }
	
	@EventHandler
		public void postInit (FMLPostInitializationEvent event)
		{
			
			
			
		}
	
	
}