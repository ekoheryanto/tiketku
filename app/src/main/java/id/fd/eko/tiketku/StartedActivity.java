package id.fd.eko.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartedActivity extends AppCompatActivity {
    Button btnlogin;
    Button btn_newakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);
        btn_newakun =findViewById(R.id.btn_new_akun);
        btn_newakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistone = new Intent(StartedActivity.this, RegisoneActivity.class);
                startActivity(gotoregistone);
            }
        });

        btnlogin = findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent klik = new Intent(StartedActivity.this, SigninActivity.class);
                startActivity(klik);
            }
        });


    }
}
