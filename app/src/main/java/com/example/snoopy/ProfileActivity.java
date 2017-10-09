package com.example.snoopy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private TextView textViewUserEmail;
    private Button buttonLogout;
    private Button buttonContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() == null){
            //user is not logged in
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }
        //if the user has logged in, the code will bypass the If condition
        FirebaseUser user = firebaseAuth.getCurrentUser();


        textViewUserEmail = (TextView) findViewById(R.id.textViewUserEmail);
        textViewUserEmail.setText("Welcome "+user.getEmail());

        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        buttonContent = (Button) findViewById(R.id.buttonContent);

        buttonLogout.setOnClickListener(this);
        buttonContent.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == buttonLogout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }

        if (view == buttonContent){
            startActivity(new Intent(this, StorageActivity.class));
        }

    }
}
