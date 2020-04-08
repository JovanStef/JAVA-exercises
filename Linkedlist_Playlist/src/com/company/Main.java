package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Album_1", "Artist_1");
        album.addSong("A_1 - Track_1", 5.22);
        album.addSong("A_1 - Track_2", 5.22);
        album.addSong("A_1 - Track_3", 5.22);
        album.addSong("A_1 - Track_4", 5.22);
        album.addSong("A_1 - Track_5", 5.22);
        album.addSong("A_1 - Track_6", 5.22);
        album.addSong("A_1 - Track_7", 5.22);
        albums.add(album);

        album = new Album("Album_2", "Artist_2");
        album.addSong("A_2 - Track_1", 5.22);
        album.addSong("A_2 - Track_2", 5.22);
        album.addSong("A_2 - Track_3", 5.22);
        album.addSong("A_2 - Track_4", 5.22);
        album.addSong("A_2 - Track_5", 5.22);
        album.addSong("A_2 - Track_6", 5.22);
        album.addSong("A_2 - Track_7", 5.22);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("A_1 - Track_3", playlist);
        albums.get(0).addToPlaylist("A_1 - Track_5", playlist);
        albums.get(0).addToPlaylist("A_1 - Track_8", playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(8, playlist);

        play(playlist);


    }


    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean fwd = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            printMenu();
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!fwd) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        fwd = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("we have reached the end of the playlist");
                        fwd = false;
                    }
                    break;
                case 2:
                    if (fwd) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        fwd = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        fwd = true;
                    }
                    break;
                case 3:
                    if (fwd) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            fwd = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Npw playing " + listIterator.next().toString());
                            fwd = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("MENU");
        System.out.println("0 --> QUIT");
        System.out.println("1 --> NEXT");
        System.out.println("2 --> PREVIOUS");
        System.out.println("3 --> REPLAY");
        System.out.println("4 --> LIST");
        System.out.println("5 --> MENU");
        System.out.println("6 --> DELETE");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
