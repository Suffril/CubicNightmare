package me.swirtzly.cubicnightmare.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Sharktopus - Batman
 * Created using Tabula 5.1.0
 */
public class ModelSharktopus extends ModelBase {
	
	private static float rad = (float) (Math.PI / 180);
	public ModelRenderer body;
	public ModelRenderer head;
	public ModelRenderer dorsalfin1;
	public ModelRenderer rightfin1;
	public ModelRenderer leftfin1;
	public ModelRenderer tt11;
	public ModelRenderer tt21;
	public ModelRenderer tt31;
	public ModelRenderer tt41;
	public ModelRenderer tt51;
	public ModelRenderer tt61;
	public ModelRenderer tt71;
	public ModelRenderer tt81;
	public ModelRenderer leftspikes;
	public ModelRenderer rightspikes;
	public ModelRenderer topjaw;
	public ModelRenderer lowerjaw;
	public ModelRenderer snout;
	public ModelRenderer topteeth;
	public ModelRenderer lowteeth;
	public ModelRenderer dorsalfin2;
	public ModelRenderer dorsalfin3;
	public ModelRenderer rightfin2;
	public ModelRenderer rightfin3;
	public ModelRenderer leftfin2;
	public ModelRenderer leftfin3;
	public ModelRenderer tt12;
	public ModelRenderer tt13;
	public ModelRenderer tt14;
	public ModelRenderer tt15;
	public ModelRenderer tt22;
	public ModelRenderer tt23;
	public ModelRenderer tt24;
	public ModelRenderer tt25;
	public ModelRenderer tt32;
	public ModelRenderer tt33;
	public ModelRenderer tt34;
	public ModelRenderer tt35;
	public ModelRenderer tt42;
	public ModelRenderer tt43;
	public ModelRenderer tt44;
	public ModelRenderer tt45;
	public ModelRenderer tt52;
	public ModelRenderer tt53;
	public ModelRenderer tt54;
	public ModelRenderer tt55;
	public ModelRenderer tt62;
	public ModelRenderer tt63;
	public ModelRenderer tt64;
	public ModelRenderer tt65;
	public ModelRenderer tt72;
	public ModelRenderer tt73;
	public ModelRenderer tt74;
	public ModelRenderer tt75;
	public ModelRenderer tt82;
	public ModelRenderer tt83;
	public ModelRenderer tt84;
	public ModelRenderer tt85;
	
	public ModelSharktopus() {
		this.textureWidth = 200;
		this.textureHeight = 200;
		this.tt23 = new ModelRenderer(this, 0, 149);
		this.tt23.setRotationPoint(0.0F, -0.4F, 21.0F);
		this.tt23.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.tt22 = new ModelRenderer(this, 0, 123);
		this.tt22.setRotationPoint(0.0F, -0.5F, 20.8F);
		this.tt22.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.tt74 = new ModelRenderer(this, 53, 174);
		this.tt74.setRotationPoint(0.4F, 0.0F, 20.7F);
		this.tt74.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt34 = new ModelRenderer(this, 0, 174);
		this.tt34.setRotationPoint(0.0F, -0.5F, 20.7F);
		this.tt34.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt51 = new ModelRenderer(this, 79, 0);
		this.tt51.setRotationPoint(0.0F, 4.5F, -0.4F);
		this.tt51.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt51, -0.27314402793711257F, 0.0F, 0.0F);
		this.lowteeth = new ModelRenderer(this, 38, 60);
		this.lowteeth.setRotationPoint(-0.5F, -3.0F, -6.5F);
		this.lowteeth.addBox(-3.0F, 0.0F, 0.0F, 7, 2, 6, 0.0F);
		this.leftfin2 = new ModelRenderer(this, 12, 87);
		this.leftfin2.setRotationPoint(0.0F, 2.6F, -0.5F);
		this.leftfin2.addBox(-0.5F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
		this.setRotateAngle(leftfin2, 0.091106186954104F, 0.0F, 0.0F);
		this.tt63 = new ModelRenderer(this, 77, 53);
		this.tt63.setRotationPoint(0.0F, 0.5F, 21.0F);
		this.tt63.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.tt42 = new ModelRenderer(this, 79, 27);
		this.tt42.setRotationPoint(0.0F, 0.5F, 20.8F);
		this.tt42.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.tt55 = new ModelRenderer(this, 104, 64);
		this.tt55.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt55.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.tt33 = new ModelRenderer(this, 0, 149);
		this.tt33.setRotationPoint(0.0F, -0.4F, 21.0F);
		this.tt33.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.leftspikes = new ModelRenderer(this, 17, 73);
		this.leftspikes.setRotationPoint(5.6F, -3.0F, -14.0F);
		this.leftspikes.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.setRotateAngle(leftspikes, 0.0F, 0.22759093446006054F, 0.0F);
		this.tt24 = new ModelRenderer(this, 0, 174);
		this.tt24.setRotationPoint(0.0F, -0.5F, 20.7F);
		this.tt24.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt25 = new ModelRenderer(this, 0, 174);
		this.tt25.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt25.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.tt41 = new ModelRenderer(this, 79, 0);
		this.tt41.setRotationPoint(-4.0F, 4.5F, -0.4F);
		this.tt41.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt41, -0.22759093446006054F, -0.091106186954104F, 0.0F);
		this.tt45 = new ModelRenderer(this, 104, 64);
		this.tt45.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt45.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.leftfin3 = new ModelRenderer(this, 23, 87);
		this.leftfin3.setRotationPoint(0.0F, 2.7F, -0.4F);
		this.leftfin3.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
		this.setRotateAngle(leftfin3, 0.18203784098300857F, 0.0F, 0.0F);
		this.tt84 = new ModelRenderer(this, 108, 174);
		this.tt84.setRotationPoint(-0.4F, 0.0F, 20.7F);
		this.tt84.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt31 = new ModelRenderer(this, 0, 96);
		this.tt31.setRotationPoint(-4.0F, -2.5F, -0.4F);
		this.tt31.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt31, 0.091106186954104F, -0.136659280431156F, 0.0F);
		this.rightfin2 = new ModelRenderer(this, 12, 87);
		this.rightfin2.setRotationPoint(0.0F, 2.6F, -0.5F);
		this.rightfin2.addBox(-0.5F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
		this.setRotateAngle(rightfin2, 0.091106186954104F, 0.0F, 0.0F);
		this.dorsalfin3 = new ModelRenderer(this, 61, 73);
		this.dorsalfin3.setRotationPoint(-0.5F, -0.4F, 0.3F);
		this.dorsalfin3.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
		this.setRotateAngle(dorsalfin3, -0.22759093446006054F, 0.0F, 0.0F);
		this.tt12 = new ModelRenderer(this, 0, 123);
		this.tt12.setRotationPoint(0.0F, -0.5F, 20.8F);
		this.tt12.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.setRotateAngle(tt12, 0.0F, 0.136659280431156F, 0.0F);
		this.tt73 = new ModelRenderer(this, 53, 149);
		this.tt73.setRotationPoint(0.4F, 0.0F, 21.0F);
		this.tt73.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.setRotateAngle(tt73, 0.0F, 0.136659280431156F, 0.0F);
		this.tt82 = new ModelRenderer(this, 108, 123);
		this.tt82.setRotationPoint(-0.4F, 0.0F, 20.8F);
		this.tt82.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.setRotateAngle(tt82, 0.0F, -0.136659280431156F, 0.0F);
		this.tt61 = new ModelRenderer(this, 79, 0);
		this.tt61.setRotationPoint(4.0F, 4.5F, -0.4F);
		this.tt61.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt61, -0.22759093446006054F, 0.091106186954104F, 0.0F);
		this.tt11 = new ModelRenderer(this, 0, 96);
		this.tt11.setRotationPoint(4.0F, -2.5F, -0.4F);
		this.tt11.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt11, 0.091106186954104F, 0.136659280431156F, 0.0F);
		this.dorsalfin1 = new ModelRenderer(this, 33, 73);
		this.dorsalfin1.setRotationPoint(0.0F, -3.7F, -11.0F);
		this.dorsalfin1.addBox(-1.5F, -3.0F, -2.5F, 3, 4, 4, 0.0F);
		this.setRotateAngle(dorsalfin1, -0.5462880558742251F, 0.0F, 0.0F);
		this.tt64 = new ModelRenderer(this, 104, 71);
		this.tt64.setRotationPoint(0.0F, 0.5F, 20.7F);
		this.tt64.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt54 = new ModelRenderer(this, 104, 71);
		this.tt54.setRotationPoint(0.0F, 0.5F, 20.7F);
		this.tt54.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.dorsalfin2 = new ModelRenderer(this, 49, 73);
		this.dorsalfin2.setRotationPoint(0.0F, -6.7F, -1.3F);
		this.dorsalfin2.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
		this.setRotateAngle(dorsalfin2, -0.31869712141416456F, 0.0F, 0.0F);
		this.snout = new ModelRenderer(this, 0, 46);
		this.snout.setRotationPoint(0.0F, -3.3F, -9.5F);
		this.snout.addBox(-4.5F, 0.0F, 0.0F, 9, 4, 8, 0.0F);
		this.setRotateAngle(snout, 0.31869712141416456F, 0.0F, 0.0F);
		this.rightspikes = new ModelRenderer(this, 0, 73);
		this.rightspikes.setRotationPoint(-5.6F, -3.0F, -14.0F);
		this.rightspikes.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.setRotateAngle(rightspikes, 0.0F, -0.22759093446006054F, 0.0F);
		this.tt72 = new ModelRenderer(this, 53, 123);
		this.tt72.setRotationPoint(0.4F, 0.0F, 20.8F);
		this.tt72.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.setRotateAngle(tt72, 0.0F, 0.136659280431156F, 0.0F);
		this.tt85 = new ModelRenderer(this, 108, 174);
		this.tt85.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt85.addBox(0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F);
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setRotationPoint(0.0F, 5.0F, 5.0F);
		this.body.addBox(-6.0F, -4.5F, -14.0F, 12, 11, 14, 0.0F);
		this.setRotateAngle(body, 0.045553093477052F, 0.0F, 0.0F);
		this.tt14 = new ModelRenderer(this, 0, 174);
		this.tt14.setRotationPoint(0.0F, -0.5F, 20.7F);
		this.tt14.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.rightfin3 = new ModelRenderer(this, 23, 87);
		this.rightfin3.setRotationPoint(0.0F, 2.7F, -0.4F);
		this.rightfin3.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
		this.setRotateAngle(rightfin3, 0.18203784098300857F, 0.0F, 0.0F);
		this.tt35 = new ModelRenderer(this, 0, 174);
		this.tt35.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt35.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.head = new ModelRenderer(this, 0, 28);
		this.head.setRotationPoint(0.0F, 0.6F, -13.5F);
		this.head.addBox(-5.5F, -5.0F, -6.0F, 11, 10, 6, 0.0F);
		this.setRotateAngle(head, 0.045553093477052F, 0.0F, 0.0F);
		this.topjaw = new ModelRenderer(this, 36, 28);
		this.topjaw.setRotationPoint(0.0F, 1.2F, -4.9F);
		this.topjaw.addBox(-5.0F, -2.5F, -8.0F, 10, 3, 8, 0.0F);
		this.setRotateAngle(topjaw, -0.18203784098300857F, 0.0F, 0.0F);
		this.topteeth = new ModelRenderer(this, 38, 46);
		this.topteeth.setRotationPoint(-4.0F, 0.3F, -7.0F);
		this.topteeth.addBox(0.0F, 0.0F, -0.3F, 8, 2, 6, 0.0F);
		this.tt43 = new ModelRenderer(this, 77, 53);
		this.tt43.setRotationPoint(0.0F, 0.5F, 21.0F);
		this.tt43.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.tt21 = new ModelRenderer(this, 0, 96);
		this.tt21.setRotationPoint(0.0F, -2.5F, -0.4F);
		this.tt21.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt21, 0.18203784098300857F, 0.0F, 0.0F);
		this.tt71 = new ModelRenderer(this, 53, 96);
		this.tt71.setRotationPoint(4.0F, 0.5F, -0.4F);
		this.tt71.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt71, -0.136659280431156F, 0.136659280431156F, 0.0F);
		this.tt83 = new ModelRenderer(this, 108, 149);
		this.tt83.setRotationPoint(-0.4F, 0.0F, 21.0F);
		this.tt83.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.setRotateAngle(tt83, 0.0F, -0.136659280431156F, 0.0F);
		this.rightfin1 = new ModelRenderer(this, 0, 87);
		this.rightfin1.setRotationPoint(-5.0F, 1.0F, -12.0F);
		this.rightfin1.addBox(-0.5F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(rightfin1, 0.31869712141416456F, 0.0F, 0.6829473363053812F);
		this.tt13 = new ModelRenderer(this, 0, 149);
		this.tt13.setRotationPoint(0.0F, -0.4F, 21.0F);
		this.tt13.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.tt53 = new ModelRenderer(this, 77, 53);
		this.tt53.setRotationPoint(0.0F, 0.5F, 21.0F);
		this.tt53.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 21, 0.0F);
		this.tt44 = new ModelRenderer(this, 104, 71);
		this.tt44.setRotationPoint(0.0F, 0.5F, 20.7F);
		this.tt44.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 21, 0.0F);
		this.tt52 = new ModelRenderer(this, 79, 27);
		this.tt52.setRotationPoint(0.0F, 0.5F, 20.8F);
		this.tt52.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.tt62 = new ModelRenderer(this, 79, 27);
		this.tt62.setRotationPoint(0.0F, 0.5F, 20.8F);
		this.tt62.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.lowerjaw = new ModelRenderer(this, 0, 60);
		this.lowerjaw.setRotationPoint(0.0F, 2.8F, -4.9F);
		this.lowerjaw.addBox(-4.5F, -1.5F, -8.0F, 9, 3, 8, 0.0F);
		this.setRotateAngle(lowerjaw, 0.5918411493512771F, 0.0F, 0.0017453292519943296F);
		this.tt15 = new ModelRenderer(this, 0, 174);
		this.tt15.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt15.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.tt65 = new ModelRenderer(this, 104, 64);
		this.tt65.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt65.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
		this.tt75 = new ModelRenderer(this, 53, 174);
		this.tt75.setRotationPoint(0.0F, 0.0F, 20.8F);
		this.tt75.addBox(0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F);
		this.tt32 = new ModelRenderer(this, 0, 123);
		this.tt32.setRotationPoint(0.0F, -0.5F, 20.8F);
		this.tt32.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 21, 0.0F);
		this.setRotateAngle(tt32, 0.0F, -0.136659280431156F, 0.0F);
		this.leftfin1 = new ModelRenderer(this, 0, 87);
		this.leftfin1.setRotationPoint(5.0F, 1.0F, -12.0F);
		this.leftfin1.addBox(-0.5F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(leftfin1, 0.31869712141416456F, 0.0F, -0.6829473363053812F);
		this.tt81 = new ModelRenderer(this, 108, 96);
		this.tt81.setRotationPoint(-4.0F, 0.5F, -0.4F);
		this.tt81.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 21, 0.0F);
		this.setRotateAngle(tt81, -0.136659280431156F, -0.136659280431156F, 0.0F);
		this.tt22.addChild(this.tt23);
		this.tt21.addChild(this.tt22);
		this.tt73.addChild(this.tt74);
		this.tt33.addChild(this.tt34);
		this.body.addChild(this.tt51);
		this.lowerjaw.addChild(this.lowteeth);
		this.leftfin1.addChild(this.leftfin2);
		this.tt62.addChild(this.tt63);
		this.tt41.addChild(this.tt42);
		this.tt54.addChild(this.tt55);
		this.tt32.addChild(this.tt33);
		this.body.addChild(this.leftspikes);
		this.tt23.addChild(this.tt24);
		this.tt24.addChild(this.tt25);
		this.body.addChild(this.tt41);
		this.tt44.addChild(this.tt45);
		this.leftfin2.addChild(this.leftfin3);
		this.tt83.addChild(this.tt84);
		this.body.addChild(this.tt31);
		this.rightfin1.addChild(this.rightfin2);
		this.dorsalfin2.addChild(this.dorsalfin3);
		this.tt11.addChild(this.tt12);
		this.tt72.addChild(this.tt73);
		this.tt81.addChild(this.tt82);
		this.body.addChild(this.tt61);
		this.body.addChild(this.tt11);
		this.body.addChild(this.dorsalfin1);
		this.tt63.addChild(this.tt64);
		this.tt53.addChild(this.tt54);
		this.dorsalfin1.addChild(this.dorsalfin2);
		this.topjaw.addChild(this.snout);
		this.body.addChild(this.rightspikes);
		this.tt71.addChild(this.tt72);
		this.tt84.addChild(this.tt85);
		this.tt13.addChild(this.tt14);
		this.rightfin2.addChild(this.rightfin3);
		this.tt34.addChild(this.tt35);
		this.body.addChild(this.head);
		this.head.addChild(this.topjaw);
		this.topjaw.addChild(this.topteeth);
		this.tt42.addChild(this.tt43);
		this.body.addChild(this.tt21);
		this.body.addChild(this.tt71);
		this.tt82.addChild(this.tt83);
		this.body.addChild(this.rightfin1);
		this.tt12.addChild(this.tt13);
		this.tt52.addChild(this.tt53);
		this.tt43.addChild(this.tt44);
		this.tt51.addChild(this.tt52);
		this.tt61.addChild(this.tt62);
		this.head.addChild(this.lowerjaw);
		this.tt14.addChild(this.tt15);
		this.tt64.addChild(this.tt65);
		this.tt74.addChild(this.tt75);
		this.tt31.addChild(this.tt32);
		this.body.addChild(this.leftfin1);
		this.body.addChild(this.tt81);
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5) {
		GlStateManager.pushMatrix();
		setRotationAngles(entity, limbSwing, limbSwingAmount, ticksExisted, headyaw, headpitch, f5);
		GlStateManager.scale(2, 2, 2);
		this.body.render(f5);
		GlStateManager.popMatrix();
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
	}
	
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5) {
		
		float motion = MathHelper.sqrt(entity.motionX * entity.motionX + entity.motionY * entity.motionY + entity.motionZ * entity.motionZ);
		ModelRenderer[] tt1 = {this.tt11, this.tt12, this.tt13, this.tt14, this.tt15};
		ModelRenderer[] tt2 = {this.tt21, this.tt22, this.tt23, this.tt24, this.tt25};
		ModelRenderer[] tt3 = {this.tt31, this.tt32, this.tt33, this.tt34, this.tt35};
		ModelRenderer[] tt4 = {this.tt41, this.tt42, this.tt43, this.tt44, this.tt45};
		ModelRenderer[] tt5 = {this.tt51, this.tt52, this.tt53, this.tt54, this.tt55};
		ModelRenderer[] tt6 = {this.tt61, this.tt62, this.tt63, this.tt64, this.tt65};
		ModelRenderer[] tt7 = {this.tt71, this.tt72, this.tt73, this.tt74, this.tt75};
		ModelRenderer[] tt8 = {this.tt81, this.tt82, this.tt83, this.tt84, this.tt85};
		ModelRenderer[][] tt = {tt1, tt2, tt3, tt4, tt5, tt6, tt7, tt8};
		
		this.lowerjaw.rotateAngleX = -7 * rad + MathHelper.sin(ticksExisted * 0.1f) * 0.3f + 0.3f;
		
		float f1 = 0.9f;
		float f2 = 0.5F * limbSwingAmount;
		for (int i = 0; i < tt.length; i++) {
			for (int j = 0; j < tt[i].length; j++) {
				float k = i * 2 * 3.14f / tt.length;
				float l = 0;
				float m = 0;
				switch (i) {
					case 0:
						l = 0.5f;
						m = 0.5f;
						break;
					case 1:
						l = 1.0f;
						m = 0.0f;
						break;
					case 2:
						l = 0.5f;
						m = -0.5f;
						break;
					case 3:
						l = -0.5f;
						m = -0.5f;
						break;
					case 4:
						l = -1.0f;
						m = 0.0f;
						break;
					case 5:
						l = -0.5f;
						m = 0.5f;
						break;
					case 6:
						l = 0.0f;
						m = 1.0f;
						break;
					case 7:
						l = 0.0f;
						m = -1.0f;
						break;
				}
				float idle = (MathHelper.cos(k + ticksExisted * 0.01f + (f1 * (tt[i].length - j))) + 0.0f) * 0.1f;
				float motiona = (MathHelper.cos(limbSwing * 0.15F + (f1 * (tt[i].length - j))) + 0.5f) * f2;
				
				tt[i][j].rotateAngleX = motiona * l;
				tt[i][j].rotateAngleY = motiona * m;
				tt[i][j].rotateAngleX += ((idle) / (motion + 1)) * l;
				tt[i][j].rotateAngleY += ((idle) / (motion + 1)) * m;
				
			}
		}
		
	}
}
