package net.goldtreeservers.worldguardextraflags.blaze;

import org.bukkit.Location;

public class BlazeUtil {

    public static boolean shouldBlazeSkyblockCancel(Location location) {
        String loc = location.getWorld().getName();
        return loc.equals("skyblock_world") ||
                loc.equals("skyblock_world_nether") ||
                loc.equals("skyblock_world_the_end");
    }

}
