package isd.vn.ecobike.data.repositories;

import androidx.annotation.NonNull;

import isd.vn.ecobike.domain.repositories.BarcodeRepositoryInterface;
import isd.vn.ecobike.domain.repositories.PaymentRepositoryInterface;
import isd.vn.ecobike.domain.repositories.RentBikeRepositoryInterface;

public class RepositoryFactory {

    private static <T> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(RentBikeRepositoryInterface.class)) {
            RentBikeRepositoryImpl repository = new RentBikeRepositoryImpl();
            return (T) repository;
        }
        if (modelClass.isAssignableFrom(PaymentRepositoryInterface.class)){
            PaymentRepositoryImpl repository = new PaymentRepositoryImpl();
            return (T) repository;
        }
        if (modelClass.isAssignableFrom(BarcodeRepositoryInterface.class)){
            BarcodeRepositoryImpl repository = new BarcodeRepositoryImpl();
            return (T) repository;
        }

        throw new IllegalArgumentException("Unknown ViewModel class name");
    }

    public static <T> T initRepository(Class<T> classModel) {
        return create(classModel);
    }
}
