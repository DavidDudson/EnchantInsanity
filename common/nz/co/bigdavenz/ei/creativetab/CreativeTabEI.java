package nz.co.bigdavenz.ei.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemSword;
import nz.co.bigdavenz.ei.block.EIBlock;

public class CreativeTabEI extends CreativeTabs {

    public CreativeTabEI(int par1, String par2Str) {

        super(par1, par2Str);
    }

    @Override
    public Item getTabIconItem() {
        return new ItemSword(Item.ToolMaterial.EMERALD);
    }
}
