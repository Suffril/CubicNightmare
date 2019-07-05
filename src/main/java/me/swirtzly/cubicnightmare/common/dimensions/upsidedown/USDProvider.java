package me.swirtzly.cubicnightmare.common.dimensions.upsidedown;

import me.swirtzly.cubicnightmare.proxy.ClientProxy;
import net.minecraft.client.audio.MusicTicker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.IRenderHandler;

import javax.annotation.Nullable;

public class USDProvider extends WorldProviderSurface {
	
	private static final Vec3d USD_COLOR = new Vec3d(0.14F, 0.15F, 0.22F);
	
	@Nullable
	@Override
	public IRenderHandler getSkyRenderer() {
		//return RenderUpsideDownSky.getInstance();
		return null;
	}
	
	@Nullable
	@Override
	public IRenderHandler getCloudRenderer() {
		return super.getCloudRenderer();
	}
	
	@Override
	public float calculateCelestialAngle(long par1, float par3) {
		return 0.59181356F;
	}
	
	@Override
	public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
		return USD_COLOR;
	}
	
	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return USD_COLOR;
	}
	
	@Override
	public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
		return USD_COLOR;
	}
	
	@Override
	public boolean canDoLightning(Chunk chunk) {
		return false;
	}
	
	@Override
	public float getCloudHeight() {
		return super.getCloudHeight() * 2;
	}
	
	@Override
	protected void generateLightBrightnessTable() {
		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float) i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * 1.0F + 0.0F;
			this.lightBrightnessTable[i] = lightBrightnessTable[i] *= 0.8F;
		}
	}
	
	
	@Override
	public void calculateInitialWeather() {
		world.thunderingStrength = 1.0F;
		world.getWorldInfo().setThundering(true);
	}
	
	@Override
	public void updateWeather() {
		WorldInfo worldInfo = world.getWorldInfo();
		if (!world.isRemote) {
			world.thunderingStrength = 1.0f;
			worldInfo.setThundering(true);
		}
		worldInfo.setCleanWeatherTime(0);
		worldInfo.setThunderTime(worldInfo.getThunderTime() - 100);
		world.updateWeatherBody();
	}
	
	@Nullable
	@Override
	public MusicTicker.MusicType getMusicType() {
		return ClientProxy.USD_MUSIC;
	}
	
	@Override
	public boolean shouldClientCheckLighting() {
		return true;
	}
	
	@Override
	public WorldSleepResult canSleepAt(EntityPlayer player, BlockPos pos) {
		return WorldSleepResult.ALLOW;
	}
}
