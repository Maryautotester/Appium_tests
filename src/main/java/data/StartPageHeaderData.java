package data;

public enum StartPageHeaderData {
    FIRST_PAGE_HEADER("Chat to improve your English"),
    SECOND_PAGE_HEADER("Learn new words and grammar");

    private String header;

    StartPageHeaderData(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}
