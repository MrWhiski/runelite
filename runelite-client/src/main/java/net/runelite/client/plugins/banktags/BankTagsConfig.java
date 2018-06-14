package net.runelite.client.plugins.banktags;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup(
        keyName = "banktags",
        name = "Bank Tags",
        description = "Add tags to different items that they can be searched for.")
public interface BankTagsConfig extends Config
{
    @ConfigItem(
            keyName = "allDoses",
            name = "Add tags to all doses for pots.",
            description = "Adds tags to all doses for pots.")
    default boolean allDoses()
    {
        return false;
    }
}
