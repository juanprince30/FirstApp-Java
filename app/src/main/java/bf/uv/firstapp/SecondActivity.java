package bf.uv.firstapp;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
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

        Button btn = findViewById(R.id.button);
        RadioButton color_verte = findViewById(R.id.radioButton1);
        RadioButton color_rouge = findViewById(R.id.radioButton2);
        RadioButton color_bleu = findViewById(R.id.radioButton3);
        btn.setOnClickListener(v -> {
            String color="" ;
            if(color_verte.isChecked()){
                color=color+" "+ "vert";
            }
            if(color_rouge.isChecked()){
                color=color+" "+ "rouge";
            }
            if(color_bleu.isChecked()){
                color=color+" "+ "bleu";
            }

            Log.d(TAG,"Boutton clicker dans lapp");
            Intent intent=new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("color", color);
            startActivity(intent);
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