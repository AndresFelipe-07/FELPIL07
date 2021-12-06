package felpil.com;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import static android.Manifest.permission_group.CAMERA;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_VIDEO_CAPTURE = 1;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button capture = findViewById(R.id.button);
        videoView = findViewById(R.id.videoView);


        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check permission
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CAMERA) ==
                        PackageManager.PERMISSION_GRANTED) {

                    // permission granted
                    // continue the action
                    Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                    if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
                        startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
                    }

                } else {
                    // permission not granted
                    // ask for the permission
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{CAMERA}, 1);

                }


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == REQUEST_VIDEO_CAPTURE) {
            if (resultCode == Activity.RESULT_OK) {

                Uri videoUri = intent.getData();
                videoView.setVideoURI(videoUri);
                videoView.setMediaController(new MediaController(this));
                videoView.requestFocus();
                videoView.start();

            }

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

      
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED) {

                    // permission granted
                    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, REQUEST_VIDEO_CAPTURE);


                } else {
                    // permission denied
                    Toast.makeText(this, "You cannot capture video without permission", Toast.LENGTH_SHORT).show();
                }
        }
    }
}