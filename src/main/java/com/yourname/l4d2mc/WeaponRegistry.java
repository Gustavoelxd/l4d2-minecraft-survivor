package com.yourname.l4d2mc;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WeaponRegistry {
    public static final Item PISTOL = new WeaponItem(new Item.Settings(), WeaponType.PISTOL);
    public static final Item SHOTGUN = new WeaponItem(new Item.Settings(), WeaponType.SHOTGUN);
    public static final Item SMG = new WeaponItem(new Item.Settings(), WeaponType.SMG);
    public static final Item RIFLE = new WeaponItem(new Item.Settings(), WeaponType.RIFLE);
    public static final Item MELEE = new WeaponItem(new Item.Settings(), WeaponType.MELEE);

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "pistol"), PISTOL);
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "shotgun"), SHOTGUN);
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "smg"), SMG);
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "rifle"), RIFLE);
        Registry.register(Registries.ITEM, new Identifier("l4d2mc", "melee"), MELEE);
    }
}
