package app.tfkproject.utapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.tfkproject.utapplication.adapter.AdapterGuide;
import app.tfkproject.utapplication.model.ItemGuide;

public class GuideHd785_7 extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    AdapterGuide adapter;
    private ProgressDialog pDialog;
    List<ItemGuide> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        getSupportActionBar().setTitle(getResources().getString(R.string.gde_hd785_7));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();

        items.add(new ItemGuide("Blowby", R.drawable.hd785_7_blowby, "" +
                "Switch the machine monitor display to \"Service mode 1\" and use the \"Monitoring function\" to display the following two items at the same time.\n" +
                "Monitoring system: 2 ITEMS\n" +
                "- Monitoring code: 01002 (ENG SPEED)\n" +
                "- Monitoring code: 42801 (BLOWBY PRESS)"));

        items.add(new ItemGuide("Brake Oil Pressure", R.drawable.hd785_7_brake_oill_pressure, "" +
                "1) Set the machine monitor in service mode and display the following 2 items simultaneously with the monitoring function.\n" +
                "Monitoring system: 2 ITEMS\n" +
                "- Monitoring code: 35500 (ACC OIL PRESS F)\n" +
                "- Monitoring code: 35501 (ACC OIL PRESS R)\n" +
                "2) Start the engine.\n" +
                "3) Test the cut-in pressure at high idle. Press and release the brake pedal repeatedly to lower the oil pressure in the accumulator. Read the lower one of the ACC oil pressures (front or rear) when it starts rising after it reaches the bottom.\n" +
                "4) Test the cut-out pressure at high idle.\n" +
                "- Read the ACC oil pressure (front or rear) when it stops rising at the highest point after the cut-in pressure.\n" +
                "\n" +
                "Standard Pressure:\n" +
                "Service Brake: 93-107 Kg/cm≤\n" +
                "Retarder: 59-72 Kg/cm≤"));

        items.add(new ItemGuide("Control Switch Selection", R.drawable.hd785_7_control_switch_selection, "" +
                "Each switch  of [ ♢ ], [ ■ ], [ > ], [ < ] is  assigned to the following  function.\n" +
                "1)  ♢  :  Determine  and  execute\n" +
                "2)  ■  :  To cancel, release,  and determine\n" +
                "(only  YES  and NO screen)\n" +
                "3)  >  :  To right,  to  next,  to proceed, to  increase\n" +
                "(only  when inputting  Arabic  numbers)\n" +
                "4)  <  :  To left, to previous,  to  return,  to  decrease\n" +
                "(only  when  inputting  Arabic  numbers)"));

        items.add(new ItemGuide("Engine Oil Pressure", R.drawable.hd785_7_engine_oil_pressure, "" +
                "Low Idle: Min. 0.8 kPa\n" +
                "Rated Speed: 3.0 - 4.5 kPa"));

        items.add(new ItemGuide("Hoist Pressure", R.drawable.hd785_7_hoist_pressure, "" +
                "1) Raise the hydraulic oil temperature.\n" +
                "Oil temperature when measuring :45 ñ 55 ∞C\n" +
                "2) Remove oil pressure pickup plug at\n" +
                "the hoist cylinder bottom and install tool\n" +
                "(39.2 MPa {400 kg/cm≤}).\n" +
                "Hoist Relief Pressure:\n" +
                "Rated Speed: 206-215 Kg/cm≤\n" +
                "Low Idle: 182-192 Kg/cm≤\n"));

        items.add(new ItemGuide("Power Train", R.drawable.hd785_7_power_train_oil_press, "" +
                "Lockup Clutch:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Remove plug, install nipple K2 and connect oil pressure gauge (5.9 MPa) {60 kg/cm≤}) of hydraulic tester K1 by hose.\n" +
                "3) Lower the body to the normal position.\n" +
                "4) Run the engine and heighten the torque converter oil temperature to the operating\n" +
                "range.\n" +
                "5) Turn the parking brake switch to the \"OFF\" position. While pressing the brake pedal,set the gearshift lever in the \"L\" position.\n" +
                "6) Release the brake, drive the machine at rated speed (1,900 rpm) and high idle and test the oil pressure when the lockup pilot lamp lights up.\n" +
                "- Since the F1 speed reaches about 10.9 km/h, take extreme care of the\n" +
                "safety around the machine.\n" +
                "7) After finishing testing, remove the testing\n" +
                "instruments and return the removed parts.\n" +
                "\n" +
                "Main Relief Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Heighten the transmission oil temperature.\n" +
                "- Oil leak tester for testing: 60 ñ 80 ∞C\n" +
                "3) Remove plug (1), install nipple and connect oil pressure gauge (5.9 MPa) {60 kg/cm≤}) of hydraulic tester K1 by hose.\n" +
                "\n" +
                "Torque Converter Inlet Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Referring to \"Testing of main relief pressure\",\n" +
                "check that there is no abnormality.\n" +
                "3) Remove plug, install nipple K2 and\n" +
                "connect oil pressure gauge (2.45 MPa) {25 kg/cm≤}) of hydraulic tester by hose.\n" +
                "4) Start the engine and test the oil pressure\n" +
                "at rated speed (1,900 rpm) and high idle.\n" +
                "5) After finishing testing, remove the testing\n" +
                "instruments and return the removed parts.\n" +
                "\n" +
                "Torque Converter Outlet Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Referring to \"Testing of main relief pressure\", check that there is no abnormality.\n" +
                "3) Remove plug, install nipple and connect oil pressure gauge (2.45 MPa) {25 kg/cm≤}) of hydraulic tester by hose .\n" +
                "4) Start the engine and test the oil pressure at rated speed (1,900 rpm) and high idle.\n" +
                "5) After finishing testing, remove the testing instruments and return the removed parts."));

        items.add(new ItemGuide("Steering Pressure", R.drawable.hd785_7_steering, "" +
                "1) Raise the hydraulic oil temperature.\n" +
                "Oil temperature when measuring :45 ñ 55 ∞C\n" +
                "2) Remove plug of the outlet piping of\n" +
                "steering demand valve and install tool\n" +
                "K1 (39.2 MPa {400 kg/cm≤}).\n" +
                "3) Start the engine, turn the steering wheel\n" +
                "fully to the right or left to relieve the oil and\n" +
                "measure the oil pressure at this time.\n" +
                "Standard Steering Relief Pressure:\n" +
                "Low Idle: 182-195 Kg/cm≤\n" +
                "Rated Speed: 206-215 Kg/cm≤"));

        items.add(new ItemGuide("Torque Converter Stall Speed", R.drawable.hd785_7_torque_converter, "" +
                "Turn the starting switch ON and set the monitor\n" +
                "panel in the real-time monitoring function\n" +
                "(REAL-TIME MONITOR) of the service mode.\n" +
                "Monitoring functions: 2 ITEMS\n" +
                "- Monitoring code 1: 01002 (ENG SPEED)\n" +
                "- Monitoring code 2: 30100 (T/C OIL TEMP)"));

        adapter = new AdapterGuide(GuideHd785_7.this, items);
        recyclerView.setAdapter(adapter);

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
