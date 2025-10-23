package mx.edu.tesoem.isc.tsdmh_7s21_252_p2e1_csaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Preguntas extends AppCompatActivity {

    RadioButton p2p1r1,p2p1r2,p2p1r3;
    Button p2btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_preguntas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        p2p1r1 = findViewById(R.id.p2p1r1);
        p2p1r2 = findViewById(R.id.p2p1r2);
        p2p1r3 = findViewById(R.id.p2p1r3);
        p2btn1 = findViewById(R.id.p2btn1);

        p2p1r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p2p1r1.isChecked())
                    Toast.makeText(Preguntas.this, "Selecciona hombre", Toast.LENGTH_SHORT).show();
            }
        });
    }
        public void verificarespuesta(View v) {
            if (v.getId() == R.id.p2p1r2) {
                Toast.makeText(this, "Seleccionaste Mujer", Toast.LENGTH_SHORT).show();
            } else if (v.getId() == R.id.p2p1r3) {
                Toast.makeText(this, "No definido", Toast.LENGTH_SHORT).show();
            } else if (v.getId() == R.id.p2btn1) {
                Intent intent = new Intent(this, desplaza.class);
                startActivity(intent);
                finish();

            }

            }
        }



