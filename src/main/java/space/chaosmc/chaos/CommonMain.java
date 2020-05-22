package space.chaosmc.chaos;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.projectile.FireballEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import space.chaosmc.chaos.init.ModItems;
import space.chaosmc.chaos.util.Reference;

public class CommonMain implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + Reference.MODNAME.getValue() + "] " + message);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        ModItems.registerItems();
        log(Level.INFO, "Done.");
    }
}
