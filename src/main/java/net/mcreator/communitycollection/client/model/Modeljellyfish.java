package net.mcreator.communitycollection.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljellyfish extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("community_collection", "modeljellyfish"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart t1;
	public final ModelPart t2;
	public final ModelPart t3;
	public final ModelPart t4;
	public final ModelPart t5;
	public final ModelPart bb_main;

	public Modeljellyfish(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.t1 = this.body.getChild("t1");
		this.t2 = this.body.getChild("t2");
		this.t3 = this.body.getChild("t3");
		this.t4 = this.body.getChild("t4");
		this.t5 = this.body.getChild("t5");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -0.25F, -8.0F, 16.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
				.addBox(-6.0F, -4.25F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-3.0F, -2.25F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.75F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.6F, 12.45F, -0.1F));
		PartDefinition t1 = body.addOrReplaceChild("t1",
				CubeListBuilder.create().texOffs(40, 39).addBox(-1.0F, -10.75F, -1.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 36).addBox(-1.0F, 0.25F, -0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.4F, 1.3F, 5.6F));
		PartDefinition t2 = body.addOrReplaceChild("t2",
				CubeListBuilder.create().texOffs(49, 22).addBox(-1.0F, -10.75F, -1.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 49).addBox(-1.0F, 0.25F, -0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, 0.8F, -4.4F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t3 = body.addOrReplaceChild("t3",
				CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -9.75F, -1.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 55).addBox(-1.0F, 0.25F, -0.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4F, -0.2F, 0.6F, 0.0F, 0.0F, -3.1416F));
		PartDefinition t4 = body.addOrReplaceChild("t4",
				CubeListBuilder.create().texOffs(58, 22).addBox(-1.0F, -9.25F, -1.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 51).addBox(-1.0F, -0.25F, -0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6F, -0.2F, 2.6F));
		PartDefinition t5 = body.addOrReplaceChild("t5",
				CubeListBuilder.create().texOffs(58, 34).addBox(-1.0F, -7.75F, -1.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 53).addBox(-1.0F, -0.75F, -0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.4F, -1.7F, -4.4F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(18, 55).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 39).addBox(-2.0F, -21.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}