package fr.kerlann.model;


import fr.kerlann.tmt.ModelBlock;
import fr.kerlann.tmt.ModelRendererTurbo;

public class ModelShape extends ModelBlock
{
    int textureX = 4096;
    int textureY = 4096;

    public ModelShape() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[1];
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4

        bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 10F, 0F, 10F, 20F, 0F, 10F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 10F, 0F, 0F, 10F); // Box 4
        bodyModel[0].setRotationPoint(0F, 0F, 0F);



        translateAll(0F, 0F, 0F);


        flipAll();
    }

}