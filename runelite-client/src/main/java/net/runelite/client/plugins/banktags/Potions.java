package net.runelite.client.plugins.banktags;

import net.runelite.api.ItemID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Potions
{
    // Definition of constants

    public static List<PotionItem> POTIONS = Arrays.asList(
        /**
         * COMBAT POTIONS
         */
            new PotionItem(ItemID.ATTACK_POTION4, ItemID.ATTACK_POTION3,
                    ItemID.ATTACK_POTION2, ItemID.ATTACK_POTION1),
            new PotionItem(ItemID.STRENGTH_POTION4, ItemID.STRENGTH_POTION3,
                    ItemID.STRENGTH_POTION2, ItemID.STRENGTH_POTION1),
            new PotionItem(ItemID.DEFENCE_POTION4, ItemID.DEFENCE_POTION3,
                    ItemID.DEFENCE_POTION2, ItemID.DEFENCE_POTION1),
            new PotionItem(ItemID.MAGIC_POTION4, ItemID.MAGIC_POTION3,
                    ItemID.MAGIC_POTION2, ItemID.MAGIC_POTION1),
            new PotionItem(ItemID.RANGING_POTION4, ItemID.RANGING_POTION3,
                    ItemID.RANGING_POTION2, ItemID.RANGING_POTION1),
            new PotionItem(ItemID.COMBAT_POTION4, ItemID.COMBAT_POTION3,
                    ItemID.COMBAT_POTION2, ItemID.COMBAT_POTION1),
            new PotionItem(ItemID.SUPER_ATTACK4, ItemID.SUPER_ATTACK3,
                    ItemID.SUPER_ATTACK2, ItemID.SUPER_ATTACK1),
            new PotionItem(ItemID.SUPER_STRENGTH4, ItemID.SUPER_STRENGTH3,
                    ItemID.SUPER_STRENGTH2, ItemID.SUPER_STRENGTH1),
            new PotionItem(ItemID.MAGIC_ESSENCE4, ItemID.MAGIC_ESSENCE3,
                    ItemID.MAGIC_ESSENCE2, ItemID.MAGIC_ESSENCE1),
            new PotionItem(ItemID.SUPER_DEFENCE4, ItemID.SUPER_DEFENCE3,
                    ItemID.SUPER_DEFENCE2, ItemID.SUPER_DEFENCE1),
            new PotionItem(ItemID.SUPER_COMBAT_POTION4, ItemID.SUPER_COMBAT_POTION3,
                    ItemID.SUPER_COMBAT_POTION2, ItemID.SUPER_COMBAT_POTION1),
            //public static final PotionItem BASTION_POTION = new PotionItem(ItemID.)
            //public static final PotionItem BATTLEMAGE_POTION = new PotionItem(ItemID)
            new PotionItem(ItemID.ANTIFIRE_POTION4, ItemID.ANTIFIRE_POTION3,
                    ItemID.ANTIFIRE_POTION2, ItemID.ANTIFIRE_POTION1),
            new PotionItem(ItemID.EXTENDED_ANTIFIRE4, ItemID.EXTENDED_ANTIFIRE3,
                    ItemID.EXTENDED_ANTIFIRE2, ItemID.EXTENDED_ANTIFIRE1),
            new PotionItem(ItemID.ZAMORAK_BREW4, ItemID.ZAMORAK_BREW3,
                    ItemID.ZAMORAK_BREW2, ItemID.ZAMORAK_BREW1),
            new PotionItem(ItemID.SARADOMIN_BREW4, ItemID.SARADOMIN_BREW3,
                    ItemID.SARADOMIN_BREW2, ItemID.SARADOMIN_BREW1),
            new PotionItem(ItemID.SUPER_ANTIFIRE_POTION4,
                    ItemID.SUPER_ANTIFIRE_POTION3, ItemID.SUPER_ANTIFIRE_POTION2, ItemID.SUPER_ANTIFIRE_POTION1),
            new PotionItem(ItemID.EXTENDED_SUPER_ANTIFIRE4,
                    ItemID.EXTENDED_SUPER_ANTIFIRE3, ItemID.EXTENDED_SUPER_ANTIFIRE2, ItemID.EXTENDED_SUPER_ANTIFIRE1),
            new PotionItem(ItemID.SUPER_RANGING_4, ItemID.SUPER_RANGING_3,
                    ItemID.SUPER_RANGING_2, ItemID.SUPER_RANGING_1),
            new PotionItem(ItemID.SUPER_MAGIC_POTION_4,
                    ItemID.SUPER_MAGIC_POTION_3, ItemID.SUPER_MAGIC_POTION_2, ItemID.SUPER_MAGIC_POTION_1),
            new PotionItem(ItemID.OVERLOAD_4, ItemID.OVERLOAD_3,
                    ItemID.OVERLOAD_2, ItemID.OVERLOAD_1),
            new PotionItem(ItemID.ABSORPTION_4, ItemID.ABSORPTION_3,
                    ItemID.ABSORPTION_2, ItemID.ABSORPTION_1),
            /**
             * RECOVERY POTIONS
             */
            //public static final PotionItem STAT_RESTORE_POTION = new PotionItem(ItemID.STA
            new PotionItem(ItemID.ENERGY_POTION4, ItemID.ENERGY_POTION3,
                    ItemID.ENERGY_POTION2, ItemID.ENERGY_POTION1),
            new PotionItem(ItemID.SUPER_ENERGY4, ItemID.SUPER_ENERGY3,
                    ItemID.SUPER_ENERGY2, ItemID.SUPER_ENERGY1),
            new PotionItem(ItemID.SUPER_RESTORE4, ItemID.SUPER_RESTORE3,
                    ItemID.SUPER_RESTORE2, ItemID.SUPER_RESTORE1),
            new PotionItem(ItemID.SANFEW_SERUM4, ItemID.SANFEW_SERUM3,
                    ItemID.SANFEW_SERUM2, ItemID.SANFEW_SERUM1),
            new PotionItem(ItemID.STAMINA_POTION4, ItemID.STAMINA_POTION3,
                    ItemID.STAMINA_POTION2, ItemID.STAMINA_POTION1)
            /**
             * CURES AND ANTIPOISONS
             */
    );

    public Potions()
    {
        //mPotions = new ArrayList<PotionItem>();
    }


    /**
     * Returns true if the given item is a potion, false otherwise.
     * @param itemId The itemID of the item which is checked for being a potion.
     * @return
     */
    public static boolean isPotion(int itemId)
    {
        for(PotionItem potion : POTIONS) {
            if(potion.contains(itemId)) return true;
        }

        return false;
    }


    public static int[] getPotionIds(int itemId)
    {
        for(PotionItem potion : POTIONS) {
            if(potion.contains(itemId)) return potion.getIds();
        }

        return null;
    }

}
