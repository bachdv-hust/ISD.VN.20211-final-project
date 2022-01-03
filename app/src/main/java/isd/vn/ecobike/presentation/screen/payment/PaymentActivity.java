package isd.vn.ecobike.presentation.screen.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import isd.vn.ecobike.databinding.ActivityPaymentBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class PaymentActivity extends BaseActivity {


    private ActivityPaymentBinding mBinding ;
    @Override
    public View createViewBinding() {
        mBinding = ActivityPaymentBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {

    }
}