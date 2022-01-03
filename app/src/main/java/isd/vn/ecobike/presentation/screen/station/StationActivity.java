package isd.vn.ecobike.presentation.screen.station;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import isd.vn.ecobike.R;
import isd.vn.ecobike.databinding.ActivityStationBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;
import isd.vn.ecobike.presentation.screen.bike.BikeInfoActivity;

public class StationActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent starter = new Intent(context, StationActivity.class);
        context.startActivity(starter);
    }


    private ActivityStationBinding mBiding;

    @Override
    public View createViewBinding() {
        mBiding = ActivityStationBinding.inflate(getLayoutInflater());
        return mBiding.getRoot();
    }

    @Override
    public void afterCreateView() {
        mBiding.ivBack.setOnClickListener(view ->{
            finish();
        });
    }
}