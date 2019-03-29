package me.suff.cubicnightmare.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Kothoga - Batman
 * Created using Tabula 5.1.0
 */
public class ModelKothoga extends ModelBase {
	ModelRenderer rear;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg1;
	ModelRenderer leftleg1;
	ModelRenderer front;
	ModelRenderer tail1;
	ModelRenderer ridge2;
	ModelRenderer neck;
	ModelRenderer ridge1;
	ModelRenderer head;
	ModelRenderer neckhair;
	ModelRenderer topjaw;
	ModelRenderer lowerjaw;
	ModelRenderer leftpinsir1;
	ModelRenderer rightpinsir1;
	ModelRenderer snout;
	ModelRenderer topteeth;
	ModelRenderer lowteeth;
	ModelRenderer leftpinsir2;
	ModelRenderer leftpinsir3;
	ModelRenderer leftpinsir4;
	ModelRenderer rightpinsir2;
	ModelRenderer rightpinsir3;
	ModelRenderer rightpinsir4;
	ModelRenderer tail2;
	ModelRenderer ridge3;
	ModelRenderer tail3;
	ModelRenderer ridge4;
	ModelRenderer tail4;
	ModelRenderer ridge5;
	ModelRenderer tail5;
	ModelRenderer rightarm2;
	ModelRenderer righthand;
	ModelRenderer rightfinger1;
	ModelRenderer rightfinger2;
	ModelRenderer rightfinger3;
	ModelRenderer rightfinger4;
	ModelRenderer rightfinger5;
	ModelRenderer leftarm2;
	ModelRenderer lefthand;
	ModelRenderer leftfinger1;
	ModelRenderer leftfinger2;
	ModelRenderer leftfinger3;
	ModelRenderer leftfinger4;
	ModelRenderer leftfinger5;
	ModelRenderer rightleg2;
	ModelRenderer rightleg3;
	ModelRenderer rightfoot;
	ModelRenderer righttoe1;
	ModelRenderer righttoe2;
	ModelRenderer righttoe3;
	ModelRenderer righttoe4;
	ModelRenderer righttoe5;
	ModelRenderer leftleg2;
	ModelRenderer leftleg3;
	ModelRenderer leftfoot;
	ModelRenderer lefttoe1;
	ModelRenderer lefttoe2;
	ModelRenderer lefttoe3;
	ModelRenderer lefttoe4;
	ModelRenderer lefttoe5;
	
	public ModelKothoga() {
		this.textureWidth = 100;
		this.textureHeight = 200;
		this.rightfinger1 = new ModelRenderer(this, 0, 177);
		this.rightfinger1.setRotationPoint(1.5F, 1.0F, -1.4F);
		this.rightfinger1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rightfinger1, 0.136659280431156F, -0.136659280431156F, 0.0F);
		this.rightarm = new ModelRenderer(this, 0, 143);
		this.rightarm.setRotationPoint(-5.0F, 5.9F, -7.4F);
		this.rightarm.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(rightarm, 0.045553093477052F, 0.0F, 0.0F);
		this.leftleg1 = new ModelRenderer(this, 18, 143);
		this.leftleg1.setRotationPoint(4.0F, 9.9F, 4.0F);
		this.leftleg1.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
		this.setRotateAngle(leftleg1, 0.4553564018453205F, 0.0F, 0.0F);
		this.snout = new ModelRenderer(this, 45, 49);
		this.snout.setRotationPoint(0.0F, -1.0F, -3.0F);
		this.snout.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(snout, 0.5462880558742251F, 0.0F, 0.0F);
		this.lefttoe2 = new ModelRenderer(this, 18, 186);
		this.lefttoe2.setRotationPoint(0.5F, 1.0F, -1.4F);
		this.lefttoe2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe2, 0.136659280431156F, -0.091106186954104F, 0.0F);
		this.leftpinsir3 = new ModelRenderer(this, 51, 86);
		this.leftpinsir3.setRotationPoint(0.5F, 0.1F, -4.6F);
		this.leftpinsir3.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(leftpinsir3, 0.0F, 0.8651597102135892F, 0.0F);
		this.tail1 = new ModelRenderer(this, 0, 46);
		this.tail1.setRotationPoint(0.0F, -1.0F, 10.6F);
		this.tail1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 9, 0.0F);
		this.setRotateAngle(tail1, -0.36425021489121656F, 0.0F, 0.0F);
		this.righttoe2 = new ModelRenderer(this, 18, 186);
		this.righttoe2.setRotationPoint(0.5F, 1.0F, -1.4F);
		this.righttoe2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe2, 0.136659280431156F, -0.091106186954104F, 0.0F);
		this.tail3 = new ModelRenderer(this, 0, 79);
		this.tail3.setRotationPoint(0.0F, -1.0F, 8.9F);
		this.tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F);
		this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
		this.rightleg3 = new ModelRenderer(this, 18, 168);
		this.rightleg3.setRotationPoint(0.0F, 4.5F, 0.7F);
		this.rightleg3.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(rightleg3, -1.3658946726107624F, 0.0F, 0.0F);
		this.tail2 = new ModelRenderer(this, 0, 63);
		this.tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.tail2.addBox(-2.5F, -3.0F, 0.0F, 5, 5, 9, 0.0F);
		this.ridge4 = new ModelRenderer(this, 0, 125);
		this.ridge4.setRotationPoint(0.0F, -5.0F, 0.0F);
		this.ridge4.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
		this.rightfinger4 = new ModelRenderer(this, 0, 177);
		this.rightfinger4.setRotationPoint(-1.5F, 1.0F, -1.4F);
		this.rightfinger4.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rightfinger4, 0.136659280431156F, 0.18203784098300857F, 0.0F);
		this.neckhair = new ModelRenderer(this, 45, 28);
		this.neckhair.setRotationPoint(0.0F, -2.7F, -8.0F);
		this.neckhair.addBox(-2.0F, -4.0F, 0.0F, 4, 4, 8, 0.0F);
		this.leftpinsir1 = new ModelRenderer(this, 33, 76);
		this.leftpinsir1.setRotationPoint(2.0F, 0.5F, -4.0F);
		this.leftpinsir1.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F);
		this.setRotateAngle(leftpinsir1, 0.0F, -0.8196066167365371F, 0.0F);
		this.leftfinger4 = new ModelRenderer(this, 0, 177);
		this.leftfinger4.setRotationPoint(-1.5F, 1.0F, -1.4F);
		this.leftfinger4.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(leftfinger4, 0.136659280431156F, 0.136659280431156F, 0.0F);
		this.front = new ModelRenderer(this, 0, 0);
		this.front.setRotationPoint(0.0F, 0.9F, 1.0F);
		this.front.addBox(-5.0F, -5.5F, -11.0F, 10, 10, 11, 0.0F);
		this.setRotateAngle(front, 0.045553093477052F, 0.0F, 0.0F);
		this.rightpinsir3 = new ModelRenderer(this, 51, 86);
		this.rightpinsir3.setRotationPoint(-0.5F, 0.1F, -4.6F);
		this.rightpinsir3.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rightpinsir3, 0.0F, -0.8651597102135892F, 0.0F);
		this.leftpinsir2 = new ModelRenderer(this, 51, 76);
		this.leftpinsir2.setRotationPoint(0.5F, 0.0F, -4.6F);
		this.leftpinsir2.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
		this.setRotateAngle(leftpinsir2, 0.0F, 0.5009094953223726F, 0.0F);
		this.leftfinger1 = new ModelRenderer(this, 0, 177);
		this.leftfinger1.setRotationPoint(1.5F, 1.0F, -1.4F);
		this.leftfinger1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(leftfinger1, 0.136659280431156F, -0.18203784098300857F, 0.0F);
		this.rightpinsir1 = new ModelRenderer(this, 33, 76);
		this.rightpinsir1.setRotationPoint(-2.0F, 0.5F, -4.0F);
		this.rightpinsir1.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F);
		this.setRotateAngle(rightpinsir1, 0.0F, 0.8196066167365371F, 0.0F);
		this.lowerjaw = new ModelRenderer(this, 45, 63);
		this.lowerjaw.setRotationPoint(0.0F, 2.0F, -3.7F);
		this.lowerjaw.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(lowerjaw, 0.6373942428283291F, 0.0F, 0.0F);
		this.righttoe5 = new ModelRenderer(this, 18, 186);
		this.righttoe5.setRotationPoint(-1.7F, 1.0F, -0.4F);
		this.righttoe5.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe5, 0.136659280431156F, 0.5918411493512771F, 0.0F);
		this.rightpinsir2 = new ModelRenderer(this, 51, 76);
		this.rightpinsir2.setRotationPoint(-0.5F, 0.0F, -4.6F);
		this.rightpinsir2.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
		this.setRotateAngle(rightpinsir2, 0.0F, -0.5009094953223726F, 0.0F);
		this.ridge2 = new ModelRenderer(this, 0, 113);
		this.ridge2.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.ridge2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 12, 0.0F);
		this.righthand = new ModelRenderer(this, 0, 171);
		this.righthand.setRotationPoint(0.0F, 6.5F, 0.0F);
		this.righthand.addBox(-2.0F, 0.0F, -1.5F, 4, 2, 3, 0.0F);
		this.setRotateAngle(righthand, 0.136659280431156F, 0.0F, 0.0F);
		this.leftarm2 = new ModelRenderer(this, 0, 159);
		this.leftarm2.setRotationPoint(0.0F, 9.7F, 0.5F);
		this.leftarm2.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(leftarm2, -0.18203784098300857F, 0.0F, 0.0F);
		this.lefttoe4 = new ModelRenderer(this, 18, 186);
		this.lefttoe4.setRotationPoint(-1.5F, 1.0F, -1.4F);
		this.lefttoe4.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe4, 0.136659280431156F, 0.18203784098300857F, 0.0F);
		this.ridge1 = new ModelRenderer(this, 0, 110);
		this.ridge1.setRotationPoint(0.0F, -7.0F, -11.0F);
		this.ridge1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 11, 0.0F);
		this.righttoe4 = new ModelRenderer(this, 18, 186);
		this.righttoe4.setRotationPoint(-1.5F, 1.0F, -1.4F);
		this.righttoe4.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe4, 0.136659280431156F, 0.18203784098300857F, 0.0F);
		this.leftpinsir4 = new ModelRenderer(this, 51, 91);
		this.leftpinsir4.setRotationPoint(-0.7F, -0.5F, -3.0F);
		this.leftpinsir4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(leftpinsir4, 0.0F, 0.7853981633974483F, 0.0F);
		this.neck = new ModelRenderer(this, 45, 0);
		this.neck.setRotationPoint(0.0F, -2.9F, -9.4F);
		this.neck.addBox(-3.0F, -3.0F, -8.0F, 6, 6, 8, 0.0F);
		this.setRotateAngle(neck, 0.5462880558742251F, 0.0F, 0.0F);
		this.leftfinger2 = new ModelRenderer(this, 0, 177);
		this.leftfinger2.setRotationPoint(0.5F, 1.0F, -1.4F);
		this.leftfinger2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(leftfinger2, 0.136659280431156F, -0.091106186954104F, 0.0F);
		this.leftleg3 = new ModelRenderer(this, 18, 168);
		this.leftleg3.setRotationPoint(0.0F, 4.5F, 0.7F);
		this.leftleg3.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(leftleg3, -1.3658946726107624F, 0.0F, 0.0F);
		this.lefttoe5 = new ModelRenderer(this, 18, 186);
		this.lefttoe5.setRotationPoint(1.7F, 1.0F, -0.4F);
		this.lefttoe5.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe5, 0.136659280431156F, -0.5918411493512771F, 0.0F);
		this.rightpinsir4 = new ModelRenderer(this, 51, 91);
		this.rightpinsir4.setRotationPoint(-0.7F, -0.5F, -3.0F);
		this.rightpinsir4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(rightpinsir4, 0.0F, 0.7853981633974483F, 0.0F);
		this.leftarm = new ModelRenderer(this, 0, 143);
		this.leftarm.setRotationPoint(5.0F, 5.9F, -7.4F);
		this.leftarm.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(leftarm, 0.045553093477052F, 0.0F, 0.0F);
		this.rightfinger2 = new ModelRenderer(this, 0, 177);
		this.rightfinger2.setRotationPoint(0.5F, 1.0F, -1.4F);
		this.rightfinger2.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rightfinger2, 0.136659280431156F, -0.045553093477052F, 0.0F);
		this.lefttoe1 = new ModelRenderer(this, 18, 186);
		this.lefttoe1.setRotationPoint(1.5F, 1.0F, -1.4F);
		this.lefttoe1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe1, 0.136659280431156F, -0.18203784098300857F, 0.0F);
		this.lefthand = new ModelRenderer(this, 0, 171);
		this.lefthand.setRotationPoint(0.0F, 6.5F, 0.0F);
		this.lefthand.addBox(-2.0F, 0.0F, -1.5F, 4, 2, 3, 0.0F);
		this.setRotateAngle(lefthand, 0.136659280431156F, 0.0F, 0.0F);
		this.rightleg1 = new ModelRenderer(this, 18, 143);
		this.rightleg1.setRotationPoint(-4.0F, 9.9F, 4.0F);
		this.rightleg1.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
		this.setRotateAngle(rightleg1, 0.4553564018453205F, 0.0F, 0.0F);
		this.leftfoot = new ModelRenderer(this, 18, 180);
		this.leftfoot.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.leftfoot.addBox(-2.0F, 0.0F, -1.5F, 4, 2, 3, 0.0F);
		this.setRotateAngle(leftfoot, 0.136659280431156F, 0.0F, 0.0F);
		this.righttoe1 = new ModelRenderer(this, 18, 186);
		this.righttoe1.setRotationPoint(1.5F, 1.0F, -1.4F);
		this.righttoe1.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe1, 0.136659280431156F, -0.18203784098300857F, 0.0F);
		this.lefttoe3 = new ModelRenderer(this, 18, 186);
		this.lefttoe3.setRotationPoint(-0.5F, 1.0F, -1.4F);
		this.lefttoe3.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lefttoe3, 0.136659280431156F, 0.091106186954104F, 0.0F);
		this.ridge3 = new ModelRenderer(this, 0, 120);
		this.ridge3.setRotationPoint(0.0F, -4.9F, 0.0F);
		this.ridge3.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
		this.tail4 = new ModelRenderer(this, 0, 94);
		this.tail4.setRotationPoint(0.0F, -0.5F, 8.8F);
		this.tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F);
		this.setRotateAngle(tail4, 0.136659280431156F, 0.0F, 0.0F);
		this.ridge5 = new ModelRenderer(this, 0, 129);
		this.ridge5.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.ridge5.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
		this.rear = new ModelRenderer(this, 0, 23);
		this.rear.setRotationPoint(0.0F, 9.0F, 0.0F);
		this.rear.addBox(-4.0F, -4.5F, 0.0F, 8, 9, 12, 0.0F);
		this.setRotateAngle(rear, -0.136659280431156F, 0.0F, 0.0F);
		this.topteeth = new ModelRenderer(this, 45, 57);
		this.topteeth.setRotationPoint(-2.0F, 0.6F, -3.0F);
		this.topteeth.addBox(-0.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
		this.leftfinger5 = new ModelRenderer(this, 0, 177);
		this.leftfinger5.setRotationPoint(-2.1F, 1.0F, -0.4F);
		this.leftfinger5.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(leftfinger5, -0.36425021489121656F, 0.40980330836826856F, 0.0F);
		this.righttoe3 = new ModelRenderer(this, 18, 186);
		this.righttoe3.setRotationPoint(-0.5F, 1.0F, -1.4F);
		this.righttoe3.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(righttoe3, 0.136659280431156F, 0.091106186954104F, 0.0F);
		this.rightfinger3 = new ModelRenderer(this, 0, 177);
		this.rightfinger3.setRotationPoint(-0.5F, 1.0F, -1.4F);
		this.rightfinger3.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rightfinger3, 0.136659280431156F, 0.091106186954104F, 0.0F);
		this.tail5 = new ModelRenderer(this, 0, 108);
		this.tail5.setRotationPoint(0.0F, -0.4F, 8.7F);
		this.tail5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F);
		this.setRotateAngle(tail5, 0.18203784098300857F, 0.0F, 0.0F);
		this.lowteeth = new ModelRenderer(this, 45, 69);
		this.lowteeth.setRotationPoint(-1.5F, -1.0F, -2.9F);
		this.lowteeth.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
		this.topjaw = new ModelRenderer(this, 45, 42);
		this.topjaw.setRotationPoint(0.0F, 0.5F, -4.0F);
		this.topjaw.addBox(-2.5F, -1.0F, -3.0F, 5, 2, 3, 0.0F);
		this.leftfinger3 = new ModelRenderer(this, 0, 177);
		this.leftfinger3.setRotationPoint(-0.5F, 1.0F, -1.4F);
		this.leftfinger3.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(leftfinger3, 0.136659280431156F, 0.045553093477052F, 0.0F);
		this.leftleg2 = new ModelRenderer(this, 18, 157);
		this.leftleg2.setRotationPoint(0.0F, 5.7F, -0.8F);
		this.leftleg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 3, 0.0F);
		this.setRotateAngle(leftleg2, 0.7740535232594852F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 45, 16);
		this.head.setRotationPoint(0.0F, -0.2F, -7.5F);
		this.head.addBox(-3.5F, -3.0F, -4.0F, 7, 6, 4, 0.0F);
		this.setRotateAngle(head, 0.18203784098300857F, 0.0F, 0.0F);
		this.rightarm2 = new ModelRenderer(this, 0, 159);
		this.rightarm2.setRotationPoint(0.0F, 9.7F, 0.5F);
		this.rightarm2.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(rightarm2, -0.18203784098300857F, 0.0F, 0.0F);
		this.rightfinger5 = new ModelRenderer(this, 0, 177);
		this.rightfinger5.setRotationPoint(2.1F, 1.0F, -0.4F);
		this.rightfinger5.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rightfinger5, -0.36425021489121656F, -0.40980330836826856F, 0.0F);
		this.rightfoot = new ModelRenderer(this, 18, 180);
		this.rightfoot.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.rightfoot.addBox(-2.0F, 0.0F, -1.5F, 4, 2, 3, 0.0F);
		this.setRotateAngle(rightfoot, 0.136659280431156F, 0.0F, 0.0F);
		this.rightleg2 = new ModelRenderer(this, 18, 157);
		this.rightleg2.setRotationPoint(0.0F, 5.7F, -0.8F);
		this.rightleg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 3, 0.0F);
		this.setRotateAngle(rightleg2, 0.7740535232594852F, 0.0F, 0.0F);
		this.righthand.addChild(this.rightfinger1);
		this.topjaw.addChild(this.snout);
		this.leftfoot.addChild(this.lefttoe2);
		this.leftpinsir2.addChild(this.leftpinsir3);
		this.rear.addChild(this.tail1);
		this.rightfoot.addChild(this.righttoe2);
		this.tail2.addChild(this.tail3);
		this.rightleg2.addChild(this.rightleg3);
		this.tail1.addChild(this.tail2);
		this.tail2.addChild(this.ridge4);
		this.righthand.addChild(this.rightfinger4);
		this.neck.addChild(this.neckhair);
		this.head.addChild(this.leftpinsir1);
		this.lefthand.addChild(this.leftfinger4);
		this.rear.addChild(this.front);
		this.rightpinsir2.addChild(this.rightpinsir3);
		this.leftpinsir1.addChild(this.leftpinsir2);
		this.lefthand.addChild(this.leftfinger1);
		this.head.addChild(this.rightpinsir1);
		this.head.addChild(this.lowerjaw);
		this.rightfoot.addChild(this.righttoe5);
		this.rightpinsir1.addChild(this.rightpinsir2);
		this.rear.addChild(this.ridge2);
		this.rightarm2.addChild(this.righthand);
		this.leftarm.addChild(this.leftarm2);
		this.leftfoot.addChild(this.lefttoe4);
		this.front.addChild(this.ridge1);
		this.rightfoot.addChild(this.righttoe4);
		this.leftpinsir3.addChild(this.leftpinsir4);
		this.front.addChild(this.neck);
		this.lefthand.addChild(this.leftfinger2);
		this.leftleg2.addChild(this.leftleg3);
		this.leftfoot.addChild(this.lefttoe5);
		this.rightpinsir3.addChild(this.rightpinsir4);
		this.righthand.addChild(this.rightfinger2);
		this.leftfoot.addChild(this.lefttoe1);
		this.leftarm2.addChild(this.lefthand);
		this.leftleg3.addChild(this.leftfoot);
		this.rightfoot.addChild(this.righttoe1);
		this.leftfoot.addChild(this.lefttoe3);
		this.tail1.addChild(this.ridge3);
		this.tail3.addChild(this.tail4);
		this.tail3.addChild(this.ridge5);
		this.topjaw.addChild(this.topteeth);
		this.lefthand.addChild(this.leftfinger5);
		this.rightfoot.addChild(this.righttoe3);
		this.righthand.addChild(this.rightfinger3);
		this.tail4.addChild(this.tail5);
		this.lowerjaw.addChild(this.lowteeth);
		this.head.addChild(this.topjaw);
		this.lefthand.addChild(this.leftfinger3);
		this.leftleg1.addChild(this.leftleg2);
		this.neck.addChild(this.head);
		this.rightarm.addChild(this.rightarm2);
		this.righthand.addChild(this.rightfinger5);
		this.rightleg3.addChild(this.rightfoot);
		this.rightleg1.addChild(this.rightleg2);
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5) {
		GlStateManager.pushMatrix();
		setRotationAngles(entity, limbSwing, limbSwingAmount, ticksExisted, headyaw, headpitch, f5);
		GlStateManager.scale(2,2,2);
		GlStateManager.translate(0,-0.7,0);
		this.rightarm.render(f5);
		this.leftleg1.render(f5);
		this.leftarm.render(f5);
		this.rightleg1.render(f5);
		this.rear.render(f5);
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
	private static float rad = (float) ( Math.PI/180 );
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ticksExisted, float headyaw, float headpitch, float f5){
		
		float motion = MathHelper.sqrt( entity.motionX*entity.motionX + entity.motionY*entity.motionY + entity.motionZ*entity.motionZ );
		ModelRenderer[] tail= {this.tail1,this.tail2,this.tail3,this.tail4,this.tail5};
		float f1=0.6f;float f2=0.5F * limbSwingAmount;
		this.neck.rotateAngleX=headpitch*rad/2;
		this.head.rotateAngleX=this.neck.rotateAngleX;
		this.neck.rotateAngleY=headyaw*rad/2;
		this.head.rotateAngleY=this.neck.rotateAngleY;
		this.lowerjaw.rotateAngleX=10*rad;
		tail[0].rotateAngleX=-20*rad;
		tail[1].rotateAngleX=15*rad;
		tail[2].rotateAngleX=10*rad;
		tail[3].rotateAngleX=5*rad;
		tail[4].rotateAngleX=1*rad;
		//this.lowerjaw.rotateAngleX+=(MathHelper.cos( ticksExisted )*30+30)*rad;
		if(motion>0.17f){
			this.rightarm.rotateAngleX=10*rad+MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightarm2.rotateAngleX=-13*rad-(MathHelper.sin(limbSwing * 0.6662F)+0.5f) * 1F * limbSwingAmount;
			this.rightleg1.rotateAngleX=33.91f*rad+MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightleg2.rotateAngleX=44.35f*rad-MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightleg3.rotateAngleX=-78.26f*rad+(MathHelper.cos(limbSwing * 0.6662F)+1f) * 1F * limbSwingAmount;
			this.leftarm.rotateAngleX=10*rad+MathHelper.cos(6+limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftarm2.rotateAngleX=-13*rad-(MathHelper.sin(6+limbSwing * 0.6662F)+0.5f) * 1F * limbSwingAmount;
			this.leftleg1.rotateAngleX=33.91f*rad+MathHelper.cos(6+limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftleg2.rotateAngleX=44.35f*rad-MathHelper.sin(6+limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftleg3.rotateAngleX=-78.26f*rad+(MathHelper.sin(6+limbSwing * 0.6662F)+1f) * 1F * limbSwingAmount;
			f2=0.2F * limbSwingAmount;
			tail[0].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*5))*f2;
			tail[1].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*4))*f2;
			tail[2].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*3))*f2;
			tail[3].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*2))*f2;
			tail[4].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*1))*f2;
			tail[0].rotateAngleX=0;
			tail[1].rotateAngleX=0;
			tail[2].rotateAngleX=0;
			tail[3].rotateAngleX=0;
			tail[4].rotateAngleX=0;
		}else{
			this.rightarm.rotateAngleX=10*rad+MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightarm2.rotateAngleX=-13*rad-(MathHelper.sin(limbSwing * 0.6662F)+0.5f) * 1F * limbSwingAmount;
			this.rightleg1.rotateAngleX=33.91f*rad-MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightleg2.rotateAngleX=44.35f*rad+MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.rightleg3.rotateAngleX=-78.26f*rad-MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftarm.rotateAngleX=10*rad-MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftarm2.rotateAngleX=-13*rad-(MathHelper.cos(limbSwing * 0.6662F)+0.5f) * 1F * limbSwingAmount;
			this.leftleg1.rotateAngleX=33.91f*rad+MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftleg2.rotateAngleX=44.35f*rad-MathHelper.sin(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			this.leftleg3.rotateAngleX=-78.26f*rad+MathHelper.cos(limbSwing * 0.6662F) * 1F * limbSwingAmount;
			
		}
		
		if(!entity.onGround&&entity.motionY>0.01f){
			this.rightarm.rotateAngleX=motion;
			this.rightarm2.rotateAngleX=motion;
			this.leftarm.rotateAngleX=motion;
			this.leftarm2.rotateAngleX=motion;
			this.rightleg1.rotateAngleX=motion;
			this.rightleg3.rotateAngleX=motion;
			this.leftleg1.rotateAngleX=motion;
			this.leftleg3.rotateAngleX=motion;
		}
		
		if(entity.isSneaking()){
			this.rear.rotationPointY=12;
			f2=2F * limbSwingAmount;
			tail[0].rotateAngleX=-20*rad+MathHelper.sqrt(head.rotateAngleX*head.rotateAngleX);
			tail[1].rotateAngleX=MathHelper.sqrt(head.rotateAngleX*head.rotateAngleX);
			tail[2].rotateAngleX=tail[1].rotateAngleX;
			tail[3].rotateAngleX=tail[1].rotateAngleX;
			tail[4].rotateAngleX=tail[1].rotateAngleX;
		}else{
			this.rear.rotationPointY=9;
		}
		
		tail[0].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*5))*f2;
		tail[1].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*4))*f2;
		tail[2].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*3))*f2;
		tail[3].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*2))*f2;
		tail[4].rotateAngleY=MathHelper.cos(limbSwing * 0.6662F+(f1*1))*f2;
		
	}
}