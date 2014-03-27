package com.example.cameraexample;

import java.io.IOException;

import android.content.Context;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;

public class MyGLSurfaceView extends GLSurfaceView {
	public MyGLSurfaceView ( Context context ) {
		super ( context ) ;
		setEGLConfigChooser( 8, 8, 8, 8, 16, 0 );
	    getHolder().setFormat( PixelFormat.TRANSLUCENT );
		setRenderer ( new GLClearRenderer () ) ;
		//setEGLContextClientVersion (2) ;
	}
	
    public void surfaceCreated( SurfaceHolder holder ) {
    	super.surfaceCreated(holder);
        // Once the surface is created, simply open a handle to the camera hardware.
    }
 
    public void surfaceChanged( SurfaceHolder holder, int format, int width, int height ) {
        // This method is called when the surface changes, e.g. when it's size is set.
    	super.surfaceChanged(holder, format, width, height);
    }
 
    public void surfaceDestroyed( SurfaceHolder holder ) {
        // Once the surface gets destroyed, we stop the preview mode and release
    	super.surfaceDestroyed(holder);
     }

}
