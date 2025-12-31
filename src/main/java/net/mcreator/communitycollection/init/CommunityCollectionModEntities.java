/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.communitycollection.entity.JellyfishEntity;
import net.mcreator.communitycollection.entity.IcicleProjectileEntity;
import net.mcreator.communitycollection.entity.CoconutProjectileEntity;
import net.mcreator.communitycollection.entity.CapybaraEntity;
import net.mcreator.communitycollection.CommunityCollectionMod;

@EventBusSubscriber
public class CommunityCollectionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CommunityCollectionMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CoconutProjectileEntity>> COCONUT_PROJECTILE = register("coconut_projectile",
			EntityType.Builder.<CoconutProjectileEntity>of(CoconutProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IcicleProjectileEntity>> ICICLE_PROJECTILE = register("icicle_projectile",
			EntityType.Builder.<IcicleProjectileEntity>of(IcicleProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CapybaraEntity>> CAPYBARA = register("capybara",
			EntityType.Builder.<CapybaraEntity>of(CapybaraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JellyfishEntity>> JELLYFISH = register("jellyfish",
			EntityType.Builder.<JellyfishEntity>of(JellyfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.8f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(CommunityCollectionMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CapybaraEntity.init(event);
		JellyfishEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
		event.put(JELLYFISH.get(), JellyfishEntity.createAttributes().build());
	}
}