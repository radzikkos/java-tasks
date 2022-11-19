package utils;

public enum ScientificTitle {
    BACHELOR("bachelor"),
    MASTER("master"),
    PHD("phd"),
    PROFESSOR("professor");

    private String title;

    ScientificTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
