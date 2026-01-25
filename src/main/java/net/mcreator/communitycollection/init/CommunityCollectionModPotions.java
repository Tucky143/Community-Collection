/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.communitycollection.CommunityCollectionMod;

public class CommunityCollectionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, CommunityCollectionMod.MODID);
	public static final DeferredHolder<Potion, Potion> POTION_OF_SHRINKING = REGISTRY.register("potion_of_shrinking", () -> new Potion("potion_of_shrinking", new MobEffectInstance(CommunityCollectionModMobEffects.SHRUNKEN, 3600, 0, false, false)));
}