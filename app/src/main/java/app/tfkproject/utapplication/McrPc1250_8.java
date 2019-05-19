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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import app.tfkproject.utapplication.util.Config;
import app.tfkproject.utapplication.util.Request;

public class McrPc1250_8 extends AppCompatActivity {

    /*
    * Widget
    * */
    //customer
    private EditText
    customer,
    sn_unit,
    node_no,
    model_eng,
    sn_eng,
    hrs_meter,
    insp_name,
    date;

    //engine
    private EditText
    eng_speed_l,
    eng_speed_h,
    eng_speed_r_off,
    eng_speed_r_on,
    blw_press,
    lub_oil_press_lw,
    lub_oil_press_tc,
    boost_press,
    exh_gas_tmp_123,
    exh_gas_tmp_456;
    private EditText rslt_eng;

    //work equipment speed
    private EditText
    wes_boom_r,
    wes_boom_l,
    wes_arm_i,
    wes_arm_o,
    wes_bucket_c,
    wes_bucket_d,
    wes_swing,
    wes_drv_l,
    wes_drv_r;
    private EditText rslt_eqp_spd;

    //Hydraulic Equipment
    private EditText
    hst_br_off,
    hst_br_on,
    ar_i,
    ar_o,
    bucket_r_c,
    bucket_r_d,
    travel_f,
    travel_r;
    private EditText rslt_hdy_eqp;

    //Rear pump
    private EditText
    rp_br_off,
    rp_br_on,
    rp_ar_i,
    rp_ar_o,
    rp_bucket_r_c,
    rp_bucket_r_d,
    rp_travel_f,
    rp_travel_r;

    //Swing pump
    private EditText
    sp_br_off,
    sp_br_on,
    sp_ar_i,
    sp_ar_o,
    sp_swing_r,
    sp_swing_l,
    sp_bc_r;
    private EditText rslt_pmp;

    //No name
    private EditText
    chg_pmp_l,
    chg_pmp_h,
    tvc_vlv_a,
    tvc_vlv_e;

    //CO-NC valve pressure
    private EditText
    CO_fp_n,
    CO_fp_nc,
    CO_fp_mp,
    CO_rp_n,
    CO_rp_nc,
    CO_rp_mp,
    CO_sp_n,
    CO_sp_nc,
    CO_sp_mp;
    private EditText rslt_cocn;

    //Fan Speed
    private EditText
    fs_ac_hi,
    fs_ac_op,
    fs_cl_hi,
    fs_cl_op;
    private EditText rslt_fan;

    //Hydraulic drift
    private EditText
    hd_doe;
    private EditText rslt_hdy_dft;

    private EditText
    ol_rtn_str,
    drn_plg_fd,
    ol_lk_fd,
    drn_plg_sw,
    ol_lk_sw;
    private EditText rslt_oil_rtn_str;
    private EditText rslt_fd;
    private EditText rslt_swing;

    private EditText
    scb_axl;
    private EditText rslt_cicle;

    //Electrical
    private EditText
    instrument_pnl,
    start_sys,
    charging_sys,
    lighting,
    battery,
    wiring_hms,
    vhms;
    private EditText rslt_elct;

    //Optional
    private EditText
    emc_sht,
    logout_swt,
    pdu,
    autolube,
    fire_sup,
    fatique,
    bkp_alm;
    private EditText rslt_opt;

    //General
    private EditText
    att_frame,
    machine,
    undercarriage;
    private EditText rslt_gnrl;

    /*
    * String
    * */
    //customer
    private String
            str_customer,
            str_sn_unit,
            str_node_no,
            str_model_eng,
            str_sn_eng,
            str_hrs_meter,
            str_insp_name,
            str_date;

    //engine
    private String
            str_eng_speed_l,
            str_eng_speed_h,
            str_eng_speed_r_off,
            str_eng_speed_r_on,
            str_blw_press,
            str_lub_oil_press_lw,
            str_lub_oil_press_tc,
            str_boost_press,
            str_exh_gas_tmp_123,
            str_exh_gas_tmp_456;
    private String str_rslt_eng;

    //WES
    private String
            str_wes_boom_r,
            str_wes_boom_l,
            str_wes_arm_i,
            str_wes_arm_o,
            str_wes_bucket_c,
            str_wes_bucket_d,
            str_wes_swing,
            str_wes_drv_l,
            str_wes_drv_r;
    private String str_rslt_eqp_spd;

    //Hydraulic Equipment
    private String
            str_hst_br_off,
            str_hst_br_on,
            str_ar_i,
            str_ar_o,
            str_bucket_r_c,
            str_bucket_r_d,
            str_travel_f,
            str_travel_r;
    private String str_rslt_hdy_eqp;

    //Rear pump
    private String
            str_rp_br_off,
            str_rp_br_on,
            str_rp_ar_i,
            str_rp_ar_o,
            str_rp_bucket_r_c,
            str_rp_bucket_r_d,
            str_rp_travel_f,
            str_rp_travel_r;

    //Swing pump
    private String
            str_sp_br_off,
            str_sp_br_on,
            str_sp_ar_i,
            str_sp_ar_o,
            str_sp_swing_r,
            str_sp_swing_l,
            str_sp_bc_r;
    private String str_rslt_pmp;

    //No name
    private String
            str_chg_pmp_l,
            str_chg_pmp_h,
            str_tvc_vlv_a,
            str_tvc_vlv_e;

    //CO-NC valve pressure
    private String
            str_CO_fp_n,
            str_CO_fp_nc,
            str_CO_fp_mp,
            str_CO_rp_n,
            str_CO_rp_nc,
            str_CO_rp_mp,
            str_CO_sp_n,
            str_CO_sp_nc,
            str_CO_sp_mp;
    private String str_rslt_cocn;

    //Fan Speed
    private String
            str_fs_ac_hi,
            str_fs_ac_op,
            str_fs_cl_hi,
            str_fs_cl_op;
    private String str_rslt_fan;

    //Hydraulic drift
    private String
            str_hd_doe;
    private String str_rslt_hdy_dft;

    private String
            str_ol_rtn_str,
            str_drn_plg_fd,
            str_ol_lk_fd,
            str_drn_plg_sw,
            str_ol_lk_sw;
    private String str_rslt_oil_rtn_str;
    private String str_rslt_fd;
    private String str_rslt_swing;

    private String
            str_scb_axl;
    private String str_rslt_cicle;

    //Electrical
    private String
            str_instrument_pnl,
            str_start_sys,
            str_charging_sys,
            str_lighting,
            str_battery,
            str_wiring_hms,
            str_vhms;
    private String str_rslt_elct;

    //Optional
    private String
            str_emc_sht,
            str_logout_swt,
            str_pdu,
            str_autolube,
            str_fire_sup,
            str_fatique,
            str_bkp_alm;
    private String str_rslt_opt;

    //General
    private String
            str_att_frame,
            str_machine,
            str_undercarriage;
    private String str_rslt_gnrl;

    private Button btnSave;

    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcr_pc1250_8);

        getSupportActionBar().setTitle(getResources().getString(R.string.mcr_pc1250_8));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        customer = findViewById(R.id.txt_customer);
        sn_unit = findViewById(R.id.txt_sn_unit);
        node_no = findViewById(R.id.txt_code_no);
        model_eng = findViewById(R.id.txt_model_eng);
        sn_eng = findViewById(R.id.txt_sn_eng);
        hrs_meter = findViewById(R.id.txt_hours_mtr);
        insp_name = findViewById(R.id.txt_insp_name);
        date = findViewById(R.id.txt_date);

        eng_speed_l = findViewById(R.id.txt_eng_spd_l);
        eng_speed_h = findViewById(R.id.txt_eng_spd_h);
        eng_speed_r_off = findViewById(R.id.txt_eng_spd_r_off);
        eng_speed_r_on = findViewById(R.id.txt_eng_spd_r_on);
        blw_press = findViewById(R.id.txt_blw_press);
        lub_oil_press_lw = findViewById(R.id.txt_lbo_press_lw);
        lub_oil_press_tc = findViewById(R.id.txt_lbo_press_tc);
        boost_press = findViewById(R.id.txt_bst_press);
        exh_gas_tmp_123 = findViewById(R.id.txt_exh_gas_tmp_123);
        exh_gas_tmp_456 = findViewById(R.id.txt_exh_gas_tmp_456);

        rslt_eng = findViewById(R.id.txt_rslt_eng);


        wes_boom_r = findViewById(R.id.txt_wes_boom_r);
        wes_boom_l = findViewById(R.id.txt_wes_boom_l);
        wes_arm_i = findViewById(R.id.txt_wes_arm_i);
        wes_arm_o = findViewById(R.id.txt_wes_arm_o);
        wes_bucket_c = findViewById(R.id.txt_wes_bucket_c);
        wes_bucket_d = findViewById(R.id.txt_wes_bucket_d);
        wes_swing = findViewById(R.id.txt_wes_swing);
        wes_drv_l = findViewById(R.id.txt_wes_drv_l);
        wes_drv_r = findViewById(R.id.txt_wes_drv_r);

        rslt_eqp_spd = findViewById(R.id.txt_rslt_eqp_spd);


        hst_br_off = findViewById(R.id.txt_hst_br_off);
        hst_br_on = findViewById(R.id.txt_hst_br_on);
        ar_i = findViewById(R.id.txt_ar_i);
        ar_o = findViewById(R.id.txt_ar_o);
        bucket_r_c = findViewById(R.id.txt_bcr_c);
        bucket_r_d = findViewById(R.id.txt_bcr_d);
        travel_f = findViewById(R.id.txt_hd_tr_f);
        travel_r = findViewById(R.id.txt_hd_tr_r);

        rslt_hdy_eqp = findViewById(R.id.txt_rslt_hdy_eqp);

        rp_br_off = findViewById(R.id.txt_rp_br_off);
        rp_br_on = findViewById(R.id.txt_rp_br_on);
        rp_ar_i = findViewById(R.id.txt_rp_ar_i);
        rp_ar_o = findViewById(R.id.txt_rp_ar_o);
        rp_bucket_r_c = findViewById(R.id.txt_rp_bcr_c);
        rp_bucket_r_d = findViewById(R.id.txt_rp_bcr_d);
        rp_travel_f = findViewById(R.id.txt_rp_tr_f);
        rp_travel_r = findViewById(R.id.txt_rp_tr_r);

        sp_br_off = findViewById(R.id.txt_sp_br_off);
        sp_br_on = findViewById(R.id.txt_sp_br_on);
        sp_ar_i = findViewById(R.id.txt_sp_ar_i);
        sp_ar_o = findViewById(R.id.txt_sp_ar_o);
        sp_swing_r = findViewById(R.id.txt_sp_sr_r);
        sp_swing_l = findViewById(R.id.txt_sp_sr_l);
        sp_bc_r = findViewById(R.id.txt_sp_bc_r);

        rslt_pmp = findViewById(R.id.txt_rslt_pmp);


        chg_pmp_l = findViewById(R.id.txt_chg_pmp_l);
        chg_pmp_h = findViewById(R.id.txt_chg_pmp_h);
        tvc_vlv_a = findViewById(R.id.txt_tvc_vlv_a);
        tvc_vlv_e = findViewById(R.id.txt_tvc_vlv_e);

        CO_fp_n = findViewById(R.id.txt_CO_fp_n);
        CO_fp_nc = findViewById(R.id.txt_CO_fp_nc);
        CO_fp_mp = findViewById(R.id.txt_CO_fp_mp);
        CO_rp_n = findViewById(R.id.txt_CO_rp_n);
        CO_rp_nc = findViewById(R.id.txt_CO_rp_nc);
        CO_rp_mp = findViewById(R.id.txt_CO_rp_mp);
        CO_sp_n = findViewById(R.id.txt_CO_sp_n);
        CO_sp_nc = findViewById(R.id.txt_CO_sp_nc);
        CO_sp_mp = findViewById(R.id.txt_CO_sp_mp);

        rslt_cocn = findViewById(R.id.txt_rslt_cocn);


        fs_ac_hi = findViewById(R.id.txt_fs_ac_hi);
        fs_ac_op = findViewById(R.id.txt_fs_ac_op);
        fs_cl_hi = findViewById(R.id.txt_fs_cl_hi);
        fs_cl_op = findViewById(R.id.txt_fs_cl_op);

        rslt_fan = findViewById(R.id.txt_rslt_fan);


        hd_doe = findViewById(R.id.txt_hd_doe);

        rslt_hdy_dft = findViewById(R.id.txt_rslt_hdy_dft);


        ol_rtn_str = findViewById(R.id.txt_ol_rtn_str);
        rslt_oil_rtn_str = findViewById(R.id.txt_rslt_oil_rtn_str);
        drn_plg_fd = findViewById(R.id.txt_drn_plg_fd);
        ol_lk_fd = findViewById(R.id.txt_ol_lk_fd);
        rslt_fd = findViewById(R.id.txt_rslt_fd);
        drn_plg_sw = findViewById(R.id.txt_drn_plg_sw);
        ol_lk_sw = findViewById(R.id.txt_ol_lk_sw);
        rslt_swing = findViewById(R.id.txt_rslt_swing);

        scb_axl = findViewById(R.id.txt_scb_axl);

        rslt_cicle = findViewById(R.id.txt_rslt_cicle);


        instrument_pnl = findViewById(R.id.txt_instr_pnl);
        start_sys = findViewById(R.id.txt_srt_syt);
        charging_sys = findViewById(R.id.txt_chr_syt);
        lighting = findViewById(R.id.txt_lgt);
        battery = findViewById(R.id.txt_btr);
        wiring_hms = findViewById(R.id.txt_wrg_hrn);
        vhms = findViewById(R.id.txt_vhms);

        rslt_elct = findViewById(R.id.txt_rslt_elct);


        emc_sht = findViewById(R.id.txt_emc_sht);
        logout_swt = findViewById(R.id.txt_lgt_swt);
        pdu = findViewById(R.id.txt_pdu);
        autolube = findViewById(R.id.txt_aut);
        fire_sup = findViewById(R.id.txt_fr_spp);
        fatique = findViewById(R.id.txt_ftq_wrn);
        bkp_alm = findViewById(R.id.txt_bkp_alm);

        rslt_opt = findViewById(R.id.txt_rslt_opt);


        att_frame = findViewById(R.id.txt_att_frm);
        machine = findViewById(R.id.txt_mch);
        undercarriage = findViewById(R.id.txt_ucr);

        rslt_gnrl = findViewById(R.id.txt_rslt_gnrl);


        btnSave = findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_customer = customer.getText().toString();
                str_sn_unit = sn_unit.getText().toString();
                str_node_no = node_no.getText().toString();
                str_model_eng = model_eng.getText().toString();
                str_sn_eng = sn_eng.getText().toString();
                str_hrs_meter = hrs_meter.getText().toString();
                str_insp_name = insp_name.getText().toString();
                str_date = date.getText().toString();

                str_eng_speed_l = eng_speed_l.getText().toString();
                str_eng_speed_h = eng_speed_h.getText().toString();
                str_eng_speed_r_off = eng_speed_r_off.getText().toString();
                str_eng_speed_r_on = eng_speed_r_on.getText().toString();
                str_blw_press = blw_press.getText().toString();
                str_lub_oil_press_lw = lub_oil_press_lw.getText().toString();
                str_lub_oil_press_tc = lub_oil_press_tc.getText().toString();
                str_boost_press = boost_press.getText().toString();
                str_exh_gas_tmp_123 = exh_gas_tmp_123.getText().toString();
                str_exh_gas_tmp_456 = exh_gas_tmp_456.getText().toString();

                str_rslt_eng = rslt_eng.getText().toString();


                str_wes_boom_r = wes_boom_r.getText().toString();
                str_wes_boom_l = wes_boom_l.getText().toString();
                str_wes_arm_i = wes_arm_i.getText().toString();
                str_wes_arm_o = wes_arm_o.getText().toString();
                str_wes_bucket_c = wes_bucket_c.getText().toString();
                str_wes_bucket_d = wes_bucket_d.getText().toString();
                str_wes_swing = wes_swing.getText().toString();
                str_wes_drv_l = wes_drv_l.getText().toString();
                str_wes_drv_r = wes_drv_r.getText().toString();

                str_rslt_eqp_spd = rslt_eqp_spd.getText().toString();


                str_hst_br_off = hst_br_off.getText().toString();
                str_hst_br_on = hst_br_on.getText().toString();
                str_ar_i = ar_i.getText().toString();
                str_ar_o = ar_o.getText().toString();
                str_bucket_r_c = bucket_r_c.getText().toString();
                str_bucket_r_d = bucket_r_d.getText().toString();
                str_travel_f = travel_f.getText().toString();
                str_travel_r = travel_r.getText().toString();

                str_rslt_hdy_eqp = rslt_hdy_eqp.getText().toString();


                str_rp_br_off = rp_br_off.getText().toString();
                str_rp_br_on = rp_br_on.getText().toString();
                str_rp_ar_i = rp_ar_i.getText().toString();
                str_rp_ar_o = rp_ar_o.getText().toString();
                str_rp_bucket_r_c = rp_bucket_r_c.getText().toString();
                str_rp_bucket_r_d = rp_bucket_r_d.getText().toString();
                str_rp_travel_f = rp_travel_f.getText().toString();
                str_rp_travel_r = rp_travel_r.getText().toString();

                str_rslt_pmp = rslt_pmp.getText().toString();


                str_sp_br_off = sp_br_off.getText().toString();
                str_sp_br_on = sp_br_on.getText().toString();
                str_sp_ar_i = sp_ar_i.getText().toString();
                str_sp_ar_o = sp_ar_o.getText().toString();
                str_sp_swing_r = sp_swing_r.getText().toString();
                str_sp_swing_l = sp_swing_l.getText().toString();
                str_sp_bc_r = sp_bc_r.getText().toString();

                str_chg_pmp_l = chg_pmp_l.getText().toString();
                str_chg_pmp_h = chg_pmp_h.getText().toString();
                str_tvc_vlv_a = tvc_vlv_a.getText().toString();
                str_tvc_vlv_e = tvc_vlv_e.getText().toString();

                str_CO_fp_n = CO_fp_n.getText().toString();
                str_CO_fp_nc = CO_fp_nc.getText().toString();
                str_CO_fp_mp = CO_fp_mp.getText().toString();
                str_CO_rp_n = CO_rp_n.getText().toString();
                str_CO_rp_nc = CO_rp_nc.getText().toString();
                str_CO_rp_mp = CO_rp_mp.getText().toString();
                str_CO_sp_n = CO_sp_n.getText().toString();
                str_CO_sp_nc = CO_sp_nc.getText().toString();
                str_CO_sp_mp = CO_sp_mp.getText().toString();

                str_rslt_cocn = rslt_cocn.getText().toString();


                str_fs_ac_hi = fs_ac_hi.getText().toString();
                str_fs_ac_op = fs_ac_op.getText().toString();
                str_fs_cl_hi = fs_cl_hi.getText().toString();
                str_fs_cl_op = fs_cl_op.getText().toString();

                str_rslt_fan = rslt_fan.getText().toString();


                str_hd_doe = hd_doe.getText().toString();

                str_rslt_hdy_dft = rslt_hdy_dft.getText().toString();

                str_ol_rtn_str = ol_rtn_str.getText().toString();
                str_rslt_oil_rtn_str = rslt_oil_rtn_str.getText().toString();
                str_drn_plg_fd = drn_plg_fd.getText().toString();
                str_ol_lk_fd = ol_lk_fd.getText().toString();
                str_rslt_fd = rslt_fd.getText().toString();
                str_drn_plg_sw = drn_plg_sw.getText().toString();
                str_ol_lk_sw = ol_lk_sw.getText().toString();
                str_rslt_swing = rslt_swing.getText().toString();

                str_scb_axl = scb_axl.getText().toString();
                str_rslt_cicle = rslt_cicle.getText().toString();

                str_instrument_pnl = instrument_pnl.getText().toString();
                str_start_sys = start_sys.getText().toString();
                str_charging_sys = charging_sys.getText().toString();
                str_lighting = lighting.getText().toString();
                str_battery = battery.getText().toString();
                str_wiring_hms = wiring_hms.getText().toString();
                str_vhms = vhms.getText().toString();

                str_rslt_elct = rslt_elct.getText().toString();


                str_emc_sht = emc_sht.getText().toString();
                str_logout_swt = logout_swt.getText().toString();
                str_pdu = pdu.getText().toString();
                str_autolube = autolube.getText().toString();
                str_fire_sup = fire_sup.getText().toString();
                str_fatique = fatique.getText().toString();
                str_bkp_alm = bkp_alm.getText().toString();

                str_rslt_opt = rslt_opt.getText().toString();


                str_att_frame = att_frame.getText().toString();
                str_machine = machine.getText().toString();
                str_undercarriage = undercarriage.getText().toString();

                str_rslt_gnrl = rslt_gnrl.getText().toString();

                new postData().execute();

            }
        });
    }

    private class postData extends AsyncTask<Void,Void,String> {

        //variabel untuk tangkap data
        private int scs = 0;
        private String psn;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(McrPc1250_8.this);
            pDialog.setMessage("Loading...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
        }

        protected String doInBackground(Void... params) {

            try{
                //susun parameter
                HashMap<String,String> detail = new HashMap<>();
                detail.put("action", "update");
                detail.put("tableName", "Konsep");
                //Customer
                detail.put("customer", str_customer);
                detail.put("sn_unit", str_sn_unit);
                detail.put("node_no", str_node_no);
                detail.put("model_eng", str_model_eng);
                detail.put("sn_eng", str_sn_eng);
                detail.put("hrs_meter", str_hrs_meter);
                detail.put("insp_name", str_insp_name);
                detail.put("date", str_date);
                //Engine
                detail.put("eng_speed_l", str_eng_speed_l);
                detail.put("eng_speed_h", str_eng_speed_h);
                detail.put("eng_speed_r_off", str_eng_speed_r_off);
                detail.put("eng_speed_r_on", str_eng_speed_r_on);
                detail.put("blw_press", str_blw_press);
                detail.put("lub_oil_press_lw", str_lub_oil_press_lw);
                detail.put("lub_oil_press_tc", str_lub_oil_press_tc);
                detail.put("boost_press", str_boost_press);
                detail.put("exh_gas_tmp_123", str_exh_gas_tmp_123);
                detail.put("exh_gas_tmp_456", str_exh_gas_tmp_456);

                detail.put("rslt_eng", str_rslt_eng);
                //WES
                detail.put("wes_boom_r", str_wes_boom_r);
                detail.put("wes_boom_l", str_wes_boom_l);
                detail.put("wes_arm_i", str_wes_arm_i);
                detail.put("wes_arm_o", str_wes_arm_o);
                detail.put("wes_bucket_c", str_wes_bucket_c);
                detail.put("wes_bucket_d", str_wes_bucket_d);
                detail.put("wes_swing", str_wes_swing);
                detail.put("wes_drv_l", str_wes_drv_l);
                detail.put("wes_drv_r", str_wes_drv_r);

                detail.put("rslt_eqp_spd", str_rslt_eqp_spd);
                //Hydraulic
                detail.put("hst_br_off", str_hst_br_off);
                detail.put("hst_br_on", str_hst_br_on);
                detail.put("ar_i", str_ar_i);
                detail.put("ar_o", str_ar_o);
                detail.put("bucket_r_d", str_bucket_r_d);
                detail.put("bucket_r_c", str_bucket_r_c);
                detail.put("travel_f", str_travel_f);
                detail.put("travel_r", str_travel_r);

                detail.put("rslt_hdy_eqp", str_rslt_hdy_eqp);
                //Rear pump
                detail.put("rp_br_off", str_rp_br_off);
                detail.put("rp_br_on", str_rp_br_on);
                detail.put("rp_ar_i", str_rp_ar_i);
                detail.put("rp_ar_o", str_rp_ar_o);
                detail.put("rp_bucket_r_d", str_rp_bucket_r_d);
                detail.put("rp_bucket_r_c", str_rp_bucket_r_c);
                detail.put("rp_travel_f", str_rp_travel_f);
                detail.put("rp_travel_r", str_rp_travel_r);
                //Swing pump
                detail.put("sp_br_off", str_sp_br_off);
                detail.put("sp_br_on", str_sp_br_on);
                detail.put("sp_ar_i", str_sp_ar_i);
                detail.put("sp_ar_o", str_sp_ar_o);
                detail.put("sp_swing_r", str_sp_swing_r);
                detail.put("sp_swing_l", str_sp_swing_l);
                detail.put("sp_bc_r", str_sp_bc_r);

                detail.put("rslt_pmp", str_rslt_pmp);
                //No name
                detail.put("chg_pmp_l", str_chg_pmp_l);
                detail.put("chg_pmp_h", str_chg_pmp_h);
                detail.put("tvc_vlv_a", str_tvc_vlv_a);
                detail.put("tvc_vlv_e", str_tvc_vlv_e);
                //CO-NC valve pressure
                detail.put("CO_fp_n", str_CO_fp_n);
                detail.put("CO_fp_nc", str_CO_fp_nc);
                detail.put("CO_fp_mp", str_CO_fp_mp);
                detail.put("CO_rp_n", str_CO_rp_n);
                detail.put("CO_rp_nc", str_CO_rp_nc);
                detail.put("CO_rp_mp", str_CO_rp_mp);
                detail.put("CO_sp_n", str_CO_sp_n);
                detail.put("CO_sp_nc", str_CO_sp_nc);
                detail.put("CO_sp_mp", str_CO_sp_mp);

                detail.put("rslt_cocn", str_rslt_cocn);
                //Fan Speed
                detail.put("fs_ac_hi", str_fs_ac_hi);
                detail.put("fs_ac_op", str_fs_ac_op);
                detail.put("fs_cl_hi", str_fs_cl_hi);
                detail.put("fs_cl_op", str_fs_cl_op);

                detail.put("rslt_fan", str_rslt_fan);
                //Hydraulic drift
                detail.put("hd_doe", str_hd_doe);
                detail.put("rslt_hdy_dft", str_rslt_hdy_dft);

                detail.put("ol_rtn_str", str_ol_rtn_str);
                detail.put("rslt_oil_rtn_str", str_rslt_oil_rtn_str);

                detail.put("drn_plg_fd", str_drn_plg_fd);
                detail.put("ol_lk_fd", str_ol_lk_fd);
                detail.put("rslt_fd", str_rslt_fd);
                detail.put("drn_plg_sw", str_drn_plg_sw);
                detail.put("ol_lk_sw", str_ol_lk_sw);
                detail.put("rslt_swing", str_rslt_swing);

                detail.put("scb_axl", str_scb_axl);
                detail.put("rslt_cicle", str_rslt_cicle);

                //Electrical
                detail.put("instrument_pnl", str_instrument_pnl);
                detail.put("start_sys", str_start_sys);
                detail.put("charging_sys", str_charging_sys);
                detail.put("lighting", str_lighting);
                detail.put("battery", str_battery);
                detail.put("wiring_hms", str_wiring_hms);
                detail.put("vhms", str_vhms);

                detail.put("rslt_elct", str_rslt_elct);
                //Optional
                detail.put("emc_sht", str_emc_sht);
                detail.put("logout_swt", str_logout_swt);
                detail.put("pdu", str_pdu);
                detail.put("autolube", str_autolube);
                detail.put("fire_sup", str_fire_sup);
                detail.put("fatique", str_fatique);
                detail.put("bkp_alm", str_bkp_alm);

                detail.put("rslt_opt", str_rslt_opt);
                //General
                detail.put("att_frame", str_att_frame);
                detail.put("machine", str_machine);
                detail.put("undercarriage", str_undercarriage);

                detail.put("rslt_gnrl", str_rslt_gnrl);

                try {
                    //convert this HashMap to encodedUrl to send to php file
                    String dataToSend = hashMapToUrl(detail);
                    //make a Http request and send data to php file
                    String response = Request.post(Config.KONSEP_PC1250_8, dataToSend);

                    //dapatkan respon
                    Log.e("Respon", response);

                    JSONObject ob = new JSONObject(response);
                    scs = ob.getInt("success");

                    psn = ob.getString("message");

                } catch (JSONException e){
                    e.printStackTrace();
                }

            } catch (Exception e){
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            pDialog.dismiss();
            Toast.makeText(McrPc1250_8.this, psn, Toast.LENGTH_SHORT).show();
//            if(scs == 1){
//                Toast.makeText(McrHd465_7R.this, psn, Toast.LENGTH_SHORT).show();
//                finish();
//            }
//            else{
//                Toast.makeText(McrHd465_7R.this, psn, Toast.LENGTH_SHORT).show();
//            }
        }

    }

    private String hashMapToUrl(HashMap<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for(Map.Entry<String, String> entry : params.entrySet()){
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        return result.toString();
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
