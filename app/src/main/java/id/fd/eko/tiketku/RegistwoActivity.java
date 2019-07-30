package id.fd.eko.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegistwoActivity extends AppCompatActivity {

    Button btn_continue;
    LinearLayout btn_backto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registwo);

        btn_continue = findViewById(R.id.btn_lanjut);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanjut = new Intent(RegistwoActivity.this, SuccesRegistration.class);
                startActivity(lanjut);
            }
        });
        btn_backto = findViewById(R.id.btn_backto);
        btn_backto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backto = new Intent(RegistwoActivity.this, RegisoneActivity.class);
                startActivity(backto);
            }
        });
    }
}
