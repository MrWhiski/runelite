package net.runelite.client.plugins.banktags;

/**
 * Wrapper for ItemFamily of Potions
 */
public class PotionItem extends ItemFamily
{
    /**
     * Constructor
     * @param idDose4 Item ID of the 4 dose potion
     * @param idDose3 Item ID of the 3 dose potion
     * @param idDose2 Item ID of the 2 dose Potion
     * @param idDose1 Item ID of the 1 dose Potion
     */
    public PotionItem(int idDose4, int idDose3, int idDose2, int idDose1)
    {
        super(new int[]{idDose1, idDose2, idDose3, idDose4});
    }
}
