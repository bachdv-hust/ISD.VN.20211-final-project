package isd.vn.ecobike.presentation.di;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import isd.vn.ecobike.domain.repositories.RentBikeRepositoryInterface;
import isd.vn.ecobike.data.repositories.RepositoryFactory;
import isd.vn.ecobike.presentation.screen.rentbike.RentBikeViewModel;


public class ViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(RentBikeViewModel.class)) {
            RentBikeViewModel viewModel = new RentBikeViewModel(RepositoryFactory.initRepository(RentBikeRepositoryInterface.class));
            return (T) viewModel;
        }
        throw new IllegalArgumentException("Unknown ViewModel class name");
    }

    public static <T extends ViewModel> T initViewModel(AppCompatActivity activity, Class<T> classModel) {
        return (T) new ViewModelProvider(activity, new ViewModelFactory())
                .get(classModel);
    }

    public static <T extends ViewModel> T initViewModel(Fragment activity, Class<T> classModel) {
        return (T) new ViewModelProvider(activity, new ViewModelFactory())
                .get(classModel);
    }
}
