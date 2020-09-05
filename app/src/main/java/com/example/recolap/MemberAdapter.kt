package com.example.recolap

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ListView
import java.text.FieldPosition

class MemberAdapter (val context: Context, var members: ArrayList<Member>): BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View= LayoutInflater.from(context).inflate(R.layout.activity_result_screen, null)

        val member=view.findViewById<ListView>(R.id.listview)



        return view

    }

    override fun getItem(position: Int): Any {
        return members[position]

    }

    override fun getItemId(position: Int): Long {
        return 0

    }

    override fun getCount(): Int {
        return members.size

    }
}