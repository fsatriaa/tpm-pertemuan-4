package com.fdev22.pertemuan42;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesFragment extends Fragment {
    HeroesAdapter heroesAdapter;

    public HeroesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_heroes, container, false);

        RecyclerView rvHero = (RecyclerView) rootView.findViewById(R.id.activityMain_rv_hero);

        rvHero.setLayoutManager(new LinearLayoutManager(getActivity()));

        HeroesAdapter heroesAdapter = new HeroesAdapter(getActivity());

        heroesAdapter.setHeroes(HeroesData.getHeroesList());

        rvHero.setAdapter(heroesAdapter);

        return rootView;
    }
}