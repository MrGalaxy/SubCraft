package com.Mr_Galaxy.Subcraft_3.reference;

/**
 * Subcraft 3
 * 
 * Mod Version class
 * 
 * [ (0.0.0) - (0.0.0) ]
 * [ 0.0.0 ]
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class version
{
	public static final String Minecraft_VERSION = "1.8.9";
	
	public static final int MAJOR_VERSION = 1;
	public static final int MINOR_VERSION = 0;
	public static final int REVISION_VERSION = 0;

	
	public static final String MOD_BUILD = "[ (" + Minecraft_VERSION 
										   + ") - (" + MAJOR_VERSION 
										   + "." + MINOR_VERSION
										   + "."  + REVISION_VERSION 
										   + ") ]";
	
	public static final String MOD_BUILD_NUMBER = "[ " + MAJOR_VERSION + "." + MINOR_VERSION + "."  + REVISION_VERSION + " ]";
	
}