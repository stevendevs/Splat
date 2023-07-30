package me.stevenplayzz.splat.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.stevenplayzz.splat.Splat;

@Config(name = Splat.MODID)
public class SplatConfig implements ConfigData {
    @ConfigEntry.BoundedDiscrete(min = 0, max = 25)
    public int xVelocity = 1;

    @ConfigEntry.BoundedDiscrete(min = 0, max = 25)
    public int yVelocity = 1;

    @ConfigEntry.BoundedDiscrete(min = 0, max = 25)
    public int zVelocity = 1;
}