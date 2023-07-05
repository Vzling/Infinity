package net.jin.avaritia.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.jin.avaritia.entity.BlackHoleEntity;

public class BlackHoleModel extends GeoModel<BlackHoleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackHoleEntity entity) {
		return new ResourceLocation("avaritia", "animations/blackhole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackHoleEntity entity) {
		return new ResourceLocation("avaritia", "geo/blackhole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackHoleEntity entity) {
		return new ResourceLocation("avaritia", "textures/entities/" + entity.getTexture() + ".png");
	}

}
