package isd.vn.ecobike.presentation.screen.rentbike;

import androidx.lifecycle.ViewModel;

import isd.vn.ecobike.domain.repositories.RentBikeRepositoryInterface;

public class RentBikeViewModel extends ViewModel {
    private RentBikeRepositoryInterface repository;
    public RentBikeViewModel(RentBikeRepositoryInterface repository){
        this.repository = repository;
    }



}
