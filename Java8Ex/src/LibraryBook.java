import com.sun.media.jfxmedia.events.BufferListener;

public class LibraryBook {
    private final String bookType;
    private final String bookName;

    public LibraryBook(String bookType, String bookName) {
        this.bookType = bookType;
        this.bookName = bookName;
    }

    public static class Builder {
        private String bookType = "comic";
        private String bookName;

        public Builder withBookType(final String bookType) {
            this.bookType = bookType;
            return this;
        }

        public Builder withBookName(final String bookName) {
            this.bookName = bookName;
            return this;
        }

        public LibraryBook build() {
            if(bookName==null || bookType==null) {
                throw new IllegalStateException("cannot create book");
            }

            return new LibraryBook(bookName,bookType);
        }
    }

    public static void main(String[] args) {
        LibraryBook.Builder builder = new Builder();
        LibraryBook libraryBook = builder.withBookName("코난").withBookType("commic").build();
        System.out.println(libraryBook.bookName);
    }
}
