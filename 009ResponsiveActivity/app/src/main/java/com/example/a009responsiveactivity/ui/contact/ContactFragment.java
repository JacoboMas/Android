package com.example.a009responsiveactivity.ui.contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a009responsiveactivity.databinding.FragmentContactBinding;


import java.util.zip.Inflater;

public class ContactFragment  extends Fragment {

    private FragmentContactBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContactViewModel contactViewModel =
                new ViewModelProvider(this).get(ContactViewModel.class);



        binding = FragmentContactBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContact;
        contactViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}