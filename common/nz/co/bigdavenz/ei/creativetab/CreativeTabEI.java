package nz.co.bigdavenz.ei.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public abstract class CreativeTabEI extends CreativeTabs {

    public CreativeTabEI(int par1, String par2Str) {

        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {

        return 340;
    }
}
