package net.mcreator.communitycollection.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class RabbitBootsItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(10, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 0, ArmorType.CHESTPLATE, 0, ArmorType.HELMET, 0, ArmorType.BODY, 0), 30,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.llama_carpet.unequip")), 0.5f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("community_collection:rabbit_boots_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("community_collection:rabbit_boots")));

	private RabbitBootsItem(Item.Properties properties) {
		super(properties);
	}

	public static class Boots extends RabbitBootsItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}