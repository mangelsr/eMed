package ec.edu.fiec.emed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText txtUsername, txtPassword;
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias a los controles
        txtUsername =  findViewById(R.id.txtUsername);
        txtPassword =  findViewById(R.id.txtPassword);
        btnLogin =  findViewById(R.id.btnLogin);
        btnRegistro =  findViewById(R.id.btnRegister);

    }

    public void login(View view) {
        Toast.makeText(getApplicationContext(), R.string.toastMsg, Toast.LENGTH_SHORT).show();
    }

    public void regster(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnRegister) {
        }
    }

}
