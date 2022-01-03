package isd.vn.ecobike.presentation.screen.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import isd.vn.ecobike.R;
import isd.vn.ecobike.databinding.ActivityMainBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected ActivityMainBinding mBinding ;
    @Override
    public View createViewBinding() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {

    }
}