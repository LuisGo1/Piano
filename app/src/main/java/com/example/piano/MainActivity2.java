package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void sonidoviolin (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.violin);
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
    public void sonidotambor (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.tambor);
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
    public void sonidotrompe (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.trompeta);
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
    public void sonidosaxo (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.saxo);
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
    public void sonidopiano (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.piano);
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
    public void sonidoconga (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.conga);
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
    public void sonidoguitar (View view)
    {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.bajo);
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