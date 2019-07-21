package id.fd.eko.tiketku;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView applogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        applogo=(ImageView)findViewById(R.id.applogo);

        //handle waktu otomatis splash screen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent logo= new Intent(SplashActivity.this, StartedActivity.class);
                startActivity(logo);
                finish();
            }
        },2000);
    }
}
