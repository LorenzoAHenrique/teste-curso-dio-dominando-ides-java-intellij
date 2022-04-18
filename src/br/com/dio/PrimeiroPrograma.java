package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        String name;
        int pages;
        Book book = new Book( name = "Lord of the Rings", pages= 500);
        Book book2 = new Book( name = "Lord of the Rings 2", pages= 700);
        System.out.println(book);
        System.out.println(book2);

       /* int a = 5;
        int b = 3;

        System.out.println("Hello World " + (a+b));*/
    }
}

class Book{
    private String name;
    private Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

