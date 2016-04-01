package com.github.MrGalaxy.subcraft_2.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.github.MrGalaxy.subcraft_2.lib.Reference;
import com.github.MrGalaxy.subcraft_2.lib.id_block;
import com.github.MrGalaxy.subcraft_2.lib.id_item;

import cpw.mods.fml.common.FMLLog;

/**
 * Subcraft-2
 * 
 * Config Class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class config
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        configuration = new Configuration(configFile);

        try {
            configuration.load();
            
            
            /* Block configs */

            id_block.ID_OREBLOCK_NAQUADAH_DEFAULT = configuration.getBlock("oreblock_naquadah", id_block.ID_OREBLOCK_NAQUADAH_DEFAULT).getInt(id_block.ID_OREBLOCK_NAQUADAH_DEFAULT);

            id_block.ID_OREBLOCK_NAQUADRIA_DEFAULT = configuration.getBlock("oreblock_naquadria", id_block.ID_OREBLOCK_NAQUADRIA_DEFAULT).getInt(id_block.ID_OREBLOCK_NAQUADRIA_DEFAULT);

            id_block.ID_OREBLOCK_TIN_DEFAULT = configuration.getBlock("oreblock_tin", id_block.ID_OREBLOCK_TIN_DEFAULT).getInt(id_block.ID_OREBLOCK_TIN_DEFAULT);

            id_block.ID_OREBLOCK_COPPER_DEFAULT = configuration.getBlock("oreblock_copper", id_block.ID_OREBLOCK_COPPER_DEFAULT).getInt(id_block.ID_OREBLOCK_COPPER_DEFAULT);

            id_block.ID_OREBLOCK_QUARTZ_DEFAULT = configuration.getBlock("oreblock_quartz", id_block.ID_OREBLOCK_QUARTZ_DEFAULT).getInt(id_block.ID_OREBLOCK_QUARTZ_DEFAULT);

				//id_block.id_block.ID_OREBLOCK_SILVER_DEFAULT = configuration.getBlock("oreblock_silver", id_block.ID_OREBLOCK_SILVER_DEFAULT).getInt(id_block.ID_OREBLOCK_SILVER_DEFAULT);

            id_block.ID_OREBLOCK_LIGHT_COAL_DEFAULT = configuration.getBlock("oreblock_light_coal", id_block.ID_OREBLOCK_LIGHT_COAL_DEFAULT).getInt(id_block.ID_OREBLOCK_LIGHT_COAL_DEFAULT);

			id_block.ID_BLOCK_NAQUADAH_BLOCK_DEFAULT = configuration.getBlock("block_naquadah_block", id_block.ID_BLOCK_NAQUADAH_BLOCK_DEFAULT).getInt(id_block.ID_BLOCK_NAQUADAH_BLOCK_DEFAULT);

			id_block.ID_BLOCK_NAQUADRIA_BLOCK_DEFAULT = configuration.getBlock("block_naquadria_bloc", id_block.ID_BLOCK_NAQUADRIA_BLOCK_DEFAULT).getInt(id_block.ID_BLOCK_NAQUADRIA_BLOCK_DEFAULT);

			id_block.ID_BLOCK_NAQUADAH_DEFAULT = configuration.getBlock("block_naquadah", id_block.ID_BLOCK_NAQUADAH_DEFAULT).getInt(id_block.ID_BLOCK_NAQUADAH_DEFAULT);

			id_block.ID_BLOCK_NAQUADRIA_DEFAULT = configuration.getBlock("block_naquadria", id_block.ID_BLOCK_NAQUADRIA_DEFAULT).getInt(id_block.ID_BLOCK_NAQUADRIA_DEFAULT);

				//id_block. = configuration.getBlock(String, id_block.).getInt(id_block.);

				//id_block. = configuration.getBlock(String, id_block.).getInt(id_block.);

				//id_block. = configuration.getBlock(String, id_block.).getInt(id_block.);

            
            
            /* Item configs */

            id_item.ID_ITEM_NAQUADAH_BRICK_DEFAULT = configuration.getItem("item_naquadah_brick", id_item.ID_ITEM_NAQUADAH_BRICK_DEFAULT).getInt(id_item.ID_ITEM_NAQUADAH_BRICK_DEFAULT);

            id_item.ID_ITEM_NAQUADRIA_BRICK_DEFAULT = configuration.getItem("item_naquadria_brick", id_item.ID_ITEM_NAQUADRIA_BRICK_DEFAULT).getInt(id_item.ID_ITEM_NAQUADRIA_BRICK_DEFAULT);

            id_item.ID_ITEM_TIN_INGOT_DEFAULT = configuration.getItem("item_tin_ingot", id_item.ID_ITEM_TIN_INGOT_DEFAULT).getInt(id_item.ID_ITEM_TIN_INGOT_DEFAULT);

            id_item.ID_ITEM_COPPER_INGOT_DEFAULT = configuration.getItem("item_copper_ingot", id_item.ID_ITEM_COPPER_INGOT_DEFAULT).getInt(id_item.ID_ITEM_COPPER_INGOT_DEFAULT);

            id_item.ID_ITEM_QUARTZ_DEFAULT = configuration.getItem("item_quartz", id_item.ID_ITEM_QUARTZ_DEFAULT).getInt(id_item.ID_ITEM_QUARTZ_DEFAULT);

				//id_item.ID_ITEM_SILVER_INGOT_DEFAULT = configuration.getItem("item_silver_ingot", id_item.ID_ITEM_SILVER_INGOT_DEFAULT).getInt(id_item.ID_ITEM_SILVER_INGOT_DEFAULT);

            id_item.ID_ITEM_LIGHT_COAL_DEFAULT = configuration.getItem("item_light_coal", id_item.ID_ITEM_LIGHT_COAL_DEFAULT).getInt(id_item.ID_ITEM_LIGHT_COAL_DEFAULT);

				//id_item.ID_ITEM_NAQUADAH_INGOT_DEFAULT = configuration.getItem("item_naquadah_ingot", id_item.ID_ITEM_NAQUADAH_INGOT_DEFAULT).getInt(id_item.ID_ITEM_NAQUADAH_INGOT_DEFAULT);

				//id_item.ID_ITEM_NAQUADRIA_INGOT_DEFAULT = configuration.getItem("item_naquadria_ingot", id_item.ID_ITEM_NAQUADRIA_INGOT_DEFAULT).getInt(id_item.ID_ITEM_NAQUADRIA_INGOT_DEFAULT);

            	//id_item. = configuration.getItem(String, id_item.).getInt(id_item.);

				//id_item. = configuration.getItem(String, id_item.).getInt(id_item.);

				//id_item. = configuration.getItem(String, id_item.).getInt(id_item.);

            
            
        }
        catch (Exception S)
        {
            FMLLog.log(Level.SEVERE, S, Reference.MAINCREATIVETAB_NAME + " has had a problem loading its configuration");
        }
        finally
        {
            configuration.save();
        }
    }

    public static void set(String categoryName, String propertyName, String newValue)
    {
        configuration.load();
        if (configuration.getCategoryNames().contains(categoryName)) {
            if (configuration.getCategory(categoryName).containsKey(propertyName)) {
                configuration.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        configuration.save();
    }
}
