package model;

public class Dictionary {
    private String vietnamese;
    private String english;

    public Dictionary() {
    }

    public Dictionary(String vietnamese, String english) {
        this.vietnamese = vietnamese;
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
