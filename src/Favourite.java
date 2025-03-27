public class Favourite {
    public String title;
    public String comment;
    public Medium medium;

    // Konstruktor 1
    public Favourite(String title, Medium medium, String comment) {
        this.title = title;
        this.medium = medium;
        this.comment = comment;
    }

    // Konstruktor 2
    public Favourite(String title, Medium medium) {
        this.title = title;
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Favourite{" +
                "title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", medium=" + medium +
                '}';
    }

    // Setter & Getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
