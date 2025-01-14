package com.particlesdevs.photoncamera.pro;

import com.particlesdevs.photoncamera.processing.render.NoiseModeler;

//Device current sensor specific
public class SpecificSettingSensor {
    public int id = 0;
    public boolean isRawColorCorrection = false;
    public float[] blackLevel;
    public float captureSharpeningS = 1.05f;
    public float captureSharpeningIntense = 0.5f;
    public float[] aberrationCorrection;
    public float[][] CCT;
    //Noise model [A,B,C,D][bayer]
    public double[][] NoiseModelerArr;
    public boolean ModelerExists = false;
    public boolean CCTExists = false;
    public SpecificSettingSensor(){
        NoiseModelerArr = new double[4][4];
        CCT = new float[3][3];
        aberrationCorrection = new float[8];
    }
}
