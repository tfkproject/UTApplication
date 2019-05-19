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

public class McrHd785_7 extends AppCompatActivity {

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
    eng_speed_li_l,
    eng_speed_li_h,
    eng_speed_pm_h,
    eng_speed_em_h,
    eng_speed_h_rh,
    eng_speed_h_rl,
    tc_stall_am,
    tc_stall_bm,
    tc_stall_cm,
    tc_stall_dm,
    blw_press,
    lub_oil_press_rs,
    lub_oil_press_li,
    boost_press_rh,
    boost_press_lh,
    exh_gas_tmp_am,
    exh_gas_tmp_rh,
    exh_gas_tmp_lh;
    private EditText rslt_eng;

    //torque converter & transmission
    private EditText
    torque_cvt_i,
    torque_cvt_o,
    torque_bf,
    torque_bn,
    torque_tl,
    main_relief_oil_press_r,
    main_relief_oil_press_f;
    private EditText rslt_tq;

    //Streering
    private EditText
    str_relieve_press_l,
    str_relieve_press_rs,
    str_time_lcl_rl,
    str_time_lcl_lr;
    private EditText rslt_str;

    //Brake
    private EditText
    brake_oil_prs_sb,
    brake_oil_prs_rt,
    chr_valve_prs_ci,
    chr_valve_prs_co,
    service_brk,
    retarder_brk,
    parking_brk,
    emc_brk;
    private EditText rslt_brk;

    //Hydraulic Equipment
    private EditText
    hois_rf_prs,
    hd_rs,
    hd_lw,
    dump_h,
    dump_l,
    dump_rs,
    dump_lw,
    hyd_dft;
    private EditText rslt_hdy;

    //Suspension
    private EditText
    left_fnt,
    right_fnt,
    left_rear,
    right_rear,
    left_fnt_lg,
    right_fnt_lg,
    left_rear_lg,
    right_rear_lg;
    private EditText rslt_ssp;

    //Differential & Final Drive
    private EditText
    diff_drn_plg,
    fd_drn_plg_l,
    fd_drn_plg_r;
    private EditText rslt_fd;

    //Electrical
    private EditText
    instrument_pnl,
    start_sys,
    charging_sys,
    lighting,
    battery,
    wiring_hms,
    vhms;
    private EditText rslt_elec;

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
    machine;
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
            str_eng_speed_li_l,
            str_eng_speed_li_h,
            str_eng_speed_pm_h,
            str_eng_speed_em_h,
            str_eng_speed_h_rh,
            str_eng_speed_h_rl,
            str_tc_stall_am,
            str_tc_stall_bm,
            str_tc_stall_cm,
            str_tc_stall_dm,
            str_blw_press,
            str_lub_oil_press_rs,
            str_lub_oil_press_li,
            str_boost_press_rh,
            str_boost_press_lh,
            str_exh_gas_tmp_am,
            str_exh_gas_tmp_rh,
            str_exh_gas_tmp_lh;
    private String str_rslt_eng;

    //Torque converter & transmission
    private String
            str_torque_cvt_i,
            str_torque_cvt_o,
            str_torque_bf,
            str_torque_bn,
            str_torque_tl,
            str_main_relief_oil_press_r,
            str_main_relief_oil_press_f;
    private String str_rslt_tq;

    //Streering
    private String
            str_str_relieve_press_l,
            str_str_relieve_press_rs,
            str_str_time_lcl_rl,
            str_str_time_lcl_lr;
    private String str_rslt_str;

    //Brake
    private String
            str_brake_oil_prs_sb,
            str_brake_oil_prs_rt,
            str_chr_valve_prs_ci,
            str_chr_valve_prs_co,
            str_service_brk,
            str_retarder_brk,
            str_parking_brk,
            str_emc_brk;
    private String str_rslt_brk;

    //Hydraulic Equipment
    private String
            str_hois_rf_prs,
            str_hd_rs,
            str_hd_lw,
            str_dump_h,
            str_dump_l,
            str_dump_rs,
            str_dump_lw,
            str_hyd_dft;
    private String str_rslt_hdy;

    //Suspension
    private String
            str_left_fnt,
            str_right_fnt,
            str_left_rear,
            str_right_rear,
            str_left_fnt_lg,
            str_right_fnt_lg,
            str_left_rear_lg,
            str_right_rear_lg;
    private String str_rslt_ssp;

    //Differential & Final Drive
    private String
            str_diff_drn_plg,
            str_fd_drn_plg_l,
            str_fd_drn_plg_r;
    private String str_rslt_fd;

    //Electrical
    private String
            str_instrument_pnl,
            str_start_sys,
            str_charging_sys,
            str_lighting,
            str_battery,
            str_wiring_hms,
            str_vhms;
    private String str_rslt_elec;

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
            str_machine;
    private String str_rslt_gnrl;

    private Button btnSave;

    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcr_hd785_7);

        getSupportActionBar().setTitle(getResources().getString(R.string.mcr_hd785_7));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        customer = findViewById(R.id.txt_customer);
        sn_unit = findViewById(R.id.txt_sn_unit);
        node_no = findViewById(R.id.txt_code_no);
        model_eng = findViewById(R.id.txt_model_eng);
        sn_eng = findViewById(R.id.txt_sn_eng);
        hrs_meter = findViewById(R.id.txt_hours_mtr);
        insp_name = findViewById(R.id.txt_insp_name);
        date = findViewById(R.id.txt_date);

        eng_speed_li_l = findViewById(R.id.txt_eng_spd_li_l);
        eng_speed_li_h = findViewById(R.id.txt_eng_spd_li_h);
        eng_speed_pm_h = findViewById(R.id.txt_eng_spd_pm_h);
        eng_speed_em_h = findViewById(R.id.txt_eng_spd_em_h);
        eng_speed_h_rh = findViewById(R.id.txt_eng_spd_h_rh);
        eng_speed_h_rl = findViewById(R.id.txt_eng_spd_h_rl);
        tc_stall_am = findViewById(R.id.txt_tc_stall_am);
        tc_stall_bm = findViewById(R.id.txt_tc_stall_bm);
        tc_stall_cm = findViewById(R.id.txt_tc_stall_cm);
        tc_stall_dm = findViewById(R.id.txt_tc_stall_dm);
        blw_press = findViewById(R.id.txt_blw_press);
        lub_oil_press_rs = findViewById(R.id.txt_lbo_press_rs);
        lub_oil_press_li = findViewById(R.id.txt_lbo_press_li);
        boost_press_rh = findViewById(R.id.txt_bst_press_rh);
        boost_press_lh = findViewById(R.id.txt_bst_press_lh);
        exh_gas_tmp_am = findViewById(R.id.txt_exh_gas_tmp_am);
        exh_gas_tmp_rh = findViewById(R.id.txt_exh_gas_tmp_rh);
        exh_gas_tmp_lh = findViewById(R.id.txt_exh_gas_tmp_lh);

        rslt_eng = findViewById(R.id.txt_rslt_eng);

        torque_cvt_i = findViewById(R.id.txt_tq_cvt_i);
        torque_cvt_o = findViewById(R.id.txt_tq_cvt_o);
        torque_bf = findViewById(R.id.txt_tq_bf);
        torque_bn = findViewById(R.id.txt_tq_bn);
        torque_tl = findViewById(R.id.txt_tq_tl);
        main_relief_oil_press_r = findViewById(R.id.txt_rl_ol_press_r);
        main_relief_oil_press_f = findViewById(R.id.txt_rl_ol_press_f);

        rslt_tq = findViewById(R.id.txt_rslt_tq);

        str_relieve_press_l = findViewById(R.id.txt_str_rlv_press_l);
        str_relieve_press_rs = findViewById(R.id.txt_str_rlv_press_rs);
        str_time_lcl_rl = findViewById(R.id.txt_str_tm_lck_rl);
        str_time_lcl_lr = findViewById(R.id.txt_str_tm_lck_lr);

        rslt_str = findViewById(R.id.txt_rslt_str);

        brake_oil_prs_sb = findViewById(R.id.txt_brk_ol_prs_sb);
        brake_oil_prs_rt = findViewById(R.id.txt_brk_ol_prs_rt);
        chr_valve_prs_ci = findViewById(R.id.txt_crg_vlv_prs_ci);
        chr_valve_prs_co = findViewById(R.id.txt_crg_vlv_prs_co);
        service_brk = findViewById(R.id.txt_srv_brk);
        retarder_brk = findViewById(R.id.txt_rtd_brk);
        parking_brk = findViewById(R.id.txt_prkg_brk);
        emc_brk = findViewById(R.id.txt_emg_brk);

        rslt_brk = findViewById(R.id.txt_rslt_brk);

        hois_rf_prs = findViewById(R.id.txt_hst_rlf_prs);
        hd_rs = findViewById(R.id.txt_hd_rs);
        hd_lw = findViewById(R.id.txt_hd_lw);
        dump_h = findViewById(R.id.txt_dmp_h);
        dump_l = findViewById(R.id.txt_dmp_l);
        dump_rs = findViewById(R.id.txt_dmp_rs);
        dump_lw = findViewById(R.id.txt_dmp_lw);
        hyd_dft = findViewById(R.id.txt_hyd_dft);

        rslt_hdy = findViewById(R.id.txt_rslt_hdy);

        left_fnt = findViewById(R.id.txt_lft_fnt);
        right_fnt = findViewById(R.id.txt_rgt_fnt);
        left_rear = findViewById(R.id.txt_lft_rr);
        right_rear = findViewById(R.id.txt_rgt_rr);
        left_fnt_lg = findViewById(R.id.txt_lft_fnt_lg);
        right_fnt_lg = findViewById(R.id.txt_rgt_fnt_lg);
        left_rear_lg = findViewById(R.id.txt_lft_rr_lg);
        right_rear_lg = findViewById(R.id.txt_rgt_rr_lg);

        rslt_ssp = findViewById(R.id.txt_rslt_ssp);

        diff_drn_plg = findViewById(R.id.txt_dff_drn_plg);
        fd_drn_plg_l = findViewById(R.id.txt_fd_drn_plg_l);
        fd_drn_plg_r = findViewById(R.id.txt_fd_drn_plg_r);

        rslt_fd = findViewById(R.id.txt_rslt_fd);

        instrument_pnl = findViewById(R.id.txt_instr_pnl);
        start_sys = findViewById(R.id.txt_srt_syt);
        charging_sys = findViewById(R.id.txt_chr_syt);
        lighting = findViewById(R.id.txt_lgt);
        battery = findViewById(R.id.txt_btr);
        wiring_hms = findViewById(R.id.txt_wrg_hrn);
        vhms = findViewById(R.id.txt_vhms);

        rslt_elec = findViewById(R.id.txt_rslt_elec);

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

                str_eng_speed_li_l = eng_speed_li_l.getText().toString();
                str_eng_speed_li_h = eng_speed_li_h.getText().toString();
                str_eng_speed_pm_h = eng_speed_pm_h.getText().toString();
                str_eng_speed_em_h = eng_speed_em_h.getText().toString();
                str_eng_speed_h_rh = eng_speed_h_rh.getText().toString();
                str_eng_speed_h_rl = eng_speed_h_rl.getText().toString();
                str_tc_stall_am = tc_stall_am.getText().toString();
                str_tc_stall_bm = tc_stall_bm.getText().toString();
                str_tc_stall_cm = tc_stall_cm.getText().toString();
                str_tc_stall_dm = tc_stall_dm.getText().toString();
                str_blw_press = blw_press.getText().toString();
                str_lub_oil_press_rs = lub_oil_press_rs.getText().toString();
                str_lub_oil_press_li = lub_oil_press_li.getText().toString();
                str_boost_press_rh = boost_press_rh.getText().toString();
                str_boost_press_lh = boost_press_lh.getText().toString();
                str_exh_gas_tmp_am = exh_gas_tmp_am.getText().toString();
                str_exh_gas_tmp_rh = exh_gas_tmp_rh.getText().toString();
                str_exh_gas_tmp_lh = exh_gas_tmp_lh.getText().toString();

                str_rslt_eng = rslt_eng.getText().toString();

                str_torque_cvt_i = torque_cvt_i.getText().toString();
                str_torque_cvt_o = torque_cvt_o.getText().toString();
                str_torque_bf = torque_bf.getText().toString();
                str_torque_bn = torque_bn.getText().toString();
                str_torque_tl = torque_tl.getText().toString();
                str_main_relief_oil_press_r = main_relief_oil_press_r.getText().toString();
                str_main_relief_oil_press_f = main_relief_oil_press_f.getText().toString();

                str_rslt_tq = rslt_tq.getText().toString();

                str_str_relieve_press_l = str_relieve_press_l.getText().toString();
                str_str_relieve_press_rs = str_relieve_press_rs.getText().toString();
                str_str_time_lcl_rl = str_time_lcl_rl.getText().toString();
                str_str_time_lcl_lr = str_time_lcl_lr.getText().toString();

                str_rslt_str = rslt_str.getText().toString();

                str_brake_oil_prs_sb = brake_oil_prs_sb.getText().toString();
                str_brake_oil_prs_rt = brake_oil_prs_rt.getText().toString();
                str_chr_valve_prs_ci = chr_valve_prs_ci.getText().toString();
                str_chr_valve_prs_co = chr_valve_prs_co.getText().toString();
                str_service_brk = service_brk.getText().toString();
                str_retarder_brk = retarder_brk.getText().toString();
                str_parking_brk = parking_brk.getText().toString();
                str_emc_brk = emc_brk.getText().toString();

                str_rslt_brk = rslt_brk.getText().toString();

                str_hois_rf_prs = hois_rf_prs.getText().toString();
                str_hd_rs = hd_rs.getText().toString();
                str_hd_lw = hd_lw.getText().toString();
                str_dump_h = dump_h.getText().toString();
                str_dump_l = dump_l.getText().toString();
                str_dump_rs = dump_rs.getText().toString();
                str_dump_lw = dump_lw.getText().toString();
                str_hyd_dft = hyd_dft.getText().toString();

                str_rslt_hdy = rslt_hdy.getText().toString();

                str_left_fnt = left_fnt.getText().toString();
                str_right_fnt = right_fnt.getText().toString();
                str_left_rear = left_rear.getText().toString();
                str_right_rear = right_rear.getText().toString();
                str_left_fnt_lg = left_fnt_lg.getText().toString();
                str_right_fnt_lg = right_fnt_lg.getText().toString();
                str_left_rear_lg = left_rear_lg.getText().toString();
                str_right_rear_lg = right_rear_lg.getText().toString();

                str_rslt_ssp = rslt_ssp.getText().toString();

                str_diff_drn_plg = diff_drn_plg.getText().toString();
                str_fd_drn_plg_l = fd_drn_plg_l.getText().toString();
                str_fd_drn_plg_r = fd_drn_plg_r.getText().toString();

                str_rslt_fd = rslt_fd.getText().toString();

                str_instrument_pnl = instrument_pnl.getText().toString();
                str_start_sys = start_sys.getText().toString();
                str_charging_sys = charging_sys.getText().toString();
                str_lighting = lighting.getText().toString();
                str_battery = battery.getText().toString();
                str_wiring_hms = wiring_hms.getText().toString();
                str_vhms = vhms.getText().toString();

                str_rslt_elec = rslt_elec.getText().toString();

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
            pDialog = new ProgressDialog(McrHd785_7.this);
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
                detail.put("eng_speed_li_l", str_eng_speed_li_l);
                detail.put("eng_speed_li_h", str_eng_speed_li_h);
                detail.put("eng_speed_pm_h", str_eng_speed_pm_h);
                detail.put("eng_speed_em_h", str_eng_speed_em_h);
                detail.put("eng_speed_h_rh", str_eng_speed_h_rh);
                detail.put("eng_speed_h_rl", str_eng_speed_h_rl);
                detail.put("tc_stall_am", str_tc_stall_am);
                detail.put("tc_stall_bm", str_tc_stall_bm);
                detail.put("tc_stall_cm", str_tc_stall_cm);
                detail.put("tc_stall_dm", str_tc_stall_dm);
                detail.put("blw_press", str_blw_press);
                detail.put("lub_oil_press_rs", str_lub_oil_press_rs);
                detail.put("lub_oil_press_li", str_lub_oil_press_li);
                detail.put("boost_press_rh", str_boost_press_rh);
                detail.put("boost_press_lh", str_boost_press_lh);
                detail.put("exh_gas_tmp_am", str_exh_gas_tmp_am);
                detail.put("exh_gas_tmp_rh", str_exh_gas_tmp_rh);
                detail.put("exh_gas_tmp_lh", str_exh_gas_tmp_lh);

                detail.put("rslt_eng", str_rslt_eng);
                //Torque
                detail.put("torque_cvt_i", str_torque_cvt_i);
                detail.put("torque_cvt_o", str_torque_cvt_o);
                detail.put("torque_bf", str_torque_bf);
                detail.put("torque_bn", str_torque_bn);
                detail.put("torque_tl", str_torque_tl);
                detail.put("main_relief_oil_press_r", str_main_relief_oil_press_r);
                detail.put("main_relief_oil_press_f", str_main_relief_oil_press_f);

                detail.put("rslt_tq", str_rslt_tq);
                //Steering
                detail.put("str_relieve_press_l", str_str_relieve_press_l);
                detail.put("str_relieve_press_rs", str_str_relieve_press_rs);
                detail.put("str_time_lcl_rl", str_str_time_lcl_rl);
                detail.put("str_time_lcl_lr", str_str_time_lcl_lr);

                detail.put("rslt_str", str_rslt_str);
                //Brake
                detail.put("brake_oil_prs_sb", str_brake_oil_prs_sb);
                detail.put("brake_oil_prs_rt", str_brake_oil_prs_rt);
                detail.put("chr_valve_prs_ci", str_chr_valve_prs_ci);
                detail.put("chr_valve_prs_co", str_chr_valve_prs_co);
                detail.put("service_brk", str_service_brk);
                detail.put("retarder_brk", str_retarder_brk);
                detail.put("parking_brk", str_parking_brk);
                detail.put("emc_brk", str_emc_brk);

                detail.put("rslt_brk", str_rslt_brk);
                //Hydraulic
                detail.put("hois_rf_prs", str_hois_rf_prs);
                detail.put("hd_rs", str_hd_rs);
                detail.put("hd_lw", str_hd_lw);
                detail.put("dump_l", str_dump_l);
                detail.put("dump_h", str_dump_h);
                detail.put("dump_rs", str_dump_rs);
                detail.put("dump_lw", str_dump_lw);
                detail.put("hyd_dft", str_hyd_dft);

                detail.put("rslt_hdy", str_rslt_hdy);
                //Suspension
                detail.put("left_fnt", str_left_fnt);
                detail.put("right_fnt", str_right_fnt);
                detail.put("left_rear", str_left_rear);
                detail.put("right_rear", str_right_rear);
                detail.put("left_fnt_lg", str_left_fnt_lg);
                detail.put("right_fnt_lg", str_right_fnt_lg);
                detail.put("left_rear_lg", str_left_rear_lg);
                detail.put("right_rear_lg", str_right_rear_lg);

                detail.put("rslt_ssp", str_rslt_ssp);
                //Final Drive
                detail.put("diff_drn_plg", str_diff_drn_plg);
                detail.put("fd_drn_plg_l", str_fd_drn_plg_l);
                detail.put("fd_drn_plg_r", str_fd_drn_plg_r);

                detail.put("rslt_fd", str_rslt_fd);
                //Electrical
                detail.put("instrument_pnl", str_instrument_pnl);
                detail.put("start_sys", str_start_sys);
                detail.put("charging_sys", str_charging_sys);
                detail.put("lighting", str_lighting);
                detail.put("battery", str_battery);
                detail.put("wiring_hms", str_wiring_hms);
                detail.put("vhms", str_vhms);

                detail.put("rslt_elec", str_rslt_elec);
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

                detail.put("rslt_gnrl", str_rslt_gnrl);

                try {
                    //convert this HashMap to encodedUrl to send to php file
                    String dataToSend = hashMapToUrl(detail);
                    //make a Http request and send data to php file
                    String response = Request.post(Config.KONSEP_HD785_7, dataToSend);

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
            Toast.makeText(McrHd785_7.this, psn, Toast.LENGTH_SHORT).show();
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
