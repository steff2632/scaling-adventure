package com.example.scalingadventure.filmlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.scalingadventure.R;
import com.example.scalingadventure.data.Film;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by stefanmay on 07/11/2016.
 */

public class FilmListAdapter extends RecyclerView.Adapter<FilmListAdapter.ViewHolder> {

    private Film[] films = new Film[0];
    private OnItemClickListener<Film> onClickListener;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_film, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtTitle.setText(films[position].title);
        holder.itemView.setOnClickListener(view -> onClickListener.onItemClick(films[position]));
    }

    public void setFilms(Film[] films) {
        this.films = films;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener<Film> onClickListener) {
        this.onClickListener = onClickListener;
    }

    public Film getItemAt(int x) {
        return films[x];
    }

    @Override
    public int getItemCount() {
        return films.length;
    }

    public interface OnItemClickListener<T> {
        void onItemClick(T t);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_title)
        TextView txtTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
