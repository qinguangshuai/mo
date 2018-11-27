package com.bw.qgs.fresco;

import android.app.Application;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

import java.io.File;

/**
 * date:2018/11/27    14:45
 * author:秦广帅(Lenovo)
 * fileName:App
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this,ImagePipelineConfig.newBuilder(App.this)
                .setMainDiskCacheConfig(
                        DiskCacheConfig.newBuilder(this)
                                .setBaseDirectoryPath(new File("xysdk"))
                        .build()
                )
                .build());
    }
}
