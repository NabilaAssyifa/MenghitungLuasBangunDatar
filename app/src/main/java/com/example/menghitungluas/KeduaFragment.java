package com.example.menghitungluas;

import static java.lang.String.format;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KeduaFragment extends Fragment {
    private EditText txt_panjang,txt_lebar;
    private Button btnHasil;
    private TextView hasil;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kedua,container,false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                int panjang = Integer.parseInt(nilai1);
                int lebar = Integer.parseInt(nilai2);

                int keliling = 2 * (panjang + lebar);

                hasil.setText("Keliling Persegi Panjang: " + keliling);
                }
            });
        return v;
    }
}