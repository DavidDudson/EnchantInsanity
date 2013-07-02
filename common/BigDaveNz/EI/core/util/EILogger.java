package BigDaveNz.EI.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import BigDaveNz.EI.lib.Reference;


import cpw.mods.fml.common.FMLLog;

/**
 * @author BigDaveNz
 *
 */
public class EILogger {

    private static Logger eiLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        eiLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        eiLogger.log(logLevel, message);
    }

    public static void severe(String message) {
            
       log(Level.SEVERE, message);
    }
        
    public static void debug(String message) {
            
        log(Level.WARNING, "[DEBUG] " + message);
    }
        
    public static void warning(String message) {
            
        log(Level.WARNING, message);
    }
       
    public static void info(String message) {
         
        log(Level.INFO, message);
    }
        
    public static void config(String message) {
            
        log(Level.CONFIG, message);
    }
        
    public static void fine(String message) {
            
         log(Level.FINE, message);
    }
        
    public static void finer(String message) {
           
        log(Level.FINER, message);
    }
        
    public static void finest(String message) {
            
        log(Level.FINEST, message);
    }
}

