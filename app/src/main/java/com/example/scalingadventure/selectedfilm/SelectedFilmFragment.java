package com.example.scalingadventure.selectedfilm;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.scalingadventure.R;
import com.example.scalingadventure.data.Character;
import com.example.scalingadventure.data.Film;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by stefanmay on 08/11/2016.
 */

public class SelectedFilmFragment extends Fragment implements SelectedFilmContract.View{

    private Unbinder unbinder;
    private SelectedFilmContract.Presenter mPresenter;
    private Film film;

    @BindView(R.id.txt_producer)
    TextView txtProducer;

    @BindView(R.id.txt_director)
    TextView txtDirector;

    @BindView(R.id.txt_openingCrawl)
    TextView txtCrawl;

    @BindView(R.id.txt_releaseDate)
    TextView txtReleaseDate;

    @BindView(R.id.txt_title)
    TextView txtTitle;

    @BindView(R.id.layout_characters)
    GridLayout gridCharacters;

    public static final SelectedFilmFragment getInstance() {
        return new SelectedFilmFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_selected_film, container, false);

        unbinder = ButterKnife.bind(this, view);

        if(film != null)
            updateView();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }

    @Override
    public void setFilm(Film film) {
        this.film = film;

        updateView();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mPresenter.getCharacters();
        this.film = mPresenter.getFilm();
    }

    @Override
    public void setCharacters(Character[] characters) {
        LayoutInflater inflater = LayoutInflater.from(getActivity());

        for (Character character :characters) {
            TextView textView = (TextView) inflater.inflate(R.layout.textview_people, gridCharacters, false);

            textView.setText(character.name);

            gridCharacters.addView(textView);
        }
    }

    @Override
    public void setPresenter(SelectedFilmContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    private void updateView() {
        txtCrawl.setText(film.openingCrawl);
        txtDirector.setText(film.director);
        txtProducer.setText(film.producer);
        txtReleaseDate.setText(film.releaseDate);
        txtTitle.setText(film.title);
    }
}
