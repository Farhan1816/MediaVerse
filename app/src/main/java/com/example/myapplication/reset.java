package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class reset extends Fragment implements View.OnClickListener {

    public reset() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_reset, container, false);
        TextView log = view.findViewById(R.id.textView7);
        log.setOnClickListener(this);

        TextView signup = view.findViewById(R.id.textView8);
        signup.setOnClickListener(this);

        Button reset = view.findViewById(R.id.login);
        reset.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textView7) {
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            login lll = new login();
            fragmentTransaction.replace(R.id.fragmentContainer, lll);
            fragmentTransaction.commit();
        }
        else if (v.getId() == R.id.textView8) {
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            signup sss = new signup();
            fragmentTransaction.replace(R.id.fragmentContainer, sss);
            fragmentTransaction.commit();
        }
        else if (v.getId() == R.id.login) {
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            otp ooo = new otp();
            fragmentTransaction.replace(R.id.fragmentContainer, ooo);
            fragmentTransaction.commit();
        }
    }
}