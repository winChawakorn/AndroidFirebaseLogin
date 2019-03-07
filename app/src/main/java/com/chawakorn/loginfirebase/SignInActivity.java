package com.chawakorn.loginfirebase;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mAuth = FirebaseAuth.getInstance();
        user = findViewById(R.id.user);
        user.setText("Welcome " + mAuth.getCurrentUser().getEmail());
    }

    public void logout(View view) {
        mAuth.signOut();
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
