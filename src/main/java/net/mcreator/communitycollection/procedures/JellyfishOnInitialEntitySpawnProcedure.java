package net.mcreator.communitycollection.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class JellyfishOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("community_collection:spawn"), 0.5, AttributeModifier.Operation.ADD_VALUE);
			if (!_entity.getAttribute(Attributes.MOVEMENT_EFFICIENCY).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.MOVEMENT_EFFICIENCY).addPermanentModifier(modifier);
			}
		}
	}
}