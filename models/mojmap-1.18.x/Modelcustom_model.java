// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -10.0F, -3.0F, 12.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-6.0F, -10.0F, 8.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(6.0F, -2.0F, -3.0F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-5.0F, -9.0F, -2.0F, 10.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-6.0F, 0.0F, -3.0F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r2 = bb_main
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(36, 16).addBox(-8.0F, -10.0F, 6.0F, 11.0F, 7.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 39)
						.addBox(-6.0F, -10.0F, 3.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 0.0F, -7.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-6.0F, 0.0F, -8.0F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 23)
						.addBox(-3.0F, -10.0F, 6.0F, 11.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(8.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = bb_main
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 23).addBox(6.0F, -2.0F, -8.0F, 0.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(3.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-8.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}