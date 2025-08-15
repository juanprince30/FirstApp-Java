package bf.uv.firstapp;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String TAG= "Etapes actuelle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreated appelle par lapp");
        Button btn = findViewById(R.id.buttonStart);
        EditText edtx = findViewById(R.id.editTextText);
        btn.setOnClickListener(v -> {
            String nom = edtx.getText().toString().trim();

            Log.d(TAG,"Boutton clicker dans lapp");
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("username", nom);
            startActivity(intent);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
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