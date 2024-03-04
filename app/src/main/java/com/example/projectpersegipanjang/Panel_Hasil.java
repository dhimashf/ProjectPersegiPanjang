package com.example.projectpersegipanjang;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
//pada activity_panel_hasil menggunakan android:editable="false"
//agar pada panel_hasil, hasil dari perkalian tidak dapat di edit user

public class Panel_Hasil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel_hasil);

        // Mengambil nilai panjang, lebar, luas, dan keliling dari intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double panjang = extras.getDouble("panjang", 0.0);
            double lebar = extras.getDouble("lebar", 0.0);
            double luas = extras.getDouble("luas", 0.0);
            double keliling = extras.getDouble("keliling", 0.0);

            // Menampilkan nilai panjang, lebar, luas, dan keliling pada TextView
            TextView textViewPanjang = findViewById(R.id.editTextPanjang);
            TextView textViewLebar = findViewById(R.id.editTextLebar);
            TextView textViewLuas = findViewById(R.id.editTextLuas);
            TextView textViewKeliling = findViewById(R.id.editTextKeliling);

            textViewPanjang.setText(String.valueOf(panjang));
            textViewLebar.setText(String.valueOf(lebar));
            textViewLuas.setText(String.valueOf(luas));
            textViewKeliling.setText(String.valueOf(keliling));
        }
    }
}
