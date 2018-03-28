package tn.esprit.salmen.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import tn.esprit.salmen.fragments.MainActivity;
import tn.esprit.salmen.fragments.R;
import tn.esprit.salmen.fragments.adapters.PrisonerAdapter;
import tn.esprit.salmen.fragments.utils.PrisonerContent;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrisonerListFragment extends Fragment {

    ListView lvPrisoners;

    public PrisonerListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_prisoner_list, container, false);

        lvPrisoners = (ListView) view.findViewById(R.id.lv_prisoners);

        PrisonerAdapter adapter = new PrisonerAdapter(getActivity(), R.layout.item_prisoner, PrisonerContent.getPrisoners());
        lvPrisoners.setAdapter(adapter);

        lvPrisoners.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PrisonerDetailFragment prisonerDetailFragment = PrisonerDetailFragment.newInstance(PrisonerContent.getPrisoners().get(position).getName(), PrisonerContent.getPrisoners().get(position).getMat(), PrisonerContent.getPrisoners().get(position).getDuration(), PrisonerContent.getPrisoners().get(position).getImageRes());
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, prisonerDetailFragment , PrisonerDetailFragment.TAG);
                //Add Fragment to back Stack
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
