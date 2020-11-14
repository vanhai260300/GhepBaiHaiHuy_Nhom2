package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.foody.R;


public class vi_voucher extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_voucher);

        imageButton = (ImageButton) findViewById(R.id.bt_vi);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();

            }
        });

    }

    public void openMainActivity(){
        Intent intent = new Intent(this, AccountFragment.class);
        startActivity(intent);
    }
}