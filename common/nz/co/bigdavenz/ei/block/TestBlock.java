package nz.co.bigdavenz.ei.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.IIcon;
import net.minecraft.util.IIcon;
import nz.co.bigdavenz.ei.EnchantInsanity;
import nz.co.bigdavenz.ei.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TestBlock extends Block {

    @SideOnly(Side.CLIENT)
    public IIcon sideOneIcon;

    @SideOnly(Side.CLIENT)
    public IIcon sideTwoIcon;

    @SideOnly(Side.CLIENT)
    public IIcon sideThreeIcon;

    @SideOnly(Side.CLIENT)
    public IIcon sideFourIcon;

    @SideOnly(Side.CLIENT)
    public IIcon sideFiveIcon;

    @SideOnly(Side.CLIENT)
    public IIcon sideSixIcon;

    public TestBlock(int id, Material material) {
        super(material);
        this.func_149672_a(Block.field_149767_g);
        this.func_149658_d("testBlock");
        this.func_149647_a(EnchantInsanity.tabsEI);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void func_149651_a(IIconRegister icon) {
        sideOneIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side1"); // Bottom
        sideTwoIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side2"); // Top
        sideThreeIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side3"); // North
        sideFourIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side4"); // South
        sideFiveIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side5"); // West
        sideSixIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side6"); // East
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon func_149735_b(int side, int metadata) {

        switch (side) {
            case 0:
                return sideOneIcon;
            case 1:
                return sideTwoIcon;
            case 2:
                return sideThreeIcon;
            case 3:
                return sideFourIcon;
            case 4:
                return sideFiveIcon;
            case 5:
                return sideSixIcon;
            default:
                return null;
        }

    }
}
