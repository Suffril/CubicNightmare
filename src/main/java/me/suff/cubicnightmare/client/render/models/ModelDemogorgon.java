package me.suff.cubicnightmare.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Demogorgon - BOTMON
 * Created using Tabula 5.1.0
 */
public class ModelDemogorgon extends ModelBase {
	public ModelRenderer bodybase;
	public ModelRenderer neck;
	public ModelRenderer leftshoulder;
	public ModelRenderer rightshoulder;
	public ModelRenderer belly;
	public ModelRenderer head;
	public ModelRenderer pedal11;
	public ModelRenderer pedal21;
	public ModelRenderer pedal31;
	public ModelRenderer pedal41;
	public ModelRenderer pedal51;
	public ModelRenderer lowerjaw;
	public ModelRenderer topjaw;
	public ModelRenderer pedal12;
	public ModelRenderer jawset11;
	public ModelRenderer jawset12;
	public ModelRenderer pedal13;
	public ModelRenderer pedal14;
	public ModelRenderer pedal22;
	public ModelRenderer jawset21;
	public ModelRenderer jawset22;
	public ModelRenderer pedal23;
	public ModelRenderer pedal24;
	public ModelRenderer pedal32;
	public ModelRenderer jawset31;
	public ModelRenderer jawset32;
	public ModelRenderer pedal33;
	public ModelRenderer pedal34;
	public ModelRenderer pedal42;
	public ModelRenderer jawset42;
	public ModelRenderer jawset41;
	public ModelRenderer pedal43;
	public ModelRenderer pedal44;
	public ModelRenderer pedal52;
	public ModelRenderer jawset52;
	public ModelRenderer jawset51;
	public ModelRenderer pedal53;
	public ModelRenderer pedal54;
	public ModelRenderer lowjawteeth1;
	public ModelRenderer lowjawteeth2;
	public ModelRenderer topjawteeth1;
	public ModelRenderer topjawteeth2;
	public ModelRenderer leftarm1;
	public ModelRenderer leftarm2;
	public ModelRenderer leftarm3;
	public ModelRenderer lefthand;
	public ModelRenderer leftfinger1;
	public ModelRenderer leftfinger2;
	public ModelRenderer leftfinger3;
	public ModelRenderer leftfinger4;
	public ModelRenderer leftthumb;
	public ModelRenderer rightarm1;
	public ModelRenderer rightarm2;
	public ModelRenderer rightarm3;
	public ModelRenderer righthand;
	public ModelRenderer rightfinger1;
	public ModelRenderer rightfinger2;
	public ModelRenderer rightfinger3;
	public ModelRenderer rightfinger4;
	public ModelRenderer rightthumb;
	public ModelRenderer bodylower;
	public ModelRenderer leftleg1;
	public ModelRenderer rightleg1;
	public ModelRenderer leftleg2;
	public ModelRenderer leftfoot;
	public ModelRenderer lefttoe1;
	public ModelRenderer lefttoe2;
	public ModelRenderer rightleg2;
	public ModelRenderer rightfoot;
	public ModelRenderer righttoe1;
	public ModelRenderer righttoe2;
	
	public ModelDemogorgon() {
		this.textureWidth = 150;
		this.textureHeight = 150;
		this.righttoe1 = new ModelRenderer(this, 21, 104);
		this.righttoe1.setRotationPoint(-1.0F, 1.0F, -2.8F);
		this.righttoe1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe1, -0.31869712141416456F, 0.18203784098300857F, 0.0F);
		this.lefttoe1 = new ModelRenderer(this, 20, 94);
		this.lefttoe1.setRotationPoint(-1.0F, 1.0F, -2.8F);
		this.lefttoe1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe1, -0.31869712141416456F, 0.18203784098300857F, 0.0F);
		this.jawset52 = new ModelRenderer(this, 84, 64);
		this.jawset52.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset52.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset52, -1.5481070465189704F, 0.0F, 0.5009094953223726F);
		this.pedal51 = new ModelRenderer(this, 65, 59);
		this.pedal51.setRotationPoint(1.5F, -0.8F, -2.0F);
		this.pedal51.addBox(-2.5F, -2.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotateAngle(pedal51, 0.31869712141416456F, 0.0F, 2.367539130330308F);
		this.topjaw = new ModelRenderer(this, 32, 103);
		this.topjaw.setRotationPoint(0.0F, -4.0F, 0.2F);
		this.topjaw.addBox(0.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
		this.setRotateAngle(topjaw, -0.5918411493512771F, 0.7853981633974483F, -0.4413937678293659F);
		this.pedal54 = new ModelRenderer(this, 71, 64);
		this.pedal54.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.pedal54.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(pedal54, 0.18203784098300857F, 0.0F, 0.0F);
		this.lefttoe2 = new ModelRenderer(this, 20, 87);
		this.lefttoe2.setRotationPoint(1.0F, 1.0F, -2.8F);
		this.lefttoe2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe2, -0.31869712141416456F, -0.18203784098300857F, 0.0F);
		this.jawset22 = new ModelRenderer(this, 33, 93);
		this.jawset22.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset22.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset22, -1.5481070465189704F, 0.0F, 0.5009094953223726F);
		this.pedal14 = new ModelRenderer(this, 37, 82);
		this.pedal14.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.pedal14.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(pedal14, 0.136659280431156F, 0.0F, 0.0F);
		this.lefthand = new ModelRenderer(this, 38, 28);
		this.lefthand.setRotationPoint(0.0F, 2.2F, -0.5F);
		this.lefthand.addBox(-1.5F, 0.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(lefthand, 0.22759093446006054F, 0.0F, 0.0F);
		this.lowjawteeth1 = new ModelRenderer(this, 80, 103);
		this.lowjawteeth1.setRotationPoint(2.9F, -1.6F, -3.0F);
		this.lowjawteeth1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
		this.bodylower = new ModelRenderer(this, 0, 36);
		this.bodylower.setRotationPoint(0.0F, 6.3F, -0.4F);
		this.bodylower.addBox(-4.0F, -1.0F, -6.0F, 8, 5, 8, 0.0F);
		this.setRotateAngle(bodylower, -0.045553093477052F, 0.0F, 0.0F);
		this.pedal11 = new ModelRenderer(this, 37, 67);
		this.pedal11.setRotationPoint(0.0F, -6.0F, -2.0F);
		this.pedal11.addBox(-2.5F, -2.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotateAngle(pedal11, 0.18203784098300857F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 64, 41);
		this.head.setRotationPoint(0.0F, -5.2F, -0.3F);
		this.head.addBox(-3.5F, -6.0F, -2.5F, 7, 7, 5, 0.0F);
		this.rightfinger4 = new ModelRenderer(this, 89, 12);
		this.rightfinger4.setRotationPoint(-0.5F, 3.0F, -0.5F);
		this.rightfinger4.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rightfinger4, 0.36425021489121656F, 0.0F, 0.0F);
		this.pedal33 = new ModelRenderer(this, 105, 78);
		this.pedal33.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal33.addBox(-1.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(pedal33, 0.22759093446006054F, 0.0F, 0.0F);
		this.leftleg2 = new ModelRenderer(this, 18, 71);
		this.leftleg2.setRotationPoint(0.0F, 11.4F, -0.5F);
		this.leftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(leftleg2, 0.22759093446006054F, 0.0F, 0.18203784098300857F);
		this.belly = new ModelRenderer(this, 0, 21);
		this.belly.setRotationPoint(0.0F, -1.0F, -1.0F);
		this.belly.addBox(-3.0F, 0.0F, -5.0F, 6, 6, 6, 0.0F);
		this.righttoe2 = new ModelRenderer(this, 15, 111);
		this.righttoe2.setRotationPoint(1.0F, 1.0F, -2.8F);
		this.righttoe2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe2, -0.31869712141416456F, -0.18203784098300857F, 0.0F);
		this.leftfoot = new ModelRenderer(this, 0, 91);
		this.leftfoot.setRotationPoint(0.0F, 10.0F, 0.5F);
		this.leftfoot.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(leftfoot, 0.31869712141416456F, 0.0F, 0.0F);
		this.pedal24 = new ModelRenderer(this, 46, 93);
		this.pedal24.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.pedal24.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(pedal24, 0.091106186954104F, 0.0F, 0.0F);
		this.rightleg2 = new ModelRenderer(this, 0, 71);
		this.rightleg2.setRotationPoint(0.0F, 11.4F, -0.5F);
		this.rightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(rightleg2, 0.22759093446006054F, 0.0F, -0.18203784098300857F);
		this.pedal13 = new ModelRenderer(this, 37, 77);
		this.pedal13.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal13.addBox(-1.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(pedal13, 0.136659280431156F, 0.0F, 0.0F);
		this.pedal31 = new ModelRenderer(this, 90, 78);
		this.pedal31.setRotationPoint(-2.5F, -4.0F, -2.0F);
		this.pedal31.addBox(-2.5F, -2.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotateAngle(pedal31, 0.22759093446006054F, 0.0F, -1.1383037381507017F);
		this.lowjawteeth2 = new ModelRenderer(this, 71, 103);
		this.lowjawteeth2.setRotationPoint(2.9F, -1.6F, -3.0F);
		this.lowjawteeth2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
		this.setRotateAngle(lowjawteeth2, 0.0F, -1.5481070465189704F, 0.0F);
		this.pedal34 = new ModelRenderer(this, 105, 83);
		this.pedal34.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.pedal34.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(pedal34, 0.091106186954104F, 0.0F, 0.0F);
		this.rightfoot = new ModelRenderer(this, 0, 104);
		this.rightfoot.setRotationPoint(0.0F, 10.0F, 0.5F);
		this.rightfoot.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(rightfoot, 0.31869712141416456F, 0.0F, 0.0F);
		this.jawset51 = new ModelRenderer(this, 71, 64);
		this.jawset51.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset51.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset51, -1.5481070465189704F, 0.0F, -0.5009094953223726F);
		this.pedal53 = new ModelRenderer(this, 80, 64);
		this.pedal53.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal53.addBox(-1.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(pedal53, 0.091106186954104F, 0.0F, 0.0F);
		this.rightthumb = new ModelRenderer(this, 77, 17);
		this.rightthumb.setRotationPoint(-1.4F, 0.1F, 0.4F);
		this.rightthumb.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(rightthumb, -0.7285004297824331F, 0.0F, 0.0F);
		this.pedal52 = new ModelRenderer(this, 80, 59);
		this.pedal52.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal52.addBox(-2.0F, -2.0F, -0.5F, 4, 2, 1, 0.0F);
		this.setRotateAngle(pedal52, 0.18203784098300857F, 0.0F, 0.0F);
		this.leftarm3 = new ModelRenderer(this, 50, 28);
		this.leftarm3.setRotationPoint(-0.5F, 7.8F, 0.0F);
		this.leftarm3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F);
		this.leftfinger2 = new ModelRenderer(this, 60, 36);
		this.leftfinger2.setRotationPoint(1.5F, 3.0F, -0.5F);
		this.leftfinger2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(leftfinger2, 0.36425021489121656F, 0.0F, 0.0F);
		this.rightfinger1 = new ModelRenderer(this, 77, 12);
		this.rightfinger1.setRotationPoint(-1.5F, 3.0F, -0.5F);
		this.rightfinger1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rightfinger1, 0.36425021489121656F, 0.0F, 0.0F);
		this.rightarm2 = new ModelRenderer(this, 69, 0);
		this.rightarm2.setRotationPoint(0.0F, 4.5F, -0.8F);
		this.rightarm2.addBox(-1.5F, 0.0F, -1.5F, 2, 8, 2, 0.0F);
		this.setRotateAngle(rightarm2, 0.0F, 0.9560913642424937F, -0.18203784098300857F);
		this.pedal43 = new ModelRenderer(this, 63, 88);
		this.pedal43.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal43.addBox(-1.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(pedal43, 0.091106186954104F, 0.0F, 0.0F);
		this.jawset12 = new ModelRenderer(this, 39, 59);
		this.jawset12.setRotationPoint(0.0F, -5.5F, -0.4F);
		this.jawset12.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset12, -1.5481070465189704F, 0.0F, 0.5009094953223726F);
		this.pedal12 = new ModelRenderer(this, 37, 72);
		this.pedal12.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal12.addBox(-2.0F, -2.0F, -0.5F, 4, 2, 1, 0.0F);
		this.setRotateAngle(pedal12, 0.136659280431156F, 0.0F, 0.0F);
		this.pedal22 = new ModelRenderer(this, 48, 88);
		this.pedal22.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal22.addBox(-2.0F, -2.0F, -0.5F, 4, 2, 1, 0.0F);
		this.setRotateAngle(pedal22, 0.22759093446006054F, 0.0F, 0.0F);
		this.righthand = new ModelRenderer(this, 81, 6);
		this.righthand.setRotationPoint(0.0F, 2.2F, -0.5F);
		this.righthand.addBox(-1.5F, 0.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(righthand, 0.22759093446006054F, 0.0F, 0.0F);
		this.rightfinger3 = new ModelRenderer(this, 85, 12);
		this.rightfinger3.setRotationPoint(0.5F, 3.0F, -0.5F);
		this.rightfinger3.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rightfinger3, 0.36425021489121656F, 0.0F, 0.0F);
		this.rightleg1 = new ModelRenderer(this, 0, 52);
		this.rightleg1.setRotationPoint(-2.7F, 1.4F, -2.0F);
		this.rightleg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(rightleg1, -0.27314402793711257F, 0.0F, 0.18203784098300857F);
		this.pedal21 = new ModelRenderer(this, 34, 88);
		this.pedal21.setRotationPoint(2.5F, -4.0F, -2.0F);
		this.pedal21.addBox(-2.5F, -2.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotateAngle(pedal21, 0.22759093446006054F, 0.0F, 1.1383037381507017F);
		this.topjawteeth2 = new ModelRenderer(this, 40, 106);
		this.topjawteeth2.setRotationPoint(2.9F, 0.0F, -3.0F);
		this.topjawteeth2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
		this.setRotateAngle(topjawteeth2, 0.0F, -1.4570008595648662F, 0.0F);
		this.jawset11 = new ModelRenderer(this, 51, 59);
		this.jawset11.setRotationPoint(0.0F, -5.5F, -0.4F);
		this.jawset11.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset11, -1.5481070465189704F, 0.0F, -0.5009094953223726F);
		this.pedal32 = new ModelRenderer(this, 90, 83);
		this.pedal32.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal32.addBox(-2.0F, -2.0F, -0.5F, 4, 2, 1, 0.0F);
		this.setRotateAngle(pedal32, 0.22759093446006054F, 0.0F, 0.0F);
		this.jawset42 = new ModelRenderer(this, 75, 92);
		this.jawset42.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset42.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset42, -1.5481070465189704F, 0.0F, 0.5009094953223726F);
		this.leftleg1 = new ModelRenderer(this, 19, 52);
		this.leftleg1.setRotationPoint(2.7F, 1.4F, -2.0F);
		this.leftleg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(leftleg1, -0.27314402793711257F, 0.0F, -0.18203784098300857F);
		this.rightarm3 = new ModelRenderer(this, 81, 0);
		this.rightarm3.setRotationPoint(-0.5F, 7.8F, 0.0F);
		this.rightarm3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F);
		this.leftshoulder = new ModelRenderer(this, 39, 15);
		this.leftshoulder.setRotationPoint(5.0F, -10.0F, -2.5F);
		this.leftshoulder.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 4, 0.0F);
		this.setRotateAngle(leftshoulder, -0.18203784098300857F, 0.0F, -0.36425021489121656F);
		this.pedal44 = new ModelRenderer(this, 63, 92);
		this.pedal44.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.pedal44.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotateAngle(pedal44, 0.18203784098300857F, 0.0F, 0.0F);
		this.rightarm1 = new ModelRenderer(this, 55, 0);
		this.rightarm1.setRotationPoint(-0.4F, 5.6F, 0.0F);
		this.rightarm1.addBox(-2.0F, 0.0F, -2.0F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rightarm1, 0.0F, 0.0F, -0.091106186954104F);
		this.leftfinger3 = new ModelRenderer(this, 56, 36);
		this.leftfinger3.setRotationPoint(0.5F, 3.0F, -0.5F);
		this.leftfinger3.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(leftfinger3, 0.36425021489121656F, 0.0F, 0.0F);
		this.pedal41 = new ModelRenderer(this, 65, 77);
		this.pedal41.setRotationPoint(-1.6F, -0.7F, -2.0F);
		this.pedal41.addBox(-2.5F, -2.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotateAngle(pedal41, 0.31869712141416456F, 0.0F, -2.367539130330308F);
		this.leftthumb = new ModelRenderer(this, 36, 34);
		this.leftthumb.setRotationPoint(-1.4F, 0.1F, 0.4F);
		this.leftthumb.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(leftthumb, -0.7285004297824331F, 0.0F, 0.0F);
		this.jawset41 = new ModelRenderer(this, 63, 92);
		this.jawset41.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset41.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset41, -1.5481070465189704F, 0.0F, -0.5009094953223726F);
		this.leftarm2 = new ModelRenderer(this, 58, 25);
		this.leftarm2.setRotationPoint(-0.5F, 4.5F, 0.0F);
		this.leftarm2.addBox(-1.5F, 0.0F, -1.5F, 2, 8, 2, 0.0F);
		this.setRotateAngle(leftarm2, 0.0F, -0.9560913642424937F, 0.18203784098300857F);
		this.pedal23 = new ModelRenderer(this, 33, 94);
		this.pedal23.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal23.addBox(-1.5F, -1.0F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(pedal23, 0.22759093446006054F, 0.0F, 0.0F);
		this.jawset31 = new ModelRenderer(this, 105, 84);
		this.jawset31.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset31.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset31, -1.5481070465189704F, 0.0F, -0.5009094953223726F);
		this.rightfinger2 = new ModelRenderer(this, 81, 12);
		this.rightfinger2.setRotationPoint(1.5F, 3.0F, -0.5F);
		this.rightfinger2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rightfinger2, 0.36425021489121656F, 0.0F, 0.0F);
		this.leftfinger4 = new ModelRenderer(this, 51, 34);
		this.leftfinger4.setRotationPoint(-0.5F, 3.0F, -0.5F);
		this.leftfinger4.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(leftfinger4, 0.36425021489121656F, 0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 40, 50);
		this.neck.setRotationPoint(0.0F, -10.2F, -3.5F);
		this.neck.addBox(-2.5F, -6.0F, -2.5F, 5, 6, 5, 0.0F);
		this.setRotateAngle(neck, 0.22759093446006054F, 0.0F, 0.0F);
		this.topjawteeth1 = new ModelRenderer(this, 32, 106);
		this.topjawteeth1.setRotationPoint(2.9F, 0.0F, -3.0F);
		this.topjawteeth1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F);
		this.leftfinger1 = new ModelRenderer(this, 47, 34);
		this.leftfinger1.setRotationPoint(-1.5F, 3.0F, -0.5F);
		this.leftfinger1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(leftfinger1, 0.36425021489121656F, 0.0F, 0.0F);
		this.lowerjaw = new ModelRenderer(this, 55, 103);
		this.lowerjaw.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.lowerjaw.addBox(0.0F, -0.4F, -3.0F, 3, 1, 3, 0.0F);
		this.setRotateAngle(lowerjaw, 0.22759093446006054F, 0.7853981633974483F, 0.136659280431156F);
		this.rightshoulder = new ModelRenderer(this, 38, 0);
		this.rightshoulder.setRotationPoint(-4.0F, -10.0F, -2.5F);
		this.rightshoulder.addBox(-2.5F, 0.0F, -2.5F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rightshoulder, -0.18203784098300857F, 0.0F, 0.36425021489121656F);
		this.bodybase = new ModelRenderer(this, 0, 0);
		this.bodybase.setRotationPoint(0.0F, -7.0F, 6.0F);
		this.bodybase.addBox(-5.0F, -11.0F, -7.5F, 10, 11, 8, 0.0F);
		this.setRotateAngle(bodybase, 0.136659280431156F, 0.0F, 0.0F);
		this.jawset32 = new ModelRenderer(this, 91, 84);
		this.jawset32.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset32.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset32, -1.5481070465189704F, 0.0F, 0.5009094953223726F);
		this.jawset21 = new ModelRenderer(this, 46, 93);
		this.jawset21.setRotationPoint(0.0F, -5.5F, -0.5F);
		this.jawset21.addBox(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
		this.setRotateAngle(jawset21, -1.5481070465189704F, 0.0F, -0.5009094953223726F);
		this.leftarm1 = new ModelRenderer(this, 58, 15);
		this.leftarm1.setRotationPoint(0.4F, 5.6F, 0.0F);
		this.leftarm1.addBox(-2.0F, 0.0F, -2.0F, 3, 5, 3, 0.0F);
		this.setRotateAngle(leftarm1, 0.0F, 0.0F, 0.091106186954104F);
		this.pedal42 = new ModelRenderer(this, 65, 83);
		this.pedal42.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.pedal42.addBox(-2.0F, -2.0F, -0.5F, 4, 2, 1, 0.0F);
		this.setRotateAngle(pedal42, 0.18203784098300857F, 0.0F, 0.0F);
		this.rightfoot.addChild(this.righttoe1);
		this.leftfoot.addChild(this.lefttoe1);
		this.pedal51.addChild(this.jawset52);
		this.head.addChild(this.pedal51);
		this.head.addChild(this.topjaw);
		this.pedal53.addChild(this.pedal54);
		this.leftfoot.addChild(this.lefttoe2);
		this.pedal21.addChild(this.jawset22);
		this.pedal13.addChild(this.pedal14);
		this.leftarm3.addChild(this.lefthand);
		this.lowerjaw.addChild(this.lowjawteeth1);
		this.belly.addChild(this.bodylower);
		this.head.addChild(this.pedal11);
		this.neck.addChild(this.head);
		this.righthand.addChild(this.rightfinger4);
		this.pedal32.addChild(this.pedal33);
		this.leftleg1.addChild(this.leftleg2);
		this.bodybase.addChild(this.belly);
		this.rightfoot.addChild(this.righttoe2);
		this.leftleg2.addChild(this.leftfoot);
		this.pedal23.addChild(this.pedal24);
		this.rightleg1.addChild(this.rightleg2);
		this.pedal12.addChild(this.pedal13);
		this.head.addChild(this.pedal31);
		this.lowerjaw.addChild(this.lowjawteeth2);
		this.pedal33.addChild(this.pedal34);
		this.rightleg2.addChild(this.rightfoot);
		this.pedal51.addChild(this.jawset51);
		this.pedal52.addChild(this.pedal53);
		this.righthand.addChild(this.rightthumb);
		this.pedal51.addChild(this.pedal52);
		this.leftarm2.addChild(this.leftarm3);
		this.lefthand.addChild(this.leftfinger2);
		this.righthand.addChild(this.rightfinger1);
		this.rightarm1.addChild(this.rightarm2);
		this.pedal42.addChild(this.pedal43);
		this.pedal11.addChild(this.jawset12);
		this.pedal11.addChild(this.pedal12);
		this.pedal21.addChild(this.pedal22);
		this.rightarm3.addChild(this.righthand);
		this.righthand.addChild(this.rightfinger3);
		this.bodylower.addChild(this.rightleg1);
		this.head.addChild(this.pedal21);
		this.topjaw.addChild(this.topjawteeth2);
		this.pedal11.addChild(this.jawset11);
		this.pedal31.addChild(this.pedal32);
		this.pedal41.addChild(this.jawset42);
		this.bodylower.addChild(this.leftleg1);
		this.rightarm2.addChild(this.rightarm3);
		this.bodybase.addChild(this.leftshoulder);
		this.pedal43.addChild(this.pedal44);
		this.rightshoulder.addChild(this.rightarm1);
		this.lefthand.addChild(this.leftfinger3);
		this.head.addChild(this.pedal41);
		this.lefthand.addChild(this.leftthumb);
		this.pedal41.addChild(this.jawset41);
		this.leftarm1.addChild(this.leftarm2);
		this.pedal22.addChild(this.pedal23);
		this.pedal31.addChild(this.jawset31);
		this.righthand.addChild(this.rightfinger2);
		this.lefthand.addChild(this.leftfinger4);
		this.bodybase.addChild(this.neck);
		this.topjaw.addChild(this.topjawteeth1);
		this.lefthand.addChild(this.leftfinger1);
		this.head.addChild(this.lowerjaw);
		this.bodybase.addChild(this.rightshoulder);
		this.pedal31.addChild(this.jawset32);
		this.pedal21.addChild(this.jawset21);
		this.leftshoulder.addChild(this.leftarm1);
		this.pedal41.addChild(this.pedal42);
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5) {
		setRotationAngles(entity, limbSwing, limbSwingAmount, ticksExisted, headyaw, headpitch, f5);
		this.bodybase.render(f5);
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	private static float rad = (float) ( Math.PI/180 );
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5){
		
		float motion = MathHelper.sqrt( entity.motionX*entity.motionX + entity.motionY*entity.motionY + entity.motionZ*entity.motionZ );
		
		this.neck.rotateAngleX=headpitch*rad/2;
		this.head.rotateAngleX=this.neck.rotateAngleX;
		this.neck.rotateAngleY=headyaw*rad/2;
		this.head.rotateAngleY=this.neck.rotateAngleY;
		this.lowerjaw.rotateAngleX=10*rad;
		
		this.bodybase.rotateAngleX=motion*2+20*rad;
		
		this.pedal11.rotateAngleX=10*rad+(MathHelper.sin( ticksExisted*0.1f +1)*30+30)*rad*0.5f;
		this.pedal21.rotateAngleX=10*rad+(MathHelper.sin( ticksExisted*0.1f +2)*30+30)*rad*0.5f;
		this.pedal31.rotateAngleX=10*rad+(MathHelper.sin( ticksExisted*0.1f +3)*30+30)*rad*0.5f;
		this.pedal41.rotateAngleX=10*rad+(MathHelper.sin( ticksExisted*0.1f +4)*30+30)*rad*0.5f;
		this.pedal51.rotateAngleX=10*rad+(MathHelper.sin( ticksExisted*0.1f +5)*30+30)*rad*0.5f;
		
		this.rightleg1.rotateAngleX=-40.91f*rad-MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
		this.rightleg2.rotateAngleX=30.26f*rad-MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
		
		this.leftleg1.rotateAngleX=-40.91f*rad+MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
		this.leftleg2.rotateAngleX=30.26f*rad+MathHelper.cos(limbSwing * 0.6662F+3) * 1F * limbSwingAmount;
		
		if(!entity.onGround&&entity.motionY>0.01f){
			this.bodybase.rotateAngleX-=motion*2;
			this.rightleg1.rotateAngleX=motion;
			this.rightleg2.rotateAngleX=motion;
			this.leftleg1.rotateAngleX=motion;
			this.leftleg2.rotateAngleX=motion;
		}
		
		this.bodybase.rotationPointY=-7;
		this.bodybase.rotationPointZ=-MathHelper.cos( ticksExisted*0.08f )*0.6f;
		
		this.bodybase.rotateAngleX+=MathHelper.cos( ticksExisted*0.08f )*0.1f;
		this.rightleg1.rotateAngleX-=MathHelper.cos( ticksExisted*0.08f )*0.1f;
		this.leftleg1.rotateAngleX-=MathHelper.cos( ticksExisted*0.08f )*0.1f;
		
		this.rightshoulder.rotateAngleX=-motion*20+60*rad-MathHelper.cos( ticksExisted*0.08f )*0.1f;
		this.leftshoulder.rotateAngleX =-motion*20+60*rad-MathHelper.cos( ticksExisted*0.08f )*0.1f;
		this.rightshoulder.rotateAngleZ=-motion*8+1.0f;
		this.leftshoulder.rotateAngleZ =motion*8-1.0f;
	}
}
