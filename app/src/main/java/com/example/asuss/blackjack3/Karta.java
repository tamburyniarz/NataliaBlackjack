package com.example.asuss.blackjack3;

import android.widget.Button;
import android.widget.ImageView;

import com.example.asuss.blackjack3.enums.CardColorEnum;
import com.example.asuss.blackjack3.enums.CardNumberEnum;

/**
 * Created by asuss on 2016-08-05.
 */
public class Karta {
    private ImageView imagee;

    private CardNumberEnum number;
    private CardColorEnum color;

    private int id;

    public Karta(CardNumberEnum number, CardColorEnum color){
        this.number = number;
        this.color = color;

        ImageView image = new ImageView(Glowna.this);
        image.setImageResource(R.drawable.penguin_raspberry)
    }


}
