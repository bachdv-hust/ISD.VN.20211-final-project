package isd.vn.ecobike.presentation.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = createViewBinding();
        setContentView(view);
        afterCreateView();
    }

    public abstract View createViewBinding() ;

    public abstract void afterCreateView();
}
