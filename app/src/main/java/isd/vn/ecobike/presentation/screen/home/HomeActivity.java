package isd.vn.ecobike.presentation.screen.home;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import isd.vn.ecobike.databinding.ActivityHomeBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;
import isd.vn.ecobike.presentation.screen.Router;
import isd.vn.ecobike.presentation.screen.home.adapter.HomeAdapter;

public class HomeActivity extends BaseActivity {

    protected ActivityHomeBinding mBinding ;
    @Override
    public View createViewBinding() {
        mBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }
    private HomeAdapter mAdapter ;
    @Override
    public void afterCreateView() {
        mBinding.btnRentBike.setOnClickListener(view->{
            Router.startScreen(this,Router.ScreenName.RENT_BIKE_SCREEN,new Object());
        });
        mAdapter = new HomeAdapter();
        mBinding.rvStations.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rvStations.setAdapter(mAdapter);


    }
}