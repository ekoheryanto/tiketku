package id.fd.eko.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {
    TextView new_akun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        new_akun = findViewById(R.id.new_akun);
        new_akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistone = new Intent(SigninActivity.this, RegisoneActivity.class);
                startActivity(gotoregistone);
            }
        });
    }
}
