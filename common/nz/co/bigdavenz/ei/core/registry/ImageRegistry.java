package nz.co.bigdavenz.ei.core.registry;

import nz.co.bigdavenz.ei.core.util.ImageResource;
import nz.co.bigdavenz.ei.lib.ResourcePaths;

/**
 * Created by David J. Dudson on 8/12/13.
 */
public class ImageRegistry {

    public static ImageResource hotbarBacking = new ImageResource(ResourcePaths.PATH_HOTBAR_BACKING,935, 185);
    public static ImageResource hungerBar = new ImageResource(ResourcePaths.PATH_HUNGER_BAR,403, 20);
    public static ImageResource iconOffence = new ImageResource(ResourcePaths.PATH_SKILL_ICON_OFFENCE,256, 256);

    public static ImageResource crosshairCircle = new ImageResource(ResourcePaths.PATH_CROSSHAIR_CIRCLE, 16, 16);
    public static ImageResource crosshairCross = new ImageResource(ResourcePaths.PATH_CROSSHAIR_CROSS, 16, 16);
    public static ImageResource crosshairHollowCross = new ImageResource(ResourcePaths.PATH_CROSSHAIR_HOLLOW_CROSS, 16, 16);
}
