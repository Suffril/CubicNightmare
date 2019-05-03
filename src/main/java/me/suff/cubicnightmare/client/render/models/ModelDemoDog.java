package me.suff.cubicnightmare.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Demodog - Botmon
 * Created using Tabula 5.1.0
 */
public class ModelDemoDog extends ModelBase {
	
	public ModelRenderer bodybase;
	public ModelRenderer leftbackleg1;
	public ModelRenderer rightbackleg1;
	public ModelRenderer leftfrontleg1;
	public ModelRenderer rightfrontleg1;
	public ModelRenderer bodyrear;
	public ModelRenderer neck;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;
	public ModelRenderer head;
	public ModelRenderer toppedal1;
	public ModelRenderer topleftpedal1;
	public ModelRenderer toprightpedal1;
	public ModelRenderer lowleftpedal1;
	public ModelRenderer lowrightpedal1;
	public ModelRenderer topjaw;
	public ModelRenderer lowjaw;
	public ModelRenderer toppedal2;
	public ModelRenderer ptt1;
	public ModelRenderer ptt2;
	public ModelRenderer topleftpedal2;
	public ModelRenderer ltt1;
	public ModelRenderer ltt2;
	public ModelRenderer leftpedal3;
	public ModelRenderer toprightpedal2;
	public ModelRenderer rtt1;
	public ModelRenderer rtt2;
	public ModelRenderer toprightpedal3;
	public ModelRenderer lowleftpedal2;
	public ModelRenderer llt1;
	public ModelRenderer llt2;
	public ModelRenderer lowleftpedal3;
	public ModelRenderer lowrightpedal2;
	public ModelRenderer rlt1;
	public ModelRenderer rlt2;
	public ModelRenderer lowrightpedal3;
	public ModelRenderer topjawteeth;
	public ModelRenderer lowjawteeth;
	public ModelRenderer leftbackleg2;
	public ModelRenderer leftbackleg3;
	public ModelRenderer leftbackfoot;
	public ModelRenderer leftbacktoe1;
	public ModelRenderer leftbacktoe2;
	public ModelRenderer leftbacktoe3;
	public ModelRenderer leftbacktoe4;
	public ModelRenderer rightbackleg2;
	public ModelRenderer rightbackleg3;
	public ModelRenderer rightbackfoot;
	public ModelRenderer rightbacktoe1;
	public ModelRenderer rightbacktoe2;
	public ModelRenderer rightbacktoe3;
	public ModelRenderer rightbacktoe4;
	public ModelRenderer leftfrontleg2;
	public ModelRenderer leftfrontfoot;
	public ModelRenderer leftfronttoe1;
	public ModelRenderer leftfronttoe2;
	public ModelRenderer leftfronttoe3;
	public ModelRenderer leftfronttoe4;
	public ModelRenderer rightfrontleg2;
	public ModelRenderer rightfrontfoot;
	public ModelRenderer rightfronttoe1;
	public ModelRenderer rightfronttoe2;
	public ModelRenderer rightfronttoe3;
	public ModelRenderer rightfronttoe4;
	
	public ModelDemoDog() {
		this.textureWidth = 130;
		this.textureHeight = 80;
		this.llt1 = new ModelRenderer(this, 96, 53);
		this.llt1.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.llt1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(llt1, 0.0F, 0.0F, 0.27314402793711257F);
		this.toppedal1 = new ModelRenderer(this, 44, 40);
		this.toppedal1.setRotationPoint(0.0F, -2.4F, -0.5F);
		this.toppedal1.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.setRotateAngle(toppedal1, 0.18203784098300857F, 0.0F, 0.0F);
		this.lowjawteeth = new ModelRenderer(this, 103, 55);
		this.lowjawteeth.setRotationPoint(0.1F, -0.5F, 0.1F);
		this.lowjawteeth.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.topjaw = new ModelRenderer(this, 103, 43);
		this.topjaw.setRotationPoint(0.0F, -1.6F, -2.0F);
		this.topjaw.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(topjaw, 0.18203784098300857F, -0.7853981633974483F, -0.136659280431156F);
		this.leftbacktoe2 = new ModelRenderer(this, 113, 6);
		this.leftbacktoe2.setRotationPoint(0.2F, 1.5F, 0.0F);
		this.leftbacktoe2.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(leftbacktoe2, 0.0F, -0.18203784098300857F, 0.0F);
		this.lowjaw = new ModelRenderer(this, 103, 60);
		this.lowjaw.setRotationPoint(0.0F, 0.4F, -1.8F);
		this.lowjaw.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(lowjaw, 0.136659280431156F, -0.7853981633974483F, -0.091106186954104F);
		this.topjawteeth = new ModelRenderer(this, 103, 48);
		this.topjawteeth.setRotationPoint(0.1F, 0.5F, 0.1F);
		this.topjawteeth.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.rightfrontleg2 = new ModelRenderer(this, 34, 11);
		this.rightfrontleg2.setRotationPoint(-1.5F, 4.5F, 1.0F);
		this.rightfrontleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rightfrontleg2, -0.5009094953223726F, 0.0F, 0.0F);
		this.tail1 = new ModelRenderer(this, 0, 32);
		this.tail1.setRotationPoint(0.0F, -1.4F, 7.4F);
		this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotateAngle(tail1, -0.18203784098300857F, 0.0F, 0.0F);
		this.rightbackleg3 = new ModelRenderer(this, 66, 19);
		this.rightbackleg3.setRotationPoint(0.0F, 3.2F, 0.2F);
		this.rightbackleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(rightbackleg3, -0.7285004297824331F, 0.0F, 0.0F);
		this.leftfronttoe2 = new ModelRenderer(this, 29, 25);
		this.leftfronttoe2.setRotationPoint(0.1F, 1.5F, 0.2F);
		this.leftfronttoe2.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(leftfronttoe2, 0.0F, -0.18203784098300857F, 0.0F);
		this.rightbacktoe1 = new ModelRenderer(this, 81, 10);
		this.rightbacktoe1.setRotationPoint(0.8F, 1.5F, -0.5F);
		this.rightbacktoe1.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(rightbacktoe1, 0.0F, -0.36425021489121656F, 0.0F);
		this.rightfronttoe1 = new ModelRenderer(this, 30, 24);
		this.rightfronttoe1.setRotationPoint(0.7F, 1.5F, -0.5F);
		this.rightfronttoe1.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(rightfronttoe1, 0.0F, -0.36425021489121656F, 0.0F);
		this.leftfronttoe1 = new ModelRenderer(this, 30, 24);
		this.leftfronttoe1.setRotationPoint(0.7F, 1.5F, -0.5F);
		this.leftfronttoe1.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(leftfronttoe1, 0.0F, -0.36425021489121656F, 0.0F);
		this.rightbackfoot = new ModelRenderer(this, 67, 27);
		this.rightbackfoot.setRotationPoint(0.0F, 2.9F, -0.1F);
		this.rightbackfoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rightbackfoot, 0.091106186954104F, 0.0F, 0.0F);
		this.lowleftpedal2 = new ModelRenderer(this, 92, 46);
		this.lowleftpedal2.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lowleftpedal2.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.ltt1 = new ModelRenderer(this, 68, 53);
		this.ltt1.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.ltt1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(ltt1, 0.0F, 0.0F, 0.27314402793711257F);
		this.leftfrontleg1 = new ModelRenderer(this, 33, 0);
		this.leftfrontleg1.setRotationPoint(2.5F, 13.7F, -4.8F);
		this.leftfrontleg1.addBox(-1.0F, 0.0F, -1.0F, 3, 5, 3, 0.0F);
		this.setRotateAngle(leftfrontleg1, 0.36425021489121656F, 0.0F, 0.0F);
		this.tail2 = new ModelRenderer(this, 0, 43);
		this.tail2.setRotationPoint(0.0F, -0.5F, 4.6F);
		this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(tail2, 0.091106186954104F, 0.0F, 0.0F);
		this.toprightpedal2 = new ModelRenderer(this, 54, 46);
		this.toprightpedal2.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.toprightpedal2.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.lowrightpedal2 = new ModelRenderer(this, 80, 46);
		this.lowrightpedal2.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lowrightpedal2.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.bodybase = new ModelRenderer(this, 0, 0);
		this.bodybase.setRotationPoint(0.0F, 15.2F, 1.0F);
		this.bodybase.addBox(-3.0F, -4.0F, -7.0F, 6, 7, 7, 0.0F);
		this.setRotateAngle(bodybase, 0.045553093477052F, 0.0F, 0.0F);
		this.rightbacktoe3 = new ModelRenderer(this, 81, 14);
		this.rightbacktoe3.setRotationPoint(-0.1F, 1.5F, 0.0F);
		this.rightbacktoe3.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(rightbacktoe3, 0.0F, 0.18203784098300857F, 0.0F);
		this.neck = new ModelRenderer(this, 24, 38);
		this.neck.setRotationPoint(0.0F, -1.0F, -6.3F);
		this.neck.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
		this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
		this.ltt2 = new ModelRenderer(this, 72, 53);
		this.ltt2.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.ltt2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(ltt2, 0.0F, 0.0F, -0.27314402793711257F);
		this.toppedal2 = new ModelRenderer(this, 44, 45);
		this.toppedal2.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.toppedal2.addBox(-0.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F);
		this.topleftpedal1 = new ModelRenderer(this, 68, 40);
		this.topleftpedal1.setRotationPoint(1.7F, -1.2F, -0.5F);
		this.topleftpedal1.addBox(-1.5F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(topleftpedal1, 0.5918411493512771F, 0.0F, 1.0016444577195458F);
		this.head = new ModelRenderer(this, 23, 51);
		this.head.setRotationPoint(0.0F, 0.0F, -5.0F);
		this.head.addBox(-2.5F, -2.5F, -1.0F, 5, 5, 2, 0.0F);
		this.ptt2 = new ModelRenderer(this, 44, 48);
		this.ptt2.setRotationPoint(0.0F, -2.9F, -1.0F);
		this.ptt2.addBox(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
		this.setRotateAngle(ptt2, 0.0F, 0.0F, -0.27314402793711257F);
		this.rightbacktoe2 = new ModelRenderer(this, 81, 11);
		this.rightbacktoe2.setRotationPoint(0.2F, 1.5F, 0.0F);
		this.rightbacktoe2.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(rightbacktoe2, 0.0F, -0.18203784098300857F, 0.0F);
		this.lowrightpedal3 = new ModelRenderer(this, 80, 50);
		this.lowrightpedal3.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.lowrightpedal3.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.leftbackleg2 = new ModelRenderer(this, 95, 12);
		this.leftbackleg2.setRotationPoint(2.0F, 4.2F, -1.2F);
		this.leftbackleg2.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2, 0.0F);
		this.setRotateAngle(leftbackleg2, 0.8196066167365371F, 0.0F, 0.0F);
		this.leftbackleg1 = new ModelRenderer(this, 95, 2);
		this.leftbackleg1.setRotationPoint(0.6F, 12.8F, 5.9F);
		this.leftbackleg1.addBox(0.0F, 0.0F, -2.0F, 4, 5, 3, 0.0F);
		this.setRotateAngle(leftbackleg1, -0.136659280431156F, 0.0F, 0.0F);
		this.bodyrear = new ModelRenderer(this, 0, 16);
		this.bodyrear.setRotationPoint(0.0F, -0.4F, -1.5F);
		this.bodyrear.addBox(-2.5F, -3.5F, 0.0F, 5, 5, 8, 0.0F);
		this.setRotateAngle(bodyrear, -0.136659280431156F, 0.0F, 0.0F);
		this.rightbacktoe4 = new ModelRenderer(this, 81, 19);
		this.rightbacktoe4.setRotationPoint(-0.8F, 1.5F, -0.5F);
		this.rightbacktoe4.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(rightbacktoe4, 0.0F, 0.36425021489121656F, 0.0F);
		this.leftfrontleg2 = new ModelRenderer(this, 34, 11);
		this.leftfrontleg2.setRotationPoint(0.5F, 4.5F, 1.0F);
		this.leftfrontleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(leftfrontleg2, -0.5009094953223726F, 0.0F, 0.0F);
		this.rightfronttoe3 = new ModelRenderer(this, 36, 23);
		this.rightfronttoe3.setRotationPoint(-0.1F, 1.5F, 0.2F);
		this.rightfronttoe3.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(rightfronttoe3, 0.0F, 0.18203784098300857F, 0.0F);
		this.rtt1 = new ModelRenderer(this, 58, 53);
		this.rtt1.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.rtt1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rtt1, 0.0F, 0.0F, 0.27314402793711257F);
		this.rlt1 = new ModelRenderer(this, 84, 53);
		this.rlt1.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.rlt1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rlt1, 0.0F, 0.0F, 0.27314402793711257F);
		this.tail3 = new ModelRenderer(this, 0, 53);
		this.tail3.setRotationPoint(0.0F, 0.5F, 4.7F);
		this.tail3.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
		this.leftpedal3 = new ModelRenderer(this, 68, 50);
		this.leftpedal3.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.leftpedal3.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.rightfrontleg1 = new ModelRenderer(this, 33, 0);
		this.rightfrontleg1.setRotationPoint(-1.5F, 13.7F, -4.8F);
		this.rightfrontleg1.addBox(-3.0F, 0.0F, -1.0F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rightfrontleg1, 0.36425021489121656F, 0.0F, 0.0F);
		this.rtt2 = new ModelRenderer(this, 54, 53);
		this.rtt2.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.rtt2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rtt2, 0.0F, 0.0F, -0.27314402793711257F);
		this.leftfronttoe4 = new ModelRenderer(this, 39, 28);
		this.leftfronttoe4.setRotationPoint(-0.7F, 1.5F, -0.5F);
		this.leftfronttoe4.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(leftfronttoe4, 0.0F, 0.36425021489121656F, 0.0F);
		this.topleftpedal2 = new ModelRenderer(this, 68, 46);
		this.topleftpedal2.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.topleftpedal2.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
		this.leftbackfoot = new ModelRenderer(this, 95, 28);
		this.leftbackfoot.setRotationPoint(0.0F, 2.9F, -0.1F);
		this.leftbackfoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(leftbackfoot, 0.091106186954104F, 0.0F, 0.0F);
		this.lowrightpedal1 = new ModelRenderer(this, 80, 40);
		this.lowrightpedal1.setRotationPoint(-1.4F, 1.4F, -0.5F);
		this.lowrightpedal1.addBox(-1.5F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(lowrightpedal1, 0.31869712141416456F, 0.0F, -2.367539130330308F);
		this.rightfronttoe2 = new ModelRenderer(this, 36, 23);
		this.rightfronttoe2.setRotationPoint(0.1F, 1.5F, 0.2F);
		this.rightfronttoe2.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(rightfronttoe2, 0.0F, -0.18203784098300857F, 0.0F);
		this.rlt2 = new ModelRenderer(this, 80, 53);
		this.rlt2.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.rlt2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(rlt2, 0.0F, 0.0F, -0.27314402793711257F);
		this.toprightpedal1 = new ModelRenderer(this, 54, 40);
		this.toprightpedal1.setRotationPoint(-1.7F, -1.2F, -0.5F);
		this.toprightpedal1.addBox(-1.5F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(toprightpedal1, 0.5918411493512771F, 0.0F, -1.0016444577195458F);
		this.leftbacktoe4 = new ModelRenderer(this, 113, 0);
		this.leftbacktoe4.setRotationPoint(-0.8F, 1.5F, -0.5F);
		this.leftbacktoe4.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(leftbacktoe4, 0.0F, 0.36425021489121656F, 0.0F);
		this.leftbacktoe1 = new ModelRenderer(this, 113, 11);
		this.leftbacktoe1.setRotationPoint(0.8F, 1.5F, -0.5F);
		this.leftbacktoe1.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(leftbacktoe1, 0.0F, -0.36425021489121656F, 0.0F);
		this.leftfronttoe3 = new ModelRenderer(this, 36, 23);
		this.leftfronttoe3.setRotationPoint(-0.1F, 1.5F, 0.2F);
		this.leftfronttoe3.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(leftfronttoe3, 0.0F, 0.18203784098300857F, 0.0F);
		this.llt2 = new ModelRenderer(this, 92, 53);
		this.llt2.setRotationPoint(0.0F, -4.6F, -1.0F);
		this.llt2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 1, 0.0F);
		this.setRotateAngle(llt2, 0.0F, 0.0F, -0.27314402793711257F);
		this.lowleftpedal3 = new ModelRenderer(this, 92, 50);
		this.lowleftpedal3.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.lowleftpedal3.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.rightbackleg2 = new ModelRenderer(this, 66, 11);
		this.rightbackleg2.setRotationPoint(-2.0F, 4.2F, -1.2F);
		this.rightbackleg2.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2, 0.0F);
		this.setRotateAngle(rightbackleg2, 0.8196066167365371F, 0.0F, 0.0F);
		this.toprightpedal3 = new ModelRenderer(this, 54, 50);
		this.toprightpedal3.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.toprightpedal3.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.rightbackleg1 = new ModelRenderer(this, 70, 0);
		this.rightbackleg1.setRotationPoint(-0.5F, 12.8F, 5.9F);
		this.rightbackleg1.addBox(-4.0F, 0.0F, -2.0F, 4, 5, 3, 0.0F);
		this.setRotateAngle(rightbackleg1, -0.136659280431156F, 0.0F, 0.0F);
		this.leftbacktoe3 = new ModelRenderer(this, 113, 2);
		this.leftbacktoe3.setRotationPoint(-0.1F, 1.5F, 0.0F);
		this.leftbacktoe3.addBox(0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F);
		this.setRotateAngle(leftbacktoe3, 0.0F, 0.18203784098300857F, 0.0F);
		this.leftfrontfoot = new ModelRenderer(this, 30, 20);
		this.leftfrontfoot.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.leftfrontfoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(leftfrontfoot, 0.12723450247038662F, 0.0F, 0.0F);
		this.rightfrontfoot = new ModelRenderer(this, 30, 20);
		this.rightfrontfoot.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.rightfrontfoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rightfrontfoot, 0.12723450247038662F, 0.0F, 0.0F);
		this.ptt1 = new ModelRenderer(this, 44, 53);
		this.ptt1.setRotationPoint(0.0F, -2.9F, -1.0F);
		this.ptt1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
		this.setRotateAngle(ptt1, 0.0F, 0.0F, 0.27314402793711257F);
		this.rightfronttoe4 = new ModelRenderer(this, 39, 28);
		this.rightfronttoe4.setRotationPoint(-0.7F, 1.5F, -0.5F);
		this.rightfronttoe4.addBox(0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F);
		this.setRotateAngle(rightfronttoe4, 0.0F, 0.36425021489121656F, 0.0F);
		this.lowleftpedal1 = new ModelRenderer(this, 92, 40);
		this.lowleftpedal1.setRotationPoint(1.4F, 1.4F, -0.5F);
		this.lowleftpedal1.addBox(-1.5F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
		this.setRotateAngle(lowleftpedal1, 0.31869712141416456F, 0.0F, 2.367539130330308F);
		this.leftbackleg3 = new ModelRenderer(this, 95, 20);
		this.leftbackleg3.setRotationPoint(0.0F, 3.2F, 0.2F);
		this.leftbackleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(leftbackleg3, -0.7285004297824331F, 0.0F, 0.0F);
		this.lowleftpedal1.addChild(this.llt1);
		this.head.addChild(this.toppedal1);
		this.lowjaw.addChild(this.lowjawteeth);
		this.head.addChild(this.topjaw);
		this.leftbackfoot.addChild(this.leftbacktoe2);
		this.head.addChild(this.lowjaw);
		this.topjaw.addChild(this.topjawteeth);
		this.rightfrontleg1.addChild(this.rightfrontleg2);
		this.bodyrear.addChild(this.tail1);
		this.rightbackleg2.addChild(this.rightbackleg3);
		this.leftfrontfoot.addChild(this.leftfronttoe2);
		this.rightbackfoot.addChild(this.rightbacktoe1);
		this.rightfrontfoot.addChild(this.rightfronttoe1);
		this.leftfrontfoot.addChild(this.leftfronttoe1);
		this.rightbackleg3.addChild(this.rightbackfoot);
		this.lowleftpedal1.addChild(this.lowleftpedal2);
		this.topleftpedal1.addChild(this.ltt1);
		this.tail1.addChild(this.tail2);
		this.toprightpedal1.addChild(this.toprightpedal2);
		this.lowrightpedal1.addChild(this.lowrightpedal2);
		this.rightbackfoot.addChild(this.rightbacktoe3);
		this.bodybase.addChild(this.neck);
		this.topleftpedal1.addChild(this.ltt2);
		this.toppedal1.addChild(this.toppedal2);
		this.head.addChild(this.topleftpedal1);
		this.neck.addChild(this.head);
		this.toppedal1.addChild(this.ptt2);
		this.rightbackfoot.addChild(this.rightbacktoe2);
		this.lowrightpedal2.addChild(this.lowrightpedal3);
		this.leftbackleg1.addChild(this.leftbackleg2);
		this.bodybase.addChild(this.bodyrear);
		this.rightbackfoot.addChild(this.rightbacktoe4);
		this.leftfrontleg1.addChild(this.leftfrontleg2);
		this.rightfrontfoot.addChild(this.rightfronttoe3);
		this.toprightpedal1.addChild(this.rtt1);
		this.lowrightpedal1.addChild(this.rlt1);
		this.tail2.addChild(this.tail3);
		this.topleftpedal2.addChild(this.leftpedal3);
		this.toprightpedal1.addChild(this.rtt2);
		this.leftfrontfoot.addChild(this.leftfronttoe4);
		this.topleftpedal1.addChild(this.topleftpedal2);
		this.leftbackleg3.addChild(this.leftbackfoot);
		this.head.addChild(this.lowrightpedal1);
		this.rightfrontfoot.addChild(this.rightfronttoe2);
		this.lowrightpedal1.addChild(this.rlt2);
		this.head.addChild(this.toprightpedal1);
		this.leftbackfoot.addChild(this.leftbacktoe4);
		this.leftbackfoot.addChild(this.leftbacktoe1);
		this.leftfrontfoot.addChild(this.leftfronttoe3);
		this.lowleftpedal1.addChild(this.llt2);
		this.lowleftpedal2.addChild(this.lowleftpedal3);
		this.rightbackleg1.addChild(this.rightbackleg2);
		this.toprightpedal2.addChild(this.toprightpedal3);
		this.leftbackfoot.addChild(this.leftbacktoe3);
		this.leftfrontleg2.addChild(this.leftfrontfoot);
		this.rightfrontleg2.addChild(this.rightfrontfoot);
		this.toppedal1.addChild(this.ptt1);
		this.rightfrontfoot.addChild(this.rightfronttoe4);
		this.head.addChild(this.lowleftpedal1);
		this.leftbackleg2.addChild(this.leftbackleg3);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.leftfrontleg1.render(f5);
		this.bodybase.render(f5);
		this.leftbackleg1.render(f5);
		this.rightfrontleg1.render(f5);
		this.rightbackleg1.render(f5);
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
