package ru.mirea.rulev.notificationapp;

import static android.Manifest.permission.POST_NOTIFICATIONS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int PermissionCode = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this, POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {

            Log.d(MainActivity.class.getSimpleName().toString(), "Разрешения получены");

        } else {
            Log.d(MainActivity.class.getSimpleName().toString(), "Нет разрешений!");

            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, PermissionCode);

        }

    }

    private static final String CHANNEL_ID = "com.Rulev.asd.notification.ANDROID";
    public void onClickNewMessageNotification(View view) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)

                .setContentText("Congratulation!")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setStyle(new NotificationCompat.BigTextStyle()

                        .bigText("Much longer text that cannot fit oneline..."))
                .setContentTitle("Mirea");
        int importance = NotificationManager.IMPORTANCE_HIGH;

        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Student FIO Notification", importance);

        channel.setDescription("MIREA Channel");

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        notificationManager.createNotificationChannel(channel);
        notificationManager.notify(1, builder.build());
    }
}