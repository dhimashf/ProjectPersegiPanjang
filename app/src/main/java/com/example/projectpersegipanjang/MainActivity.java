package com.example.projectpersegipanjang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPanjang, editTextLebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi view
        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
    }

    public void Hitung(View view) {
        // Ambil nilai panjang dan lebar dari EditText
        String panjangString = editTextPanjang.getText().toString();
        String lebarString = editTextLebar.getText().toString();

        // Validasi input
        if (panjangString.isEmpty() && lebarString.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai panjang dan lebar", Toast.LENGTH_SHORT).show();
            return;
        } else if (panjangString.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai panjang", Toast.LENGTH_SHORT).show();
            return;
        } else if (lebarString.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai lebar", Toast.LENGTH_SHORT).show();
            return;
        }

        // Konversi nilai panjang dan lebar ke tipe data double
        double panjang = Double.parseDouble(panjangString);
        double lebar = Double.parseDouble(lebarString);

        // Hitung luas dan keliling
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Buat intent untuk berpindah ke Panel_Hasil dan kirimkan nilai panjang, lebar, luas, dan keliling
        Intent intent = new Intent(this, Panel_Hasil.class);
        intent.putExtra("panjang", panjang);
        intent.putExtra("lebar", lebar);
        intent.putExtra("luas", luas);
        intent.putExtra("keliling", keliling);
        startActivity(intent);
    }
}
