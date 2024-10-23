package com.example.dumvanimechat.data;

import com.example.dumvanimechat.R;

import java.util.ArrayList;

public class DataApp {

    public ArrayList<AnimeChon> arr = new ArrayList<>();
public DataApp(){
    init();
}
    private void init(){
        arr.clear();
        arr.add(new AnimeChon(
                R.drawable.cha1,
                "Monkey D. Luffy",
                "Monkey D. Luffy, also known as \"Straw Hat\" Luffy, is a fictional character and the protagonist in the Japanese manga series One Piece created by Eiichiro Oda. "
        ));
        arr.add(new AnimeChon(
                R.drawable.cha2,
                "Sanji",
                "His dream is to find the rumored chef's paradise"
        ));        arr.add(new AnimeChon(
                R.drawable.cha3,
                "Usopp",
                "Usopp is a habitual liar and a kind person who joined the Straw Hat pirate crew after Luffy helped him defeat the villainous Captain Kuro."
        ));        arr.add(new AnimeChon(
                R.drawable.cha4,
                "Roronoa Zoro",
                "Killer is one of the only two pirates who became Worst Generation Supernovas despite not being captains of a crew. "
        ));        arr.add(new AnimeChon(
                R.drawable.cha5,
                "Nico Robin",
                "The archaeologist for the Straw Hat Pirates is Nico Robin. Towards the conclusion of the Alabasta arc, she unexpectedly joined the Straw Hats after being"
        ));        arr.add(new AnimeChon(
                R.drawable.cha6,
                "Brook",
                "Goofy and humorous, Brook is the oldest member of the Straw Hat Pirates. The crew's musician, he is also a quite capable swordsman and can combine his blade ..."
        ));        arr.add(new AnimeChon(
                R.drawable.cha7,
                "Nami",
                "Nami is the navigator of the Straw Hat pirate crew and an expert thief who never misses a chance to earn berries or swipe valuable treasure."
        ));        arr.add(new AnimeChon(
                R.drawable.cha8,
                "Tony Tony Chopper",
                "Tony Tony Chopper, the Straw Hat Pirates' lovable and dedicated doctor , is a reindeer who ate the Hito Hito fruit . This gave him human abilities and the .."
        ));        arr.add(new AnimeChon(
                R.drawable.cha9,
                "Franky",
                "Franky joined the Straw Hat pirate crew in the Water 7 saga, building Luffy a brand-new ship named the Thousand Sunny as a gesture of goodwill. "
        ));     arr.add(new AnimeChon(
                R.drawable.cha10,
                "Jinbe",
                "After helping Luffy in Impel Down and in Marineford, Jinbe joined the Straw Hat Pirates, becoming the crew's helmsman."
        ));
    }
}
