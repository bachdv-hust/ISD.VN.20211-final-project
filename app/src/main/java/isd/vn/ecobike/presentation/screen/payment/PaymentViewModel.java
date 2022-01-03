package isd.vn.ecobike.presentation.screen.payment;

import androidx.lifecycle.ViewModel;

import isd.vn.ecobike.domain.repositories.PaymentRepositoryInterface;

public class PaymentViewModel extends ViewModel {
    private PaymentRepositoryInterface repository;

    public PaymentViewModel(PaymentRepositoryInterface repository) {
        this.repository = repository;
    }

}
