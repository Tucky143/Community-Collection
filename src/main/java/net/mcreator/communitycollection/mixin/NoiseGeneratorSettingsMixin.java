package net.mcreator.communitycollection.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.communitycollection.init.CommunityCollectionModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements CommunityCollectionModBiomes.CommunityCollectionModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> community_collection_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.community_collection_dimensionTypeReference != null) {
			retval = CommunityCollectionModBiomes.adaptSurfaceRule(retval, this.community_collection_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setcommunity_collectionDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.community_collection_dimensionTypeReference = dimensionType;
	}
}