package com.h071211059.recyclerviewapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Chat implements Parcelable {
    private String name;
    private String messages;
    private String time;
    private int image;

    public Chat(String name, String messages, String time, int image) {
        this.name = name;
        this.messages = messages;
        this.time = time;
        this.image = image;
    }

    protected Chat(Parcel in) {
        name = in.readString();
        messages = in.readString();
        time = in.readString();
        image = in.readInt();
    }

    public static final Creator<Chat> CREATOR = new Creator<Chat>() {
        @Override
        public Chat createFromParcel(Parcel in) {
            return new Chat(in);
        }

        @Override
        public Chat[] newArray(int size) {
            return new Chat[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(messages);
        parcel.writeString(time);
        parcel.writeInt(image);
    }
}
