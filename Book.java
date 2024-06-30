public class Book {
        public static int i = 1;
        private String title;
        private String author;
        private int yearPublished;
        private double price;

    Book(String title, String author, int yearPublished,double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;    
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public double getPrice(){
        return price;
    }
    public static void main(String[] args) {
        
        Book bookOne = new Book("Java Programming","Sir Marco",2024,120.21);
        Book bookTwo = new Book("Phyton Basics","Sir Marco",2023,110.11);
        Book bookThree = new Book("C++ Essentials","Sir Marco",2022,100.01);
        /*System.out.println("Book 1: \n" + "Title: \""+bookOne.title+"\"\nAuthor : \""+bookOne.author + "\"\nYear Pubished : "+ bookOne.yearPublished+"\nPrice : $"+ bookOne.price );
        System.out.println();
        System.out.println("Book 2: \n" + "Title: \""+bookTwo.title+"\"\nAuthor : \""+bookTwo.author + "\"\nYear Pubished : "+ bookTwo.yearPublished+"\nPrice : $"+ bookTwo.price );
        System.out.println();
        System.out.println("Book 3: \n" + "Title: \""+bookThree.title+"\"\nAuthor : \""+bookThree.author + "\"\nYear Pubished : "+ bookThree.yearPublished+"\nPrice : $"+ bookThree.price );
        */
        printBookDetails(bookOne);
        System.out.println();
        printBookDetails(bookTwo);
        System.out.println();
        printBookDetails(bookThree);
        }
        private static void printBookDetails(Book book){
            System.out.println("Book "+ i +": \n" + "Title: \""+book.getTitle()+"\"\nAuthor : \""+book.getAuthor() + "\"\nYear Pubished : "
            + book.getYearPublished()+"\nPrice : $"+ book.getPrice() );
            i++;
        }
    
}
