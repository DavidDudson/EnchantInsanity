package nz.co.bigdavenz.ei.core.registry;

import nz.co.bigdavenz.ei.block.EIBlock;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EILanguageRegistry {

    public static void init() {
        LanguageRegistry.addName(EIBlock.eiTestBlock, "Generic Dirt");
    }
}
