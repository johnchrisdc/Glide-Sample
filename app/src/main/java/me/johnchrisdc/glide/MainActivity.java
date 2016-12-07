package me.johnchrisdc.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        String url = "https://raw.githubusercontent.com/bumptech/glide/master/static/glide_logo.png";

        Glide
                .with(this)
                .load(url)
                .into(imageView);

    }
}
