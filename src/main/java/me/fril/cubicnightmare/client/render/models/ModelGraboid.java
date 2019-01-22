package me.fril.cubicnightmare.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * graboid - TheSirBatman
 * Created using Tabula 5.1.0
 */
public class ModelGraboid extends ModelBase {
	ModelRenderer body01;
	ModelRenderer body02;
	ModelRenderer neck01;
	ModelRenderer spine01;
	ModelRenderer spine03;
	ModelRenderer spine02;
	ModelRenderer spine04;
	ModelRenderer leftspine01;
	ModelRenderer leftspine02;
	ModelRenderer leftspine04;
	ModelRenderer leftspine03;
	ModelRenderer rightspine01;
	ModelRenderer rightspine02;
	ModelRenderer rightspine03;
	ModelRenderer rightspine04;
	ModelRenderer body03;
	ModelRenderer spine05;
	ModelRenderer spine06;
	ModelRenderer spine07;
	ModelRenderer leftspine06;
	ModelRenderer leftspine05;
	ModelRenderer leftspine07;
	ModelRenderer rightspine05;
	ModelRenderer rightspine06;
	ModelRenderer rightspine07;
	ModelRenderer body04;
	ModelRenderer spine09;
	ModelRenderer spine08;
	ModelRenderer leftspine08;
	ModelRenderer leftspine09;
	ModelRenderer rightspine08;
	ModelRenderer rightspine09;
	ModelRenderer body05;
	ModelRenderer spine10;
	ModelRenderer leftspine10;
	ModelRenderer rightspine10;
	ModelRenderer body06;
	ModelRenderer body07;
	ModelRenderer head;
	ModelRenderer throat;
	ModelRenderer tTusk01;
	ModelRenderer lTusk01;
	ModelRenderer mTusk01;
	ModelRenderer rTusk01;
	ModelRenderer mGrabber01;
	ModelRenderer lGrabber01;
	ModelRenderer rGrabber01;
	ModelRenderer tTusk02;
	ModelRenderer tTusk03;
	ModelRenderer tTuskTip;
	ModelRenderer tTuskBeak;
	ModelRenderer lTusk02;
	ModelRenderer lTusk03A;
	ModelRenderer lTuskTeeth;
	ModelRenderer lTusk04;
	ModelRenderer lFangA;
	ModelRenderer mTusk02;
	ModelRenderer mTusk03;
	ModelRenderer mFang;
	ModelRenderer rTusk02;
	ModelRenderer rTusk03A;
	ModelRenderer rTuskTeeth;
	ModelRenderer rTusk04;
	ModelRenderer rFangA;
	ModelRenderer mGrabber02;
	ModelRenderer mGrabber03;
	ModelRenderer mGrabber04;
	ModelRenderer mGrabber05;
	ModelRenderer mGrabberJawUpper;
	ModelRenderer mGrabberJawLower01;
	ModelRenderer mGrabberHorn01;
	ModelRenderer mGrabberHorn02;
	ModelRenderer mGrabberHorn03;
	ModelRenderer mGrabberHorn04;
	ModelRenderer mGrabberJawUpperTeeth02;
	ModelRenderer mGrabberJawUpperTeeth01;
	ModelRenderer mGrabberJawLower02;
	ModelRenderer mGrabberJawLowerTeeth02;
	ModelRenderer mGrabberJawLowerTeeth01;
	ModelRenderer lGrabber02;
	ModelRenderer lGrabber03;
	ModelRenderer lGrabber04;
	ModelRenderer lGrabber05;
	ModelRenderer lGrabberJawUpper;
	ModelRenderer lGrabberJawLower01;
	ModelRenderer lGrabberHorn01;
	ModelRenderer lGrabberHorn02;
	ModelRenderer lGrabberHorn03;
	ModelRenderer lGrabberHorn04;
	ModelRenderer lGrabberJawUpperTeeth02;
	ModelRenderer lGrabberJawUpperTeeth01;
	ModelRenderer lGrabberJawLower02;
	ModelRenderer lGrabberJawLowerTeeth02;
	ModelRenderer lGrabberJawLowerTeeth01;
	ModelRenderer rGrabber02;
	ModelRenderer rGrabber03;
	ModelRenderer rGrabber04;
	ModelRenderer rGrabber05;
	ModelRenderer rGrabberJawUpper;
	ModelRenderer rGrabberJawLower01;
	ModelRenderer rGrabberHorn01;
	ModelRenderer rGrabberHorn02;
	ModelRenderer rGrabberHorn03;
	ModelRenderer rGrabberHorn04;
	ModelRenderer rGrabberJawUpperTeeth02;
	ModelRenderer rGrabberJawUpperTeeth01;
	ModelRenderer rGrabberJawLower02;
	ModelRenderer rGrabberJawLowerTeeth02;
	ModelRenderer rGrabberJawLowerTeeth01;
	
	public ModelGraboid() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.leftspine08 = new ModelRenderer(this, 100, 99);
		this.leftspine08.setRotationPoint(5.0F, -3.5F, 1.2F);
		this.leftspine08.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine08, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.body07 = new ModelRenderer(this, 0, 121);
		this.body07.setRotationPoint(0.5F, 1.0F, 4.0F);
		this.body07.addBox(-2.0F, -2.0F, 0.0F, 4, 3, 3, 0.0F);
		this.throat = new ModelRenderer(this, 62, 18);
		this.throat.setRotationPoint(0.0F, 2.6F, -3.9F);
		this.throat.addBox(-5.0F, -0.1F, 0.0F, 10, 3, 4, 0.0F);
		this.setRotateAngle(throat, -0.36425021489121656F, 0.0F, 0.0F);
		this.lGrabberJawLowerTeeth01 = new ModelRenderer(this, 61, 97);
		this.lGrabberJawLowerTeeth01.setRotationPoint(-0.1F, -0.6F, -0.9F);
		this.lGrabberJawLowerTeeth01.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.tTusk02 = new ModelRenderer(this, 61, 41);
		this.tTusk02.setRotationPoint(0.0F, -0.4F, -3.5F);
		this.tTusk02.addBox(-5.0F, -2.0F, -3.9F, 10, 4, 4, 0.0F);
		this.setRotateAngle(tTusk02, 0.136659280431156F, 0.0F, 0.0F);
		this.leftspine10 = new ModelRenderer(this, 100, 99);
		this.leftspine10.setRotationPoint(4.0F, -2.0F, 1.2F);
		this.leftspine10.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine10, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.lGrabber05 = new ModelRenderer(this, 78, 105);
		this.lGrabber05.setRotationPoint(0.0F, -0.3F, -4.0F);
		this.lGrabber05.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.rGrabberHorn02 = new ModelRenderer(this, 46, 59);
		this.rGrabberHorn02.mirror = true;
		this.rGrabberHorn02.setRotationPoint(0.5F, -0.4F, -0.7F);
		this.rGrabberHorn02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rGrabberHorn02, 0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.leftspine02 = new ModelRenderer(this, 100, 99);
		this.leftspine02.setRotationPoint(7.0F, -5.0F, -5.0F);
		this.leftspine02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine02, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.head = new ModelRenderer(this, 62, 0);
		this.head.setRotationPoint(0.0F, -1.7F, -5.7F);
		this.head.addBox(-5.5F, -5.0F, -5.0F, 11, 10, 5, 0.0F);
		this.lGrabber04 = new ModelRenderer(this, 75, 96);
		this.lGrabber04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lGrabber04.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.lGrabberJawUpper = new ModelRenderer(this, 42, 92);
		this.lGrabberJawUpper.setRotationPoint(0.0F, -0.5F, -0.9F);
		this.lGrabberJawUpper.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F);
		this.rGrabberJawLower01 = new ModelRenderer(this, 42, 97);
		this.rGrabberJawLower01.setRotationPoint(0.0F, 0.8F, -0.2F);
		this.rGrabberJawLower01.addBox(-1.0F, -0.5F, -1.8F, 2, 1, 2, 0.0F);
		this.setRotateAngle(rGrabberJawLower01, 0.36425021489121656F, 0.0F, 0.0F);
		this.spine08 = new ModelRenderer(this, 100, 83);
		this.spine08.setRotationPoint(-1.5F, -4.2F, 0.7F);
		this.spine08.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine08, 0.22759093446006054F, -0.22759093446006054F, 0.7641212560659197F);
		this.leftspine01 = new ModelRenderer(this, 100, 99);
		this.leftspine01.setRotationPoint(7.0F, -2.0F, -9.0F);
		this.leftspine01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine01, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.mGrabber01 = new ModelRenderer(this, 42, 66);
		this.mGrabber01.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.mGrabber01.addBox(-1.0F, -1.0F, -5.9F, 2, 2, 6, 0.0F);
		this.leftspine04 = new ModelRenderer(this, 100, 99);
		this.leftspine04.setRotationPoint(7.0F, -1.5F, -3.0F);
		this.leftspine04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine04, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.body03 = new ModelRenderer(this, 0, 67);
		this.body03.setRotationPoint(0.0F, 1.0F, 5.0F);
		this.body03.addBox(-5.0F, -5.5F, 0.0F, 11, 10, 5, 0.0F);
		this.rightspine08 = new ModelRenderer(this, 100, 91);
		this.rightspine08.setRotationPoint(-4.0F, -3.5F, 1.2F);
		this.rightspine08.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine08, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.rGrabberJawUpperTeeth02 = new ModelRenderer(this, 53, 92);
		this.rGrabberJawUpperTeeth02.mirror = true;
		this.rGrabberJawUpperTeeth02.setRotationPoint(-0.9F, -0.2F, -0.6F);
		this.rGrabberJawUpperTeeth02.addBox(-0.05F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.rGrabberJawLowerTeeth02 = new ModelRenderer(this, 61, 97);
		this.rGrabberJawLowerTeeth02.mirror = true;
		this.rGrabberJawLowerTeeth02.setRotationPoint(-0.9F, -0.6F, -0.9F);
		this.rGrabberJawLowerTeeth02.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.lGrabberJawUpperTeeth02 = new ModelRenderer(this, 53, 92);
		this.lGrabberJawUpperTeeth02.mirror = true;
		this.lGrabberJawUpperTeeth02.setRotationPoint(-0.9F, -0.2F, -0.6F);
		this.lGrabberJawUpperTeeth02.addBox(-0.05F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.spine09 = new ModelRenderer(this, 100, 83);
		this.spine09.setRotationPoint(2.5F, -4.2F, 0.7F);
		this.spine09.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine09, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.rGrabberJawUpper = new ModelRenderer(this, 42, 92);
		this.rGrabberJawUpper.setRotationPoint(0.0F, -0.5F, -0.9F);
		this.rGrabberJawUpper.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F);
		this.lTuskTeeth = new ModelRenderer(this, 45, 0);
		this.lTuskTeeth.setRotationPoint(0.0F, 0.0F, -5.6F);
		this.lTuskTeeth.addBox(0.0F, -2.8F, 0.0F, 0, 3, 6, 0.0F);
		this.mTusk02 = new ModelRenderer(this, 96, 53);
		this.mTusk02.setRotationPoint(0.0F, 0.6F, -2.9F);
		this.mTusk02.addBox(-1.5F, -1.1F, -4.0F, 3, 2, 4, 0.0F);
		this.lFangA = new ModelRenderer(this, 107, 32);
		this.lFangA.setRotationPoint(0.0F, 0.0F, -1.4F);
		this.lFangA.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lFangA, 0.18203784098300857F, 0.7740535232594852F, 0.136659280431156F);
		this.body02 = new ModelRenderer(this, 0, 47);
		this.body02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body02.addBox(-6.0F, -6.5F, 0.0F, 13, 12, 6, 0.0F);
		this.rGrabberJawLowerTeeth01 = new ModelRenderer(this, 61, 97);
		this.rGrabberJawLowerTeeth01.setRotationPoint(-0.1F, -0.6F, -0.9F);
		this.rGrabberJawLowerTeeth01.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.mGrabberHorn02 = new ModelRenderer(this, 46, 59);
		this.mGrabberHorn02.mirror = true;
		this.mGrabberHorn02.setRotationPoint(0.5F, -0.4F, -0.7F);
		this.mGrabberHorn02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(mGrabberHorn02, 0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.lGrabberJawLower02 = new ModelRenderer(this, 52, 98);
		this.lGrabberJawLower02.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.lGrabberJawLower02.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(lGrabberJawLower02, -0.18203784098300857F, 0.0F, 0.0F);
		this.mGrabber02 = new ModelRenderer(this, 42, 76);
		this.mGrabber02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mGrabber02.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.rTusk04 = new ModelRenderer(this, 101, 24);
		this.rTusk04.mirror = true;
		this.rTusk04.setRotationPoint(-0.01F, 0.5F, -1.7F);
		this.rTusk04.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rTusk04, -0.045553093477052F, 0.0F, 0.0F);
		this.rTusk01 = new ModelRenderer(this, 101, 0);
		this.rTusk01.mirror = true;
		this.rTusk01.setRotationPoint(-4.7F, 4.0F, -4.3F);
		this.rTusk01.addBox(-1.0F, -1.5F, -3.0F, 2, 3, 3, 0.0F);
		this.setRotateAngle(rTusk01, 0.091106186954104F, 0.0F, 0.36425021489121656F);
		this.mGrabberJawUpperTeeth02 = new ModelRenderer(this, 53, 92);
		this.mGrabberJawUpperTeeth02.mirror = true;
		this.mGrabberJawUpperTeeth02.setRotationPoint(-0.9F, -0.2F, -0.6F);
		this.mGrabberJawUpperTeeth02.addBox(-0.05F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.rightspine06 = new ModelRenderer(this, 100, 91);
		this.rightspine06.setRotationPoint(-5.0F, 1.9F, 1.2F);
		this.rightspine06.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine06, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.spine04 = new ModelRenderer(this, 100, 83);
		this.spine04.setRotationPoint(0.5F, -6.2F, -3.3F);
		this.spine04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine04, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.rightspine04 = new ModelRenderer(this, 100, 91);
		this.rightspine04.setRotationPoint(-6.0F, -1.5F, -3.0F);
		this.rightspine04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine04, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.tTuskTip = new ModelRenderer(this, 65, 62);
		this.tTuskTip.setRotationPoint(0.0F, -0.7F, -2.5F);
		this.tTuskTip.addBox(-2.5F, -0.5F, -2.0F, 5, 1, 2, 0.0F);
		this.setRotateAngle(tTuskTip, 0.9560913642424937F, 0.0F, 0.0F);
		this.rTuskTeeth = new ModelRenderer(this, 45, 0);
		this.rTuskTeeth.mirror = true;
		this.rTuskTeeth.setRotationPoint(0.0F, 0.0F, -5.6F);
		this.rTuskTeeth.addBox(0.0F, -2.8F, 0.0F, 0, 3, 6, 0.0F);
		this.rFangA = new ModelRenderer(this, 107, 32);
		this.rFangA.mirror = true;
		this.rFangA.setRotationPoint(0.0F, 0.0F, -1.4F);
		this.rFangA.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rFangA, 0.18203784098300857F, -0.7740535232594852F, -0.136659280431156F);
		this.lGrabberHorn02 = new ModelRenderer(this, 46, 59);
		this.lGrabberHorn02.mirror = true;
		this.lGrabberHorn02.setRotationPoint(0.5F, -0.4F, -0.7F);
		this.lGrabberHorn02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lGrabberHorn02, 0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.leftspine07 = new ModelRenderer(this, 100, 99);
		this.leftspine07.setRotationPoint(6.0F, 1.9F, 1.2F);
		this.leftspine07.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine07, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.neck01 = new ModelRenderer(this, 0, 0);
		this.neck01.setRotationPoint(0.5F, 0.5F, -10.0F);
		this.neck01.addBox(-6.5F, -7.0F, -7.0F, 13, 12, 7, 0.0F);
		this.body06 = new ModelRenderer(this, 0, 112);
		this.body06.setRotationPoint(0.0F, 0.5F, 3.5F);
		this.body06.addBox(-2.0F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
		this.tTusk03 = new ModelRenderer(this, 61, 53);
		this.tTusk03.setRotationPoint(0.0F, -0.9F, -3.1F);
		this.tTusk03.addBox(-4.0F, -1.0F, -3.0F, 8, 2, 3, 0.0F);
		this.setRotateAngle(tTusk03, 0.136659280431156F, 0.0F, 0.0F);
		this.mGrabberJawUpperTeeth01 = new ModelRenderer(this, 53, 92);
		this.mGrabberJawUpperTeeth01.setRotationPoint(0.4F, -0.2F, -0.6F);
		this.mGrabberJawUpperTeeth01.addBox(-0.45F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.rGrabberHorn01 = new ModelRenderer(this, 46, 59);
		this.rGrabberHorn01.setRotationPoint(-0.5F, -0.4F, -0.7F);
		this.rGrabberHorn01.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rGrabberHorn01, 0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.lGrabber01 = new ModelRenderer(this, 74, 70);
		this.lGrabber01.setRotationPoint(2.6F, 3.1F, 0.0F);
		this.lGrabber01.addBox(-1.0F, -1.0F, -5.9F, 2, 2, 6, 0.0F);
		this.setRotateAngle(lGrabber01, 0.0F, -0.136659280431156F, 0.0F);
		this.rightspine09 = new ModelRenderer(this, 100, 91);
		this.rightspine09.setRotationPoint(-4.0F, 0.0F, 1.2F);
		this.rightspine09.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine09, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.lGrabberJawLower01 = new ModelRenderer(this, 42, 97);
		this.lGrabberJawLower01.setRotationPoint(0.0F, 0.8F, -0.2F);
		this.lGrabberJawLower01.addBox(-1.0F, -0.5F, -1.8F, 2, 1, 2, 0.0F);
		this.setRotateAngle(lGrabberJawLower01, 0.36425021489121656F, 0.0F, 0.0F);
		this.rightspine02 = new ModelRenderer(this, 100, 91);
		this.rightspine02.setRotationPoint(-6.0F, -5.0F, -5.0F);
		this.rightspine02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine02, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.lTusk01 = new ModelRenderer(this, 101, 0);
		this.lTusk01.setRotationPoint(4.7F, 4.0F, -4.3F);
		this.lTusk01.addBox(-1.0F, -1.5F, -3.0F, 2, 3, 3, 0.0F);
		this.setRotateAngle(lTusk01, 0.091106186954104F, 0.0F, -0.36425021489121656F);
		this.leftspine03 = new ModelRenderer(this, 100, 99);
		this.leftspine03.setRotationPoint(7.0F, 2.0F, -5.0F);
		this.leftspine03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine03, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.lGrabberHorn01 = new ModelRenderer(this, 46, 59);
		this.lGrabberHorn01.setRotationPoint(-0.5F, -0.4F, -0.7F);
		this.lGrabberHorn01.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lGrabberHorn01, 0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.rGrabber05 = new ModelRenderer(this, 78, 105);
		this.rGrabber05.setRotationPoint(0.0F, -0.3F, -4.0F);
		this.rGrabber05.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.rGrabberHorn03 = new ModelRenderer(this, 54, 63);
		this.rGrabberHorn03.setRotationPoint(-0.5F, 0.8F, -0.7F);
		this.rGrabberHorn03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rGrabberHorn03, -0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.lTusk02 = new ModelRenderer(this, 100, 8);
		this.lTusk02.setRotationPoint(0.01F, 0.0F, -2.6F);
		this.lTusk02.addBox(-1.0F, -1.5F, -4.0F, 2, 3, 4, 0.0F);
		this.setRotateAngle(lTusk02, -0.22759093446006054F, 0.0F, 0.0F);
		this.lGrabber02 = new ModelRenderer(this, 75, 80);
		this.lGrabber02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lGrabber02.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.rGrabber01 = new ModelRenderer(this, 74, 70);
		this.rGrabber01.mirror = true;
		this.rGrabber01.setRotationPoint(-2.6F, 3.1F, 2.5F);
		this.rGrabber01.addBox(-1.0F, -1.0F, -5.9F, 2, 2, 6, 0.0F);
		this.setRotateAngle(rGrabber01, 0.0F, 0.136659280431156F, 0.0F);
		this.lTusk03A = new ModelRenderer(this, 101, 18);
		this.lTusk03A.setRotationPoint(0.01F, 0.0F, -3.7F);
		this.lTusk03A.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lTusk03A, -0.091106186954104F, 0.0F, 0.0F);
		this.rightspine07 = new ModelRenderer(this, 100, 91);
		this.rightspine07.setRotationPoint(-5.0F, -1.5F, 1.2F);
		this.rightspine07.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine07, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.mGrabber03 = new ModelRenderer(this, 42, 76);
		this.mGrabber03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mGrabber03.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.lGrabberHorn03 = new ModelRenderer(this, 54, 63);
		this.lGrabberHorn03.setRotationPoint(-0.5F, 0.8F, -0.7F);
		this.lGrabberHorn03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lGrabberHorn03, -0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.mGrabberHorn03 = new ModelRenderer(this, 54, 63);
		this.mGrabberHorn03.setRotationPoint(-0.5F, 0.8F, -0.7F);
		this.mGrabberHorn03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(mGrabberHorn03, -0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.mGrabberHorn01 = new ModelRenderer(this, 46, 59);
		this.mGrabberHorn01.setRotationPoint(-0.5F, -0.4F, -0.7F);
		this.mGrabberHorn01.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(mGrabberHorn01, 0.5918411493512771F, -0.27314402793711257F, 0.0F);
		this.rightspine03 = new ModelRenderer(this, 100, 91);
		this.rightspine03.setRotationPoint(-6.0F, 2.0F, -5.0F);
		this.rightspine03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine03, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.mFang = new ModelRenderer(this, 100, 68);
		this.mFang.setRotationPoint(0.0F, 0.9F, -2.0F);
		this.mFang.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(mFang, -0.18203784098300857F, 0.7740535232594852F, -0.18203784098300857F);
		this.rGrabberJawUpperTeeth01 = new ModelRenderer(this, 53, 92);
		this.rGrabberJawUpperTeeth01.setRotationPoint(0.4F, -0.2F, -0.6F);
		this.rGrabberJawUpperTeeth01.addBox(-0.45F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.lGrabberJawLowerTeeth02 = new ModelRenderer(this, 61, 97);
		this.lGrabberJawLowerTeeth02.mirror = true;
		this.lGrabberJawLowerTeeth02.setRotationPoint(-0.9F, -0.6F, -0.9F);
		this.lGrabberJawLowerTeeth02.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.spine01 = new ModelRenderer(this, 100, 83);
		this.spine01.setRotationPoint(0.5F, -6.2F, -9.3F);
		this.spine01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine01, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.rGrabber04 = new ModelRenderer(this, 75, 96);
		this.rGrabber04.mirror = true;
		this.rGrabber04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rGrabber04.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.rightspine01 = new ModelRenderer(this, 100, 91);
		this.rightspine01.setRotationPoint(-6.0F, -2.0F, -9.0F);
		this.rightspine01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine01, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.mGrabberHorn04 = new ModelRenderer(this, 54, 63);
		this.mGrabberHorn04.mirror = true;
		this.mGrabberHorn04.setRotationPoint(0.5F, 0.8F, -0.7F);
		this.mGrabberHorn04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(mGrabberHorn04, -0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.rightspine05 = new ModelRenderer(this, 100, 91);
		this.rightspine05.setRotationPoint(-5.0F, -5.0F, 1.2F);
		this.rightspine05.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine05, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.leftspine09 = new ModelRenderer(this, 100, 99);
		this.leftspine09.setRotationPoint(5.0F, 0.0F, 1.2F);
		this.leftspine09.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine09, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.body05 = new ModelRenderer(this, 0, 99);
		this.body05.setRotationPoint(0.0F, 1.0F, 4.5F);
		this.body05.addBox(-3.0F, -3.5F, 0.0F, 7, 6, 4, 0.0F);
		this.tTusk01 = new ModelRenderer(this, 61, 28);
		this.tTusk01.setRotationPoint(0.0F, -2.7F, -4.1F);
		this.tTusk01.addBox(-6.0F, -2.5F, -4.0F, 12, 5, 4, 0.0F);
		this.setRotateAngle(tTusk01, 0.091106186954104F, 0.0F, 0.0F);
		this.spine05 = new ModelRenderer(this, 100, 83);
		this.spine05.setRotationPoint(0.5F, -5.2F, 0.7F);
		this.spine05.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine05, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.leftspine06 = new ModelRenderer(this, 100, 99);
		this.leftspine06.setRotationPoint(6.0F, -5.0F, 1.2F);
		this.leftspine06.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine06, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.lTusk04 = new ModelRenderer(this, 101, 24);
		this.lTusk04.setRotationPoint(0.01F, 0.5F, -1.7F);
		this.lTusk04.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lTusk04, -0.045553093477052F, 0.0F, 0.0F);
		this.spine03 = new ModelRenderer(this, 100, 83);
		this.spine03.setRotationPoint(5.5F, -6.2F, -6.3F);
		this.spine03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine03, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.mGrabberJawUpper = new ModelRenderer(this, 42, 92);
		this.mGrabberJawUpper.setRotationPoint(0.0F, -0.5F, -0.9F);
		this.mGrabberJawUpper.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F);
		this.lGrabber03 = new ModelRenderer(this, 75, 88);
		this.lGrabber03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lGrabber03.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.body04 = new ModelRenderer(this, 0, 84);
		this.body04.setRotationPoint(0.0F, 1.0F, 4.0F);
		this.body04.addBox(-4.0F, -4.5F, 0.0F, 9, 8, 5, 0.0F);
		this.spine07 = new ModelRenderer(this, 100, 83);
		this.spine07.setRotationPoint(-3.5F, -5.2F, 1.7F);
		this.spine07.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine07, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.rTusk03A = new ModelRenderer(this, 101, 18);
		this.rTusk03A.mirror = true;
		this.rTusk03A.setRotationPoint(-0.01F, 0.0F, -3.7F);
		this.rTusk03A.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rTusk03A, -0.091106186954104F, 0.0F, 0.0F);
		this.rGrabberJawLower02 = new ModelRenderer(this, 52, 98);
		this.rGrabberJawLower02.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.rGrabberJawLower02.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(rGrabberJawLower02, -0.18203784098300857F, 0.0F, 0.0F);
		this.lGrabberHorn04 = new ModelRenderer(this, 54, 63);
		this.lGrabberHorn04.mirror = true;
		this.lGrabberHorn04.setRotationPoint(0.5F, 0.8F, -0.7F);
		this.lGrabberHorn04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lGrabberHorn04, -0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.spine06 = new ModelRenderer(this, 100, 83);
		this.spine06.setRotationPoint(4.5F, -5.2F, 1.7F);
		this.spine06.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine06, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.spine02 = new ModelRenderer(this, 100, 83);
		this.spine02.setRotationPoint(-4.5F, -6.2F, -6.3F);
		this.spine02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine02, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.mGrabberJawLower01 = new ModelRenderer(this, 42, 97);
		this.mGrabberJawLower01.setRotationPoint(0.0F, 0.8F, -0.2F);
		this.mGrabberJawLower01.addBox(-1.0F, -0.5F, -1.8F, 2, 1, 2, 0.0F);
		this.setRotateAngle(mGrabberJawLower01, 0.36425021489121656F, 0.0F, 0.0F);
		this.rightspine10 = new ModelRenderer(this, 100, 91);
		this.rightspine10.setRotationPoint(-3.0F, -2.0F, 1.2F);
		this.rightspine10.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(rightspine10, 0.045553093477052F, -0.36425021489121656F, -0.8196066167365371F);
		this.mTusk01 = new ModelRenderer(this, 97, 44);
		this.mTusk01.setRotationPoint(0.0F, 4.5F, -4.5F);
		this.mTusk01.addBox(-2.0F, -1.5F, -3.0F, 4, 3, 3, 0.0F);
		this.setRotateAngle(mTusk01, -0.091106186954104F, 0.0F, 0.0F);
		this.mGrabberJawLower02 = new ModelRenderer(this, 52, 98);
		this.mGrabberJawLower02.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.mGrabberJawLower02.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.setRotateAngle(mGrabberJawLower02, -0.18203784098300857F, 0.0F, 0.0F);
		this.mGrabber04 = new ModelRenderer(this, 42, 76);
		this.mGrabber04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mGrabber04.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.mGrabberJawLowerTeeth02 = new ModelRenderer(this, 61, 97);
		this.mGrabberJawLowerTeeth02.mirror = true;
		this.mGrabberJawLowerTeeth02.setRotationPoint(-0.9F, -0.6F, -0.9F);
		this.mGrabberJawLowerTeeth02.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.rGrabber02 = new ModelRenderer(this, 75, 80);
		this.rGrabber02.mirror = true;
		this.rGrabber02.setRotationPoint(0.0F, 0.0F, -2.0F);
		this.rGrabber02.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.rGrabberHorn04 = new ModelRenderer(this, 54, 63);
		this.rGrabberHorn04.mirror = true;
		this.rGrabberHorn04.setRotationPoint(0.5F, 0.8F, -0.7F);
		this.rGrabberHorn04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rGrabberHorn04, -0.5918411493512771F, 0.27314402793711257F, 0.0F);
		this.body01 = new ModelRenderer(this, 0, 21);
		this.body01.setRotationPoint(0.0F, 18.4F, 5.0F);
		this.body01.addBox(-7.0F, -7.5F, -10.0F, 15, 13, 11, 0.0F);
		this.mTusk03 = new ModelRenderer(this, 97, 62);
		this.mTusk03.setRotationPoint(0.0F, -0.1F, -3.8F);
		this.mTusk03.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(mTusk03, -0.136659280431156F, 0.0F, 0.0F);
		this.rGrabber03 = new ModelRenderer(this, 75, 88);
		this.rGrabber03.mirror = true;
		this.rGrabber03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rGrabber03.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
		this.mGrabberJawLowerTeeth01 = new ModelRenderer(this, 61, 97);
		this.mGrabberJawLowerTeeth01.setRotationPoint(-0.1F, -0.6F, -0.9F);
		this.mGrabberJawLowerTeeth01.addBox(-0.0F, -0.7F, -1.3F, 1, 1, 2, 0.0F);
		this.rTusk02 = new ModelRenderer(this, 100, 8);
		this.rTusk02.mirror = true;
		this.rTusk02.setRotationPoint(-0.01F, 0.0F, -2.6F);
		this.rTusk02.addBox(-1.0F, -1.5F, -4.0F, 2, 3, 4, 0.0F);
		this.setRotateAngle(rTusk02, -0.22759093446006054F, 0.0F, 0.0F);
		this.leftspine05 = new ModelRenderer(this, 100, 99);
		this.leftspine05.setRotationPoint(6.0F, -1.5F, 1.8F);
		this.leftspine05.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(leftspine05, 0.045553093477052F, 0.36425021489121656F, 0.8196066167365371F);
		this.tTuskBeak = new ModelRenderer(this, 65, 67);
		this.tTuskBeak.setRotationPoint(0.0F, 0.2F, -1.4F);
		this.tTuskBeak.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tTuskBeak, -0.045553093477052F, 0.045553093477052F, 0.7740535232594852F);
		this.mGrabber05 = new ModelRenderer(this, 42, 85);
		this.mGrabber05.setRotationPoint(0.0F, -0.3F, -4.0F);
		this.mGrabber05.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.spine10 = new ModelRenderer(this, 100, 83);
		this.spine10.setRotationPoint(0.5F, -3.1F, 0.7F);
		this.spine10.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(spine10, 0.22759093446006054F, -0.22759093446006054F, 0.7740535232594852F);
		this.lGrabberJawUpperTeeth01 = new ModelRenderer(this, 53, 92);
		this.lGrabberJawUpperTeeth01.setRotationPoint(0.4F, -0.2F, -0.6F);
		this.lGrabberJawUpperTeeth01.addBox(-0.45F, 0.4F, -1.3F, 1, 1, 2, 0.0F);
		this.body03.addChild(this.leftspine08);
		this.body06.addChild(this.body07);
		this.head.addChild(this.throat);
		this.lGrabberJawLower01.addChild(this.lGrabberJawLowerTeeth01);
		this.tTusk01.addChild(this.tTusk02);
		this.body04.addChild(this.leftspine10);
		this.lGrabber04.addChild(this.lGrabber05);
		this.rGrabber05.addChild(this.rGrabberHorn02);
		this.body01.addChild(this.leftspine02);
		this.neck01.addChild(this.head);
		this.lGrabber03.addChild(this.lGrabber04);
		this.lGrabber05.addChild(this.lGrabberJawUpper);
		this.rGrabber05.addChild(this.rGrabberJawLower01);
		this.body03.addChild(this.spine08);
		this.body01.addChild(this.leftspine01);
		this.head.addChild(this.mGrabber01);
		this.body01.addChild(this.leftspine04);
		this.body02.addChild(this.body03);
		this.body03.addChild(this.rightspine08);
		this.rGrabberJawUpper.addChild(this.rGrabberJawUpperTeeth02);
		this.rGrabberJawLower01.addChild(this.rGrabberJawLowerTeeth02);
		this.lGrabberJawUpper.addChild(this.lGrabberJawUpperTeeth02);
		this.body03.addChild(this.spine09);
		this.rGrabber05.addChild(this.rGrabberJawUpper);
		this.lTusk02.addChild(this.lTuskTeeth);
		this.mTusk01.addChild(this.mTusk02);
		this.lTusk04.addChild(this.lFangA);
		this.body01.addChild(this.body02);
		this.rGrabberJawLower01.addChild(this.rGrabberJawLowerTeeth01);
		this.mGrabber05.addChild(this.mGrabberHorn02);
		this.lGrabberJawLower01.addChild(this.lGrabberJawLower02);
		this.mGrabber01.addChild(this.mGrabber02);
		this.rTusk03A.addChild(this.rTusk04);
		this.head.addChild(this.rTusk01);
		this.mGrabberJawUpper.addChild(this.mGrabberJawUpperTeeth02);
		this.body02.addChild(this.rightspine06);
		this.body01.addChild(this.spine04);
		this.body01.addChild(this.rightspine04);
		this.tTusk03.addChild(this.tTuskTip);
		this.rTusk02.addChild(this.rTuskTeeth);
		this.rTusk04.addChild(this.rFangA);
		this.lGrabber05.addChild(this.lGrabberHorn02);
		this.body02.addChild(this.leftspine07);
		this.body01.addChild(this.neck01);
		this.body05.addChild(this.body06);
		this.tTusk02.addChild(this.tTusk03);
		this.mGrabberJawUpper.addChild(this.mGrabberJawUpperTeeth01);
		this.rGrabber05.addChild(this.rGrabberHorn01);
		this.head.addChild(this.lGrabber01);
		this.body03.addChild(this.rightspine09);
		this.lGrabber05.addChild(this.lGrabberJawLower01);
		this.body01.addChild(this.rightspine02);
		this.head.addChild(this.lTusk01);
		this.body01.addChild(this.leftspine03);
		this.lGrabber05.addChild(this.lGrabberHorn01);
		this.rGrabber04.addChild(this.rGrabber05);
		this.rGrabber05.addChild(this.rGrabberHorn03);
		this.lTusk01.addChild(this.lTusk02);
		this.lGrabber01.addChild(this.lGrabber02);
		this.head.addChild(this.rGrabber01);
		this.lTusk02.addChild(this.lTusk03A);
		this.body02.addChild(this.rightspine07);
		this.mGrabber02.addChild(this.mGrabber03);
		this.lGrabber05.addChild(this.lGrabberHorn03);
		this.mGrabber05.addChild(this.mGrabberHorn03);
		this.mGrabber05.addChild(this.mGrabberHorn01);
		this.body01.addChild(this.rightspine03);
		this.mTusk03.addChild(this.mFang);
		this.rGrabberJawUpper.addChild(this.rGrabberJawUpperTeeth01);
		this.lGrabberJawLower01.addChild(this.lGrabberJawLowerTeeth02);
		this.body01.addChild(this.spine01);
		this.rGrabber03.addChild(this.rGrabber04);
		this.body01.addChild(this.rightspine01);
		this.mGrabber05.addChild(this.mGrabberHorn04);
		this.body02.addChild(this.rightspine05);
		this.body03.addChild(this.leftspine09);
		this.body04.addChild(this.body05);
		this.head.addChild(this.tTusk01);
		this.body02.addChild(this.spine05);
		this.body02.addChild(this.leftspine06);
		this.lTusk03A.addChild(this.lTusk04);
		this.body01.addChild(this.spine03);
		this.mGrabber05.addChild(this.mGrabberJawUpper);
		this.lGrabber02.addChild(this.lGrabber03);
		this.body03.addChild(this.body04);
		this.body02.addChild(this.spine07);
		this.rTusk02.addChild(this.rTusk03A);
		this.rGrabberJawLower01.addChild(this.rGrabberJawLower02);
		this.lGrabber05.addChild(this.lGrabberHorn04);
		this.body02.addChild(this.spine06);
		this.body01.addChild(this.spine02);
		this.mGrabber05.addChild(this.mGrabberJawLower01);
		this.body04.addChild(this.rightspine10);
		this.head.addChild(this.mTusk01);
		this.mGrabberJawLower01.addChild(this.mGrabberJawLower02);
		this.mGrabber03.addChild(this.mGrabber04);
		this.mGrabberJawLower01.addChild(this.mGrabberJawLowerTeeth02);
		this.rGrabber01.addChild(this.rGrabber02);
		this.rGrabber05.addChild(this.rGrabberHorn04);
		this.mTusk02.addChild(this.mTusk03);
		this.rGrabber02.addChild(this.rGrabber03);
		this.mGrabberJawLower01.addChild(this.mGrabberJawLowerTeeth01);
		this.rTusk01.addChild(this.rTusk02);
		this.body02.addChild(this.leftspine05);
		this.tTuskTip.addChild(this.tTuskBeak);
		this.mGrabber04.addChild(this.mGrabber05);
		this.body04.addChild(this.spine10);
		this.lGrabberJawUpper.addChild(this.lGrabberJawUpperTeeth01);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.body01.render(f5);
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
