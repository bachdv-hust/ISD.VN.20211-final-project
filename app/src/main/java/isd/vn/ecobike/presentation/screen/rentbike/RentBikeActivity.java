package isd.vn.ecobike.presentation.screen.rentbike;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import isd.vn.ecobike.databinding.ActivityRentBikeBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;
import isd.vn.ecobike.presentation.di.ViewModelFactory;
import isd.vn.ecobike.presentation.screen.bike.BikeInfoActivity;

public class RentBikeActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent starter = new Intent(context, RentBikeActivity.class);
        context.startActivity(starter);
    }
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
        observerViewModel();
        mBinding.ivBack.setOnClickListener(view->{
            finish();
        });
    }

    private void observerViewModel() {
        
    }
}