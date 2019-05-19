package app.tfkproject.utapplication;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import app.tfkproject.utapplication.util.Config;
import app.tfkproject.utapplication.util.Request;

public class GuideDetailActivity extends AppCompatActivity {

    private ImageView imgView;
    private TextView txtJudul, txtKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_detail);

        String judul = getIntent().getStringExtra("key_judul");
        int gambar = getIntent().getIntExtra("key_gambar", 0);
        String keterangan = getIntent().getStringExtra("key_keterangan");

        getSupportActionBar().setTitle(judul);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgView = findViewById(R.id.gambar);
        txtJudul = findViewById(R.id.txt_judul);
        txtKeterangan = findViewById(R.id.txt_keterangan);

        imgView.setImageResource(gambar);
        txtJudul.setText(judul);
        txtKeterangan.setText(keterangan);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id_menu = item.getItemId();
        if(id_menu == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
