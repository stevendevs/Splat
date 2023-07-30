package me.stevenplayzz.splat;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.stevenplayzz.splat.config.SplatConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Splat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("splat");
	public static final String MODID = "splat";

	@Override
	public void onInitialize() {
		// Register the autoconfig //
		AutoConfig.register(SplatConfig.class, JanksonConfigSerializer::new);

		LOGGER.info("Items... everywhere.");
	}
}