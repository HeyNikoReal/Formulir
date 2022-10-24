package com.mdp.formulir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_daftar;
    private EditText etnama, etnpm;
    private RadioGroup rgjk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_daftar = findViewById(R.id.btn_daftar);
        etnama = findViewById(R.id.et_Nama);
        etnpm = findViewById(R.id.et_npm);
        rgjk = findViewById(R.id.rg_jk);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = etnama.getText().toString();
                String npm = etnpm.getText().toString();

                if (npm.trim().equals("")) {
                    etnpm.setError("NPM Harus Di Isi");
                } else if (nama.trim().equals("")) {
                    etnama.setError("Nama Harus Di Isi");
                } else {
                    Toast.makeText(MainActivity.this,
                            "Anda Berhasil Terdaftar", Toast.LENGTH_LONG).show();

                    etnama.setText("");
                    etnpm.setText("");
                    rgjk.check(R.id.br_laki);
                }
            }
        });
    }
}