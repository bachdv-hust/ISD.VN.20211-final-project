package isd.vn.ecobike.presentation.screen.barcode;

import androidx.lifecycle.ViewModel;

import isd.vn.ecobike.domain.repositories.BarcodeRepositoryInterface;

public class BarcodeViewModel  extends ViewModel {
    private BarcodeRepositoryInterface repository;

    public BarcodeViewModel(BarcodeRepositoryInterface repository) {
        this.repository = repository;
    }

}
