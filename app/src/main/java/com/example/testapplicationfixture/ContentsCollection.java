package com.example.testapplicationfixture;

import java.util.ArrayList;

public class ContentsCollection {

    public static ArrayList<ContentModel> getCollections()
    {
        ArrayList<ContentModel> listOfContents=new ArrayList<>();

        ContentModel m=new ContentModel();
        m.setDateOfMatch("30 May, Thursday");
        m.setNumberOfMatch("ODI 1 of 48");
        m.setFirstTeamName("Pakistan");
        m.setFirstTeamImage(R.drawable.pakistan);
        m.setSecondTeamName("England");
        m.setSecondTeamImage(R.drawable.england);

        m.setMatchStartTime("Starts at 3:30PM (UTC+06:00)");
        listOfContents.add(m);

        m=new ContentModel();
        m.setDateOfMatch("30 May, Thursday");
        m.setNumberOfMatch("ODI 1 of 48");
        m.setFirstTeamName("Newzealand");
        m.setFirstTeamImage(R.drawable.newzealand);
        m.setSecondTeamName("West Indies");
        m.setSecondTeamImage(R.drawable.westindies);
        m.setMatchStartTime("Starts at 3:30PM (UTC+06:00)");
        listOfContents.add(m);

        m=new ContentModel();
        m.setDateOfMatch("30 May, Thursday");
        m.setNumberOfMatch("ODI 1 of 48");
        m.setFirstTeamName("Pakistan");
        m.setFirstTeamImage(R.drawable.pakistan);
        m.setSecondTeamName("England");
        m.setSecondTeamImage(R.drawable.england);
        m.setMatchStartTime("Starts at 3:30PM (UTC+06:00)");

        listOfContents.add(m);

        return listOfContents;
    }
}
