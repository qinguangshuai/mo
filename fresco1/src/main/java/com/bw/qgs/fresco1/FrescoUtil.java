package com.bw.qgs.fresco1;

/**
 * date:2018/11/27    18:42
 * author:秦广帅(Lenovo)
 * fileName:FrescoUtil
 */

import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class FrescoUtil {
    /**
     * 基础加载图片
     *
     * @param url              图片路径
     * @param simpleDraweeview 控件
     */
    public void setTu(String url, SimpleDraweeView simpleDraweeview) {
        Uri uri = Uri.parse(url);
        simpleDraweeview.setImageURI(uri);
    }

    /**
     * 渐进式加载图片
     *
     * @param url              图片路径
     * @param simpleDraweeview 控件
     */
    public void setJianjin(String url, SimpleDraweeView simpleDraweeview) {
        Uri uri = Uri.parse(url);
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                .setProgressiveRenderingEnabled(true)
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setOldController(simpleDraweeview.getController())
                .build();
    }

    /**
     * 圆角图片
     *
     * @param url              图片路径
     * @param simpleDraweeview 控件
     * @param radius           角度
     * @param color            描边线颜色
     * @param width            描边线宽度
     */
    public void setyanjiao(String url, SimpleDraweeView simpleDraweeview, float radius, int color, float width) {
        Uri uri = Uri.parse(url);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(0f);
        if (width > 0f) {
            roundingParams.setBorder(color, width);
        }
        roundingParams.setCornersRadius(radius);
        simpleDraweeview.getHierarchy().setRoundingParams(roundingParams);
        simpleDraweeview.setImageURI(uri);
    }

    /**
     * 圆角图片
     * 可控四角角度
     * @param url 图片路径
     * @param simpleDraweeView 控件
     * @param topLeft 左上角
     * @param topRight 右上角
     * @param bottomRight 右下角
     * @param bottomLeft 左下角
     * @param color 描边线颜色
     * @param width 描边线宽度
     */
    public void setYuanjiao(String url,SimpleDraweeView simpleDraweeView,float topLeft, float topRight, float bottomRight, float bottomLeft,int color,float width){
        Uri uri = Uri.parse(url);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(0f);
        if (width > 0f) {
            roundingParams.setBorder(color, width);
        }
        roundingParams.setCornersRadii(topLeft,topRight,bottomRight,bottomLeft);
        simpleDraweeView.getHierarchy().setRoundingParams(roundingParams);
        simpleDraweeView.setImageURI(uri);
    }

    /**
     * 圆形图片
     * @param url 图片路径
     * @param simpleDraweeView 控件
     * @param color 描边线颜色
     * @param width 描边线宽度
     * */
    public void setYuanQuan(String url,SimpleDraweeView simpleDraweeView,int color,float width){
        if(url==null){
            simpleDraweeView.setImageURI(url);
            return;
        }
        Uri uri = Uri.parse(url);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(0f);
        if(width>0f){
            roundingParams.setBorder(color,width);
        }
        roundingParams.setRoundAsCircle(true);
        simpleDraweeView.getHierarchy().setRoundingParams(roundingParams);
        simpleDraweeView.setImageURI(uri);
    }

    /**
     * Gif动态图片
     * @param url 图片路径
     * @param simpleDraweeView 控件
     * */
    public void setDongTai(String url,SimpleDraweeView simpleDraweeView){
        Uri uri = Uri.parse(url);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .setAutoPlayAnimations(true)
                .setOldController(simpleDraweeView.getController())
                .build();
        simpleDraweeView.setController(controller);
    }
}
