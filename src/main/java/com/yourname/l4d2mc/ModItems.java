package com.yourname.l4d2mc;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "test_item"), TEST_ITEM);
    }
}
