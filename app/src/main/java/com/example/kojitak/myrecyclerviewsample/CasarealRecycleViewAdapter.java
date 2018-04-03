package com.example.kojitak.myrecyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CasarealRecycleViewAdapter extends RecyclerView.Adapter<CasarealViewHolder> {

    private List<RowData> list;

    public CasarealRecycleViewAdapter(List<RowData> list) {
        this.list = list;
    }

    /**
     *　layoutファイルを読み込み
     *  表示する分のViewHolderを生成(new)する
     */
    @Override
    public CasarealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int test = viewType;
        View inflate;
        if (viewType == 0) {
             inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        }else{

             inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);

        }
        CasarealViewHolder vh = new CasarealViewHolder(inflate);
        return vh;
    }

    /**
     * 1行分のデータをget(取得)する
     * 1行分のデータをset(設定)する
     */
    @Override
    public void onBindViewHolder(CasarealViewHolder holder, int position) {
        if (holder.getItemViewType() == 0) {
            holder.titleView.setText(list.get(position).getTitle());
            holder.detailView.setText(list.get(position).getDetail());
        }else{
            holder.titleView.setText("");
            holder.detailView.setText("");
        }
    }

    @Override
    public int getItemViewType(int position) {
        // サンプルコードなので手軽に position が偶数の項目と奇数の項目で view type を分ける。
        return position % 2;
    }

    /**
     * 表示するアイテムの総数
     * @return
     */
    @Override
    public int getItemCount() {
        return list.size();
    }
}
