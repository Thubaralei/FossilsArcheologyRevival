package fossilsarcheology.client.model;

import fossilsarcheology.server.entity.prehistoric.EntityDeinonychus;
import fossilsarcheology.server.entity.prehistoric.EntityPrehistoric;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class ModelOrnitholestes extends ModelPrehistoric {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer Rightthigh;
    public AdvancedModelRenderer Leftthigh;
    public AdvancedModelRenderer Shoulders;
    public AdvancedModelRenderer Tailstart;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Rightupperarm;
    public AdvancedModelRenderer Leftupperarm;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Upperjaw;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Headquills;
    public AdvancedModelRenderer Rightlowerarm;
    public AdvancedModelRenderer Rightupperarmfeathers;
    public AdvancedModelRenderer Rightlowerarmfeathers;
    public AdvancedModelRenderer Leftlowerarm;
    public AdvancedModelRenderer Leftupperarmfeathers;
    public AdvancedModelRenderer Leftlowerarmfeathers;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Tailfeathers1;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfeathers2;
    public AdvancedModelRenderer Tailfeathers3;
    public AdvancedModelRenderer Rightshin;
    public AdvancedModelRenderer Rightfoot;
    public AdvancedModelRenderer Rightfootclaw;
    public AdvancedModelRenderer Leftshin;
    public AdvancedModelRenderer Leftfoot;
    public AdvancedModelRenderer Leftfootclaw;
    ModelAnimator animator;

    public ModelOrnitholestes() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tailfeathers1 = new AdvancedModelRenderer(this, 38, 0);
        this.Tailfeathers1.setRotationPoint(0.0F, -1.899999976158142F, 2.5999999046325684F);
        this.Tailfeathers1.addBox(-2.5F, -0.5F, -1.0F, 5, 10, 1, 0.0F);
        this.setRotateAngle(Tailfeathers1, 1.5707963267948966F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 12, 0);
        this.Head.setRotationPoint(0.0F, 0.20000000298023224F, -9.0F);
        this.Head.addBox(-2.5F, -2.5F, -4.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(Head, 0.9339256534473936F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 18, 45);
        this.Tailmiddle.setRotationPoint(0.0F, -0.699999988079071F, 11.0F);
        this.Tailmiddle.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 12, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.08482300397719036F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRenderer(this, 24, 15);
        this.Rightthigh.setRotationPoint(2.0F, 8.0F, 1.5F);
        this.Rightthigh.addBox(0.0F, -2.0F, -2.0F, 3, 8, 6, 0.0F);
        this.Shoulders = new AdvancedModelRenderer(this, 36, 40);
        this.Shoulders.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.Shoulders.addBox(-2.5F, -3.0F, -8.0F, 5, 8, 9, 0.0F);
        this.setRotateAngle(Shoulders, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjaw = new AdvancedModelRenderer(this, 10, 10);
        this.Upperjaw.setRotationPoint(0.0F, -0.699999988079071F, -3.5999999046325684F);
        this.Upperjaw.addBox(-1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Upperjaw, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailfeathers2 = new AdvancedModelRenderer(this, 38, 0);
        this.Tailfeathers2.setRotationPoint(0.0F, -0.10000000149011612F, 1.600000023841858F);
        this.Tailfeathers2.addBox(-2.5F, -0.5F, 0.0F, 5, 10, 1, 0.0F);
        this.setRotateAngle(Tailfeathers2, 1.5707963267948966F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRenderer(this, 20, 46);
        this.Rightlowerarm.setRotationPoint(0.5F, 4.5F, 0.0F);
        this.Rightlowerarm.addBox(-1.0F, -0.5F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.9339256534473936F, 0.12740903872453743F, 0.0F);
        this.Leftshin = new AdvancedModelRenderer(this, 0, 45);
        this.Leftshin.setRotationPoint(-1.5F, 4.0F, 2.0F);
        this.Leftshin.addBox(-1.0F, -1.0F, 0.0F, 2, 12, 3, 0.0F);
        this.setRotateAngle(Leftshin, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftupperarmfeathers = new AdvancedModelRenderer(this, 36, 36);
        this.Leftupperarmfeathers.setRotationPoint(-0.8999999761581421F, 1.5F, 0.0F);
        this.Leftupperarmfeathers.addBox(-0.5F, -2.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Leftupperarmfeathers, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailfeathers3 = new AdvancedModelRenderer(this, 50, 1);
        this.Tailfeathers3.setRotationPoint(0.0F, 0.10000000149011612F, 0.30000001192092896F);
        this.Tailfeathers3.addBox(-3.0F, -0.5F, 0.0F, 6, 17, 1, 0.0F);
        this.setRotateAngle(Tailfeathers3, 1.5283848206451123F, 0.0F, 0.0F);
        this.Rightfootclaw = new AdvancedModelRenderer(this, 0, 0);
        this.Rightfootclaw.setRotationPoint(-1.2000000476837158F, 0.5F, -0.5F);
        this.Rightfootclaw.addBox(-0.5F, -3.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Rightfootclaw, 1.273566776485551F, 0.33964105645913F, 0.0F);
        this.Leftthigh = new AdvancedModelRenderer(this, 24, 15);
        this.Leftthigh.setRotationPoint(-2.0F, 8.0F, 1.5F);
        this.Leftthigh.addBox(-3.0F, -2.0F, -2.0F, 3, 8, 6, 0.0F);
        this.Leftlowerarmfeathers = new AdvancedModelRenderer(this, 36, 36);
        this.Leftlowerarmfeathers.setRotationPoint(-0.10000000149011612F, 0.800000011920929F, 0.0F);
        this.Leftlowerarmfeathers.addBox(-0.5F, -2.5F, 0.0F, 1, 9, 3, 0.0F);
        this.setRotateAngle(Leftlowerarmfeathers, 0.12740903872453743F, 0.0F, 0.0F);
        this.Headquills = new AdvancedModelRenderer(this, 0, 12);
        this.Headquills.setRotationPoint(0.0F, -1.2999999523162842F, -0.5F);
        this.Headquills.addBox(-0.5F, -5.0F, -2.0F, 1, 5, 6, 0.0F);
        this.setRotateAngle(Headquills, -0.6368706733475028F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRenderer(this, 0, 25);
        this.Rightupperarm.setRotationPoint(2.0F, 3.5F, -6.5F);
        this.Rightupperarm.addBox(-0.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.9765117298066328F, 0.12740903872453743F, -0.12740903872453743F);
        this.Tailstart = new AdvancedModelRenderer(this, 30, 17);
        this.Tailstart.setRotationPoint(0.0F, 0.8999999761581421F, 5.0F);
        this.Tailstart.addBox(-2.0F, -3.0F, 0.0F, 4, 6, 12, 0.0F);
        this.setRotateAngle(Tailstart, 0.12740903872453743F, 0.0F, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 24);
        this.Body.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -4.5F, 6, 10, 11, 0.0F);
        this.setRotateAngle(Body, -0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 0, 6);
        this.Lowerjaw.setRotationPoint(0.0F, 1.399999976158142F, -3.200000047683716F);
        this.Lowerjaw.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.Rightlowerarmfeathers = new AdvancedModelRenderer(this, 36, 36);
        this.Rightlowerarmfeathers.setRotationPoint(0.10000000149011612F, 0.800000011920929F, 0.0F);
        this.Rightlowerarmfeathers.addBox(-0.5F, -2.5F, 0.0F, 1, 9, 3, 0.0F);
        this.setRotateAngle(Rightlowerarmfeathers, 0.12740903872453743F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 21, 1);
        this.Neck.setRotationPoint(0.0F, -0.4000000059604645F, -6.5F);
        this.Neck.addBox(-1.5F, -1.5F, -11.0F, 3, 3, 11, 0.0F);
        this.setRotateAngle(Neck, -0.7216936190680444F, 0.0F, 0.0F);
        this.Rightfoot = new AdvancedModelRenderer(this, 48, 57);
        this.Rightfoot.setRotationPoint(0.4000000059604645F, 10.0F, 0.5F);
        this.Rightfoot.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(Rightfoot, 0.12740903872453743F, 0.0F, 0.0F);
        this.Rightupperarmfeathers = new AdvancedModelRenderer(this, 36, 36);
        this.Rightupperarmfeathers.setRotationPoint(0.8999999761581421F, 1.5F, 0.0F);
        this.Rightupperarmfeathers.addBox(-0.5F, -2.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Rightupperarmfeathers, 0.04241150198859518F, 0.0F, 0.0F);
        this.Leftfootclaw = new AdvancedModelRenderer(this, 0, 0);
        this.Leftfootclaw.setRotationPoint(1.2000000476837158F, 0.5F, -0.5F);
        this.Leftfootclaw.addBox(-0.5F, -3.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Leftfootclaw, 1.273566776485551F, -0.33964105645913F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 47);
        this.Tailend.setRotationPoint(0.0F, -0.30000001192092896F, 11.0F);
        this.Tailend.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 14, 0.0F);
        this.setRotateAngle(Tailend, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRenderer(this, 0, 25);
        this.Leftupperarm.setRotationPoint(-2.0F, 3.5F, -6.5F);
        this.Leftupperarm.addBox(-1.5F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.9765117298066328F, -0.12740903872453743F, 0.12740903872453743F);
        this.Leftfoot = new AdvancedModelRenderer(this, 48, 57);
        this.Leftfoot.setRotationPoint(-0.4000000059604645F, 10.0F, 0.5F);
        this.Leftfoot.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(Leftfoot, 0.12740903872453743F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRenderer(this, 0, 45);
        this.Rightshin.setRotationPoint(1.5F, 4.0F, 2.0F);
        this.Rightshin.addBox(-1.0F, -1.0F, 0.0F, 2, 12, 3, 0.0F);
        this.setRotateAngle(Rightshin, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRenderer(this, 20, 46);
        this.Leftlowerarm.setRotationPoint(-0.5F, 4.5F, 0.0F);
        this.Leftlowerarm.addBox(-1.0F, -0.5F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.9339256534473936F, -0.12740903872453743F, 0.0F);
        this.Tailstart.addChild(this.Tailfeathers1);
        this.Neck.addChild(this.Head);
        this.Tailstart.addChild(this.Tailmiddle);
        this.Body.addChild(this.Shoulders);
        this.Head.addChild(this.Upperjaw);
        this.Tailmiddle.addChild(this.Tailfeathers2);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Leftthigh.addChild(this.Leftshin);
        this.Leftupperarm.addChild(this.Leftupperarmfeathers);
        this.Tailend.addChild(this.Tailfeathers3);
        this.Rightfoot.addChild(this.Rightfootclaw);
        this.Leftlowerarm.addChild(this.Leftlowerarmfeathers);
        this.Head.addChild(this.Headquills);
        this.Shoulders.addChild(this.Rightupperarm);
        this.Body.addChild(this.Tailstart);
        this.Head.addChild(this.Lowerjaw);
        this.Rightlowerarm.addChild(this.Rightlowerarmfeathers);
        this.Shoulders.addChild(this.Neck);
        this.Rightshin.addChild(this.Rightfoot);
        this.Rightupperarm.addChild(this.Rightupperarmfeathers);
        this.Leftfoot.addChild(this.Leftfootclaw);
        this.Tailmiddle.addChild(this.Tailend);
        this.Shoulders.addChild(this.Leftupperarm);
        this.Leftshin.addChild(this.Leftfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Rightthigh.render(f5);
        this.Leftthigh.render(f5);
        this.Body.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(prehistoric.SPEAK_ANIMATION);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, Lowerjaw, 20, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(prehistoric.ATTACK_ANIMATION);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, Neck, -41, 0, 0);
        ModelUtils.rotate(animator, Head, 57, 0, 0);
        ModelUtils.rotate(animator, Lowerjaw, 15, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, Neck, 6, 0, 0);
        ModelUtils.rotate(animator, Head, -14, 0, 0);
        ModelUtils.rotate(animator, Lowerjaw, 15, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {Tailstart, Tailmiddle, Tailend};
        AdvancedModelRenderer[] neckParts = {Neck, Head};
        AdvancedModelRenderer[] leftArmParts = {Leftupperarm, Leftlowerarm};
        AdvancedModelRenderer[] rightArmParts = {Rightupperarm, Rightlowerarm};
        if (((EntityPrehistoric) entity).isSkeleton() || ((EntityPrehistoric) entity).isAIDisabled()) {
            return;
        }
        ModelUtils.faceTargetMod(Neck, f3, f4, 0.5F);
        ModelUtils.faceTargetMod(Head, f3, f4, 0.5F);
        float speed = 0.1F;
        float speed2 = 0.5F;
        float degree = 0.45F;
        this.walk(Shoulders, speed, degree * 0.1F, false, 1F, 0F, f2, 1);
        this.bob(Body, speed, degree * 0.7F, false, f2, 1);
        this.walk(Leftthigh, speed2, 0.6F, false, 0F, 0.4F, f, f1);
        this.walk(Leftshin, speed2, 0.2F, false, 0F, -0.6F, f, f1);
        this.walk(Leftfoot, speed2, -0.6F, true, 2.5F, -0.4F, f, f1);
        this.walk(Rightthigh, speed2, 0.6F, true, 0F, -0.4F, f, f1);
        this.walk(Rightshin, speed2, 0.2F, true, 0F, 0.6F, f, f1);
        this.walk(Rightfoot, speed2, -0.6F, false, 2.5F, 0.4F, f, f1);
        this.chainWave(tailParts, speed, degree * 0.05F, -3, f2, 1);
        this.chainWave(leftArmParts, speed, degree * 0.12F, -1, f2, 1);
        this.chainWave(rightArmParts, speed, degree * 0.12F, -1, f2, 1);
        this.chainSwing(tailParts, speed, degree * 0.15F, -3, f2, 1);
        this.chainSwing(tailParts, speed2, degree * 0.25F, -3, f, f1);
        this.chainSwing(neckParts, speed2, degree * 0.5F, 3, f, f1);
        this.chainWave(neckParts, speed, degree * 0.15F, 3, f2, 1);
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sitProgress;
            sitAnimationRotationPrev(Rightupperarm, sitProgress, 0.8726646259971648F, 0.12740903539558604F, -0.7853981633974483F);
            sitAnimationRotationPrev(Tailfeathers2, sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightthigh, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Headquills, sitProgress, -0.6368706733475028F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailfeathers3, sitProgress, 1.5283848206451123F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightfootclaw, sitProgress, 1.273566776485551F, 0.33964105645913F, 0.0F);
            sitAnimationRotationPrev(Rightshin, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftshin, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightfoot, sitProgress, 1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightlowerarm, sitProgress, -0.9339256534473936F, 0.12740903872453743F, 0.0F);
            sitAnimationRotationPrev(Neck, sitProgress, -0.7216936190680444F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Body, sitProgress, -0.08482300164692443F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightupperarmfeathers, sitProgress, 0.04241150198859518F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftlowerarm, sitProgress, -0.9339256534473936F, -0.12740903872453743F, 0.0F);
            sitAnimationRotationPrev(Tailmiddle, sitProgress, -0.091106186954104F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailstart, sitProgress, -0.136659280431156F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightlowerarmfeathers, sitProgress, 0.12740903872453743F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftupperarmfeathers, sitProgress, 0.04241150198859518F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftfootclaw, sitProgress, 1.273566776485551F, -0.33964105645913F, 0.0F);
            sitAnimationRotationPrev(Leftlowerarmfeathers, sitProgress, 0.12740903872453743F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Upperjaw, sitProgress, 0.08482300397719036F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Lowerjaw, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailfeathers1, sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailend, sitProgress, 0.18203784098300857F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Head, sitProgress, 0.9339256534473936F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftupperarm, sitProgress, 0.8726646259971648F, -0.12740903539558604F, 0.7853981633974483F);
            sitAnimationRotationPrev(Leftfoot, sitProgress, 1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftthigh, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Shoulders, sitProgress, 0.04241150198859518F, 0.0F, 0.0F);
            sitAnimationPos(Body, sitProgress, 0, 7.5F, 0);
            sitAnimationPos(Leftthigh, sitProgress, 0, 7.5F, 0);
            sitAnimationPos(Rightthigh, sitProgress, 0, 7.5F, 0);
        }
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sleepProgress;
            sitAnimationRotationPrev(Body, sitProgress, -0.08482300164692443F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftfoot, sitProgress, 1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftthigh, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailstart, sitProgress, -0.136659280431156F, 0.3269899983466666F, 0.0F);
            sitAnimationRotationPrev(Rightlowerarm, sitProgress, -0.9339256534473936F, 0.12740903872453743F, 0.0F);
            sitAnimationRotationPrev(Leftlowerarm, sitProgress, -0.9339256534473936F, -0.12740903872453743F, 0.0F);
            sitAnimationRotationPrev(Lowerjaw, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftupperarm, sitProgress, 0.8726646259971648F, -0.12740903539558604F, 0.7853981633974483F);
            sitAnimationRotationPrev(Rightupperarmfeathers, sitProgress, 0.04241150198859518F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightupperarm, sitProgress, 0.8726646259971648F, 0.12740903539558604F, -0.7853981633974483F);
            sitAnimationRotationPrev(Rightfootclaw, sitProgress, 1.273566776485551F, 0.33964105645913F, 0.0F);
            sitAnimationRotationPrev(Leftshin, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Head, sitProgress, -1.1383037381507017F, -0.5918411493512771F, 1.0471975511965976F);
            sitAnimationRotationPrev(Rightlowerarmfeathers, sitProgress, 0.12740903872453743F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftlowerarmfeathers, sitProgress, 0.12740903872453743F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Tailmiddle, sitProgress, -0.2834532448050846F, 0.9040311718996077F, 0.0F);
            sitAnimationRotationPrev(Neck, sitProgress, 0.5670574739729577F, -0.36425021489121656F, 0.0F);
            sitAnimationRotationPrev(Rightshin, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Headquills, sitProgress, -0.6368706733475028F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Leftupperarmfeathers, sitProgress, 0.04241150198859518F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightfoot, sitProgress, 1.3962634015954636F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Rightthigh, sitProgress, 0.0F, 0.0F, 0.0F);
            sitAnimationRotationPrev(Shoulders, sitProgress, 0.36425021489121656F, -0.6373942428283291F, 0.0F);
            sitAnimationRotationPrev(Leftfootclaw, sitProgress, 1.273566776485551F, -0.33964105645913F, 0.0F);
            sitAnimationRotationPrev(Tailend, sitProgress, 0.27314402793711257F, 0.46163958715250014F, 0.18203784098300857F);
            sitAnimationRotationPrev(Upperjaw, sitProgress, 0.08482300397719036F, 0.0F, 0.0F);
            sitAnimationPos(Body, sitProgress, 0, 7.5F, 0);
            sitAnimationPos(Leftthigh, sitProgress, 0, 7.5F, 0);
            sitAnimationPos(Rightthigh, sitProgress, 0, 7.5F, 0);
        }
    }
}