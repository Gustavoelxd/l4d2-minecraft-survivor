package com.yourname.l4d2mc;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class WeaponItem extends Item {
    private final WeaponType weaponType;

    public WeaponItem(Settings settings, WeaponType weaponType) {
        super(settings);
        this.weaponType = weaponType;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        System.out.println("Weapon fired: " + weaponType.name());
        return TypedActionResult.success(stack, world.isClient());
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
