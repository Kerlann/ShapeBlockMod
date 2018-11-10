package fr.kerlann.tmt;

import net.minecraft.entity.Entity;

public class ModelBase extends Model<Object>
{
    public ModelRendererTurbo[] base = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] open = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] closed = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r1 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r2 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r3 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r4 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r5 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r6 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r7 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r8 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r9 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] r0 = new ModelRendererTurbo[0];

    public void render()
    {
        render(this.base);
        render(this.open);
        render(this.closed);
        render(this.r0);
        render(this.r1);
        render(this.r2);
        render(this.r3);
        render(this.r4);
        render(this.r5);
        render(this.r6);
        render(this.r7);
        render(this.r8);
        render(this.r9);
    }

    public void render(Object type, Entity ent)
    {
        render();
    }

    public void translateAll(float x, float y, float z)
    {
        translate(this.base, x, y, z);
        translate(this.open, x, y, z);
        translate(this.closed, x, y, z);
        translate(this.r0, x, y, z);
        translate(this.r1, x, y, z);
        translate(this.r2, x, y, z);
        translate(this.r3, x, y, z);
        translate(this.r4, x, y, z);
        translate(this.r5, x, y, z);
        translate(this.r6, x, y, z);
        translate(this.r7, x, y, z);
        translate(this.r8, x, y, z);
        translate(this.r9, x, y, z);
    }

    public void rotateAll(float x, float y, float z)
    {
        rotate(this.base, x, y, z);
        rotate(this.open, x, y, z);
        rotate(this.closed, x, y, z);
        rotate(this.r0, x, y, z);
        rotate(this.r1, x, y, z);
        rotate(this.r2, x, y, z);
        rotate(this.r3, x, y, z);
        rotate(this.r4, x, y, z);
        rotate(this.r5, x, y, z);
        rotate(this.r6, x, y, z);
        rotate(this.r7, x, y, z);
        rotate(this.r8, x, y, z);
        rotate(this.r9, x, y, z);
    }
}
