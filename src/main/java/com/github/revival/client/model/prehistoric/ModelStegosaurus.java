package com.github.revival.client.model.prehistoric;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.server.entity.mob.EntityAnkylosaurus;
import com.github.revival.server.entity.mob.test.EntityNewPrehistoric;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStegosaurus extends ModelNewPrehistoric {
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer rightFrontThigh;
    public AdvancedModelRenderer leftFrontThigh;
    public AdvancedModelRenderer rightHindThigh;
    public AdvancedModelRenderer leftHindThigh;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer bodyPlates;
    public AdvancedModelRenderer neck1;
    public AdvancedModelRenderer neck1Plates;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer neck2Plates;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer head_1;
    public AdvancedModelRenderer head_2;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail1Plates;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer tail2Plates;
    public AdvancedModelRenderer leftThagomizer;
    public AdvancedModelRenderer rightThagomizer;
    public AdvancedModelRenderer rightFrontLeg;
    public AdvancedModelRenderer leftFrontLeg;
    public AdvancedModelRenderer rightHindLeg;
    public AdvancedModelRenderer leftHindLeg;
    private ModelAnimator animator;

    public ModelStegosaurus() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.leftFrontThigh = new AdvancedModelRenderer(this, 0, 50);
        this.leftFrontThigh.mirror = true;
        this.leftFrontThigh.setRotationPoint(3.6F, 3.7920251138256056F, -10.48596032224782F);
        this.leftFrontThigh.addBox(0.0F, -0.5F, -1.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(leftFrontThigh, 0.12217304763960303F, 0.0F, 0.0F);
        this.leftThagomizer = new AdvancedModelRenderer(this, 163, 110);
        this.leftThagomizer.setRotationPoint(1.0F, 1.3F, 4.0F);
        this.leftThagomizer.addBox(-1.0F, -10.0F, -4.0F, 2, 10, 8, 0.0F);
        this.setRotateAngle(leftThagomizer, -0.20943951023931953F, -0.0879645943005142F, 1.1786208438717707F);
        this.leftHindThigh = new AdvancedModelRenderer(this, 16, 50);
        this.leftHindThigh.setRotationPoint(5.0F, -1.713242628149242F, 8.945658147788361F);
        this.leftHindThigh.addBox(0.0F, -0.5F, -1.5F, 4, 10, 6, 0.0F);
        this.setRotateAngle(leftHindThigh, 0.034906585039886584F, 0.0F, 0.0F);
        this.tail2Plates = new AdvancedModelRenderer(this, 128, 102);
        this.tail2Plates.setRotationPoint(0.0F, 3.4F, 5.0F);
        this.tail2Plates.addBox(-1.0F, -10.0F, -8.0F, 2, 10, 16, 0.0F);
        this.setRotateAngle(tail2Plates, -0.009075712110370514F, -0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 3);
        this.head.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.head.addBox(-2.0F, -3.0F, -7.0F, 4, 6, 7, 0.0F);
        this.setRotateAngle(head, 0.20943951023931953F, 0.0F, 0.0F);
        this.rightFrontThigh = new AdvancedModelRenderer(this, 0, 50);
        this.rightFrontThigh.setRotationPoint(-5.6F, 3.7920251138256056F, -10.48596032224782F);
        this.rightFrontThigh.addBox(-2.0F, -0.5F, -1.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(rightFrontThigh, 0.12217304763960303F, 0.0F, 0.0F);
        this.tail1Plates = new AdvancedModelRenderer(this, 101, 108);
        this.tail1Plates.setRotationPoint(0.0F, 4.0F, 4.5F);
        this.tail1Plates.addBox(-2.0F, -10.0F, -5.0F, 4, 10, 10, 0.0F);
        this.setRotateAngle(tail1Plates, -0.05235987755982988F, 0.0F, 0.0F);
        this.rightHindThigh = new AdvancedModelRenderer(this, 16, 50);
        this.rightHindThigh.mirror = true;
        this.rightHindThigh.setRotationPoint(-7.0F, -1.713242628149242F, 8.945658147788361F);
        this.rightHindThigh.addBox(-2.0F, -0.5F, -1.5F, 4, 10, 6, 0.0F);
        this.setRotateAngle(rightHindThigh, 0.034906585039886584F, 0.0F, 0.0F);
        this.rightThagomizer = new AdvancedModelRenderer(this, 163, 110);
        this.rightThagomizer.mirror = true;
        this.rightThagomizer.setRotationPoint(-1.0F, 1.3F, 4.0F);
        this.rightThagomizer.addBox(-1.0F, -10.0F, -4.0F, 2, 10, 8, 0.0F);
        this.setRotateAngle(rightThagomizer, -0.20943951023931953F, 0.0879645943005142F, -1.1786208438717707F);
        this.head_2 = new AdvancedModelRenderer(this, 65, 1);
        this.head_2.setRotationPoint(0.0F, 0.3F, -5.5F);
        this.head_2.addBox(-1.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(head_2, 0.13962634015954636F, 0.0F, 0.0F);
        this.rightHindLeg = new AdvancedModelRenderer(this, 16, 68);
        this.rightHindLeg.mirror = true;
        this.rightHindLeg.setRotationPoint(-1.3F, 7.7F, 2.0F);
        this.rightHindLeg.addBox(-0.5F, 0.0F, -1.0F, 4, 8, 4, 0.0F);
        this.neck2 = new AdvancedModelRenderer(this, 0, 16);
        this.neck2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addBox(-3.0F, -3.0F, -10.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(neck2, -0.2844886680750757F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 28, 0);
        this.upperBody.setRotationPoint(0.0F, -0.5F, 3.1F);
        this.upperBody.addBox(-6.0F, -7.0F, -10.0F, 12, 14, 10, 0.0F);
        this.setRotateAngle(upperBody, 0.12217304763960307F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 118, 30);
        this.tail3.setRotationPoint(0.0F, 0.5F, 10.5F);
        this.tail3.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(tail3, 0.12217304763960307F, -0.0F, 0.0F);
        this.leftHindLeg = new AdvancedModelRenderer(this, 16, 68);
        this.leftHindLeg.setRotationPoint(0.3F, 7.7F, 2.0F);
        this.leftHindLeg.addBox(-0.5F, 0.0F, -1.0F, 4, 8, 4, 0.0F);
        this.rightFrontLeg = new AdvancedModelRenderer(this, 0, 62);
        this.rightFrontLeg.mirror = true;
        this.rightFrontLeg.setRotationPoint(-0.9F, 4.2F, 0.5F);
        this.rightFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(rightFrontLeg, -0.20943951023931953F, -0.0F, 0.0F);
        this.head_1 = new AdvancedModelRenderer(this, 23, 1);
        this.head_1.setRotationPoint(0.0F, -0.6F, -6.0F);
        this.head_1.addBox(-1.0F, -2.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(head_1, 0.13962634015954636F, 0.0F, 0.0F);
        this.bodyPlates = new AdvancedModelRenderer(this, 53, 98);
        this.bodyPlates.setRotationPoint(0.0F, -5.0F, 3.5F);
        this.bodyPlates.addBox(-2.0F, -10.0F, -10.0F, 4, 10, 20, 0.0F);
        this.setRotateAngle(bodyPlates, 0.05235987755982988F, -0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 72, 0);
        this.lowerBody.setRotationPoint(0.0F, 9.7F, -2.5F);
        this.lowerBody.addBox(-7.0F, -8.0F, 0.0F, 14, 16, 14, 0.0F);
        this.setRotateAngle(lowerBody, -0.03490658503988659F, -0.0F, 0.0F);
        this.neck1Plates = new AdvancedModelRenderer(this, 27, 110);
        this.neck1Plates.setRotationPoint(0.0F, -2.5F, -3.5F);
        this.neck1Plates.addBox(-2.0F, -10.0F, -5.0F, 4, 10, 8, 0.0F);
        this.setRotateAngle(neck1Plates, -0.05235987755982988F, -0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 42, 30);
        this.tail1.setRotationPoint(0.0F, -7.1F, 13.0F);
        this.tail1.addBox(-5.0F, 0.0F, 0.0F, 10, 8, 10, 0.0F);
        this.setRotateAngle(tail1, -0.03490658503988659F, -0.0F, 0.0F);
        this.neck1 = new AdvancedModelRenderer(this, 0, 32);
        this.neck1.setRotationPoint(0.0F, -0.2F, -7.3F);
        this.neck1.addBox(-5.0F, -5.0F, -8.0F, 10, 10, 8, 0.0F);
        this.setRotateAngle(neck1, 0.10471975511965977F, -0.0F, 0.0F);
        this.neck2Plates = new AdvancedModelRenderer(this, 0, 112);
        this.neck2Plates.setRotationPoint(0.0F, 2.5F, -6.0F);
        this.neck2Plates.addBox(-1.0F, -8.0F, -5.0F, 2, 8, 10, 0.0F);
        this.setRotateAngle(neck2Plates, 0.017453292519943295F, -0.0F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 82, 30);
        this.tail2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.tail2.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 12, 0.0F);
        this.setRotateAngle(tail2, -0.06370451769779302F, -0.0F, 0.0F);
        this.leftFrontLeg = new AdvancedModelRenderer(this, 0, 62);
        this.leftFrontLeg.setRotationPoint(0.9F, 4.2F, 0.5F);
        this.leftFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(leftFrontLeg, -0.20943951023931953F, -0.0F, 0.0F);
        this.upperBody.addChild(this.leftFrontThigh);
        this.tail3.addChild(this.leftThagomizer);
        this.lowerBody.addChild(this.leftHindThigh);
        this.tail2.addChild(this.tail2Plates);
        this.neck2.addChild(this.head);
        this.upperBody.addChild(this.rightFrontThigh);
        this.tail1.addChild(this.tail1Plates);
        this.lowerBody.addChild(this.rightHindThigh);
        this.tail3.addChild(this.rightThagomizer);
        this.head.addChild(this.head_2);
        this.rightHindThigh.addChild(this.rightHindLeg);
        this.neck1.addChild(this.neck2);
        this.lowerBody.addChild(this.upperBody);
        this.tail2.addChild(this.tail3);
        this.leftHindThigh.addChild(this.leftHindLeg);
        this.rightFrontThigh.addChild(this.rightFrontLeg);
        this.head.addChild(this.head_1);
        this.lowerBody.addChild(this.bodyPlates);
        this.neck1.addChild(this.neck1Plates);
        this.lowerBody.addChild(this.tail1);
        this.upperBody.addChild(this.neck1);
        this.neck2.addChild(this.neck2Plates);
        this.tail1.addChild(this.tail2);
        this.leftFrontThigh.addChild(this.leftFrontLeg);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.lowerBody.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(EntityAnkylosaurus.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, lowerBody, 0, 15, 0);
        ModelUtils.rotate(animator, tail1, 0, 10, 0);
        ModelUtils.rotate(animator, tail2, 0, 18, 0);
        ModelUtils.rotate(animator, tail3, 0, 20, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, lowerBody, 0, -127, 0);
        ModelUtils.rotate(animator, tail1, 0, -15, 0);
        ModelUtils.rotate(animator, tail2, 0, -25, 0);
        ModelUtils.rotate(animator, tail3, 0, -20, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckParts = {this.neck1, this.neck2, this.head};
        ModelUtils.faceTargetMod(neck1, f3, f4, 0.33F);
        ModelUtils.faceTargetMod(neck2, f3, f4, 0.33F);
        ModelUtils.faceTargetMod(head, f3, f4, 0.33F);

        float speed = 0.1F;
        float speed2 = 0.5F;
        this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed, 0.15F, -2, entity.ticksExisted, 1);
        this.chainWave(neckParts, speed, 0.05F, 3, entity.ticksExisted, 1);
        this.bob(lowerBody, speed, 0.4F, false, entity.ticksExisted, 1);
        this.bob(rightFrontThigh, speed, -0.4F, false, entity.ticksExisted, 1);
        this.bob(leftFrontThigh, speed, -0.4F, false, entity.ticksExisted, 1);
        this.bob(rightHindThigh, speed, -0.4F, false, entity.ticksExisted, 1);
        this.bob(leftHindThigh, speed, -0.4F, false, entity.ticksExisted, 1);
        this.walk(leftFrontThigh, speed2, 0.8F, true, 0F, 0F, f, f1);
        this.walk(rightFrontThigh, speed2, 0.8F, false, 0F, 0F, f, f1);
        this.walk(leftHindThigh, speed2, 0.8F, false, 0F, 0F, f, f1);
        this.walk(rightHindThigh, speed2, 0.8F, true, 0F, 0F, f, f1);
        this.walk(leftFrontLeg, speed2, 0.5F, true, 0F, 0F, f, f1);
        this.walk(rightFrontLeg, speed2, 0.5F, false, 0F, 0F, f, f1);
        this.walk(leftHindLeg, speed2, 0.5F, false, 0F, 0F, f, f1);
        this.walk(rightHindLeg, speed2, 0.5F, true, 0F, 0F, f, f1);
        {
	        float sitProgress = ((EntityNewPrehistoric) (entity)).sitProgress;
	        sitAnimationRotation(neck2, sitProgress, -((float)Math.toRadians(26.09D)), 0, 0);
	        sitAnimationRotation(leftFrontThigh, sitProgress, -((float)Math.toRadians(20.0D)), 0, 0);
	        sitAnimationRotation(head, sitProgress, (float)Math.toRadians(28.7D), 0, 0);
	        sitAnimationRotation(upperBody, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotation(neck1, sitProgress, (float)Math.toRadians(6.0D), 0, 0);
	        sitAnimationRotation(leftFrontLeg, sitProgress, -((float)Math.toRadians(70.0D)), 0, 0);
	        sitAnimationRotation(head_1, sitProgress, (float)Math.toRadians(8.0D), 0, 0);
	        sitAnimationRotation(rightFrontLeg, sitProgress, -((float)Math.toRadians(70.0D)), 0, 0);
	        sitAnimationRotation(tail1, sitProgress, -((float)Math.toRadians(28.7D)), 0, 0);
	        sitAnimationRotation(rightFrontThigh, sitProgress, -((float)Math.toRadians(20.0D)), 0, 0);
	        sitAnimationRotation(lowerBody, sitProgress, -((float)Math.toRadians(2.0D)), 0, 0);
	        sitAnimationRotation(head_2, sitProgress, (float)Math.toRadians(8.0D), 0, 0);
	        sitAnimationRotation(leftHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
	        sitAnimationRotation(rightHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
	        sitAnimationRotation(tail2, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotation(tail3, sitProgress, (float)Math.toRadians(26.09D), 0, 0);
			sitAnimationPos(lowerBody, sitProgress, 0F, 13.70F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
        }
        {
	        float sitProgress = ((EntityNewPrehistoric) (entity)).sleepProgress;
	        sitAnimationRotation(tail1, sitProgress, -((float)Math.toRadians(36.52D)), (float)Math.toRadians(31.3D), -((float)Math.toRadians(5.22D)));
	        sitAnimationRotation(rightHindThigh, sitProgress, 0, (float)Math.toRadians(5.22D), (float)Math.toRadians(26.09D));
	        sitAnimationRotation(tail3, sitProgress, (float)Math.toRadians(7.0D), (float)Math.toRadians(39.13D), (float)Math.toRadians(41.74D));
	        sitAnimationRotation(leftHindThigh, sitProgress, 0, -((float)Math.toRadians(5.22D)), -((float)Math.toRadians(10.43D)));
	        sitAnimationRotation(rightFrontLeg, sitProgress, -((float)Math.toRadians(127.83D)), (float)Math.toRadians(20.87D), (float)Math.toRadians(15.65D));
	        sitAnimationRotation(head_1, sitProgress, (float)Math.toRadians(8.0D), 0, 0);
	        sitAnimationRotation(rightHindLeg, sitProgress, (float)Math.toRadians(83.48D), -((float)Math.toRadians(10.43D)), -((float)Math.toRadians(5.22D)));
	        sitAnimationRotation(lowerBody, sitProgress, -((float)Math.toRadians(2.0D)), 0, 0);
	        sitAnimationRotation(leftHindLeg, sitProgress, (float)Math.toRadians(78.26D), (float)Math.toRadians(10.43D), -((float)Math.toRadians(7.83D)));
	        sitAnimationRotation(leftFrontLeg, sitProgress, -((float)Math.toRadians(117.39D)), -((float)Math.toRadians(13.04D)), (float)Math.toRadians(44.35D));
	        sitAnimationRotation(tail2, sitProgress, -((float)Math.toRadians(3.65D)), (float)Math.toRadians(33.91D), -((float)Math.toRadians(13.04D)));
	        sitAnimationRotation(head, sitProgress, -((float)Math.toRadians(5.22D)), -((float)Math.toRadians(26.09D)), (float)Math.toRadians(13.04D));
	        sitAnimationRotation(leftFrontThigh, sitProgress, (float)Math.toRadians(36.52D), (float)Math.toRadians(20.87D), -((float)Math.toRadians(41.74D)));
	        sitAnimationRotation(neck1, sitProgress, (float)Math.toRadians(6.0D), -((float)Math.toRadians(15.65D)), 0);
	        sitAnimationRotation(rightFrontThigh, sitProgress, (float)Math.toRadians(54.78D), -((float)Math.toRadians(10.43D)), (float)Math.toRadians(46.96D));
	        sitAnimationRotation(upperBody, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
	        sitAnimationRotation(neck2, sitProgress, -((float)Math.toRadians(13.04D)), -((float)Math.toRadians(26.09D)), (float)Math.toRadians(10.43D));
	        sitAnimationRotation(head_2, sitProgress, (float)Math.toRadians(8.0D), 0, 0);
			sitAnimationPos(lowerBody, sitProgress, 0F, 13.70F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
        }
        ((EntityNewPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);
    }

}
