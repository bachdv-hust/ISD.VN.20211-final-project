package isd.vn.ecobike.presentation.screen.home.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import isd.vn.ecobike.databinding.LayoutItemStationsBinding;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {


    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(LayoutItemStationsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class HomeViewHolder extends RecyclerView.ViewHolder {
    private LayoutItemStationsBinding mBinding ;
    public HomeViewHolder(@NonNull LayoutItemStationsBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }
    public void bindData(){

    }
}
