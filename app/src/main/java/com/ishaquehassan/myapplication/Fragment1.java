package com.ishaquehassan.myapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText et1 = getView().findViewById(R.id.et1);
        Button btn1 = getView().findViewById(R.id.btn1);

        final MainActivity mainActivity = ((MainActivity)getActivity());
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainActivity != null && mainActivity.fragment2 != null){
                    TextView tv1 = mainActivity.fragment2.getView().findViewById(R.id.tv1);
                    tv1.setText(et1.getText().toString());
                }
            }
        });

    }
}
