package nz.co.bigdavenz.ei.lib;

/**
 * Enchant Insantiy
 * <p/>
 * Created by BigDaveNz
 * <p/>
 * Reference File for EI Constants
 */

public class Reference {

    public static final String MOD_ID = "EI";
    public static boolean ModInitialised = false;
    public static final String MOD_RESOURCE_DOMAIN = "ei";
    public static final String MOD_NAME = "Enchant Insanity";
    public static final String MOD_VERSION = "0.0.1";
    public static final int TPS = 20;
    public static final String SERVER_PROXY_CLASS = "nz.co.bigdavenz.ei.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "nz.co.bigdavenz.ei.core.proxy.ClientProxy";
    public static final String CHANNEL_NAME = "assets/ei";

    private static final String LANG_RESOURCE_LOCATION = "/mods/ei/lang/";
    public static String[] localeFiles = {LANG_RESOURCE_LOCATION + "en_US.xml"};

    public static boolean debugMode = true;

    public static final String BLOCK_TEXTURE_DIR = "/assests/enchantinsanity/textures/blocks/";
    public static final String ITEM_TEXTURE_DIR = "/assests/enchantinsanity/textures/items/";
    public static final String ANIMATION_DIR = "/assests/enchantinsanity/animations";
    public static final String SOUND_DIR = "/assests/enchantinsanity/sounds/";

    public static final boolean activateAllAbilities = true;
    public static final boolean activateAllEnchantments = true;

}
