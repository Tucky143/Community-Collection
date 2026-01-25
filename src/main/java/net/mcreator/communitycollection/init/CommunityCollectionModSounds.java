/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.communitycollection.CommunityCollectionMod;

public class CommunityCollectionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CommunityCollectionMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> WIND = REGISTRY.register("wind", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("community_collection", "wind")));
}