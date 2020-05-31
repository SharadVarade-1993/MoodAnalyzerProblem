package com.mood;

import com.mood.exception.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;


    @Test
    public void givenMood_WhenAnyMood_ShouldReturnSAD() throws MoodAnalysisException{
        moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("i Am in Sad Mood");
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMood_WhenAnyMood_ShouldReturnHappy() throws MoodAnalysisException{
        moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("i am in any mood");
        Assert.assertEquals("HAPPY",mood);

    }


    @Test
    public void givenMood_WhenHappyPassThroughConstructor_ShouldReturnHappy() throws MoodAnalysisException{
        moodAnalyzer = new MoodAnalyzer("i am in Happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMood_WhenIsNull_ShouldReturnThrowException(){
        moodAnalyzer = new MoodAnalyzer(null);
        try{
            moodAnalyzer.analyzeMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Mood Is Null",e.getMessage());
        }
    }

    @Test
    public void givenMood_WhenIsEmpty_ShouldReturnThrowException(){
        moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Mood Is Empty",e.getMessage());
        }
    }
}

