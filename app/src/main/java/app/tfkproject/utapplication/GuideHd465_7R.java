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

public class GuideHd465_7R extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    AdapterGuide adapter;
    private ProgressDialog pDialog;
    List<ItemGuide> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        getSupportActionBar().setTitle(getResources().getString(R.string.gde_hd465_7R));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();

        items.add(new ItemGuide("Blowby", R.drawable.hd465_7_blowby, "" +
                "Switch the machine monitor display to \"Service mode 1\" and use the \"Monitoring function\" to display the following two items at the same time.\n" +
                "Monitoring system: 2 ITEMS\n" +
                "- Monitoring code: 01002 (ENG SPEED)\n" +
                "- Monitoring code: 42801 (BLOWBY PRESS)\n" +
                "\n" +
                "1) Depress the parking brake pedal, turn the parking brake switch TRAVEL, then set the gearshift lever to the D position.\n" +
                "2) Depress the accelerator pedal gradually, run the engine at high idle and stall the torque converter, and test the blow-by pressure.\n" +
                "Standard:\n" +
                "Power Mode, T/C Stall: Max. 3.43kPa"));

        items.add(new ItemGuide("Brake Oil Pressure", R.drawable.hd465_7_brake_oil_pressure, "" +
                "Set the machine monitor to the monitoring function in the service mode and display the following 2 items simultaneously.\n" +
                "Monitoring system: 2 ITEMS\n" +
                "- Monitoring code: 35500 (ACC OIL PRESS F)\n" +
                "- Monitoring code: 35501 (ACC OIL PRESS R)\n" +
                "\n" +
                "1) Test the cut-in pressure at high idle. \n" +
                "Depress and release the brake pedal repeatedly to lower the oil pressure in the accumulator.\n" +
                "2) Read the lower one of the ACC oil pressures (front or rear) when it starts rising after it reaches the bottom.\n" +
                "3) Test the cut-out pressure at high idle.\n" +
                "- Read the ACC oil pressure (front or rear) when it stops rising at the highest point after the cut-in pressure.\n" +
                "\n" +
                "Standard:\n" +
                "Front: 17.6±1.2 Mpa\n" +
                "Rear: 9.8±0.7 Mpa\n" +
                "Retarde: 8.7±0.6 Mpa"));
        items.add(new ItemGuide("Control Switch", R.drawable.hd465_7_control_switch_selection, "" +
                "Each switch  of [ ♢ ], [ ■ ], [ > ], [ < ] is  assigned to the following  function.\n" +
                "1)  ♢  :  Determine  and  execute\n" +
                "2)  ■  :  To cancel, release,  and determine\n" +
                "(only  YES  and NO screen)\n" +
                "3)  >  :  To right,  to  next,  to proceed, to  increase\n" +
                "(only  when inputting  Arabic  numbers)\n" +
                "4)  <  :  To left, to previous,  to  return,  to  decrease\n" +
                "(only  when  inputting  Arabic  numbers)"));
        items.add(new ItemGuide("Engine Oil Pressure", R.drawable.hd465_7_engine_oil_pressure, "" +
                "Test the engine oil pressure under the following conditions.\n" +
                "* Engine oil temperature: Min. 80 ∞C\n" +
                "* Coolant temperature\n" +
                "\n" +
                "Standard:\n" +
                "Low Idle: 1.0 kg/cm≤\n" +
                "T/C Stall: 3.5 kg/cm≤"));
        items.add(new ItemGuide("Engine Speed", R.drawable.hd465_7_engine_oil_pressure, "" +
                "Testing low idle speed\n" +
                "1) Set the gear shift lever to \"N\" and dump lever to HOLD.\n" +
                "2) Start the engine and measure the engine speed without depressing the accelerator pedal.\n" +
                "\n" +
                "Testing high idle speed\n" +
                "1) Set the shift lever to \"N\" and dump lever to HOLD.\n" +
                "2) Start the engine and set the accelerator pedal in the high idle position and measure the engine speed.\n" +
                "\n" +
                "Standard:\n" +
                "Low Idle, Low: 700-800Rpm\n" +
                "Low Idle, Hi: 895-995Rpm\n" +
                "P Mode, Hight Idle: 2220-2320Rpm\n" +
                "E mode, High Idle: 2150-2250Rpm"));
        items.add(new ItemGuide("Power Train Oil Pressure", R.drawable.hd465_7_power_train_oil_press, "" +
                "TC Outlet Oil Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Referring to \"Testing of main relief pressure\", check that there is no abnormality.\n" +
                "3) Remove plug , install nipple and connect oil pressure gauge (2.45 MPa) of hydraulic tester by hose.\n" +
                "Standard:\n" +
                "Rated Speed: 0.59 ± 0.05Mpa\n" +
                "\n" +
                "TC Inlet Oil Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Referring to \"Testing of main relief pressure\", check that there is no abnormality.\n" +
                "3) Remove plug , install nipple and connect oil pressure gauge (2.45 MPa) of hydraulic tester by hose.\n" +
                "Standard:\n" +
                "Rated Speed: 0.74 ± 0.05Mpa\n" +
                "\n" +
                "Main Relief Oil Pressure:\n"+
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Raise the transmission oil temperature.\n" +
                "- Oil leak tester for testing: 60 ? 80 ∞C\n" +
                "3) Remove plug, install nipple K2 and connect oil pressure gauge (5.9 MPa) of hydraulic tester K1 by hose.\n" +
                "4) Start the engine, set the gearshift lever in the \"N\" position and test the oil pressure at low idle and high idle.\n" +
                "Standard:\n" +
                "Rated Speed: \n" +
                "F1, F2, F3, R: 3.68±0.2Mpa\n" +
                "F4, F5, F6, F7: 2.28±0.2Mpa\n" +
                "\n" +
                "Lock Up Oil Pressure:\n" +
                "1) Raise the body and fix it with the lock pin.\n" +
                "2) Remove plug , install nipple K2 and connect oil pressure gauge (5.9 MPa) of hydraulic tester K1 by hose.\n" +
                "3) Lower the body to the normal position.\n" +
                "4) Run the engine and raise the torque converter oil temperature to the operating range.\n" +
                "5) Turn the parking brake switch to the \"OFF\" position. While depressing the brake pedal, set the gearshift lever in the \"L\" position.\n" +
                "6) Release the brake, drive the machine at high idle and test the oil pressure when the lockup pilot lamp lights up.\n" +
                "Standard:\n" +
                "Rated Speed: 1.67±0.2Mpa"));
        items.add(new ItemGuide("Service Mode", R.drawable.hd465_7_service_mode, "" +
                "After  displaying ID  input  screen, operate [>], [<], [♢], and [■] switch to input 4 digits ID.\n" +
                "* ID: 6491\n" +
                "• [ > ]: Number at the cursor increases.\n" +
                "• [ < ]: Number at the cursor decreases\n" +
                "• [ ♢ ]:  Number  at the cursor is determined\n" +
                "• [ ■ ]: Cursor moves to left end or the display returns to operator mode screen."));
        items.add(new ItemGuide("Torque Converter Stall Speed", R.drawable.hd465_7_stall_speed, "" +
                "Turn the starting switch ON and set the monitor panel to the real-time monitoring function (REAL-TIME MONITOR) of the service mode.\n" +
                "- Monitoring functions: 2 ITEMS\n" +
                "- Monitoring code 1: 01002 (ENG SPEED)\n" +
                "- Monitoring code 2: 30100 (T/C OIL TEMP)\n" +
                "\n" +
                "1. Start the engine and raise the temperature of the torque converter oil and hydraulic oil.\n" +
                "Torque converter oil temperature: 60-80 ∞C\n" +
                "Hydraulic oil temperature: 45-55 ∞C\n" +
                "2. Turn the parking brake switch ON, depress the brake pedal, then set the gear shift lever to the D position.\n" +
                "3. Depress the accelerator pedal gradually, run the engine at high idle and stall the torque converter to raise the torque converter oil temperature.\n" +
                "4. When the torque converter oil temperature goes above 90 ∞C, run the engine immediately at low idle and return the gear shift lever to the N position.\n" +
                "5. Run the engine at a medium speed, and when the torque converter oil temperature goes down to approx. 80 ∞C, run at low idle.\n" +
                "6. Repeat Steps 3-6 and equalize the oil temperature in the torque converter and transmission."));

        adapter = new AdapterGuide(GuideHd465_7R.this, items);
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
