package com.example.employee_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Employee employee;
    private List<Employee> employeeList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListAdapter(Context context, List<Employee> employeeList) {
        this.employeeList = employeeList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return employeeList.size();
    }

    @Override
    public Object getItem(int i) {
        return employeeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view ==null){
            view = layoutInflater.inflate(R.layout.list_item,null, false);
            holder = new ViewHolder();
            holder.ava = view.findViewById(R.id.imageView);
            holder.infor = view.findViewById(R.id.textView);
            holder.gender = view.findViewById(R.id.checkBox);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Employee employee = this.employeeList.get(position);
        holder.ava.setImageResource(employee.getImgAva());
        holder.infor.setText(employee.getInfor());
        holder.gender.setChecked(employee.isGender());
        return view;
    }
    static class ViewHolder {
        ImageView ava;
        TextView infor;
        CheckBox gender;
    }
}
