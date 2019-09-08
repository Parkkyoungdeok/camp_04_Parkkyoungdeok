package com.company.mondai1;

public class Word {
    String word;
    String meaning;

    public Word() {}

    public Word(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }
    @Override
    public String  toString()  {
        return "単語："+ this.word +"意味：" + this.meaning;
    }
}

