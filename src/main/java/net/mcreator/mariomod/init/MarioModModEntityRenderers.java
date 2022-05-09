
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mariomod.client.renderer.GoombaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MarioModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MarioModModEntities.FIRE_FLOWER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MarioModModEntities.ICE_FLOWER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MarioModModEntities.GOOMBA.get(), GoombaRenderer::new);
	}
}