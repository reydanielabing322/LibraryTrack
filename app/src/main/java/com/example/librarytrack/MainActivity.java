package com.example.librarytrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    Button BorrowBtn;
    EditText bookCode, daysBorrowed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       bookCode = findViewById(R.id.bookCode);
       daysBorrowed = findViewById(R.id.daysBorrowed);
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        BorrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}