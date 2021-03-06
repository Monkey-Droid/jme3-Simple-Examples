package com.jme3.hellojmesurfaceview;

import android.app.Application;
import android.widget.Toast;

import com.jme3.app.LegacyApplication;
import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetKey;
import com.jme3.input.CameraInput;
import com.jme3.input.ChaseCamera;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;
import com.simsilica.lemur.Button;
import com.simsilica.lemur.Command;
import com.simsilica.lemur.Container;
import com.simsilica.lemur.GuiGlobals;
import com.simsilica.lemur.Label;
import com.simsilica.lemur.style.BaseStyles;

/**
 * <b>Your Actual Jme Game class.</b>
 * <br>
 * To use it inside Android :
 * <ol>
 * <li>Create an instance of it inside the #{@link MainActivity}</li>
 * <li>Set that instance using #{@link com.jme3.view.surfaceview.JmeSurfaceView#setLegacyApplication(LegacyApplication)}</li>
 * <li>Start the game using #{@link com.jme3.view.surfaceview.JmeSurfaceView#startRenderer(int)}</li>
 * </ol>
 *
 * @author pavl_g
 */
public final class MyGame extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);
        final Sphere mySphere = new Sphere(10, 50, 50);
        final Geometry geometry = new Geometry("ball", mySphere);
        geometry.setLocalScale(0.05f);
        final Material material = new Material(assetManager.loadAsset(new AssetKey<>("Common/MatDefs/Misc/Unshaded.j3md")));
        material.setColor("Color", ColorRGBA.randomColor().mult(2f));
        geometry.setMaterial(material);
        rootNode.attachChild(geometry);
    }
}
