package com.example.uts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fakultas.view.*

class Adapter_Fakultas (
    private val FakultasItemList: List<Data_fakultas>,
    private val clickListener: (Data_fakultas) -> Unit
)
    :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //Fungsi CreateViewHolder sesuai data yang ada pada List<Data_Resep>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_fakultas, parent, false)
        return PartViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(FakultasItemList[position], clickListener)
    }

    override fun getItemCount() = FakultasItemList.size

    //Class PartViewHolder untuk mengubah Atribut komponen sesuai data yang ada pada List<Data_Fakultas>
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(fakultas: Data_fakultas, clickListener: (Data_fakultas) -> Unit) {
            itemView.tv_nama.text = fakultas.namaFakultas
            itemView.imgFakultas.setImageResource(fakultas.image)
            itemView.imgFakultas.contentDescription = fakultas.namaFakultas
            itemView.setOnClickListener { clickListener(fakultas) }
        }
    }
}
