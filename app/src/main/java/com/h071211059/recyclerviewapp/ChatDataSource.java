package com.h071211059.recyclerviewapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ChatDataSource {
    public static ArrayList<Chat> chats = genereateChat();

    private static ArrayList<Chat> genereateChat() {
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Lucas Oliveira da Silva", "Hola", "12:00", R.drawable.u1));
        chats.add(new Chat("Joaquín García Pérez", "Buenos días", "12:00", R.drawable.u33));
        chats.add(new Chat("Valentina", "Buenas tardes", "12:00", R.drawable.u42));
        chats.add(new Chat("Santiago", "Buenos noches", "12:00", R.drawable.u43));
        chats.add(new Chat("Mateo", "¿Cómo estás?", "12:00", R.drawable.u44));

        chats.add(new Chat("Maximilian", "Hallo", "12:00", R.drawable.eu2));
        chats.add(new Chat("Lukas", "Guten Morgen", "12:00", R.drawable.eu3));
        chats.add(new Chat("Alexander", "Guten Tag", "12:00", R.drawable.eu26));
        chats.add(new Chat("Felix", "Guten Abend", "12:00", R.drawable.eu1));
        chats.add(new Chat("Sebastian", "Tschüss", "12:00", R.drawable.eu101));
        Collections.shuffle(chats);

        return chats;
    }
}
