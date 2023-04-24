package com.example.biletick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText Idname; // поле имени
    private EditText deport; // поле адреса
    private EditText arrival; // поле электронного адреса
    private EditText timeDeport;
    private EditText timeArrival;
    private EditText cost;
    private Button button; // поле кнопки

    private String name; // поле хранения имени
    private String depo; // поле хранения адреса
    private String arri; // поле хранения электронного адреса
    private String tDepo;
    private String tArri;
    private String cos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        Idname = findViewById(R.id.Idname);
        deport = findViewById(R.id.deport);
        arrival = findViewById(R.id.arrival);
        timeDeport = findViewById(R.id.timeDeport);
        timeArrival = findViewById(R.id.timeArrival);
        cost = findViewById(R.id.cost);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = Idname.getText().toString();
            depo = deport.getText().toString();
            arri = arrival.getText().toString();
            tDepo = timeDeport.getText().toString();
            tArri = timeArrival.getText().toString();
            cos = cost.getText().toString();

            User user = new User (name, depo, arri, tDepo, tArri, cos);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(User.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);

        }
    };
}
