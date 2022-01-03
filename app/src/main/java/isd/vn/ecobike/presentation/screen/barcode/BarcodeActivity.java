package isd.vn.ecobike.presentation.screen.barcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import isd.vn.ecobike.R;
import isd.vn.ecobike.databinding.ActivityBarcodeBinding;
import isd.vn.ecobike.databinding.ActivityMainBinding;
import isd.vn.ecobike.presentation.base.BaseActivity;

public class BarcodeActivity extends BaseActivity {

    public static void startActivity(Context context){
        Intent starter = new Intent(context,BarcodeActivity.class);
        context.startActivity(starter);
    }


    private ActivityBarcodeBinding mBinding ;
    @Override
    public View createViewBinding() {
        mBinding = ActivityBarcodeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void afterCreateView() {
        mBinding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}