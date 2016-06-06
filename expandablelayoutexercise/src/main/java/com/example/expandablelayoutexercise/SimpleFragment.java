package com.example.expandablelayoutexercise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.cachapa.expandablelayout.ExpandableLinearLayout;

public class SimpleFragment extends Fragment implements View.OnClickListener {

    private ExpandableLinearLayout expandableLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.simple_fragment, container, false);

        expandableLayout = (ExpandableLinearLayout) rootView.findViewById(R.id.expandable_layout);
        rootView.findViewById(R.id.expand_button).setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        expandableLayout.toggle();
    }
}
