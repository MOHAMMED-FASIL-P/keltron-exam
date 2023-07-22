package com.example.keltron_exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class StudentsListAdapter extends RecyclerView.Adapter<StudentsListAdapter.MyViewHolder>{

    List<Students> studentsList;
    ItemClickCallBack callBack;

    public StudentsListAdapter(List<Students> studentsList,ItemClickCallBack callBack) {
        this.studentsList = studentsList;
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.students_list_item,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Students studentsData = studentsList.get(position);
        holder.txtName.setText(studentsData.getName());
        holder.txtPhone.setText(studentsData.getPhone());
        holder.txtEmail.setText(studentsData.getEmail());

        holder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.itemClick(studentsData);
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtName;
        TextView txtPhone;
        TextView txtEmail;
        FloatingActionButton btnCall;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            txtEmail = itemView.findViewById(R.id.txtMail);
            btnCall = itemView.findViewById(R.id.btnCall);

        }

    }

}

