/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.communitycollection.potion.ShrunkenMobEffect;
import net.mcreator.communitycollection.CommunityCollectionMod;

public class CommunityCollectionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CommunityCollectionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> SHRUNKEN = REGISTRY.register("shrunken", () -> new ShrunkenMobEffect());
}