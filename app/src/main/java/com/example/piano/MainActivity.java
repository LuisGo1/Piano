package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sonidogato(View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.gato);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidomono (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mono);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidogallo (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.gallo);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidocerdo(View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.cerdo);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidovaca (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.vaca);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidodog (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.perro);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
    public void sonidopajaro(View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.pajaro);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            try{
                sonido.start();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }

    }
}