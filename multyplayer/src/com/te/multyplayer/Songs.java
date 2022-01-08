package com.te.multyplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Songs {

	String songName;

	public void display(HashSet set) {
		ArrayList list = new ArrayList(set);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

	public void play() {

	}

	public void search(ArrayList list, String song) {

	}

	public void deleteSong(HashSet set, String song) {
		set.remove(song);
		System.out.println(song + " has been Deleted.");
	}

	public void shuffel(ArrayList list, int num) {
		System.out.println(list.get(num) + " is Playing");
	}

	public Songs() {

	}

	public Songs(String songName) {
		super();
		this.songName = songName;
	}

	@Override
	public String toString() {
		return "Songs [songName=" + songName + "]";
	}

	public void addSongs(HashSet<Songs> hashSet, String string) {
		// TODO Auto-generated method stub

	}

}
