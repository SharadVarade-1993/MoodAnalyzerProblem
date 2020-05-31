package com.mood;
import com.mood.exception.MoodAnalysisException;
public class MoodAnalyzer {
    public String message;

    public  MoodAnalyzer(){
    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(String message) throws MoodAnalysisException{
        try{
            if(message.equals(""))
                throw new MoodAnalysisException(MoodAnalysisException.Exception_Type.ENTERED_EMPTY,"Mood Is Empty");
            if(message.contains("i Am in Sad Mood"))
                return  "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.Exception_Type.ENTERED_NULL,"Mood Is Null");
        }
    }

    public  String analyzeMood() throws MoodAnalysisException{
        return this.analyzeMood(message);
    }
}
