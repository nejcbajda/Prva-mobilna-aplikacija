package com.example.prva;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnLogin = findViewById(R.id.btnLogin);
        FloatingActionButton fab = findViewById(R.id.fab);

        btnLogin.setOnClickListener(v ->
                Toast.makeText(this, "My first Android Studio application!",
                        Toast.LENGTH_SHORT).show());

        fab.setOnClickListener(v -> showCustomSnackbar(v));
    }

    private void showCustomSnackbar(android.view.View anchor) {
        Snackbar sb = Snackbar.make(anchor, "Just another option for button.",
                Snackbar.LENGTH_SHORT);
        sb.setAnimationMode(Snackbar.ANIMATION_MODE_FADE);

        android.view.View sbView = sb.getView();
        float d = getResources().getDisplayMetrics().density;

        // okrogla svetla oblika
        android.graphics.drawable.GradientDrawable bg =
                new android.graphics.drawable.GradientDrawable();
        bg.setColor(android.graphics.Color.parseColor("#EEEEEE"));
        bg.setCornerRadius(100 * d);
        sbView.setBackground(bg);
        sb.setBackgroundTint(android.graphics.Color.parseColor("#EEEEEE"));
        sb.setTextColor(android.graphics.Color.parseColor("#212121"));
        sbView.setElevation(6 * d);
        sbView.setPadding((int) (12 * d), (int) (4 * d), (int) (16 * d), (int) (4 * d));

        android.widget.FrameLayout.LayoutParams p =
                (android.widget.FrameLayout.LayoutParams) sbView.getLayoutParams();
        p.gravity = android.view.Gravity.CENTER;
        p.width = android.widget.FrameLayout.LayoutParams.WRAP_CONTENT;
        p.setMargins(0, 0, 0, 0);
        sbView.setLayoutParams(p);

        android.widget.TextView tv = sbView.findViewById(
                com.google.android.material.R.id.snackbar_text);
        tv.setTextSize(14);
        tv.setGravity(android.view.Gravity.CENTER_VERTICAL);

        android.graphics.drawable.Drawable icon =
                getApplicationInfo().loadIcon(getPackageManager());
        int size = (int) (24 * d);
        icon.setBounds(0, 0, size, size);
        tv.setCompoundDrawablesRelative(icon, null, null, null);
        tv.setCompoundDrawablePadding((int) (12 * d));

        sb.show();
    }
}