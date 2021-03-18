package com.example.employee_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtID;
    Button addBtn;
    RadioButton male, female;
    RadioGroup grGender;
    ListView listView;
    ListAdapter adapter;
    List<Employee> listEmp = new ArrayList<Employee>();
     Employee employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmpl();
                adapter = new ListAdapter(getApplicationContext(),listEmp);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });


    }
    private void init(){
        edtID = findViewById(R.id.edtID);
        edtName = findViewById(R.id.edtName);
        addBtn = findViewById(R.id.buttonAdd);
        male = findViewById(R.id.malebtn);
        female = findViewById(R.id.femaleBtn);
        grGender = findViewById(R.id.grGender);
        listView = findViewById(R.id.list);
    }
    private void addEmpl(){
        if (male.isChecked()){
            employee = new Employee(R.drawable.male,"",false);
            employee.setInfor(edtID.getText().toString() + " - " + edtName.getText().toString());
            employee.setGender(true);
            listEmp.add(employee);

        } else {
            employee = new Employee(R.drawable.female,"",false);
            employee.setInfor(edtID.getText().toString() + "-" + edtName.getText().toString());
            employee.setImgAva(R.drawable.female);
            employee.setGender(false);
            listEmp.add(employee);
        }
    }

}