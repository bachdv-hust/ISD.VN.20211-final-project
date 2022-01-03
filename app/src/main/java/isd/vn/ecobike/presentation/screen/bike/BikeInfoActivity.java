package isd.vn.ecobike.presentation.screen.bike;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import isd.vn.ecobike.databinding.ActivityBikeInfoBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class BikeInfoActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent starter = new Intent(context, BikeInfoActivity.class);
        context.startActivity(starter);
    }

    protected ActivityBikeInfoBinding mBinding;

    @Override
    public View createViewBinding() {
        mBinding = ActivityBikeInfoBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {
        mBinding.ivBack.setOnClickListener(view -> {
            finish();
        });
    }
}