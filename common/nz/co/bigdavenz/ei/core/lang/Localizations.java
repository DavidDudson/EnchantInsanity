package nz.co.bigdavenz.ei.core.lang;

import cpw.mods.fml.common.registry.LanguageRegistry;
import nz.co.bigdavenz.ei.lib.Reference;

/**
 * Created by David J. Dudson on 2/01/14.
 */
public class Localizations {

    public static void loadLanguages(){
        for(String LocationFile: Reference.localeFiles){
            LanguageRegistry.instance().loadLocalization(LocationFile, getLocaleFromFileName(LocationFile), isXMLLanguageFile(LocationFile));
        }
    }

    public static boolean isXMLLanguageFile(String fileName){
        return fileName.endsWith(".xml");
    }

    public static String getLocaleFromFileName(String fileName){
        return fileName.substring(fileName.lastIndexOf("/")+1,fileName.lastIndexOf("."));
    }

    public static String getLocalizationString(String key){
        return LanguageRegistry.instance().getStringLocalization(key);
    }
}
