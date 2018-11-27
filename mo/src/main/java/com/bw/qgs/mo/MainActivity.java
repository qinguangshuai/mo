package com.bw.qgs.mo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.qzs.android.fuzzybackgroundlibrary.Fuzzy_Background;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mo);
                Bitmap blur = Fuzzy_Background.with(getApplication())
                        .bitmap(bitmap)
                        .radius(5)
                        .blur();
                image.setImageBitmap(blur);
            }
        });
    }
}
