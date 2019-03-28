package com.chawakorn.loginfirebase;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mAuth = FirebaseAuth.getInstance();
        info = findViewById(R.id.info);

        if (mAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        FirebaseUser user = mAuth.getCurrentUser();
        if(user != null) {
            info.setText("Welcome " + user.getEmail());
        }
    }

    public void logout(View view) {
        mAuth.signOut();
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }

    public void newPost(View view) {
        startActivity(new Intent(this, NewPost.class));
    }

    public void viewPosts(View view) {
        startActivity(new Intent(this, ViewPosts.class));
    }

    public void location(View view) {
        startActivity(new Intent(getApplicationContext(), ViewLocation.class));
    }
}
