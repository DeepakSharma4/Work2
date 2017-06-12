package com.example.hp.work2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by hp on 6/11/2017.
 */

public class frag1 extends Fragment implements View.OnClickListener {
    private Button btn;
    private EditText edt;
    private String x;
    private TextView txt;
    communcation cc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  return super.onCreateView(inflater, container, savedInstanceState);
        //  return inflater.inflate(R.layout.frag1, container, false);
        View view = inflater.inflate(R.layout.frag1, container, false);


        btn = (Button) view.findViewById(R.id.btn1);
        edt = (EditText) view.findViewById(R.id.edt);
        txt = (TextView) view.findViewById(R.id.txt1);

        btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        x = edt.getText().toString().trim();
        cc = (communcation) getActivity();
        cc.funone(x);
    }

    public void fun4(String z){
        txt.setText(z);
    }

/*Bundle bb=new Bundle();
        bb.putString("key",x);

        // txt.setText(x);*/

}
