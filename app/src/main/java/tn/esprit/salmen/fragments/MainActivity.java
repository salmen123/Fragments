package tn.esprit.salmen.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tn.esprit.salmen.fragments.fragments.PrisonerDetailFragment;
import tn.esprit.salmen.fragments.fragments.PrisonerListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrisonerListFragment prisonerListFragment = new PrisonerListFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, prisonerListFragment);
        fragmentTransaction.commit();
    }
}
