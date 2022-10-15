package com.java.day21;
import com.java.day21.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
        private String message;
        public MoodAnalyser() {

        }

        public MoodAnalyser(String message) {
            this.message = message;

        }

        public String analyzeMood() {
            try {
                if (message.trim().length() == 0)
                    throw new MoodAnalysisException(ExceptionType.IS_EMPTY, "cannot determine mood. message is empty.");
                if (message.toLowerCase().contains("sad")) return "SAD";
                else return "HAPPY";
            } catch (NullPointerException e) {
                throw new MoodAnalysisException(ExceptionType.IS_NULL, "cannot determine mood. message is null.");
            }
        }
}
