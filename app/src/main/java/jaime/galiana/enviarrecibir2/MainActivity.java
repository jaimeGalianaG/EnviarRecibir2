package jaime.galiana.enviarrecibir2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import jaime.galiana.enviarrecibir2.Modelos.Coche;

public class MainActivity extends AppCompatActivity {
    private Button btnCrearCoche;
    private Button btnCrearMoto;
    private Button btnCrearBici;
    private TextView lbCantidadCoches;
    private TextView lbCantidadMotos;
    private TextView lbCantidadBicis;

    //atributos para los launchers
    private ActivityResultLauncher<Intent> launcherCoches;
    private ActivityResultLauncher<Intent> launcherMotos;
    private ActivityResultLauncher<Intent> launcherBicis;

    //ATRIBUTOS PARA LA LOGICA
    private ArrayList<Coche> listaCoches;
    private ArrayList<Coche> listaMotos;
    private ArrayList<Coche> listaBicis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariables();
    }

    private void inicializarVariables() {
        btnCrearCoche.findViewById(R.id.btnCrearCocheMain);
        btnCrearMoto.findViewById(R.id.btnCrearMotoMain);
        btnCrearBici.findViewById(R.id.btnCraerBiciMain);

        lbCantidadCoches.findViewById(R.id.lbCantidadCochesMain);
        lbCantidadMotos.findViewById(R.id.lbCantidadMotosMain);
        lbCantidadBicis.findViewById(R.id.lbCantidadBicisMain);

        //inicializar logica
        listaCoches = new ArrayList<>();
        listaMotos = new ArrayList<>();
        listaBicis = new ArrayList<>();

    }
}