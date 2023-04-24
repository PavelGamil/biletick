package com.example.biletick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // создание полей
    private TextView dataMainActivity; // поле вывода информации из главной активити
    private Button button; // кнопка переключения на главную активити

    private User user; // поле сущности пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка id к полю
        dataMainActivity = findViewById(R.id.dataUser);
        button = findViewById(R.id.button);

        // считывание данных из главной активити
        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) { // если в данном контейнере что-то есть, то

            // инициализация поля сущности пользователя
            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());

            // вывод на экран данных из главной активити
            dataMainActivity.setText("ID пользователя " + user.getIdname() + "\n"
                    + "Место отправления " + user.getDeport() + "\n"
                    + "Электронный адрес " + user.getArrival() + "" + "\n"
                    + "время отправления" + user.getTimeDeport() + "" + "\n"
                    + "время прибытия" + user.getTimeArrival() + "" + "\n"
                    + "стоимость билета" + user.getCost());
        }
        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class); // создание намерения переключения на другой экран
            startActivity(intent); // запуск дополнительной активити через намерение
        }
    };
}