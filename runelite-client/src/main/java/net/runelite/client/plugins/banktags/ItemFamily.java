package net.runelite.client.plugins.banktags;

import lombok.Getter;

/**
 * Groups Items that belong together.
 * e.g. Saradomin Brew(4), Saradomin Brew(3), ...
 * e.g. Amulet of Glory(6), Amulet of Glory(5), ...
 */
public class ItemFamily
{
    @Getter
    private int[] ids;

    /**
     * Constructor
     * @param ids An array of int that represent the item IDs that belong to the same item
     *            e.g. Saradomin Brew(4), Saradomin Brew(3), ...
     */
    public ItemFamily(int[] ids)
    {
        this.ids = ids;
    }

    /**
     * If the object contains the given item ID
     * @param id The item id this object should be checked for
     * @return Returns true if the object contains the given id; false otherwise
     */
    public boolean contains(int id)
    {
        for(int i = 0; i < ids.length; i++)
        {
            if(ids[i] == id) return true;
        }

        return false;
    }
}
