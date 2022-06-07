package Activities;

public class Activity5 {

    public static void main(String[] args){
        MyBook newNovel = new MyBook();
        newNovel.setTitle("Novel Book Title");

        System.out.println("The title is: " + newNovel.getTitle());
    }

}

abstract class Book {
    String title;
    abstract void setTitle(String title);
    String getTitle(){
       return title;
    }
}

class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}
