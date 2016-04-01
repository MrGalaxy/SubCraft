package com.Mr_Galaxy.Subcraft_2.reference;

/**
 * Subcraft 2
 * 
 * Mod Reference Class
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class reference
{
    /** Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;
    
    /** General Mod References */
    public static final String MOD_ID = "subcraft_2";
    public static final String MOD_NAME = "Subcraft 2";
    public static final String SERVER_PROXY_CLASS = "com.Mr_Galaxy.Subcraft_2.proxy.ComProxy";
    public static final String CLIENT_PROXY_CLASS = "com.Mr_Galaxy.Subcraft_2.proxy.ClientProxy";
    
    public static final String DEPENDENCIES = "required-after:Forge@[11.15.1.1777,)";
    public static final String MINECARFT_VERSION = "[ 1.8.9 ]";

    public static final String CHANNEL_NAME = MOD_ID;
    
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTON = 256;
    public static final int VERSION_CHECK_ATTEMPTS = 3;
    
}