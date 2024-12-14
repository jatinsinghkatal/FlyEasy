package com.uilover.project1992.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.uilover.project1992.R;
import com.uilover.project1992.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    private ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get Started button listener to navigate to SignUpActivity
        binding.startBtn.setOnClickListener(v -> {
            Intent intent = new Intent(IntroActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        // If user already has an account, go to SignInActivity
        binding.button2.setOnClickListener(v -> {
            Intent intent = new Intent(IntroActivity.this, SignInActivity.class);
            startActivity(intent);
        });
    }
}
