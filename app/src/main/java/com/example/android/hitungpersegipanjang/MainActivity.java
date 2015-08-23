package com.example.android.hitungpersegipanjang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int panjang = 0;
    int lebar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * untuk menghitung luas
     * */
    private int hitungPanjang(){
        EditText panjang = (EditText) findViewById(R.id.editText1);
        int panjangSisi = Integer.parseInt(String.valueOf(panjang.getText()));
        return panjangSisi;
    }

    /**
     * untuk menghitung keliling
     * */
    private int hitungLebar(){
        EditText lebar = (EditText) findViewById(R.id.editText2);
        int lebarSisi = Integer.parseInt(String.valueOf(lebar.getText()));
        return lebarSisi;
    }

    /**
     * Menghitung luas dan keliling
     * */

    public void hitungPersegiPanjang(View view){
        int luas = hitungPanjang() * hitungLebar();
        int keliling = 2 * (hitungPanjang() + hitungLebar());
        String priceSummary = "Luas: " + luas +"\nKeliling: "+ keliling;
        displayHasil(priceSummary);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayHasil(String number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.hasil_perhitungan);
        quantityTextView.setText("" + number);
    }
}
