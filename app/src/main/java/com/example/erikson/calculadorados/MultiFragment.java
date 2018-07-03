package com.example.erikson.calculadorados;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiFragment extends Fragment implements View.OnClickListener {
    private View ROOT;
    EditText numero1, numero2;
    Button suma;
    TextView resultado;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ROOT = inflater.inflate(R.layout.multi_fragment, container, false);
        sumar();
        return ROOT;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void sumar() {
        numero1 = (EditText)ROOT.findViewById(R.id.numm1);
        numero2 = (EditText)ROOT.findViewById(R.id.numm2);
        suma = (Button)ROOT.findViewById(R.id.multi);
        resultado = (TextView)ROOT.findViewById(R.id.resulM);
        suma.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        double entero1 = Integer.parseInt(n1);
        double entero2 = Integer.parseInt(n2);

        double rta = 0;

        switch (view.getId()){
            case R.id.multi:
                rta = entero1*entero2;
                break;
        }
        resultado.setText("" + rta);
    }
}
