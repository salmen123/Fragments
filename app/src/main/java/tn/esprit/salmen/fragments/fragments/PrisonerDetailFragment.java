package tn.esprit.salmen.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import tn.esprit.salmen.fragments.MainActivity;
import tn.esprit.salmen.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrisonerDetailFragment extends Fragment {

    public static String TAG="PrisonerDetailFragment";

    String name;
    String mat;
    String duration;
    int imageRes;

    ImageView imgPrisoner;
    TextView tvName, tvMat, tvDuration;

    public PrisonerDetailFragment() {
        // Required empty public constructor
    }

    public static PrisonerDetailFragment newInstance(String name, String mat, String duration, int imageRes) {
        PrisonerDetailFragment fragment = new PrisonerDetailFragment();
        fragment.name = name;
        fragment.mat = mat;
        fragment.duration = duration;
        fragment.imageRes = imageRes;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_prisoner_detail, container, false);

        imgPrisoner = (ImageView) view.findViewById(R.id.imgPrisonerBig);
        tvName = (TextView) view.findViewById(R.id.tv_prisoner_detail_name);
        tvMat = (TextView) view.findViewById(R.id.tv_prisoner_detail_mat);
        tvDuration = (TextView) view.findViewById(R.id.tv_prisoner_detail_duration);

        imgPrisoner.setImageResource(imageRes);
        tvName.setText(name);
        tvMat.setText(mat);
        tvDuration.setText(duration);

        // Inflate the layout for this fragment
        return view;
    }

}
