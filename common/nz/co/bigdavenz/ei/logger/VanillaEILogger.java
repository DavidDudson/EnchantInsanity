package nz.co.bigdavenz.ei.logger;

import cpw.mods.fml.relauncher.FMLRelaunchLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import nz.co.bigdavenz.ei.lib.Reference;


import cpw.mods.fml.common.FMLLog;

/**
 * @author BigDaveNz
 * 
 */
public class VanillaEILogger{

    public static Logger eiLogger;

    public static void init(){
        LogManager.getLogger(Reference.MOD_ID);
    }

    private static FMLRelaunchLog coreLog = FMLRelaunchLog.log;

    public static void log(String targetLog, Level level, String format, Object... data)
    {
        coreLog.log(targetLog, level, format, data);
    }

    public static void log(Level level, String format, Object... data)
    {
        coreLog.log(level, format, data);
    }

    public static void log(String targetLog, Level level, Throwable ex, String format, Object... data)
    {
        coreLog.log(targetLog, level, ex, format, data);
    }

    public static void log(Level level, Throwable ex, String format, Object... data)
    {
        coreLog.log(level, ex, format, data);
    }

    public static void severe(String format, Object... data)
    {
        log(Level.ERROR, format, data);
    }

    public static void warning(String format, Object... data)
    {
        log(Level.WARN, format, data);
    }

    public static void info(String format, Object... data)
    {
        log(Level.INFO, format, data);
    }

    public static void fine(String format, Object... data)
    {
        log(Level.DEBUG, format, data);
    }

    public static void finer(String format, Object... data)
    {
        log(Level.TRACE, format, data);
    }

    public static Logger getLogger()
    {
        return coreLog.getLogger();
    }
}
