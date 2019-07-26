package app.tfkproject.utapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.tfkproject.utapplication.McrHd465_7R;
import app.tfkproject.utapplication.McrHd785_7;
import app.tfkproject.utapplication.McrPc1250_8;
import app.tfkproject.utapplication.R;

public class AboutFragment extends Fragment {

    private TextView txtTentang, txtFooter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.about_fragment, container, false);

        txtTentang = rootView.findViewById(R.id.tentang);
        txtFooter = rootView.findViewById(R.id.footer);

        String tentang = "" +
                "Aplikasi ini bertujuan untuk memudahkan input Machone Condition Report (MCR) secara mobile dan memudahkan pencarian lokasi measurement check port pada saat pekerjaan Program Pemeriksaan Mesin (PPM)\n" +
                "\n" +
                "Aplikasi ini khusus digunakan oleh PT. United Tractors dengan harapan mempercepat leadtime pekerjaan pada saat PPM." +
                "";

        String footer = "" +
                "Versi 1.0" +
                "\n" +
                "Copyright © 2019 Rainoldi Aldino" +
                "\n" +
                "All Rights Reserved" +
                "";

        txtTentang.setText(tentang);
        txtFooter.setText(footer);

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