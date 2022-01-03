package isd.vn.ecobike.presentation.screen.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import isd.vn.ecobike.R;
import isd.vn.ecobike.databinding.ActivityMainBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;
import isd.vn.ecobike.presentation.screen.Router;

public class MainActivity extends BaseActivity {


    protected ActivityMainBinding mBinding ;
    @Override
    public View createViewBinding() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {
        Router.startScreen(MainActivity.this, Router.ScreenName.BARCODE_SCREEN,new Object());
    }
}