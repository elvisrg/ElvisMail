package ElvisMail.elvis.elvismail;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TMainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCorreo;
    private RecyclerViewAdaptador adaptadorCorreo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCorreo=(RecyclerView) findViewById(R.id.recvclercanCant);
        recyclerViewCorreo.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCorreo=new RecyclerViewAdaptador(obtenerUsuarios());
        recyclerViewCorreo.setAdapter(adaptadorCorreo);
    }

    public List<CorreoUsuario> obtenerUsuarios (){
        List<CorreoUsuario> usuarios=new ArrayList<>();
        usuarios.add(new CorreoUsuario("Elvis González", "3053286512", "Maracaibo", R.drawable.e));
        usuarios.add(new CorreoUsuario("Ana Perez", "3053788900", "Merida", R.drawable.carta));
        usuarios.add(new CorreoUsuario("José Ramirez", "3189657899", "Bogotá", R.drawable.j));
        usuarios.add(new CorreoUsuario("Maria de la Hoz", "3123542345", "Medellin", R.drawable.m));
        usuarios.add(new CorreoUsuario("Zara Jaramillo", "3046775566", "Santa Marta", R.drawable.z));

        return usuarios;
    }

}