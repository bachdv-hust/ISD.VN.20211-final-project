package isd.vn.ecobike.presentation.screen.rentbike;

import android.view.View;

import isd.vn.ecobike.databinding.ActivityRentBikeBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;
import isd.vn.ecobike.presentation.di.ViewModelFactory;

public class RentBikeActivity extends BaseActivity {

    protected ActivityRentBikeBinding mBinding;
    private RentBikeViewModel viewModel;
    @Override
    public View createViewBinding() {
        mBinding = ActivityRentBikeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {
        viewModel = ViewModelFactory.initViewModel(this,RentBikeViewModel.class);
    }
}