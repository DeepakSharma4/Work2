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

public class frag2 extends Fragment implements View.OnClickListener {
    private TextView txt;
    private String y;
    //Back data
    private EditText edt1;
    private Button btn1;
    //
    private String z;
    //
    communcation cc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //    return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.frag2, container, false);
        txt = (TextView) view.findViewById(R.id.txtvew1);

        edt1 = (EditText) view.findViewById(R.id.edtfrg2);
        btn1 = (Button) view.findViewById(R.id.btnfrg2);

        btn1.setOnClickListener(this);
        //  show();

        return view;
    }

  /*  public void show() {

        Bundle bb = new Bundle();
        y = (String) bb.get("key");
        txt.setText(y);
    } */

    public void fun2nd(String y) {
        txt.setText(y);

    }


    @Override
    public void onClick(View v) {
        z = edt1.getText().toString().trim();
        cc = (communcation) getActivity();
        cc.fun3rd(z);

    }
}
