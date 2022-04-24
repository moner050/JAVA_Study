package threadTest;

import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary()
    {
        shelf.add("해커스토익1");
        shelf.add("해커스토익2");
        shelf.add("해커스토익3");
//        shelf.add("해커스토익4");
//        shelf.add("해커스토익5");
//        shelf.add("해커스토익6");
    }

    public synchronized String lendBook(){
        // 메소드를 수행하고 있는 쓰레드에 대한 정보.
        Thread t = Thread.currentThread();

        while(shelf.size() == 0)
        {
            System.out.println(t.getName() + " waiting start");
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(t.getName() + " waiting end");
        }


        if(shelf.size() > 0)
        {
            // 맨 앞에있는 책을 꺼내오기
            String book = shelf.remove(0);

            System.out.println(t.getName() +  " : " + book + " lend");
            return book;
        }
        else return null;
    }

    public synchronized void returnBook(String book)
    {   // 메소드를 수행하고 있는 쓰레드에 대한 정보.
        Thread t = Thread.currentThread();
        // 책을 반납
        shelf.add(book);
        // wait 상태에 빠진것이 깨어나게 된다.
        notify();
        System.out.println(t.getName() + " : " + book + " return");
    }
}

class Student extends Thread{

    public Student(String name)
    {
        super(name);
    }
    public void run()
    {   // 빌린 책의 이름을 저장하기
        String title = LibraryMain.library.lendBook();
        // 만약 빌린 책이 없으면 종료
        if(title == null)
        {
            System.out.println(getName() + " 못빌렸음");
            return;
        }
        try
        {
            sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        LibraryMain.library.returnBook(title);
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        // 학생 인스턴스 생성
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");

        // 책 빌리기 시작
        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
