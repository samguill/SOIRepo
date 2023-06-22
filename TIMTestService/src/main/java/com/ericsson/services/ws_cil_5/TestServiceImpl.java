package com.ericsson.services.ws_cil_5;

import java.util.ArrayList;
import java.util.List;

public class TestServiceImpl {
    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public TestServiceImpl() {
        bookList.add("Inferno");
        bookList.add("Joyland");
        bookList.add("The Game Of Thrones");

        musicList.add("Random Access Memories");
        musicList.add("Night Visions");
        musicList.add("Jukebox");

        movieList.add("Asu Mare 1");
        movieList.add("Asu Mare 2");
        movieList.add("Asu Mare 3");
    }

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProducts(String category) {
        switch (category.toLowerCase()) {
            case "book":
                return bookList;
            case "music":
                return musicList;
            case "movie":
                return movieList;
        }
        return null;
    }

    public boolean addProduct(String category, String product) {
        switch (category.toLowerCase()) {
            case "book":
                bookList.add(product);
                break;
            case "music":
                musicList.add(product);
                break;
            case "movie":
                movieList.add(product);
                break;
            default:
                return false;
        }
        return true;
    }
}
