package bf.uv.firstapp;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG= "Etapes actuelle";
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        String texteExistant = textView.getText().toString();

        String texteRecu = getIntent().getStringExtra("username");

        textView.setText(texteExistant +" "+ texteRecu+ " !");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart appelle par lapp");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume appelle par lapp");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop appelle par lapp");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause appelle par lapp");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy appelle par lapp");
    }
}