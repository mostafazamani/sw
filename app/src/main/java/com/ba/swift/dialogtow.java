package com.ba.swift;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Mostafa on 7/3/2018.
 */

public class dialogtow extends DialogFragment implements View.OnClickListener {

    Button next, cancel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dialog_next, container, false);


        next = (Button) rootView.findViewById(R.id.next);
        cancel = (Button) rootView.findViewById(R.id.cancel);

        next.setOnClickListener(this);
        cancel.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == next.getId()) {
            startActivity(new Intent(getContext(), testtow.class));
            getActivity().finish();

        } else if (v.getId() == cancel.getId()) {
            startActivity(new Intent(getContext(), MainActivity.class));

            dismiss();
            getActivity().finish();
        }


    }



}
