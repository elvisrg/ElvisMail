package ElvisMail.elvis.elvismail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button registrar;
    Button Consultar;

    EditText etnombre, etcorreo, etelefono, etciudad, etedad, etestado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrar = findViewById(R.id.registrar);
        Consultar = findViewById(R.id.consultar);

        etnombre=(EditText) findViewById(R.id.etnombre);
        etcorreo=(EditText) findViewById(R.id.etcorreo);
        etelefono=(EditText) findViewById(R.id.etelefono);
        etciudad=(EditText) findViewById(R.id.etciudad);
        etedad=(EditText) findViewById(R.id.etedad);
        etestado=(EditText) findViewById(R.id.etestado);
        registrar=(Button) findViewById(R.id.registrar);
        Consultar=(Button) findViewById(R.id.consultar);


        final ElvisMailBD elvisMailBD=new ElvisMailBD(getApplicationContext());

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                elvisMailBD.agregarDatos(etnombre.getText().toString(),etcorreo.getText().toString(), etelefono.getText().toString(), etciudad.getText().toString(), etedad.getText().toString(), etestado.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

        Consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elvisMail=new Intent(getApplicationContext(), CorreoUsuario.class);
                startActivity(elvisMail);

            }
        });



    }
}