package id.fd.eko.tiketku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisoneActivity extends AppCompatActivity {
    LinearLayout btn_back;
    Button btn_lanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisone);

        btn_lanjut=findViewById(R.id.btn_lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanjut = new Intent(RegisoneActivity.this, RegistwoActivity.class);
                startActivity(lanjut);
            }
        });

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(RegisoneActivity.this, SigninActivity.class);
                startActivity(kembali);
            }
        });
    }
}
