package isd.vn.ecobike.presentation.screen.rentbike;

import android.view.View;

import isd.vn.ecobike.databinding.ActivityRentBikeBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class RentBikeActivity extends BaseActivity {

    protected ActivityRentBikeBinding mBinding;

    @Override
    public View createViewBinding() {
        mBinding = ActivityRentBikeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {

    }
}