package app.tfkproject.utapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import app.tfkproject.utapplication.McrHd465_7R;
import app.tfkproject.utapplication.McrHd785_7;
import app.tfkproject.utapplication.McrPc1250_8;
import app.tfkproject.utapplication.R;

public class FormPPM extends Fragment {

    private CardView btnHd465_7r, btnHd785_7, btnPc1250_8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.form_ppm, container, false);

        btnHd465_7r = rootView.findViewById(R.id.btn_hd465_7r);
        btnHd785_7 = rootView.findViewById(R.id.btn_hd785_7);
        btnPc1250_8 = rootView.findViewById(R.id.btn_pc1250_8);

        btnHd465_7r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), McrHd465_7R.class);
                getContext().startActivity(intent);
            }
        });

        btnHd785_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), McrHd785_7.class);
                getContext().startActivity(intent);
            }
        });

        btnPc1250_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), McrPc1250_8.class);
                getContext().startActivity(intent);
            }
        });



        return rootView;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        // Do something that differs the Activity's menu here
//        super.onCreateOptionsMenu(menu, inflater);
//        inflater = getActivity().getMenuInflater();
//        inflater.inflate(R.menu.main, menu);
//
//
//        //return true;
//    }
}