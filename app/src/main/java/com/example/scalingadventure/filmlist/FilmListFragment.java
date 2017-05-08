package com.example.scalingadventure.filmlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.scalingadventure.R;
import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.selectedfilm.SelectedFilmActivity;
import com.google.gson.Gson;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by stefanmay on 07/11/2016.
 */

public class FilmListFragment extends Fragment implements FilmListContract.View{

    private Unbinder unbinder;
    private FilmListAdapter filmListAdapter;

    FilmListContract.Presenter presenter;

    public static final FilmListFragment getInstance() {
        return new FilmListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        filmListAdapter = new FilmListAdapter();
        filmListAdapter.setOnItemClickListener(film -> presenter.onItemSelected(film));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_films_list, container, false);

        unbinder = ButterKnife.bind(this, view);

        RecyclerView recyclerView = ButterKnife.findById(view, R.id.recyclerView);
        recyclerView.setAdapter(filmListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setHasFixedSize(true);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        presenter.doRefresh();
    }

    @Override
    public void onRefresh(Film[] films) {
        filmListAdapter.setFilms(films);
    }

    @Override
    public void showSelectedItem(Film film) {

        Gson gson = new Gson();
        String json = gson.toJson(film, Film.class);

        Intent intent = new Intent(getActivity(), SelectedFilmActivity.class);
        intent.putExtra(SelectedFilmActivity.EXTRA_FILM, json);
        startActivity(intent);
    }

    @Override
    public void setPresenter(FilmListContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
