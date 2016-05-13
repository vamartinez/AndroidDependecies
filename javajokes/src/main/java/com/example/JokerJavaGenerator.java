package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokerJavaGenerator {
    public String getJoke() {
        Random rnd = new Random();
        List<String> jokeList = new ArrayList<>();
        jokeList.add("Why do Farts stink? A: So that Deaf people can enjoy them too");
        jokeList.add("Why did the Hedgehog cross the road? A: To see his Flat Mate");
        jokeList.add("What do you call a Fish without an eye? A: A 'Fsh'!");
        jokeList.add("Why does it take 1 million sperm to fertilize one egg? A: They won't stop to ask directions");
        jokeList.add("What's the difference between Big Foot and an intelligent man? A: Big Foot's been spotted several times");
        jokeList.add("What do you call a handcuffed man? A: Trustworthy");
        jokeList.add("What did the fish say when he hit a concrete wall? A: 'Dam'");
        jokeList.add("Why is divorce so expensive? A: Because it's worth it");
        jokeList.add("What is black, white and red all over? A skunk with nappy rash");
        jokeList.add("Why did the man jump out of the window? A. He wanted tocatcha butterfly");
        jokeList.add("Why did the monkey put a piece of steak on his head? A He thought he was a griller");
        jokeList.add("What do you call a deer with no eyes? A No eye deer");
        jokeList.add("What do you call a deer with no eyes and no legs? A Still no eye deer");
        jokeList.add("Why was six afraid of seven? A Because seven eight nine");
        jokeList.add("Why did the dinosaur walk across the road? A Because chickens were not invented yet");
        jokeList.add("What has four wheels and flies? A A rubbish truck");
        jokeList.add("What's brown and sticky? A A stick");
        jokeList.add("When were vowels invented? A When u and i were born");
        jokeList.add("What's orange and sounds like a parrot? A A carrot");
        jokeList.add("What do you call a sheep with no head and legs? A A fuzz ball");
        jokeList.add("What do you call a fairy that hasn't bathed in a year? A Stinkerbell");
        jokeList.add("When is it a good time to eat a window? When it 's jammed");
        jokeList.add("Whats the difference between a tractor and a giraffe? A One has hydraulics the other has highbollocks");
        int number = (int) (rnd.nextDouble() * jokeList.size() + 1);
        return jokeList.get(number);
    }
}
