package com.te.multyplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MultiPlayer {

	String names;
	static HashSet<Songs> hashSet;
	static ArrayList list;
	static MultiPlayer player;

	public static void main(String[] args) {
		int count = 0;
		player = new MultiPlayer();
		Scanner scanner = new Scanner(System.in);
		hashSet = new HashSet<Songs>();
		hashSet.add(new Songs("Like Flames"));
		hashSet.add(new Songs("Enemy"));
		hashSet.add(new Songs("Legends Never Die"));
		hashSet.add(new Songs("Warriors"));
		hashSet.add(new Songs("Phoenix"));
		hashSet.add(new Songs("Giants"));
	
		list = new ArrayList(hashSet);
		player.menu();
		player.caseUse();
	}

	public void caseUse() {
		Songs songs = new Songs();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			songs.display(hashSet);
			break;
		case 2:
			songs.play();
			break;
		case 3:
			songs.search(list, player.names = scanner.nextLine());
			break;
		case 4:
			songs.addSongs(hashSet, player.names = scanner.nextLine());
			break;
		case 5:
			songs.deleteSong(hashSet, player.names = scanner.nextLine());
			break;
		case 6:
			player.menu();
			break;
		default:
			break;
		}

	}
	public static void menu() {
		System.out.println("Welcome to Multimedia");
		System.out.println("Choose from the below Choices.");
		System.out.println("1] Songs\n2] Play\n3] Search Song\n4] Add Song\n5] Delete Song \n6] For Menu");
		System.out.println("Enter Your Choice");
	}
}
