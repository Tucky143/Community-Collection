package net.mcreator.communitycollection.potion;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.communitycollection.init.CommunityCollectionModMobEffects;
import net.mcreator.communitycollection.CommunityCollectionMod;

import java.util.List;
import java.util.ArrayList;

@EventBusSubscriber
public class ShrunkenMobEffect extends MobEffect {
	public ShrunkenMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13290187);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.wandering_trader.disappeared")));
		this.addAttributeModifier(Attributes.SCALE, ResourceLocation.fromNamespaceAndPath(CommunityCollectionMod.MODID, "effect.shrunken_0"), -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(NeoForgeMod.NAMETAG_DISTANCE, ResourceLocation.fromNamespaceAndPath(CommunityCollectionMod.MODID, "effect.shrunken_1"), -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.CAMERA_DISTANCE, ResourceLocation.fromNamespaceAndPath(CommunityCollectionMod.MODID, "effect.shrunken_2"), -0.5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, ResourceLocation.fromNamespaceAndPath(CommunityCollectionMod.MODID, "effect.shrunken_3"), -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Items.HONEY_BOTTLE.components().get(DataComponents.CONSUMABLE);
		if (original != null) {
			List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
			onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(CommunityCollectionModMobEffects.SHRUNKEN));
			Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
			event.modify(Items.HONEY_BOTTLE, builder -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
		}
	}
}