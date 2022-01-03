package isd.vn.ecobike.presentation.screen.rentbike;

import android.view.View;

import isd.vn.ecobike.databinding.ActivityRentingBikeBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class RentingBikeActivity extends BaseActivity {
    protected ActivityRentingBikeBinding mBinding;

    @Override
    public View createViewBinding() {
        mBinding = ActivityRentingBikeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {

    }
}